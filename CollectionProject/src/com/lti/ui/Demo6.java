package com.lti.ui;
import java.util.*;

public class Demo6 {

	public static void main(String[] args) {
		Set<String> s = new HashSet<String>(); // no duplicates and
		s.add("Ram");
		s.add("Sham");
		s.add("Krishna");
		s.add("Ram");
		//s.add("100");
		
		int size= s.size();
		System.out.println("Number of elements"+size);
		System.out.println(s);

	}

}
