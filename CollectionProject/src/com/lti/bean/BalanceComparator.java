package com.lti.bean;

import java.util.Comparator;

public class BalanceComparator implements Comparator<Account> {

	@Override
	public int compare(Account o1, Account o2) {
		double diff=o1.getBalance()-o2.getBalance();
		if(diff>0)
			return 1;
		else if(diff<0)
			return -1;
		else
			return 0;
	}
	

}
