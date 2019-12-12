package com.mindtree.MobileStore.service.service;

import com.mindtree.MobileStore.entities.Brand;
import com.mindtree.MobileStore.entities.Product;
import com.mindtree.MobileStore.exceptions.MobileStoreDaoException;
import com.mindtree.MobileStore.exceptions.ServiceException;

public interface MobileStoreService {

	void addBrand(Brand brand) throws ServiceException;

	void addProduct(String brandName, Product product) throws ServiceException;



}
