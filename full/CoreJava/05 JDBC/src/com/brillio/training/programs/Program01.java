package com.brillio.training.programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Program01 {

	public static void main(String[] args) 
		throws Exception{
			
		String url = "jdbc:hsqldb:hsql://localhost/nwind";
		String user = "sa";
		String password = "";
		String driverClassName = "org.hsqldb.jdbcDriver";
		
		// Step 1: register the driver with DriverManager
		Class.forName(driverClassName);
		
		// Step 2: use DriverManager to get an instance of a Connection
		Connection conn = DriverManager.getConnection(url, user, password);
		System.out.println("Got an instanceof" + conn.getClass());
		
		// Step 3: create an object that can execute SQL commands
		Statement stmt = conn.createStatement();
		
		// Step 4: execute SQL command
		String sql = "insert into shippers values(5, 'Blue dart', '(928) 333-0453')";
		stmt.execute(sql);
		
		// Step 5: close resources
		stmt.close();
		conn.close();
		
		System.out.println("Data inserterd.");
		
		}
	
}
