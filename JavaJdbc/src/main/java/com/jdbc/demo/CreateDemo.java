package com.jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateDemo {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/jfsjulybatch";
		String username="root";
		String password="root";
		String query = """
				create table employee(name varchar(20),
				employee_id int,department varchar(20),primary key(employee_id))
				""";
	
		// create a connection object
		try(Connection connection = DriverManager.getConnection(url, username, password);
			//create a Statement object
			PreparedStatement st = connection.prepareStatement(query);){
			// execute the query
			boolean isCreated = st.execute();
			System.out.println("Table created "+!isCreated);
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}
}
