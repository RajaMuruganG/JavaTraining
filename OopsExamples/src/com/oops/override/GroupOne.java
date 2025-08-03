package com.oops.override;

public class GroupOne extends Project {

	@Override
	void projectAssigned() {
		System.out.println("JAVA project");
	}

	
	String[] showTools() {
		String[] tools = {"Java", "SpringBoot"};
		return tools;
	}
	
}
