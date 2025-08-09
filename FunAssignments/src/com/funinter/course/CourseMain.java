package com.funinter.course;

import java.util.Scanner;

import com.funinter.calculator.IMenu;

public class CourseMain {
	
	public static void main(String[] args) {
		
		CourseService courseService = new CourseService();
		courseService.courseEnquiry();

	}

}
