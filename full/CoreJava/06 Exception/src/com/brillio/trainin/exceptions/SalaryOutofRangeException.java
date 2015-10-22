package com.brillio.trainin.exceptions;

public class SalaryOutofRangeException extends Exception {

	private static final long serialVersionUID = 1L;

	public SalaryOutofRangeException() {
		super();
	}

	public SalaryOutofRangeException(String message) {
		super(message);
	}

	public SalaryOutofRangeException(Throwable cause) {
		super(cause);
	}

}
