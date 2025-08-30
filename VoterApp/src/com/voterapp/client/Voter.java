package com.voterapp.client;

import java.util.Scanner;

import com.voterapp.service.PollOfficeService;

public class Voter {

	public static void main(String[] args) {

		System.out.println("Welcome to voter verification service");
		System.out.println("");
		PollOfficeService pollOfficeService = new PollOfficeService();
		pollOfficeService.checkUserElligiblity();
	}
}
