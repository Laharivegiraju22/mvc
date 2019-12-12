package com.mindtree.MobileStore.MobileStoreDao.MobileStoreDao;

import com.mindtree.MobileStore.entities.Brand;
import com.mindtree.MobileStore.entities.Product;
import com.mindtree.MobileStore.exceptions.MobileStoreDaoException;

public interface MobileStoreDao {

	void addBrands(Brand brand) throws MobileStoreDaoException;

	void addProducts(String brandName, Product product) throws MobileStoreDaoException;
	

}
