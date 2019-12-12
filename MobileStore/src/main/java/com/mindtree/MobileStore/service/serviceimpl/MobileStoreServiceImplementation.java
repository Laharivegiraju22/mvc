package com.mindtree.MobileStore.service.serviceimpl;

import com.mindtree.MobileStore.MobileStoreDao.MobileStoreDao.MobileStoreDao;
import com.mindtree.MobileStore.MobileStoreDao.MobileStoreDaoImpl.MobileStoreDaoImplementation;
import com.mindtree.MobileStore.entities.Brand;
import com.mindtree.MobileStore.entities.Product;
import com.mindtree.MobileStore.exceptions.MobileStoreDaoException;
import com.mindtree.MobileStore.exceptions.ServiceException;
import com.mindtree.MobileStore.service.service.MobileStoreService;

public class MobileStoreServiceImplementation implements MobileStoreService {
	MobileStoreDao daoimpl = new MobileStoreDaoImplementation();

	@Override
	public void addBrand(Brand brand) throws ServiceException {

		try {
			daoimpl.addBrands(brand);
		} catch (MobileStoreDaoException e) {
			throw new ServiceException("service failed", e);
		}
	}

	@Override
	public void addProduct(String brandName,Product product) throws ServiceException {
		try {
			daoimpl.addProducts(brandName,product);
		} catch (MobileStoreDaoException e) {
			throw new ServiceException("service failed",e);
		}
		
	}

	
}
