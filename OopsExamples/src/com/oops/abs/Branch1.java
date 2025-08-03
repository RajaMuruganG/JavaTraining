package com.oops.abs;

public class Branch1 extends Bank {

	@Override
	void carLoan() {

		System.out.println("Branch 1 Car loan");
	}

	@Override
	void homeLoan() {
		System.out.println("Branch 1 Home loan");
	}

	@Override
	void personalLoan() {
		System.out.println("Branch 1 Personal loan");
	}
	
	void payDetails() {
		System.out.println("Bank1 Pay Detail");
	}

}
