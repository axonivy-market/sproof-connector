package com.axonivy.connector.sproof.client;

import com.fasterxml.jackson.databind.JsonNode;
import com.sproof.sign.api.v1.client.AnyOfDocumentResponseBoxValue;

public class BoxValue implements AnyOfDocumentResponseBoxValue {
	private JsonNode value;

	public JsonNode getValue() {
		return value;
	}
	public void setValue(JsonNode value) {
		this.value = value;
	}
}
