package com.brillio.training.programs;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.brillio.training.util.DbUtil;

public class Program02 {

	public static void main(String[] args) throws Exception{
		
		Connection conn = DbUtil.getConnection();
		
		int id = 8;
		
		String sql = "delete from shippers where shipper_id=?";
				PreparedStatement stmt = conn.prepareStatement(sql);
		
		// set the parameters before sending to server
		stmt.setInt(1,id);
		
		stmt.execute();
		// the method getUpdateCount() return the number of
		// rows affected by the DML (INSERT/UPDATE/DELETE) statement
		int count = stmt.getUpdateCount();
		if(count==0){
			System.out.println("No row with shipper id" + id);
		}
		else
		{
			System.out.println("Data delted.");
		}
		
		stmt.close();
		conn.close();
		
		
	}
}
