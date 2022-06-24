package com.Class_Basic_Jdbc_new;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	public static final String url="jdbc:mysql://localhost:3306/testdbsandy?"+"autoReconnect=true&useSSL=false";
	public static final String username="root";
	public static final String password="Shrisai12@";
	static Connection getConnection() throws SQLException, ClassNotFoundException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con =DriverManager.getConnection(url,username,password);
		System.out.println("Connection Established");
		return con;
		
	}

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		getConnection();

	}

}
