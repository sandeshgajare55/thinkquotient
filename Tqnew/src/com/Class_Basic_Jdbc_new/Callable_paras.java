package com.Class_Basic_Jdbc_new;


// Procedure Required
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Callable_paras {
	
Connection con;
	
Callable_paras() throws ClassNotFoundException, SQLException
	{
	 con=	DBConnection.getConnection();
	}
	
	void show_records() throws SQLException
	{
		String s="{call in_param(?)}";
		CallableStatement cb=con.prepareCall(s);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Department : ");
		String name=sc.next();
		cb.setString(1, name);
		
	   ResultSet rs=   cb.executeQuery();
	   while(rs.next())
	   {
		   System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getInt(4));
	   }
	      cb.getMoreResults();
	      ResultSet rs1=cb.getResultSet();
	   while(rs1.next())
	   {
		   System.out.println(rs1.getInt(1));
	   }
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Callable_paras cp=new Callable_paras();
		cp.show_records();

	}

}
