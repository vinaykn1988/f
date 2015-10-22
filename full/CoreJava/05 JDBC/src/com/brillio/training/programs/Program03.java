package com.brillio.training.programs;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.brillio.training.util.DbUtil;

public class Program03 {

	public static void main(String[] args) throws Exception{
		
		Connection conn = DbUtil.getConnection();
		
		int id = 8;
		String name = "FedEx couriers";
		String phone = "(555) 393-3843";
		
		String sql = "insert into shippers values(?, ?, ?)";
				PreparedStatement stmt = conn.prepareStatement(sql);
		
		// set the parameters before sending to server
		stmt.setInt(1,id);
		stmt.setString(2, name);
		stmt.setString(3, phone);
		
		stmt.execute();
		stmt.close();
		conn.close();
		
		System.out.println("Data inserted");
		
	}
}
