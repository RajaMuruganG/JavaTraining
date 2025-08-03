package com.oops.abs;

public class Client {

	public static void main(String[] args) {

		Bank bank = new Branch1();
		bank.carLoan();
		bank.homeLoan();
		bank.personalLoan();

		System.out.println();
		Branch1 branch1 = (Branch1) bank; // downcasting to branch1
		branch1.payDetails();

		System.out.println();

		// create obj of SubBranch and assign to Bank Ref
		bank = new SubBranch();
		bank.carLoan();
		bank.personalLoan();

		System.out.println();

		SubBranch subBranch = (SubBranch) bank;
		subBranch.depositType();
		subBranch.adminDetail();// called from subBranch
		subBranch.loanType();
	}
}
