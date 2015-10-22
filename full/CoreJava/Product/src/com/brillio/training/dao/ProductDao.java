package com.brillio.training.dao;

import com.brillio.training.entity.Product;

public interface ProductDao {

	public void addProduct(Product product) throws Exception;
	public Product getProduct(int productId) throws Exception;
	public void updateProduct(Product product) throws Exception;
	public void deleteProduct(int productId) throws Exception;
}
