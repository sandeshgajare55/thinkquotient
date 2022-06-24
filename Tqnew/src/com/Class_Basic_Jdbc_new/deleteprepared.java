package com.Class_Basic_Jdbc_new;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
public class deleteprepared {
	public static void main(String arg[]) throws ClassNotFoundException, SQLException
	{
		Connection con= DBConnection.getConnection();
		  String s="delete * from departments where department_id=?";
		  PreparedStatement pst= con.prepareStatement(s); 
		  pst.setInt(1,200);
		  int i= pst.executeUpdate(s);
		  System.out.println(i+"   row deleted");
	}

}


