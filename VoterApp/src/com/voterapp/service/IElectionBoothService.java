package com.voterapp.service;

import com.voterapp.exception.NotEligibleException;

public interface IElectionBoothService {

	boolean checkElegibility(int age, String locality, int vid) throws NotEligibleException;
}
