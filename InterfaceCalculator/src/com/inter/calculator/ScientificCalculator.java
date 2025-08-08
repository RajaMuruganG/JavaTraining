package com.inter.calculator;

public class ScientificCalculator extends BasicCalculator implements IScientific {

	@Override
	public void sqroot(double x) {
		  double result = Math.sqrt(22);
		System.out.println("Square Root of " + x + " is: " + String.format("%.2f", result));
	}

	@Override
	public void cube(double x) {
		System.out.println("Cubic of " + x + " is: " + (Math.pow(x, 3)));
	}

}
