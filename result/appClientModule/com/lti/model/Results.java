package com.lti.model;

public class Results 
{
private int rollno;
private String fname;
private String lname;
private String course;
private String result;


public Results() {
	super();
	// TODO Auto-generated constructor stub
}


public Results(int rollno, String fname, String lname, String course, String result) {
	super();
	this.rollno = rollno;
	this.fname = fname;
	this.lname = lname;
	this.course = course;
	this.result = result;
}


public Results(String fname, String lname, String course, String result) {
	super();
	this.fname = fname;
	this.lname = lname;
	this.course = course;
	this.result = result;
}


public int getRollno() {
	return rollno;
}


public void setRollno(int rollno) {
	this.rollno = rollno;
}


public String getFname() {
	return fname;
}


public void setFname(String fname) {
	this.fname = fname;
}


public String getLname() {
	return lname;
}


public void setLname(String lname) {
	this.lname = lname;
}


public String getCourse() {
	return course;
}


public void setCourse(String course) {
	this.course = course;
}


public String getResult() {
	return result;
}


public void setResult(String result) {
	this.result = result;
}


@Override
public String toString() {
	return "Results [rollno=" + rollno + ", fname=" + fname + ", lname=" + lname + ", course=" + course + ", result="
			+ result + "]";
}

	
}
