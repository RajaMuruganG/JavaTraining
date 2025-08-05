package com.inher.quest2;

public class Current extends Account {

	Current(double balance) {
		super(balance);
		// TODO Auto-generated constructor stub
	}

	void withdraw(double amount) {
		if (amount < 0) {
			System.out.println("Invalid amount for withdraw from your current account");
		}

		if (amount > this.balance) {
			System.out.println("Withdraw amount is greater than your current balance");
		} else if (this.balance - amount < 500) {
			System.out.println(
					"Your remaining balance is less than minimum balance, 20 rupees addition charges applicable for this transaction");
			this.balance -= (amount + 20);
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
