package com.apps;
import java.util.List;
import java.util.Scanner;

import com.lti.dao.ResultsDAO;
import com.lti.daoimpl.ResultsDAOImpl;

import com.lti.model.Results;


public class App 
{
	public static void main(String[] args) 
	{
		int choice=0;
		
		Scanner sc = new Scanner(System.in);
		ResultsDAO dao = new ResultsDAOImpl();

		while(choice !=6)
		{
		System.out.println("MMMMYYYYYY details");
		System.out.println("1.add Results");
		System.out.println("2.delete Results");
		System.out.println("3.search Results ");
		System.out.println("4.List of Results by result ");
		System.out.println("5.exit");
	
		System.out.println("enter choice");
		
		
		
		choice = sc.nextInt();
		
		switch(choice) 
		{
		case 1:
		{
		 Results r = null;
			r=acceptResults();
			dao.addResults(r);

			break;
		}
		case 2:
		{
			System.out.println("enter rollno to delete");
			int rollno = new Scanner(System.in).nextInt();
			
			dao.deleteResults(rollno);
			break;
		}
		case 3:
		{
			System.out.println("enter roll no to search");
			int rollno=new Scanner(System.in).nextInt();
			Results r=dao.searchResults(rollno);
			System.out.println(r);

			break;
		}
		case 4:
		{

			List<Results> listByResult =dao.listByResult();
			List<Results> resultlist =  listByResult;
			for(Results r:resultlist)
			{
				System.out.println(r);
			}
			break;
		}
	}		
}
}
	
	private static Results acceptResults() 
	{
		Scanner scanner1=new Scanner(System.in);
	      
	       System.out.println("Enter first name");
	       String fname=scanner1.next();
	       
	       System.out.println("Enter last name");
	       String lname=scanner1.next();
	       System.out.println("Enter course name");
	       String course=scanner1.next();
	       System.out.println("Enter result pass or fail");
	       String result=scanner1.next();
	       
	       Results r=  new Results(fname,lname,course,result);
	       
		return r ;
	}
}
