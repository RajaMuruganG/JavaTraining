package com.inter.calculator;

public class Main {

	public static void main(String[] args) {
//		ICalculator iCal = new BasicCalculator();
//		iCal.add(10, 20);
//		iCal.multiply(35, 20);
		
		
		IScientific scientific =new ScientificCalculator();
		scientific.add(10, 20);
		scientific.multiply(35, 20);
		scientific.sqroot(22);
		scientific.cube(9);
		
		
	}
}
