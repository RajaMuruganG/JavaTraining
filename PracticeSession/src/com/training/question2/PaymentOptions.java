package com.training.question2;

public class PaymentOptions {

	void pay(double amount){// print "COD"+amount
		System.out.println("COD "+amount);
	}

	void pay(long cardnumber, int cvv, double amount) {
		// add print ln stmts "pay using card"+amount;
		System.out.println("pay using card "+amount);
	}

	void pay(String upiid, double amount) {
		// add print ln stmts "pay using gpay"+amount;
		System.out.println("pay using gpay "+amount);
	}

	void pay(String bankname, String username, double amount) {
		// print "pay using netbanking " + amount +" for "+ username;
		System.out.println("pay using netbanking " + amount +" for "+ username);
	}

}
