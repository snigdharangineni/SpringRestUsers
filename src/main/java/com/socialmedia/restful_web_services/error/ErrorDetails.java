package com.socialmedia.restful_web_services.error;

import java.time.LocalDateTime;

public class ErrorDetails {

	private LocalDateTime timestamp;
	private String messgae;
	private String details;
	public ErrorDetails(LocalDateTime timestamp, String messgae, String details) {
		super();
		this.timestamp = timestamp;
		this.messgae = messgae;
		this.details = details;
	}
	public LocalDateTime getTimestamp() {
		return timestamp;
	}
	public String getMessgae() {
		return messgae;
	}
	public String getDetails() {
		return details;
	}
	
	
}
