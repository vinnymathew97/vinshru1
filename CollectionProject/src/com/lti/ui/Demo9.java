package com.lti.ui;
import java.util.*;

public class Demo9 
{

public static void main(String[] args)
{
		//Set<String> s = new HashSet<String>(); // no duplicates and
		List<String>s=new ArrayList<String>();
		s.add("Ram");
		s.add("Sham");
		s.add("Krishna");
		s.add("Ram");
		//s.add("100");
		
		int size= s.size();
		System.out.println("Number of elements"+size);
		System.out.println(s);
		
		Iterator <String> it = s.iterator();
		while(it.hasNext())
		{
			String el=it.next();
			System.out.println(el);
		}
		for(String sa : s)
			System.out.println(sa);
	}

}
