package com.mindtree.MobileStore.dbUtility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mindtree.MobileStore.exceptions.MobileStoreDbexception;

public class DbConnection {
	final String URL = "jdbc:mysql://localhost:3306/MobileStore";
	final String UNAME = "root";
	final String PASSWORD = "Welcome123";
	Connection con;

	public Connection getConnection() throws MobileStoreDbexception {
		try {

			Class.forName("com.mysql.jdbc.Driver");

			con = DriverManager.getConnection(URL, UNAME, PASSWORD);

			return con;
		} catch (SQLException | ClassNotFoundException e) {
			throw new MobileStoreDbexception();
		}
	}

}
