package com.lti.ui;
import java.util.*;
import com.lti.bean.*;


public class Demo7 {

	public static void main(String[] args) {
		Set<Account> s = new HashSet<Account>(); // no duplicates and
		s.add(new Account(100,"Ram",50000.00));
		s.add(new Account(101,"Sham",20000.00));
		s.add(new Account(102,"Krishna",10000.00));
		s.add(new Account(100,"Ram",50000.00));
		//s.add("100");
		
		int size= s.size();
		System.out.println("Number of elements"+size);
		System.out.println(s);

	}

}
