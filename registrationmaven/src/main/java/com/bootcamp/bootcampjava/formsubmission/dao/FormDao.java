package com.bootcamp.bootcampjava.formsubmission.dao;

import java.sql.Connection;



import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


import com.bootcamp.bootcampjava.formsubmission.dbutil.DBConnection;
import com.bootcamp.bootcampjava.formsubmission.model.J2EEStack;


/**
 * @author Nikshitha Nagelly 
 * This class performs jdbc connections and inserts
 * user entered data in to database  
 */
public class FormDao {
	private Connection connection;

	public FormDao() {
		connection = DBConnection.getConn();
	}

	public boolean saveData(J2EEStack stack) {
		boolean rowCount = false;

		try {

			String query = "insert into j2eestack (years, J2EELIST, webservices, frameworks,comments) values (?,?,?,?,?)";
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, stack.getYears());
			preparedStatement.setString(2, stack.getJ2EELIST());
			preparedStatement.setString(3, stack.getWebservices());
			preparedStatement.setString(4, stack.getFrameworks());
			preparedStatement.setString(5, stack.getComments());
			int i = preparedStatement.executeUpdate();
			if (i > 0) {
				rowCount = true;
			}
			preparedStatement.close();
		} catch (NullPointerException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return rowCount;
	}


	
	
	
	
	
}
