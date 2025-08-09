package com.funinter.calculator;

import java.util.Scanner;

public class Restuarnt {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("To see menu detail, Enter B for Breakfast, L for Lunch, D for Dinner");
		String menuType = scanner.next();

		IMenu iMenu = (type) -> {
			if (type.equals("B")) {
				return new String[] { "Dosa", "Idly", "Pongal" };
			} else if (type.equals("L")) {
				return new String[] { "Briyani", "Meal" };
			} else if (type.equals("D")) {
				return new String[] { "Chappathi", "Parrota" };
			}

			return new String[] { "Invalid" };
		};
		String[] menus = iMenu.menuDetails(menuType.toUpperCase());
		for (String menu: menus) {
			System.out.println(menu);
		}
	
		scanner.close();
	}

}
