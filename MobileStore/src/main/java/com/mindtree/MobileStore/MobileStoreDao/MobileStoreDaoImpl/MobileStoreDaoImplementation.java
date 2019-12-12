package com.mindtree.MobileStore.MobileStoreDao.MobileStoreDaoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mindtree.MobileStore.MobileStoreDao.MobileStoreDao.MobileStoreDao;
import com.mindtree.MobileStore.dbUtility.DbConnection;
import com.mindtree.MobileStore.entities.Brand;
import com.mindtree.MobileStore.entities.Product;
import com.mindtree.MobileStore.exceptions.MobileStoreDaoException;
import com.mindtree.MobileStore.exceptions.MobileStoreDbexception;

public class MobileStoreDaoImplementation implements MobileStoreDao{
DbConnection utility=new DbConnection();
	@Override
	public void addBrands(Brand brand) throws MobileStoreDaoException {
	try(Connection con= utility.getConnection();
			PreparedStatement st=con.prepareStatement("insert into brand(BrandName,netWorth)values(?,?)")
					){
	
	st.setString(1,brand.getBrandName());
	st.setInt(2,brand.getNetWorth());
	st.executeUpdate();
	st.close();
	}catch(SQLException |MobileStoreDbexception e)
	{
		throw new MobileStoreDaoException("database failed",e);
	}
	}
	@Override
	public void addProducts(String brandName,Product product) throws MobileStoreDaoException {
		try(Connection con=utility.getConnection()){
			PreparedStatement st=con.prepareStatement("select BrandId from brand where BrandName=?");
			st.setString(1,brandName);
			ResultSet rs=st.executeQuery();
			rs.next();
			int brandId=rs.getInt(1);
			
			PreparedStatement st1=con.prepareStatement("insert into product(productName,cost,numberOfUnits,brandId)values(?,?,?,?)");
		    st1.setString(1,product.getProductName());
		    st1.setInt(2,product.getCost());
		    st1.setInt(3,product.getNumberOfUnitsSold());
		    st1.setInt(4,brandId);
		    st1.executeUpdate();
		    
		}catch(MobileStoreDbexception|SQLException e)
		{
			throw new MobileStoreDaoException("database failed",e);
		}
		
	}
}
