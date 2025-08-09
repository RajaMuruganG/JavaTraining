package com.oops.methodRef;

public class Main {

	public static void main(String[] args) {
		
		Loan loan = new Loan();
		
		//refer to an instance method
		IProcessor process =loan::checkDocuments;
		process.showProcess("Loan");
		
		//refer to an static method of Loan class
		process = Loan::printTypes;
		process.showProcess("Home");
		
		
		System.out.println("-----");
		
		Games games = new Games();
		
		ISportsDetails sportsDetails = games::getNameType;
		String[] gamesType = sportsDetails.showGames("out");
		for (String game: gamesType) {
			System.out.println(game);
		}
	}
}
