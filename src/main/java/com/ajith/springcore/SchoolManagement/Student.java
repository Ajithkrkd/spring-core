package com.ajith.springcore.SchoolManagement;

public class Student {

	private int roleNo;
	private String studentName;
	private String phoneNumber;
	
	public Student (int roleNo, String studentName, String phoneNumber) {
		this.setRoleNo(roleNo);
		this.setStudentName(studentName);
		this.setPhoneNumber(phoneNumber);
	}

	public int getRoleNo() {
		return roleNo;
	}

	public void setRoleNo(int roleNo) {
		this.roleNo = roleNo;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
}
