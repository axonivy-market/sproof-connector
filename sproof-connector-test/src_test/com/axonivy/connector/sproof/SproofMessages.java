package com.axonivy.connector.sproof;

public interface SproofMessages {
	public static final String SIG_RQ_RSP_1 = """
			{
			"documents": [
			{
			"id": "39266f1b0f27be86f389de0e1b0f27be86e56e2dcfd66c745ff0a27d0f7b92c405280a",
			"name": "",
			"language": "en",
			"startSendingReminders": null,
			"sendReminder": false,
			"reminderSent": null,
			"reminderInterval": null,
			"createdAt": "2026-03-27T16:43:52.213Z",
			"callbackUrl": null,
			"returnUrl": null,
			"returnBtnText": null,
			"inPersonSigning": false,
			"signingRound": 1,
			"isTemplate": false,
			"templateId": null,
			"linkId": null,
			"linkExpiresAt": null,
			"derivedFromLink": false,
			"state": "pending",
			"complianceLevel": "None",
			"allowForwarding": false,
			"linkExpires": false,
			"setDueDate": false,
			"dueDate": null,
			"focusedSigningMode": false,
			"linkMaxSignaturesEnabled": false,
			"linkMaxSignatures": null,
			"fastlaneProfileId": null,
			"refId": null,
			"sendOutFinishedPdf": false,
			"signatureTypes": [
			"advanced"
			],
			"members": [
			{
			"id": "277e66203718a7f2ec4ea4f2994999014f1b0f27be86b679e05ff72085d6ca562a1c5e",
			"documentId": "39266f1b0f27be86f389de0e03ba819157e51b0f27be86745ff0a27d0f7b92c405280a",
			"email": "signer2@sprooftest.axonivy.com",
			"firstName": "Signer",
			"lastName": "Two",
			"isAdmin": false,
			"createdAt": "2026-03-27T16:43:52.330Z",
			"sentDeleteNotificationAt": null,
			"manuallyLastEmailSent": null,
			"signaturePosition": [
			{
			"page": 0,
			"x": 0.151,
			"y": 0.329,
			"width": 0.31,
			"height": 0.111,
			"pageWidth": 595,
			"pageHeight": 842
			}
			],
			"doNotSendEmails": true,
			"declinedAt": null,
			"signingOrder": 2,
			"onDemand": "",
			"recipientId": "de917f71-d8ce-447e-a3f8-96b171dfa4d9",
			"signatureTypes": [],
			"signatureTypesActive": false,
			"privateMessage": null,
			"customId": null,
			"useFastlane": false,
			"role": "signer",
			"approvedAt": null,
			"verificationConfig": {
			"method": "SMS",
			"editable": true
			},
			"phoneNumber": null,
			"signatures": [],
			"signedAt": null
			},
			{
			"id": "fc4f9a5fbe0de62614c54189309f91b0f27be864fcbc9e220a8cd0d0ea044d52d1a16b",
			"documentId": "39266f1b0f27be86f389de0e03ba1b0f27be862dcfd66c745ff0a27d0f7b92c405280a",
			"email": "signer1@sprooftest.axonivy.com",
			"firstName": "Signer",
			"lastName": "One",
			"isAdmin": false,
			"createdAt": "2026-03-27T16:43:52.323Z",
			"sentDeleteNotificationAt": null,
			"manuallyLastEmailSent": null,
			"signaturePosition": [
			{
			"page": 0,
			"x": 0.151,
			"y": 0.23400003,
			"width": 0.31,
			"height": 0.111,
			"pageWidth": 595,
			"pageHeight": 842
			}
			],
			"doNotSendEmails": true,
			"declinedAt": null,
			"signingOrder": 1,
			"onDemand": "",
			"recipientId": "ec329c34-3dae-479b-8ee1-1b0f27be862a",
			"signatureTypes": [],
			"signatureTypesActive": false,
			"privateMessage": null,
			"customId": null,
			"useFastlane": false,
			"role": "signer",
			"approvedAt": null,
			"verificationConfig": {
			"method": "SMS",
			"editable": true
			},
			"phoneNumber": null,
			"signatures": [],
			"signedAt": null
			}
			],
			"member": {
			"id": "4a65f6b98018d7f7250c5cdab0e1ed6f51b0f27be86e587388fd7cc0d4cb95c94ad09d",
			"documentId": "39266f1b0f27be86f389de0e01b0f27be8656e2dcfd66c745ff0a27d0f7b92c405280a",
			"email": "some.sender@sprooftest.axonivy.com",
			"firstName": "Sproof",
			"lastName": "Sender",
			"isAdmin": true,
			"createdAt": "2026-03-27T16:43:52.215Z",
			"sentDeleteNotificationAt": null,
			"manuallyLastEmailSent": null,
			"signaturePosition": [],
			"doNotSendEmails": false,
			"declinedAt": null,
			"signingOrder": 1,
			"onDemand": "",
			"recipientId": "8cbfec2d-ef0a-4c80-a047-1b0f27be866d",
			"signatureTypes": [],
			"signatureTypesActive": false,
			"privateMessage": null,
			"customId": null,
			"useFastlane": false,
			"role": "none",
			"approvedAt": null,
			"verificationConfig": null,
			"phoneNumber": null,
			"signatures": [],
			"signedAt": null
			},
			"boxes": [],
			"overdue": false
			}
			]
			}			
			""";

