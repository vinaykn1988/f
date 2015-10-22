package com.brillio.training.web.actions;

import java.util.List;

import com.brillio.training.dao.DaoException;
import com.brillio.training.dao.DaoFactory;
import com.brillio.training.dao.ProductDao;
import com.brillio.training.entity.Product;

public class ProductAction {

	private double minPrice, maxPrice;
	private List<Product> products;

	public double getMinPrice() {
		return minPrice;
	}

	public void setMinPrice(double minPrice) {
		this.minPrice = minPrice;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public double getMaxPrice() {
		return maxPrice;
	}

	public void setMaxPrice(double maxPrice) {
		this.maxPrice = maxPrice;
	}

	public String getProductsByPrice() throws DaoException {

		ProductDao dao = DaoFactory.getProductDao();
		products = dao.getProductsByPriceRange(minPrice, maxPrice);
		return "success";
	}
	
	public String getAllProducts() throws DaoException {

		ProductDao dao = DaoFactory.getProductDao();
		products = dao.getAllProducts();
		return "success";
	}

}