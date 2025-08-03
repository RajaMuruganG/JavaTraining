package com.oops.override;

public class Customer {

	public static void main(String[] args) {

		Project project = new GroupOne();
		project.projectAssigned();
		// here project ref can not access the "showTools" method of GroupOne.

		GroupOne groupOne = (GroupOne) project;

		groupOne.projectAssigned();
		String[] groupOneTools = groupOne.showTools();
		for (String groupOneTool : groupOneTools) {
			System.out.print(groupOneTool + " ");
		}
		System.out.println();

//		System.out.println(project.getClass().getName());
//		GroupTwo groupTwo = (GroupTwo) project;
//		groupTwo.projectAssigned();

		project = new GroupTwo();
//		project.projectAssigned();
		
		GroupTwo groupTwo = (GroupTwo) project;
		groupTwo.projectAssigned();
		String[] groupTwoTools = groupTwo.showTools();
		System.out.println("Group Two Tools");

		for (String grpTow : groupTwoTools) {
			System.out.println(grpTow);	
		}
	}
}
