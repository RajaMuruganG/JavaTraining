package com.inher.quest2;

public class Savings extends Account {

	Savings(double balance) {
		super(balance);
	}

	void withdraw(double amount) {
		if (amount < 0) {
			System.out.println("Invalid amount for withdraw from your savings account");
		}

		if (amount > this.balance) {
			System.out.println("Withdraw amount is greater than your Savings balance");
		} else {
			this.balance -= amount;
		}

	}

	void deposit(double amount) {
		if (amount > 0) {
			this.balance += amount;
		} else {
			System.out.println("Invalid Deposit amount");
		}
	}

}
