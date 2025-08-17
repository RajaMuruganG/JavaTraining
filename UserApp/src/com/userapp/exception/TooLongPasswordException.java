package com.userapp.exception;

public class TooLongPasswordException extends Exception {

	public TooLongPasswordException(String message) {
		super(message);
	}

	private static final long serialVersionUID = 1L;

}
