package com.bootcamp.bootcampjava.formsubmission.dbutil;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @author Nikshitha Nagelly 
 * This class gets the connection to database
 */
public class DBConnection {
	private static Connection connection = null;
	FileInputStream fis = null;

	public static Connection getConn() {
		if (connection != null)
			return connection;
		else {
			try {

				Properties prop = new Properties();
				InputStream inputStream = DBConnection.class.getClassLoader()
						.getResourceAsStream("resource/db.properties");
				prop.load(inputStream);
				String driver = prop.getProperty("driver");
				String url = prop.getProperty("url");
				String user = prop.getProperty("user");
				String password = prop.getProperty("password");
				Class.forName(driver);
				connection = DriverManager.getConnection(url, user, password);
			} catch (NullPointerException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}

			return connection;
		}

	}
}
