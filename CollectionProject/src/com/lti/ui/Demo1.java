package com.lti.ui;
import com.lti.bean.*;

public class Demo1 {

	public static void main(String[] args) {
    Account ob[]=new Account[3];
    ob[0]=new Account(111,"Ram",25000.00);
    ob[1]=new Account(522,"Sham",22000.00);
    ob[2]=new Account(333,"Ganesh",10000.00);
    
    
    	for(Account a:ob)
    		System.out.println(a);
	}

}
