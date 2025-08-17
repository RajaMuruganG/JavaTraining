package com.userapp.exception;

public class TooShortPasswordException extends Exception {

	public TooShortPasswordException(String messgae) {
		super(messgae);
	}

	private static final long serialVersionUID = 1L;

}
