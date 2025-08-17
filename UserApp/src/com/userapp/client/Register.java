package com.userapp.client;

import java.util.Scanner;

import com.userapp.exception.TooLongPasswordException;
import com.userapp.exception.TooShortPasswordException;
import com.userapp.exception.UserNameAlreadyExistException;
import com.userapp.service.IValidationService;
import com.userapp.service.ValidationServiceImpl;

public class Register {

	public static void main(String[] args) {
		

			
		IValidationService validationService = new ValidationServiceImpl();

		System.out.println("Enter UserName for registraion");
		Scanner scanner = new Scanner(System.in);
		String userName = scanner.next();
		boolean isValidUser = false;
		boolean isValidPwd = false;
		try {
			isValidUser = validationService.validateUserName(userName);
			if (isValidUser) {
				System.out.println("Enter password: ");
				String password = scanner.next();
				isValidPwd = validationService.validatePassword(password);
				if (isValidPwd) {
					System.out.println("Welcome " + userName + "!, You registraion has been done successfully");
				}
			}
		} catch (UserNameAlreadyExistException e) {
			System.out.println(e.getMessage());
		} catch (TooShortPasswordException e) {
			System.out.println(e.getMessage());
		} catch (TooLongPasswordException e) {
			System.out.println(e.getMessage());
		}

	}


}
