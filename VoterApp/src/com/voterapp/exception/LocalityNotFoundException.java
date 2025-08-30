package com.voterapp.exception;

public class LocalityNotFoundException extends NotEligibleException {

	private static final long serialVersionUID = 1L;

	public LocalityNotFoundException(String message) {
		super(message);
	}

}
