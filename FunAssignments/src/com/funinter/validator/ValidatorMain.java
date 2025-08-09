package com.funinter.validator;

import java.util.Scanner;

public class ValidatorMain {

	public static void main(String[] args) {
		
		String[] users = {"Raja","Shanmu"}; 
		System.out.println("Enter Username");
		Scanner scanner = new Scanner(System.in);
		String userName = scanner.next();
		IValidator validator = (name)->{
			
			boolean isExistingUser = false;
			for (String user: users) {
				if(user.equals(name))
				{
					isExistingUser= true;
				}
			}
			
			return isExistingUser ? "You are logged in "+ name: "You are registered "+name;
		};
		
		String userStatus = validator.validateUser(userName);
		System.out.println(userStatus);
		
	}
}
