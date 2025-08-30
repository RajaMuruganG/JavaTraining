package com.voterapp.service;

import com.voterapp.exception.InvalidVoterIdException;
import com.voterapp.exception.LocalityNotFoundException;
import com.voterapp.exception.NotEligibleException;
import com.voterapp.exception.UnderAgeException;

public class ElectionBoothServiceImpl implements IElectionBoothService {

	@Override
	public boolean checkElegibility(int age, String locality, int vid) throws NotEligibleException {

		return checkAge(age) ? checkLocality(locality) ? checkVoterId(vid) : false : false;
	}

	private boolean checkAge(int age) throws UnderAgeException {
		if(age<18) {
			throw new UnderAgeException("Voter age is less than 18 and you are not elligble to vote");
		}
		return true;
	}

	private boolean checkLocality(String locality) throws LocalityNotFoundException {

		String[] locations = { "Velachery", "T-Nagar", "Saidapet", "Guindy" };
		boolean isValidLocation = false;
		for (String location : locations) {
			if (locality.equalsIgnoreCase(location)) {
				isValidLocation = true;
			}
		}

		if (!isValidLocation) {
			throw new LocalityNotFoundException("Voter is not elligible to vote this location");
		}

		return isValidLocation;
	}

	private boolean checkVoterId(int voterId) throws InvalidVoterIdException {
		if(voterId <1000 || voterId > 9999) {
			throw new InvalidVoterIdException("Voter id is invalid");
		}
		return true;
	}

}