	public static final String SIG_RQ_RSP_2 = """
			{
			"documents": [
			{
			"id": "40e812a1b46f2797e53a0a346311bd500426cf1897ae81c23cc8d00297e597db323d07",
			"name": "sign-placeholders",
			"language": "en",
			"startSendingReminders": null,
			"sendReminder": false,
			"reminderSent": null,
			"reminderInterval": null,
			"createdAt": "2026-04-21T10:07:47.728Z",
			"callbackUrl": null,
			"returnUrl": null,
			"returnBtnText": null,
			"inPersonSigning": false,
			"signingRound": 1,
			"isTemplate": false,
			"templateId": null,
			"linkId": null,
			"linkExpiresAt": null,
			"derivedFromLink": false,
			"state": "pending",
			"complianceLevel": "None",
			"allowForwarding": false,
			"linkExpires": false,
			"setDueDate": false,
			"dueDate": null,
			"focusedSigningMode": false,
			"linkMaxSignaturesEnabled": false,
			"linkMaxSignatures": null,
			"fastlaneProfileId": null,
			"refId": null,
			"sendOutFinishedPdf": false,
			"signatureTypes": [
			],
			"members": [
			{
			"id": "e5bc5359d657a8adca2758d4b94f483fd06c65ad5a6676c9b0fd61eab1ab4b8773db1b",
			"documentId": "40e812a1b46f2797e53a0a346311bd500426cf1897ae81c23cc8d00297e597db323d07",
			"email": "signer2@sprooftest.axonivy.com",
			"firstName": "Signer",
			"lastName": "Two",
			"isAdmin": false,
			"createdAt": "2026-04-21T10:07:47.840Z",
			"sentDeleteNotificationAt": null,
			"manuallyLastEmailSent": null,
			"signaturePosition": [
			{
			"page": 0,
			"x": 0.151,
			"y": 0.541,
			"width": 0.31,
			"height": 0.111,
			"pageWidth": 595,
			"pageHeight": 842
			}
			],
			"doNotSendEmails": true,
			"declinedAt": null,
			"signingOrder": 2,
			"onDemand": "",
			"recipientId": "a5680424-b92a-4764-801e-8591efdd8944",
			"signatureTypes": [
			],
			"signatureTypesActive": false,
			"privateMessage": null,
			"customId": null,
			"useFastlane": false,
			"role": "signer",
			"approvedAt": null,
			"verificationConfig": {
			"method": "SMS",
			"editable": true
			},
			"phoneNumber": null,
			"signatures": [
			],
			"signedAt": null
			},
			{
			"id": "1f1aabc20b8f42a6cac2177c0472213b5f01906bde0bcc968ee41df78a2bf4cd04940d",
			"documentId": "40e812a1b46f2797e53a0a346311bd500426cf1897ae81c23cc8d00297e597db323d07",
			"email": "signer1@sprooftest.axonivy.com",
			"firstName": "Signer",
			"lastName": "One",
			"isAdmin": false,
			"createdAt": "2026-04-21T10:07:47.833Z",
			"sentDeleteNotificationAt": null,
			"manuallyLastEmailSent": null,
			"signaturePosition": [
			{
			"page": 0,
			"x": 0.151,
			"y": 0.29799998,
			"width": 0.31,
			"height": 0.111,
			"pageWidth": 595,
			"pageHeight": 842
			}
			],
			"doNotSendEmails": true,
			"declinedAt": null,
			"signingOrder": 1,
			"onDemand": "",
			"recipientId": "ac8987a5-6ca8-479d-86c3-3b5de8c387ea",
			"signatureTypes": [
			],
			"signatureTypesActive": false,
			"privateMessage": null,
			"customId": null,
			"useFastlane": false,
			"role": "signer",
			"approvedAt": null,
			"verificationConfig": {
			"method": "SMS",
			"editable": true
			},
			"phoneNumber": null,
			"signatures": [
			],
			"signedAt": null
			}
			],
			"member": {
			"id": "94f40e1f799c4317c69cdad87161768036ffa405098ef4771b59cc4f2092617320b836",
			"documentId": "40e812a1b46f2797e53a0a346311bd500426cf1897ae81c23cc8d00297e597db323d07",
			"email": "some.one+sproofsender@sprooftest.axonivy.com",
			"firstName": "Sproof",
			"lastName": "Sender",
			"isAdmin": true,
			"createdAt": "2026-04-21T10:07:47.731Z",
			"sentDeleteNotificationAt": null,
			"manuallyLastEmailSent": null,
			"signaturePosition": [
			],
			"doNotSendEmails": false,
			"declinedAt": null,
			"signingOrder": 1,
			"onDemand": "",
			"recipientId": "1a6e3840-abd9-4a56-9e55-d8d928904ce9",
			"signatureTypes": [
			],
			"signatureTypesActive": false,
			"privateMessage": null,
			"customId": null,
			"useFastlane": false,
			"role": "none",
			"approvedAt": null,
			"verificationConfig": null,
			"phoneNumber": null,
			"signatures": [
			],
			"signedAt": null
			},
			"boxes": [
			{
			"id": "9df8e0e6-b1ea-4502-83b9-283352b03306",
			"type": "dateBox",
			"value": "",
			"label": "Date"
			},
			{
			"id": "a11009c0-0dfc-4b79-a180-6d09ef50473f",
			"type": "dateBox",
			"value": "",
			"label": "Date"
			},
			{
			"id": "025a4e0d-222c-4604-b90c-9ca877ee2bdc",
			"type": "checkBox",
			"value": false,
			"label": "Acceptance"
			},
			{
			"id": "9afc37df-939c-49eb-b626-502ac444020d",
			"type": "checkBox",
			"value": false,
			"label": "Acceptance"
			}
			],
			"overdue": false
			}
			]
			}
			""";

