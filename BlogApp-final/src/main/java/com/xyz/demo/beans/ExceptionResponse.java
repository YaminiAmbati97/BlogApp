package com.xyz.demo.beans;

import java.util.Date;
/*
 * {
    "timestamp": "2020-08-26T14:59:05.549+00:00",
    "status": 404,
    "error": "Not Found",
    "message": "",
    "path": "/users/1000"
}
 */
public class ExceptionResponse {
	private Date timestamp;
	private String message;
	private String details;

	public ExceptionResponse(Date timestamp, String message, String details) {
		super();
		this.timestamp = timestamp;
		this.message = message;
		this.details = details;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public String getMessage() {
		return message;
	}

	public String getDetails() {
		return details;
	}

}