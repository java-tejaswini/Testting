package com.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.sql.DataSource;

public class MyConnection {

	private static Connection connection;

	public static Connection getConnection() {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "root", "mysql");
			System.out.println("Got the connection");
		} catch (SQLException | ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return connection;

	}
	
//	https://mvnrepository.com/artifact/commons-dbcp/commons-dbcp/1.2.2
	public DataSource dataSource() {

	    final org.apache.commons.dbcp2.BasicDataSource dataSource =
	        new org.apache.commons.dbcp2.BasicDataSource();

	    dataSource.setDriverClassName("com.mysql.jdbc.Driver");
	    dataSource.setUrl(environment.getProperty("jdbc:mysql://localhost:3306/myDatabase"));
	    dataSource.setUsername(environment.getProperty("root"));
	    dataSource.setPassword(environment.getProperty("password"));

	    return dataSource;
	}
	
	

}