	public static final String GET_DOC_RSP_1 = """
			{
				"name": "sign-fixed",
				"id": "6a60850f8255b436e61e4b40c454ba8811b0f27be86b03ca04d0a343ffba19b664b8a4",
				"language": "en",
				"updatedAt": "2026-03-30T16:42:15.717Z",
				"createdAt": "2026-03-30T16:42:15.497Z",
				"signaturesTypes": [
				                    "advanced"
				                    ],
				"callbackUrl": null,
				"returnUrl": null,
				"returnBtnText": null,
				"inPersonSigning": false,
				"signingRound": 1,
				"state": "pending",
				"member": {
					"id": "552275375850489cd461301912934d93a1b0f27be8634b6b86d5ba92fafa773cb78102",
					"email": "some.sender@sprooftest.axonivy.com",
					"firstName": "Sproof",
					"lastName": "Sender",
					"lastActivityAt": "2026-03-30T16:42:15.500Z",
					"createdAt": "2026-03-30T16:42:15.500Z",
					"isAdmin": true,
					"isSigner": false,
					"isApprover": false,
					"isViewer": false,
					"signed": false,
					"approvedAt": null,
					"viewedAt": null,
					"signaturePosition": [],
					"signedAt": null,
					"signingOrder": 1,
					"declinedAt": null,
					"signatures": []
				},
				"boxes": [],
				"members": [
				            {
				            	"id": "81458440115287d5aa392f40831a0db4e1b0f27be86d3e4f590cb1c89cbdb941e69b51",
				            	"isSigner": true,
				            	"isApprover": false,
				            	"isViewer": false,
				            	"email": "signer2@sprooftest.axonivy.com",
				            	"firstName": "Signer",
				            	"lastName": "Two",
				            	"isAdmin": false,
				            	"signedAt": null,
				            	"approvedAt": null,
				            	"viewedAt": null,
				            	"declinedAt": null,
				            	"signingOrder": 1,
				            	"signaturePosition": {
				            		"x": 0.3,
				            		"y": 0.8,
				            		"page": 0,
				            		"width": 0.3,
				            		"height": 0.1
				            	},
				            	"signed": false,
				            	"signatures": []
				            },
				            {
				            	"id": "9eff3f05b5e3a54d7d4cb7657626f6e061b0f27be86abd2946d97833ab6258c0a0f452",
				            	"isSigner": true,
				            	"isApprover": false,
				            	"isViewer": false,
				            	"email": "signer1@sprooftest.axonivy.com",
				            	"firstName": "Signer",
				            	"lastName": "One",
				            	"isAdmin": false,
				            	"signedAt": null,
				            	"approvedAt": null,
				            	"viewedAt": null,
				            	"declinedAt": null,
				            	"signingOrder": 1,
				            	"signaturePosition": {
				            		"x": 0.3,
				            		"y": 0.6,
				            		"page": 0,
				            		"width": 0.3,
				            		"height": 0.1
				            	},
				            	"signed": false,
				            	"signatures": []
				            }
				            ],
				"allSignersSigned": false,
				"allMembersSigned": false
			}
			""";

