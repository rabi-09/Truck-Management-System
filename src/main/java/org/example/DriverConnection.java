package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DriverConnection {
	private static final String USERNAME = "root", PASSWORD = "Rabi@7848", URL = "jdbc:mysql://localhost:3307/truck_management";
	
	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(URL, USERNAME, PASSWORD);
	}
}
