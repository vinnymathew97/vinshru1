package com.lti.bean;

public class Customer {
         
	private long accno;
	private String name;
	public String panno;
	public long  mobno;
	
	public void acceptvalues(long accno,String name,String panno,long mobno)
	{
		this.accno=accno;
		this.name=name;
		this.panno=panno;
		this.mobno=mobno;
	}
	
	public String display()
	{
		String s="Account No."+accno+"\n"+"Name "+name+"\n"+"Pancard No."+panno+"\n"+"Mobile No."+mobno;
		return s;
		 
	}

}
