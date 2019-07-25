package com.lti.bean;

public class Account implements Comparable<Account> {
	private int aid;
	private String aname;
	private double balance;
	
	public Account() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public int hashCode() {
		System.out.println("Account Hashcode");
		final int prime = 31;
		int result = 1;
		result = prime * result + aid;
		result = prime * result + ((aname == null) ? 0 : aname.hashCode());
		long temp;
		temp = Double.doubleToLongBits(balance);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Account equals");
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		if (aid != other.aid)
			return false;
		if (aname == null) {
			if (other.aname != null)
				return false;
		} else if (!aname.equals(other.aname))
			return false;
		if (Double.doubleToLongBits(balance) != Double.doubleToLongBits(other.balance))
			return false;
		return true;
	}

	public Account(int aid, String aname, double balance) {
		super();
		this.aid = aid;
		this.aname = aname;
		this.balance = balance;
	}

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getAname() {
		return aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [aid=" + aid + ", aname=" + aname + ", balance=" + balance + "]";
	}

	@Override
	public int compareTo(Account arg0) {
		System.out.println("Comparing ano of"+this.getAid()+"with"+arg0.getAid());
		int diff=this.getAid()-arg0.getAid();
		if(diff>0)
			return 1;
		else if(diff<0)
			return -1;
		else
			return 0;
		// TODO Auto-generated method stub
	 
	}
	

}
