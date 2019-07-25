package com.lti.ui;
import java.util.*;

public class Demo5 {

	public static void main(String[] args) {
		Map s = new HashMap(); 
		s.put("Rancho", "Amir Khan");
		s.put("Raju", "Sharman Joshi");
		s.put("Chatur", "abc");
		int size= s.size();
		s.put("Rancho", "Amir");
		System.out.println("Number of elements"+size);
		System.out.println(s);

	}

}
