package com.lti.bean;

public class Engineer  extends Employee{
	private String project;
	public Engineer() {
		// TODO Auto-generated constructor stub
	}
	public Engineer (int eid, String ename, double salary, String project)
	 {
		super(eid,ename,salary);
		this.project= project;
	 }
	public String getProject() {
		return project;
	}
	public void setProject(String project) {
		this.project = project;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"Project is"+project;
	}

}
