package com.greatlearning.model;

public class Employee {
	private String empFirstName;
	private String empLastName;
	public Employee(String empFirstName, String empLastName) {
		this.empFirstName = empFirstName;
		this.empLastName = empLastName;
	}
	public String getFirstName() {
		return empFirstName;
	}
	public void setFirstName(String empFirstName) {
		this.empFirstName = empFirstName;
	}
	public String getLastName() {
		return empLastName;
	}
	public void setLastName(String empLastName) {
		this.empLastName = empLastName;
	}
	
}
