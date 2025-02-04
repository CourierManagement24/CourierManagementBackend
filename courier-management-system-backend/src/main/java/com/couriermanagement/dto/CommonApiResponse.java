package com.couriermanagement.dto;

//import lombok.AllArgsConstructor;
//import lombok.Builder;
//import lombok.Data;
//import lombok.NoArgsConstructor;

//@Builder
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//package com.couriermanagement.dto;

public class CommonApiResponse {

	private String responseMessage;
	private boolean isSuccess;

	// No-args constructor
	public CommonApiResponse() {
	}

	// All-args constructor
	public CommonApiResponse(String responseMessage, boolean isSuccess) {
		this.responseMessage = responseMessage;
		this.isSuccess = isSuccess;
	}

	// Getters and setters
	public String getResponseMessage() {
		return responseMessage;
	}

	public void setResponseMessage(String responseMessage) {
		this.responseMessage = responseMessage;
	}

	public boolean isSuccess() {
		return isSuccess;
	}

	public void setSuccess(boolean isSuccess) {
		this.isSuccess = isSuccess;
	}

	// Static Builder class
	public static class Builder {
		private String responseMessage;
		private boolean isSuccess;

		// Builder methods
		public Builder responseMessage(String responseMessage) {
			this.responseMessage = responseMessage;
			return this;    // Returning 'this' enables method chaining
		}

		public Builder isSuccess(boolean isSuccess) {
			this.isSuccess = isSuccess;
			return this;       //Method Chaining → Each method returns this, allowing multiple calls in a single statement.
		}

		// Build method
		// Final step → Constructs the actual CommonApiResponse object.
		public CommonApiResponse build() {
			return new CommonApiResponse(responseMessage, isSuccess);
		}
	}

	// Static method to get Builder instance
	public static Builder builder() {
		return new Builder();
	}
}
