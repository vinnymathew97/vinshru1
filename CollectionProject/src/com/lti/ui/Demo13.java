package com.lti.ui;
import java.util.*;
import com.lti.bean.*;

public class Demo13 {

	public static void main(String[] args) {

		//Set<Account>aset= new TreeSet<Account>();
		//Comparator nc=new NameComparator();
		Comparator bc=new BalanceComparator();
		//Set<Account>aset= new TreeSet<Account>(nc);
		Set<Account>aset= new TreeSet<Account>(bc);
		
		aset.add(new Account (444,"Ram",25000.00));
		aset.add(new Account (222,"Sham",22000.00));
		aset.add(new Account (333,"Abdul",35000.00));
		aset.add(new Account (111,"Ganesh",33000.00));
		
		for(Account o:aset)
		{
			System.out.println(o);
		}
	}

}
