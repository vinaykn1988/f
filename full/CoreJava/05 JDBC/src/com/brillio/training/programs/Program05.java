package com.brillio.training.programs;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.brillio.training.util.DbUtil;

public class Program05 {

	public static void main(String[] args) throws Exception {

		int id = 123;

		Connection conn = DbUtil.getConnection();
		String sql = "select * from products where product_id = ?";
		PreparedStatement stmt = conn.prepareStatement(sql);

		stmt.setInt(1, id);

		ResultSet rs = stmt.executeQuery();

		if (rs.next()) {

			String name = rs.getString("product_name");
			double price = rs.getDouble("unit_price");
			String qpu = rs.getString("quantity_per_unit");

			System.out.printf("Name    :%s\n", name);
			System.out.printf("Quantity per unit  :%s\n", qpu);
			System.out.printf("Price    :%.2f USD\n", price);

		} else {

			System.out.println("Not found");
		}

		rs.close();
		stmt.close();
		conn.close();
	}
}