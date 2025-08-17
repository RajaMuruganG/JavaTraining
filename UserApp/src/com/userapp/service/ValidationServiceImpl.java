package com.userapp.service;

import com.userapp.exception.TooLongPasswordException;
import com.userapp.exception.TooShortPasswordException;
import com.userapp.exception.UserNameAlreadyExistException;

public class ValidationServiceImpl implements IValidationService {

	@Override
	public boolean validateUserName(String userName) throws UserNameAlreadyExistException {
		String[] userNames = {"Raja","Shanmu","Priya"};
		boolean isExistingUser = false;
		for (String user : userNames) {
			if(user.equals(userName)) {
				isExistingUser =true;
			}
		}
		if(isExistingUser) {
			throw new UserNameAlreadyExistException("UserName is already Existing");
		}
		return true;
	}

	@Override
	public boolean validatePassword(String password) throws TooLongPasswordException, TooShortPasswordException {
		if(password.length() <=6) {
			throw new TooShortPasswordException("Length of the Password is too small, Expected length would be 7 to 16 char");
		}
		
		if(password.length() >16) {
			throw new TooLongPasswordException("Length of the Password is too long, Expected length would be 7 to 16 char");
		}
		return true;
	}

}
