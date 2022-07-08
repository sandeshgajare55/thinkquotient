package com.Class_Basic_Jdbc_new_assignment;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Procedure_new {
	Connection con;
	CallableStatement cs;
	ResultSet rs;
	public Procedure_new() throws ClassNotFoundException, SQLException
	{
		con=DBConnection.getConnection();
	}
	
	void show_records() throws SQLException
	{
		String s="{call patient_age(?)}";
		CallableStatement cb=con.prepareCall(s);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Patient ID : ");
		int id=sc.nextInt();
		cb.setInt(1, id);
		rs=cb.executeQuery();
	   while(rs.next())
	   {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getInt(4)+" "+rs.getString(5)+" "+rs.getDate(6)+" "+rs.getInt(7));
	   }
	      cb.getMoreResults();
	      ResultSet rs1=cb.getResultSet();
	      
	      System.out.println("----------------------------------------------------------");
	   while(rs1.next())
	   {
			System.out.println(rs1.getInt(1)+" "+rs1.getString(2)+" "+rs1.getInt(3)+" "+rs1.getInt(4)+" "+rs1.getString(5)+" "+rs1.getDate(6)+" "+rs1.getInt(7));
	   }
	}
	
	public static void main(String args[]) throws ClassNotFoundException, SQLException
	{
		Procedure_new P = new Procedure_new();
		P.show_records();
	}


	
	

}
