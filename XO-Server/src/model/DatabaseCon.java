package model;

import java.sql.*;

public class DatabaseCon {
	
	private Connection conn;
	public DatabaseCon() {
		// TODO Auto-generated constructor stub
		
	}
	public Connection startConnection() {
		   try {
			   
	          Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
	        } catch (Exception ex) {
	        	System.out.println("no conn11");
	        }
		   try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/xo_game", "root","password");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("no conn");
		}
		   
		   return conn;
		   
	}
	public void closeConnection() {
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}