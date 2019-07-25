package com.lti.ui;
import com.lti.bean.*;
import java.util.*;

public class Demo2 {

	public static void main(String[] args) {
ArrayList <Account> alist = new ArrayList<Account>();
    alist.add(new Account(111,"Ram",25000.00));
    alist.add(new Account(522,"Sham",22000.00));
    alist.add(new Account(333,"Ganesh",10000.00));
    alist.add(new Account(233,"Krishna",10000.00));
    
    	for(Account a:alist)
    		System.out.println(a);
	}

}
