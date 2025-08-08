package com.inter.calculator;

public class BasicCalculator implements ICalculator {

	@Override
	public void add(int x, int y) {
		System.out.println("Addition of X and Y: "+ (x+y));
		
	}

	@Override
	public void multiply(int x, int y) {
		System.out.println("Multiply X and Y: "+ (x*y));		
	}

}
