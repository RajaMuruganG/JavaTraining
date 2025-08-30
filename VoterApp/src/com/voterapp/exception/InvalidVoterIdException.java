package com.voterapp.exception;

public class InvalidVoterIdException extends NotEligibleException {

	private static final long serialVersionUID = 1L;

	public InvalidVoterIdException(String message) {
		super(message);
	}

}
