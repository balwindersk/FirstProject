package com.inheritance;

public class Parent {
	final String schoolName="Dexters";
	String department;
	String address;
	public Parent(String department, String address) {
		super();
		this.department = department;
		this.address = address;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getSchoolName() {
		return schoolName;
	}
	

}
