package com.training.sdet.JavaProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GetConnection {
	
	static Connection connection;
	public PreparedStatement ps, ps1, ps2;
	public ResultSet rs, rs1, rs2;
	
	public static Connection getMySqlConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection
					("jdbc:mysql://localhost/sdetdec", "root", "Hexaware@123");
			return connection;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public Connection getOracleConnection() {
		return null;
	}

}
