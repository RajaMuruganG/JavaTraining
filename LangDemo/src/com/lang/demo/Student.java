package com.lang.demo;

import java.io.Serializable;

public class Student implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String studentName;
	String studentId;
	String studentMarks;
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", studentId=" + studentId + ", studentMarks=" + studentMarks
				+ "]";
	}
	public Student(String studentName, String studentId, String studentMarks) {
		this.studentName = studentName;
		this.studentId = studentId;
		this.studentMarks = studentMarks;
	}
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getStudentMarks() {
		return studentMarks;
	}
	public void setStudentMarks(String studentMarks) {
		this.studentMarks = studentMarks;
	}
	
}
