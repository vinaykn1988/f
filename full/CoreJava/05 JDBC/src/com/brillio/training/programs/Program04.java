package com.brillio.training.programs;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.brillio.training.util.DbUtil;

public class Program04 {

	public static void main(String[] args) throws Exception{
		
		Connection conn = DbUtil.getConnection();
		String sql = "select * from products";
		PreparedStatement stmt = conn.prepareStatement(sql);
		ResultSet rs = stmt.executeQuery();
		
		while(rs.next()){
			
			String name = rs.getString("product_name");
			double price = rs.getDouble("unit_price");
			String qpu = rs.getString("quantity_per_unit");
		
		System.out.printf("%-30s %-30s %10.2f\n", name, qpu, price);
	}
	
	rs.close();
	stmt.close();
	conn.close();
	}
}