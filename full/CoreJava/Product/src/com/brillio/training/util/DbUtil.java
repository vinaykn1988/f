package com.brillio.training.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbUtil {

	public static Connection getConnection() throws Exception{
		
		String url = "jdbc:hsqldb:hsql://localhost/nwind";
		String user = "sa";
		String password = "";
		String driverClassName = "org.hsqldb.jdbcDriver";
		
		Class.forName(driverClassName);
		
		return DriverManager.getConnection(url, user, password);
	}
	
}
