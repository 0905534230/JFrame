package vn.edu.vnuk.em.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 *  author Hoang
 * 
 */
public class ConnectionFactory {
	
	public Connection getConnection() {
		return returnConnection("jdbc:mysql://localhost:3306/employee-management");
	}
	
	
	public Connection getConnection(String url) {
		return returnConnection(url);
	}
	
	
	private Connection returnConnection(String url) {
		try {
			return DriverManager.getConnection(
					url, 
					System.getenv("DB_USR"), 
					System.getenv("DB_PWD")
				);
		}
		
		catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

}