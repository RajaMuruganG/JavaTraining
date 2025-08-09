package com.funinter.calculator;

public class CalculatorMain {

	public static void main(String[] args) {
		ICalculator calculator = (a,b)-> System.out.println("Addition "+(a+b));
		calculator.calculate(12, 20);
		calculator = (a,b)-> System.out.println("Sub "+(a-b));
		calculator.calculate(20, 8);
		calculator = (a,b)-> System.out.println("Mult "+(a*b));
		calculator.calculate(20, 8);
		calculator = (a,b)-> System.out.println("Div-- "+(a/b));
		calculator.calculate(20, 8);
	}
}
