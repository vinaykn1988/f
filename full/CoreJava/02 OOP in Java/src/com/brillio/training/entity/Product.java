package com.brillio.training.entity;

public class Product {

	private int productId;
	private String productName;
	private double unitPrice;
	
	//aggregation
	private Category category;
	
	public Product() {
	}

	public Product(int productId, String productName, double unitPrice) {
		this.productId = productId;
		this.productName = productName;
		this.unitPrice = unitPrice;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", unitPrice=" + unitPrice + "]";
	};
	
	public void print(){
		
		System.out.println("Id  :" + productId);
		System.out.println("Name  :" + productName);
		System.out.println("Price  :Rs." + unitPrice);
	}
	
	
}
