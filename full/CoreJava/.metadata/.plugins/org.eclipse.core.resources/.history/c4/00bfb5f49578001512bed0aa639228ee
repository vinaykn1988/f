package com.brillio.training.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="categories")
public class Category {

	@Id
	@Column (name="category_id")
	private Integer categoryId;
	@Column (name="category_name")
	private String categoryName;
	private String description;
	private byte[]	picture;
	
	// one category has many (0 or more) products
	// should be represented by any collections (like array, list, set, map)
	// most commonly preferred one is the java.util.Set
	
	@OneToMany (mappedBy = "category")
	private Set<Product> products;
	
	// In the above annotation, the value for "mappedBy" element
	// correspond to the member variable of this class (Category) in 
	// the product class
	
	public Set<Product> getProducts() {
		return products;
	}

	public void setProducts(Set<Product> products) {
		this.products = products;
	}

	public Category() {
	}

	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public byte[] getPicture() {
		return picture;
	}

	public void setPicture(byte[] picture) {
		this.picture = picture;
	}

	
}
