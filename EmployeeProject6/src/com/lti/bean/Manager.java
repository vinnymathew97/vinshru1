package com.lti.bean;

public class Manager  extends Employee{
 private String department;
 public Manager() {
	

	} 
 
 public Manager(int eid, String ename, double salary, String department)
 {
	super(eid,ename,salary);
	this.department= department;
 }

public String getDepartment() {
	return department;
}

public void setDepartment(String department) {
	this.department = department;
}

@Override
 public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"Department is"+department;
	}
}
