package com.lti.ui;
import com.lti.bean.*;

public class Demo1 {

	public static void main(String[] args) {
		//Generating super class object
		String empdata="";
		Employee emp=new Employee(100,"King",24000);
	    empdata=emp.toString();
		System.out.println(empdata);
		emp =new Manager(101,"Raja",50000,"IT");
		empdata=emp.toString();
		System.out.println(empdata);
		emp=new Engineer(102,"Amir Khan",25000,"Swiggy");
		empdata=emp.toString();
		System.out.println(empdata);	

	}

}
