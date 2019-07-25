package com.lti.bean;

public class Employee {
  private int eid;
  private String ename;
  double salary;
  public Employee() {
	  
  }
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public Employee(int eid, String ename, double salary) {
	super();
	this.eid = eid;
	this.ename = ename;
	this.salary = salary;
}
@Override
public String toString() {
	return "Employee [eid=" + eid + ", ename=" + ename + ", salary=" + salary + "]";
}
  

}
