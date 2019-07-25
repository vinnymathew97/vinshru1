package com.lti.ui;
import com.lti.bean.*;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Generating super class object
		Employee emp=new Employee(100,"King",24000);
		Manager m=new Manager(101,"Raja",50000,"IT");
		Engineer en=new Engineer(102,"Amir Khan",25000,"Swiggy");
		
		String empdata=emp.toString();
		System.out.println(empdata);
		
		String mgrdata=m.toString();
		System.out.println(mgrdata);
		
		String engdata=en.toString();
		System.out.println(engdata);
		
		

	}

}
