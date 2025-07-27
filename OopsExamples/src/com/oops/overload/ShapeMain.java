package com.oops.overload;

public class ShapeMain {

	public static void main(String[] args) {

		Shape shape = new Shape();
		shape.area(10);
		shape.area((int)20.5f);
		int result1 =shape.area(10, 20);
		System.out.println("Rect "+ result1);
		double result2 = shape.area(10,(int) 5.2f);
		System.out.println("Tri "+ result2);
	}
}
