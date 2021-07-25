package com.ecommerce.utils;

import java.sql.*; // jdbc api

public class MySQLDatabaseUtils {
	
	public static Connection getConnection() throws SQLException,ClassNotFoundException{
		String driverClassName = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/sportyshoesdb";
		String user = "root";
		String password = "V0ng0la921!";
		//step #1 : load a driver
		Class.forName(driverClassName);
		//step #2 obtain a connection use a DriverManager class
		Connection connection = DriverManager.getConnection(url,user,password);
		return connection;
	}

}