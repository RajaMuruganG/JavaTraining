package com.oops.abs;

public abstract class Bank {

	abstract void carLoan();

	abstract void homeLoan();

	abstract void personalLoan();
	
	final void adminDetail(){
		System.out.println("Admin Details From BANK");
	}

}