	public static final String GET_DOC_RSP_2 = """
			{
			"name": "sign-placeholders",
			"id": "fd3dc1062d8b41ac38d1eeeb5b5e70ad71b0f27be86432554081a1cd19982165e91f04",
			"language": "en",
			"updatedAt": "2026-04-02T15:19:26.137Z",
			"createdAt": "2026-04-02T15:16:32.936Z",
			"signaturesTypes": [
			"advanced"
			],
			"callbackUrl": null,
			"returnUrl": null,
			"returnBtnText": null,
			"inPersonSigning": false,
			"signingRound": 2,
			"state": "pending",
			"member": {
			"id": "0415d107da1e1b0f27be86b0128d9938f94095e4fda85201276706c4cfb7c5c3db4c1f",
			"email": "some.sender@sprooftest.axonivy.com",
			"firstName": "Sproof",
			"lastName": "Sender",
			"lastActivityAt": "2026-04-02T15:16:32.938Z",
			"createdAt": "2026-04-02T15:16:32.938Z",
			"isAdmin": true,
			"isSigner": false,
			"isApprover": false,
			"isViewer": false,
			"signed": false,
			"approvedAt": null,
			"viewedAt": null,
			"signaturePosition": [],
			"signedAt": null,
			"signingOrder": 1,
			"declinedAt": null,
			"signatures": []
			},
			"boxes": [],
			"members": [
			{
			"id": "cfa2d3415a131b0f27be860e826fa3e1ef5ec2192df3a949791a4c2776c03aeabbfdf4",
			"isSigner": true,
			"isApprover": false,
			"isViewer": false,
			"email": "some.body@sprooftest.axonivy.com",
			"firstName": "Signer",
			"lastName": "Two",
			"isAdmin": false,
			"signedAt": null,
			"approvedAt": null,
			"viewedAt": null,
			"declinedAt": null,
			"signingOrder": 2,
			"signaturePosition": {
			"x": 0.151,
			"y": 0.47100005,
			"page": 0,
			"width": 0.303,
			"height": 0.109,
			"pageHeight": 842,
			"pageWidth": 595
			},
			"signed": false,
			"signatures": []
			},
			{
			"id": "da9de7064a971b0f27be86b79bbf49d01a359459ff1d68724d2db2995da8bcfeeca23f",
			"isSigner": true,
			"isApprover": false,
			"isViewer": false,
			"email": "some.otherbody@sprooftest.axonivy.com",
			"firstName": "Signer",
			"lastName": "One",
			"isAdmin": false,
			"signedAt": "2026-04-02T15:19:25.942Z",
			"approvedAt": null,
			"viewedAt": null,
			"declinedAt": null,
			"signingOrder": 1,
			"signaturePosition": null,
			"signed": true,
			"signatures": [
			{
			"signatureType": "aes_sproof",
			"signedAt": "2026-04-02T15:19:25.942Z"
			}
			]
			}
			],
			"allSignersSigned": false,
			"allMembersSigned": false
			}
			""";

