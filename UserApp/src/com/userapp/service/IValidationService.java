package com.userapp.service;

import com.userapp.exception.TooLongPasswordException;
import com.userapp.exception.TooShortPasswordException;
import com.userapp.exception.UserNameAlreadyExistException;

public interface IValidationService {
	
	boolean validateUserName(String userName) throws UserNameAlreadyExistException;
	
	boolean validatePassword(String password) throws TooLongPasswordException, TooShortPasswordException;

}
