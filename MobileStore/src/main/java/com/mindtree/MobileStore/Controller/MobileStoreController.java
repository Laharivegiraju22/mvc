package com.mindtree.MobileStore.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.MobileStore.entities.Brand;
import com.mindtree.MobileStore.entities.Product;
import com.mindtree.MobileStore.exceptions.MobileStoreDaoException;
import com.mindtree.MobileStore.exceptions.ServiceException;
import com.mindtree.MobileStore.service.service.MobileStoreService;
import com.mindtree.MobileStore.service.serviceimpl.MobileStoreServiceImplementation;

@RestController
public class MobileStoreController {
	MobileStoreService serviceImpl = new MobileStoreServiceImplementation();

	@PostMapping(value = "/addBrand")
	public void addBrand(@RequestBody Brand brand) {
		try {
			serviceImpl.addBrand(brand);

		} catch (ServiceException e) {
			
			e.printStackTrace();
		}
	}
	@PostMapping(value="/addProduct/brand")
	
	@ResponseBody
	public void addProduct(@RequestParam(name = "VIVO") String brandName,Product product)
	{
		try {
			serviceImpl.addProduct(brandName,product);
		} catch (ServiceException e) {
			
			e.printStackTrace();
		}
	}
}
