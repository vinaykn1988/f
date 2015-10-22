package com.brillio.training.programs;

import com.brillio.training.entity.Product;

import com.brillio.training.dao.impl.JdbcProductDao;;

public class program01 {
	
	public static Product createProduct(){
		
		Product p1 = new Product();
		
		p1.setProductId(79);
		p1.setProductName("Ice-cream");
		p1.setSupplierId(1);
		p1.setCategoryId(4);
		p1.setQuantityPerUnit("50boxes");
		p1.setUnitPrice(50.00);
		p1.setUnitsInStock(45);
		p1.setUnitsOnOrder(14);
		p1.setReorderLevel(5);
		p1.setDiscontinued(0);
		
		return p1;
	}
	
public static Product update(){
		
		Product p1 = new Product();
		
		p1.setProductId(79);
		p1.setProductName("lolly-ice");
		p1.setSupplierId(1);
		p1.setCategoryId(4);
		p1.setQuantityPerUnit("50boxes");
		p1.setUnitPrice(50.00);
		p1.setUnitsInStock(45);
		p1.setUnitsOnOrder(14);
		p1.setReorderLevel(5);
		p1.setDiscontinued(0);
		
		return p1;
	}
	
	public static void main(String[] args) throws Exception {
		
		JdbcProductDao dao = new JdbcProductDao();
		
//		dao.addProduct(createProduct());
		
		dao.getProduct(78);

		dao.updateProduct(update());
	}

}
