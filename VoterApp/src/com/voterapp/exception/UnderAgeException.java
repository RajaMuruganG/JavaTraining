package com.voterapp.exception;

public class UnderAgeException extends NotEligibleException {

	private static final long serialVersionUID = 1L;

	public UnderAgeException(String message) {
		super(message);
	}

}
