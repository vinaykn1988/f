package com.brillio.training.dao.impl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

import com.brillio.training.dao.DaoException;
import com.brillio.training.dao.ProductDao;
import com.brillio.training.entity.Product;

public class FileProductDao implements ProductDao {

	@Override
	public void addProduct(Product product) throws DaoException {

		FileOutputStream file;
		ObjectOutputStream out;
		try {
			file = new FileOutputStream("product.dat");
			out = new ObjectOutputStream(file);
			out.writeObject(product);
			out.close();
			file.close();

		}

		catch (FileNotFoundException e) {

		} catch (IOException e) {

		}

	}

	@Override
	public Product getProduct(int productId) throws DaoException {

		FileInputStream file;
		ObjectInputStream in;
		try {
			file = new FileInputStream("product.dat");
			in = new ObjectInputStream(file);
			Product p = (Product) in.readObject();
			in.close();
			file.close();
			return p;
		} catch (Exception e) {
			throw new DaoException(e);
		} 

	}

	@Override
	public void updateProduct(Product product) throws DaoException {

		FileOutputStream file;
		ObjectOutputStream out;
		
		try {
			file = new FileOutputStream("product.dat");
			out = new ObjectOutputStream(file);
			
			
		} catch (Exception e) {
			throw new DaoException(e);
		} 
		
	}

	@Override
	public void deleteProduct(int productId) throws DaoException {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Product> getAllProducts() throws DaoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getProductsByPriceRange(double min, double max) throws DaoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getProductsByCategory(int categoryId) throws DaoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getProductsBySupplier(int supplierId) throws DaoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getProductsInStock() throws DaoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getProductsNotInStock() throws DaoException {
		// TODO Auto-generated method stub
		return null;
	}

}
