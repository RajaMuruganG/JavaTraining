package com.bookapp.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBConnection {

	static Connection connection;

	public static Connection openConnection() {

		String url = "jdbc:mysql://localhost:3306/onlinebookjdbc";
		String user = "root";
		String pwd = "root";
		
		try {
			connection = DriverManager.getConnection(url, user, pwd);
			PreparedStatement preparedStatement = connection.prepareStatement(Queries.CREATETABLE);
			boolean isExecuted = preparedStatement.execute();
			System.out.println("Table Created--> " + isExecuted);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}

	public static void closeConnection() {

		try {
			if (connection != null) {
				connection.close();
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
