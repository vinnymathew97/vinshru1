package com.lti.singletons;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionManager
{
	private static Connection connection; 
	
private ConnectionManager() {
	
	
}
	public static Connection getConnection() {
		if(connection==null) {
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","hr","hr");
			}
			
			catch(ClassNotFoundException e){
				e.printStackTrace();
				
			}
			catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return (Connection) connection;
	}
	public static void main(String[] args) {
		System.out.println(getConnection());
	}
}
