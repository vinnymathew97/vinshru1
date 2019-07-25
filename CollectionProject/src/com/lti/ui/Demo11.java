package com.lti.ui;
import java.util.*;

public class Demo11 {

	public static void main(String[] args) {
		Map<String,String>s = new HashMap<String, String>(); 
		s.put("Rancho", "Amir Khan");
		s.put("Raju", "Sharman Joshi");
		s.put("Chatur", "abc");
		int size= s.size();
		s.put("Rancho", "Amir");
		System.out.println("Number of elements"+size);
		System.out.println(s);
		
		s.put("Chatur", "Omi");
		size=s.size();
		System.out.println("No of key value pairs"+size);
		System.out.println(s);

	}

}
