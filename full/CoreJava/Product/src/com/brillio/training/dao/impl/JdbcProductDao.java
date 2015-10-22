package com.brillio.training.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.brillio.training.dao.ProductDao;
import com.brillio.training.entity.Product;
import com.brillio.training.util.DbUtil;

public class JdbcProductDao implements ProductDao {

	
	public void addProduct(Product product) throws Exception {

		Connection conn = DbUtil.getConnection();
		String sql = "insert into Products values (?,?,?,?,?,?,?,?,?,?)";
		
		int productId = product.getProductId();
		String productName = product.getProductName();
	    int supplierId = product.getSupplierId();
		int categoryId = product.getCategoryId();
		String quantityPerUnit = product.getQuantityPerUnit();
	    double unitPrice = product.getUnitPrice();
	    int unitsInStock = product.getUnitsInStock();
		int unitsOnOrder = product.getUnitsOnOrder();
		int reorderLevel = product.getReorderLevel();
		int discontinued = product.getDiscontinued();
		
		PreparedStatement stmt = conn.prepareStatement(sql);
		
		stmt.setInt(1,productId);
		stmt.setString(2,productName);
		stmt.setInt(3,supplierId);
		stmt.setInt(4,categoryId);
		stmt.setString(5,quantityPerUnit);
		stmt.setDouble(6,unitPrice);
		stmt.setInt(7,unitsInStock);
		stmt.setInt(8,unitsOnOrder);
		stmt.setInt(9,reorderLevel);
		stmt.setInt(10,discontinued);
		
		stmt.execute();
		
		System.out.println("Product has been added");
		
		stmt.close();
		conn.close();
		
	}

	@Override
	public Product getProduct(int productId) throws Exception {
		
		Connection conn = DbUtil.getConnection();
		String sql = "select * from products where product_id = ?";
		PreparedStatement stmt = conn.prepareStatement(sql);
		stmt.setInt(1, productId);
		
		ResultSet rs = stmt.executeQuery();
		
		int count = stmt.getUpdateCount();
		if(count==0){
			System.out.println("No product with product id as" + productId);
		}
		else
		{
			System.out.println("Product Retrieved");
		}
		
		return null;
	}

	
	
	@Override
	public void updateProduct(Product product) throws Exception {
		
		Connection conn = DbUtil.getConnection();
		String sql = "update products set product_Name = ?, supplierId =?, categoryId =?, quantityPerUnit =?, "
				+ "unitPrice=?, unitsInStock=?, unitsOnOrder=?, reorderlevel=?, discontinued=?";
		
		int productId = product.getProductId();
		String productName = product.getProductName();
	    int supplierId = product.getSupplierId();
		int categoryId = product.getCategoryId();
		String quantityPerUnit = product.getQuantityPerUnit();
	    double unitPrice = product.getUnitPrice();
	    int unitsInStock = product.getUnitsInStock();
		int unitsOnOrder = product.getUnitsOnOrder();
		int reorderLevel = product.getReorderLevel();
		int discontinued = product.getDiscontinued();
		
		PreparedStatement stmt = conn.prepareStatement(sql);
		
		stmt.setInt(1,productId);
		stmt.setString(2,productName);
		stmt.setInt(3,supplierId);
		stmt.setInt(4,categoryId);
		stmt.setString(5,quantityPerUnit);
		stmt.setDouble(6,unitPrice);
		stmt.setInt(7,unitsInStock);
		stmt.setInt(8,unitsOnOrder);
		stmt.setInt(9,reorderLevel);
		stmt.setInt(10,discontinued);
		
		stmt.execute();
		
		System.out.println("Product has been added");
		
		stmt.close();
		conn.close();
		

	}

	@Override
	public void deleteProduct(int productId) throws Exception {
		// TODO Auto-generated method stub

	}

}
