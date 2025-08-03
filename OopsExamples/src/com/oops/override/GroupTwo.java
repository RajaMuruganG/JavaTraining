package com.oops.override;

public class GroupTwo extends Project {

	@Override
	void projectAssigned() {
		System.out.println(".Net project");
	}

	String[] showTools() {
		String[] tools = { "c++", ".Net" };
		return tools;
	}

}
