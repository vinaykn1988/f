package com.brillio.trainin.exceptions;

public class NameLengthException extends Exception {

	private static final long serialVersionUID = 1L;

	public NameLengthException() {
		super();
	}

	public NameLengthException(String message) {
		super(message);
	}

	public NameLengthException(Throwable cause) {
		super(cause);
	}

}
