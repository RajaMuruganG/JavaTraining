package com.inher.quest2;

import java.util.Scanner;

public class ATMMain {

	public static void main(String[] args) {

		Account account = null;
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to ABC Bank");
		System.out.println("Enter S for Saving Account and C for current Account");
		String choice = scan.next();

		switch (choice.toLowerCase()) {
		case "s": {
			account = new Savings(1000);
			System.out.println("You chose Savings Account");

			System.out.println("Enter D for Deposit Account and W for withdraw");
			String operationChoice = scan.next();
			if (operationChoice.equalsIgnoreCase("D")) {
				System.out.println("Enter Deposit Account");
				double amount = scan.nextDouble();
				account.deposit(amount);
				double balance = account.getBalance();
				System.out.println("Total Balance: "+ balance);
			} else if (operationChoice.equalsIgnoreCase("W")) {
				System.out.println("Enter Withdraw Account");
				double amount = scan.nextDouble();
				account.withdraw(amount);
				double balance = account.getBalance();
				System.out.println("Remaining Balance: "+ balance);
			} else {
				System.out.println("Invalid Operation");
			}

			break;
		}
		case "c": {
			account = new Current(1000);
			System.out.println("You chose Current Account");

			System.out.println("Enter D for Deposit Account and W for withdraw");
			String operationChoice = scan.next();
			if (operationChoice.equalsIgnoreCase("D")) {
				System.out.println("Enter Deposit Account");
				double amount = scan.nextDouble();
				account.deposit(amount);
				double balance = account.getBalance();
				System.out.println("Total Balance: "+ balance);
			} else if (operationChoice.equalsIgnoreCase("W")) {
				System.out.println("Enter Withdraw Account");
				double amount = scan.nextDouble();
				account.withdraw(amount);
				double balance = account.getBalance();
				System.out.println("Remaining Balance: "+ balance);
			} else {
				System.out.println("Invalid Operation");
			}
			
			break;
		}
		default:
			System.out.println("Invalid Account");
			break;
		}

	}
}
