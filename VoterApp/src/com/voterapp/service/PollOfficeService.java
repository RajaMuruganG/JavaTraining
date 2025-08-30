package com.voterapp.service;

import java.util.Scanner;

import com.voterapp.exception.NotEligibleException;

public class PollOfficeService {

	Scanner scanner = null;

	public PollOfficeService() {
		scanner = new Scanner(System.in);
	}

	public void checkUserElligiblity() {
		System.out.println("Enter Voter age:");
		int age = scanner.nextInt();
		System.out.println("Enter Voter locality:");
		String location = scanner.next();
		System.out.println("Enter Voter voterId:");
		int voterId = scanner.nextInt();

		IElectionBoothService boothService = new ElectionBoothServiceImpl();
		try {
			boolean elligibleToVote = boothService.checkElegibility(age, location, voterId);
			if (elligibleToVote) {
				System.out.println("");
				System.out.println("-----> This Voter is elligble to vote at " + location+" <-----");
			}
		} catch (NotEligibleException e) {
			System.out.println("xxxx--- "+e.getMessage()+" ---xxxx");
		} finally {
			System.out.println("");
			System.out.println("Would you like to verify another Voter ? Enter Y to continue N to terminate");
			String choice = scanner.next();
			if (choice.equalsIgnoreCase("Y")) {
				checkUserElligiblity();
			} else {
				System.out.println("Bye, Your session has been ended");
				scanner.close();
			}
		}
	}

}
