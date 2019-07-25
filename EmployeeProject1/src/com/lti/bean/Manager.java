package com.lti.bean;

public class Manager  extends Employee{
 private String department;
 public Manager() {
		// TODO Auto-generated constructor stub
	} 
 
 public Manager(int eid, String ename, double salary, String department)
 {
	super.setEid(eid);
	setEname(ename);
	super.salary= salary;
	this.department= department;
 }

public String getDepartment() {
	return department;
}

public void setDepartment(String department) {
	this.department = department;
}
 
	
}
