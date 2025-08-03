package com.oops.abs;

public abstract class Branch2 extends Bank {

	@Override
	void homeLoan() {
		System.out.println("Branch 2 Home loan");
	}

	@Override
	void personalLoan() {
		System.out.println("Branch 2 Personal loan");
	}
	
	
	void loanType() {
		System.out.println("Branch 2 Loan Type");
	}

}
