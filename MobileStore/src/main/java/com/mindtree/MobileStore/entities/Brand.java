package com.mindtree.MobileStore.entities;

import java.util.HashSet;
import java.util.Set;

public class Brand {
private int BrandId;
private String BrandName;
private int netWorth;
Set<Product>products=new HashSet<Product>();

public Brand() {
	super();
}

public Brand(int brandId, String brandName, int netWorth, Set<Product> products) {
	super();
	BrandId = brandId;
	BrandName = brandName;
	this.netWorth = netWorth;
	this.products = products;
}

public int getBrandId() {
	return BrandId;
}

public void setBrandId(int brandId) {
	BrandId = brandId;
}

public String getBrandName() {
	return BrandName;
}

public void setBrandName(String brandName) {
	BrandName = brandName;
}

public int getNetWorth() {
	return netWorth;
}

public void setNetWorth(int netWorth) {
	this.netWorth = netWorth;
}

public Set<Product> getProducts() {
	return products;
}

public void setProducts(Set<Product> products) {
	this.products = products;
}

@Override
public String toString() {
	return "Brand [BrandId=" + BrandId + ", BrandName=" + BrandName + ", netWorth=" + netWorth + ", products="
			+ products + "]";
}

}
