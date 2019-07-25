package com.lti.ui;
import java.util.*;

public class Demo10 
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
		
		s.remove("Sham");
		System.out.println(s);
		
		System.out.println("List spcific methods");
		System.out.println("Object at 2 index");
		String s2=s.get(2);
		System.out.println(s2);
		System.out.println(s);
		s.set(2, "Ganesh");
		System.out.println("After replacing at index 2"+s);
		s.add(2, "Durga");
		System.out.println("After replacing at index 2"+s);
		s.remove(1);
		System.out.println("After removing obj from index 1"+s);
		for(String sa : s)
			System.out.println(sa);
	}

}
