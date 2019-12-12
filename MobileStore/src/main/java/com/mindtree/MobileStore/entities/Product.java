package com.mindtree.MobileStore.entities;

public class Product {
	private int productId;
	private String productName;
	private int cost;
	private int numberOfUnitsSold = 0;
	Brand brand;

	public Product() {

	}

	public Product(int productId, String productName, int cost, int numberOfUnitsSold, Brand brand) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.cost = cost;
		this.numberOfUnitsSold = numberOfUnitsSold;
		this.brand = brand;
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

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public int getNumberOfUnitsSold() {
		return numberOfUnitsSold;
	}

	public void setNumberOfUnitsSold(int numberOfUnitsSold) {
		this.numberOfUnitsSold = numberOfUnitsSold;
	}

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", cost=" + cost
				+ ", numberOfUnitsSold=" + numberOfUnitsSold + ", brand=" + brand + "]";
	}

	
}
