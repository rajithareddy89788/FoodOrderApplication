package com.mouritech.onlinefoodorderapplication.common;

import java.time.LocalDateTime;

public class APIResponse {
	private final boolean failure;
	private final String message;
	// try again
	
	public APIResponse(boolean failure, String message) {
		this.failure = failure;
		this.message = message;
	}

	
	public boolean isFailure() {
		return failure;
	}


	public String getMessage() {
		return message;
	}
	
	public String getTimestamp() {
		return LocalDateTime.now().toString();
	}

}
