package com.funinter.course;

import java.util.Scanner;

public class CourseService {
	
	Scanner scanner =null;
	public CourseService() {
		scanner = new Scanner(System.in);
	}

	void courseEnquiry() {
		System.out.println("************");
		System.out.println("To see coure details, Enter F for FrontEnd, B for Backend, D for Database");
		String menuType = scanner.next();

		ICourses iCourses = (type) -> {
			if (type.equals("F")) {
				return new String[] { "Design", "Development" };
			} else if (type.equals("B")) {
				return new String[] { "Java", "Python" };
			} else if (type.equals("D")) {
				return new String[] { "Sql", "Nosql" };
			}

			return new String[] { "Invalid" };
		};
		String[] typeOfCourses = iCourses.printCourses(menuType.toUpperCase());
		for (String course : typeOfCourses) {
			System.out.println(course);
		}
		System.out.println("To know more about the course choose one among them");
		String courseType = scanner.next();

		iCourses = (type) -> {
			if (type.equalsIgnoreCase("design")) {
				return new String[] { "html", "css", "Bootstrap", "material" };
			} else if (type.equalsIgnoreCase("development")) {
				return new String[] { "html", "css", "react", "angular" };
			} else if (type.equalsIgnoreCase("java")) {
				return new String[] { "Spring", "Hibernate" };
			} else if (type.equalsIgnoreCase("python")) {
				return new String[] { "Django", "Flask" };
			} else if (type.equalsIgnoreCase("sql")) {
				return new String[] { "MySQL", "Oracle" };
			} else if (type.equalsIgnoreCase("nosql")) {
				return new String[] { "MongoDB", "CouchDB" };
			}
			return new String[] { "Invalid course" };
		};
		String[] courseDetails = iCourses.printCourses(courseType);

		for (String course : courseDetails) {
			System.out.println(course);
		}
		System.out.println("---");
		System.out.println("For more Detail Call +91-9876543210");
		System.out.println("Would like to expolore anyother course detail? Press Y for Yes N for No");
		String choice = scanner.next();
		if (choice.equalsIgnoreCase("Y")) {
			courseEnquiry();
		}else {
			System.out.println("Thanks you");	
		}
		scanner.close();

	}

}
