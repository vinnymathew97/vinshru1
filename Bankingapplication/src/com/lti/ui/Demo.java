package com.lti.ui;
import com.lti.bean.*;

public class Demo {
	public static void main(String args[])
	{ 
		String res1 = null;
		Customer ob1=new Customer();
		ob1.acceptvalues(1000000001, "Rahil", "QCTI17786754",9810076528l);
		res1 = ob1.display();
		System.out.println(res1);	
	}
	

}
