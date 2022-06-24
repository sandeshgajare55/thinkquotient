package com.Class_Basic_Jdbc_new;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class CallbleStatementwithParam {
	
Connection con;
	
CallbleStatementwithParam() throws ClassNotFoundException, SQLException
	{
	 con=	DBConnection.getConnection();
	}
	
	void show_records() throws SQLException
	{
		String s="{call in_param(?)}";
		CallableStatement cb=con.prepareCall(s);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name");
		String name=sc.next();
		cb.setString(1, name);
		
	   ResultSet rs=   cb.executeQuery();
	   while(rs.next())
	   {
		   System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
	   }
	      cb.getMoreResults();
	      ResultSet rs1=cb.getResultSet();
	   while(rs1.next())
	   {
		   System.out.println(rs1.getInt(1));
	   }
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		CallbleStatementwithParam cp=new CallbleStatementwithParam();
		cp.show_records();

	}

}
