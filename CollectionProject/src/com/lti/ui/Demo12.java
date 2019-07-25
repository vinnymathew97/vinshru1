package com.lti.ui;
import java.util.*;
import com.lti.bean.*;
public class Demo12 {

	public static void main(String[] args) {
		Map<Long,Account> paytm= new HashMap<Long,Account>();
		paytm.put(new Long(9899898998L), new Account(100,"Ram",25000.00));
		paytm.put(1212121212L, new Account(101,"Sham",22000.00));
		paytm.put(4848484848L, new Account(102,"Krishna",35000.00));
		//get(key)
		//retrieving acc of mobile key 1212121212
		Account ob=paytm.get(1212121212L);
		System.out.println(ob);
		System.out.println("==============");
		Set<Long> mobilekeys=paytm.keySet(); //retrieves all keys into set
		Iterator<Long> it= mobilekeys.iterator();
		while (it.hasNext())
		{
			Long key=it.next();
			Account value=paytm.get(key);
			System.out.println(key+"--->"+value);
		}
 	}

}
