package com.cogent.assessment;

/*
 * Create an application in Spring framework which contains Employee bean class with the following properties. empId, empName, empSal
 * Initialize the bean using the annotation based configuration and print all the employee details on console.
 */

public class Employee 
{
	private int empId;
	private String empName;
	private double empSal;
	
	public int getEmpId() { return empId; }
	public void setEmpId(int empId) { this.empId = empId; }
	public String getEmpName() { return empName; }
	public void setEmpName(String empName) { this.empName = empName; }
	public double getEmpSal() { return empSal; }
	public void setEmpSal(double empSal) { this.empSal = empSal; }
	
	public Employee() { super(); }
	
	public Employee(int empId, String empName, double empSal) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
	}	
}