	public static final String GET_DOC_RSP_3 = """
			{
			"name": "sign-placeholders",
			"id": "0697fd52178613d61941265e354bf0a7a60de462fefb9dca62817db3aa3de545ff4262",
			"language": "en",
			"updatedAt": "2026-04-21T09:55:39.598Z",
			"createdAt": "2026-04-21T09:53:22.254Z",
			"signaturesTypes": [
			],
			"callbackUrl": null,
			"returnUrl": null,
			"returnBtnText": null,
			"inPersonSigning": false,
			"signingRound": 2,
			"state": "pending",
			"member": {
			"id": "d8f2f674cc415a4444664f695dbd9abcd1ff05a235c4758164a61f4676f7b4a35e5709",
			"email": "some.one@gmail.com",
			"firstName": "Signer",
			"lastName": "One",
			"lastActivityAt": "2026-04-21T09:53:22.368Z",
			"createdAt": "2026-04-21T09:53:22.368Z",
			"isAdmin": false,
			"isSigner": true,
			"isApprover": false,
			"isViewer": false,
			"signed": true,
			"approvedAt": null,
			"viewedAt": null,
			"signaturePosition": [
			],
			"signedAt": "2026-04-21T09:55:39.413Z",
			"signingOrder": 1,
			"declinedAt": null,
			"signatures": [
			{
			"signatureType": "aes_sproof",
			"signedAt": "2026-04-21T09:55:39.413Z"
			}
			]
			},
			"boxes": [
			{
			"id": "cce5f9b3-d0f8-4cbc-abce-5cace1e31369",
			"value": null,
			"type": "dateBox",
			"label": "Date"
			},
			{
			"id": "818df206-b440-41b2-b7f7-6c161c55de26",
			"value": true,
			"type": "checkBox",
			"label": "Acceptance"
			},
			{
			"id": "561a7147-0c4c-4ff7-9b1e-c5e1ff4ec08f",
			"value": false,
			"type": "checkBox",
			"label": "Acceptance"
			},
			{
			"id": "925d2e2c-b6fe-42ed-81ef-72a6818ab011",
			"value": "2026-04-22",
			"type": "dateBox",
			"label": "Date"
			}
			],
			"members": [
			{
			"id": "a7c3d95d4ebf8c14812349088f6d667fcfa0eed695327601ab7dcf3a5612998703cf22",
			"isSigner": true,
			"isApprover": false,
			"isViewer": false,
			"email": "signer2@sprooftest.axonivy.com",
			"firstName": "Signer",
			"lastName": "Two",
			"isAdmin": false,
			"signedAt": null,
			"approvedAt": null,
			"viewedAt": null,
			"declinedAt": null,
			"signingOrder": 2,
			"signaturePosition": {
			"x": 0.151,
			"y": 0.541,
			"page": 0,
			"width": 0.31,
			"height": 0.111,
			"pageHeight": 842,
			"pageWidth": 595
			},
			"signed": false,
			"signatures": [
			]
			},
			{
			"id": "517e5e92d1aecd4dfb2752b12345f002006448ababa2e87bef2c44e3e120afd34aaa43",
			"isSigner": false,
			"isApprover": false,
			"isViewer": false,
			"email": "some.one+sproofsender@sprooftest.axonivy.com",
			"firstName": "Sproof",
			"lastName": "Sender",
			"isAdmin": true,
			"signedAt": null,
			"approvedAt": null,
			"viewedAt": null,
			"declinedAt": null,
			"signingOrder": 1,
			"signaturePosition": null,
			"signed": false,
			"signatures": [
			]
			}
			],
			"allSignersSigned": false,
			"allMembersSigned": false
			}
			""";

}
