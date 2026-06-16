package com.axonivy.connector.sproof.service;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;

import com.aspose.pdf.Color;
import com.aspose.pdf.Document;
import com.aspose.pdf.Font;
import com.aspose.pdf.FontRepository;
import com.aspose.pdf.TextFragment;
import com.aspose.pdf.TextSegment;
import com.sproof.sign.api.v1.client.CreateSignatureRequest;
import com.sproof.sign.api.v1.client.SproofSigner;

import ch.ivyteam.ivy.addons.docfactory.aspose.AsposeProduct;
import ch.ivyteam.ivy.addons.docfactory.aspose.LicenseLoader;
import ch.ivyteam.ivy.bpm.error.BpmError;
import ch.ivyteam.ivy.environment.Ivy;

/**
 * Demo service for the Sproof connector, providing PDF document creation and signer management.
 */
public class SproofDemoService {
	private static final SproofDemoService INSTANCE = new SproofDemoService();


	static {
		try {
			LicenseLoader.loadLicenseforProduct(AsposeProduct.PDF);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	private static final String LOREMIPSUM = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. "
			+ "Integer nec odio. Praesent libero. Sed cursus ante dapibus diam. Sed nisi. "
			+ "Nulla quis sem at nibh elementum imperdiet. Duis sagittis ipsum. Praesent mauris. "
			+ "Fusce nec tellus sed augue semper porta. Mauris massa. "
			+ "Vestibulum lacinia arcu eget nulla.\n\n"
			+ "Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. "
			+ "Curabitur sodales ligula in libero. Sed dignissim lacinia nunc. Curabitur tortor. "
			+ "Pellentesque nibh. Aenean quam. In scelerisque sem at dolor. Maecenas mattis. "
			+ "Sed convallis tristique sem. Proin ut ligula vel nunc egestas porttitor.";

	/**
	 * Returns the singleton instance of this service.
	 */
	public static SproofDemoService get() {
		return INSTANCE;
	}

	/**
	 * Wraps PDF byte content as a {@link StreamedContent} suitable for browser download.
	 */
	public StreamedContent createStreamedContent(String name, byte[] content) {
		return DefaultStreamedContent.builder()
				.contentType("application/pdf")
				.name(name)
				.stream(() -> new ByteArrayInputStream(content))
				.build();
	}

	/**
	 * Creates a simple demo PDF document with a Lorem Ipsum paragraph.
	 */
	public byte[] createDocument() {
		try (var doc = new Document()) {
			var page = doc.getPages().add();

			var helvetica = FontRepository.findFont("Helvetica");
			var times = FontRepository.findFont("Times");
			var paragraphs = page.getParagraphs();
			paragraphs.add(fragment(helvetica, 24, Color.getNavy(), "Document"));
			paragraphs.add(fragment(times, 12, null, LOREMIPSUM));

			try (var os = new ByteArrayOutputStream()) {
				doc.save(os);

				return os.toByteArray();
			}
		}
		catch (Exception e) {
			throw BpmError.create("createDocument").withCause(e).build();
		}
	}

	/**
	 * Creates a demo PDF with embedded sproof signature placeholder fields for up to two signers.
	 *
	 * <p>Only signers where all three fields (email, first name, last name) are non-blank are included.
	 * The placeholders follow the sproof tag syntax and are rendered nearly invisible (light gray, small font).
	 */
	public byte[] createDocumentWithPlaceholders(String signer1Email, String signer1FirstName, String signer1LastName, String signer2Email, String signer2FirstName, String signer2LastName) {
		try (var doc = new Document()) {
			var page = doc.getPages().add();

			var helvetica = FontRepository.findFont("Helvetica");
			var times = FontRepository.findFont("Times");
			var helveticaBold = FontRepository.findFont("Helvetica-Bold");

			// Build visible document content (title + body text)
			var paragraphs = page.getParagraphs();
			paragraphs.add(fragment(helvetica, 24, Color.getNavy(), "Document with Placeholders"));
			paragraphs.add(fragment(times, 12, null, LOREMIPSUM));

			paragraphs.add(fragment());

			var signers = createSigners(signer1Email, signer1FirstName, signer1LastName, signer2Email, signer2FirstName, signer2LastName);

			for (var signer : signers) {
				// The {sproof{...}sproof} tag is the signature field placeholder; font size 6 + near-white color keeps it invisible to readers
				paragraphs.add(fragment(helvetica, 128, null, ""));
				paragraphs.add(fragment(helvetica, 6, Color.fromGray(0.9), "{sproof{%s, %s, %s, %d, true}sproof}".formatted(signer.getFirstName(), signer.getLastName(), signer.getEmail(), signer.getSigningOrder())));
				paragraphs.add(fragment(helveticaBold, null, null, "Signature %d".formatted(signer.getSigningOrder())));
				paragraphs.add(fragment(helvetica, 14, null, ""));
				// {sp{CB,...}sp} = checkbox field, {sp{DB,...}sp} = date field; same invisible-rendering trick
				page.getParagraphs().add(fragment(
						segment(helvetica, 10, null, "Accept conditions: "),
						segment(helvetica, 10, Color.fromGray(0.9), "{sp{CB, Acceptance, , %s, true}sp}".formatted(signer.getEmail()))));
				paragraphs.add(fragment(helvetica, 14, null, ""));
				paragraphs.add(fragment(helvetica, 12, Color.fromGray(0.9), "{sp{DB, Date, , %s, true}sp}".formatted(signer.getEmail())));
				paragraphs.add(fragment(helveticaBold, null, null, "Date"));
			}

			try (var os = new ByteArrayOutputStream()) {
				doc.save(os);

				return os.toByteArray();
			}
		}
		catch (Exception e) {
			throw BpmError.create("createDocument").withCause(e).build();
		}
	}

	protected TextFragment fragment(Font font, Integer size, Color color, String text) {
		var fragment = new TextFragment(text);
		if(font != null) {
			fragment.getTextState().setFont(font);
		}
		if(size != null) {
			fragment.getTextState().setFontSize(size);
		}
		if(color != null) {
			fragment.getTextState().setForegroundColor(color);
		}

		return fragment;
	}

	protected TextFragment fragment(TextSegment...segments) {
		var fragment = new TextFragment("");

		for (var segment : segments) {
			fragment.getSegments().add(segment);
		}

		return fragment;
	}

	protected TextSegment segment(Font font, Integer size, Color color, String text) {
		var segment = new TextSegment(text);
		if(font != null) {
			segment.getTextState().setFont(font);
		}
		if(size != null) {
			segment.getTextState().setFontSize(size);
		}
		if(color != null) {
			segment.getTextState().setForegroundColor(color);
		}

		return segment;
	}


	/**
	 * Creates a list of {@link SproofSigner} objects from the provided data for up to two signers.
	 *
	 * <p>Signers with any blank field (email, first name, or last name) are silently skipped.
	 */
	public List<SproofSigner> createSigners(String signer1Email, String signer1FirstName, String signer1LastName,
			String signer2Email, String signer2FirstName, String signer2LastName) {
		var signers = new ArrayList<SproofSigner>();

		var order = 1;

		if(StringUtils.isNoneBlank(signer1Email, signer1FirstName, signer1LastName)) {
			signers.add(createSigner(signer1Email, signer1FirstName, signer1LastName, order++));
		}

		if(StringUtils.isNoneBlank(signer2Email, signer2FirstName, signer2LastName)) {
			signers.add(createSigner(signer2Email, signer2FirstName, signer2LastName, order++));
		}

		return signers;
	}

	protected SproofSigner createSigner(String email, String firstName, String lastName, int signingOrder) {
		return new SproofSigner()
				.firstName(StringUtils.isNotEmpty(firstName) ? firstName : "Firstname")
				.lastName(StringUtils.isNotEmpty(lastName) ? lastName : "Lastname")
				.email(email)
				.signingOrder(signingOrder);
	}

	/**
	 * Logs the given {@link CreateSignatureRequest} at INFO level for debugging purposes.
	 */
	public void check(CreateSignatureRequest rq) {
		Ivy.log().info("Req: {0}", rq);
	}
}
