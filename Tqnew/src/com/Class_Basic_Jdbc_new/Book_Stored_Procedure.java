package com.Class_Basic_Jdbc_new;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Book_Stored_Procedure {
	Connection con;
	Book_Stored_Procedure() throws ClassNotFoundException, SQLException
		{
		 con=	DBConnection.getConnection();
		}
		
		void show_records() throws SQLException
		{
			String s="{call Book_demo(?)}";
			CallableStatement cb=con.prepareCall(s);
			Scanner sc=new Scanner(System.in);	
			System.out.println("Enter the Book Name : ");
			String name=sc.next();
			cb.setString(1, name);
			System.out.println(cb.execute());
		   ResultSet rs=cb.executeQuery();
		   while(rs.next())
		   {
			   System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getInt(4));
		   }
		   System.out.println("-----------------------------------");
		      cb.getMoreResults();
		      ResultSet rs1=cb.getResultSet();
		   while(rs1.next())
		   {
			   System.out.println(rs1.getInt(1)+" "+rs1.getString(2)+" "+rs1.getInt(3)+" "+rs1.getInt(4));
		   }
		}

		public static void main(String[] args) throws ClassNotFoundException, SQLException {
			Book_Stored_Procedure bd=new Book_Stored_Procedure();
			bd.show_records();

		}


}
