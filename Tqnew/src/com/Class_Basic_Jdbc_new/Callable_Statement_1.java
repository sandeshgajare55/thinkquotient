package com.Class_Basic_Jdbc_new;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Callable_Statement_1 {

	Connection con;
	Callable_Statement_1() throws ClassNotFoundException, SQLException{
		con=DBConnection.getConnection();
		
	}
	
	public void show_Record() throws SQLException
	{
		CallableStatement cs= con.prepareCall("{call p1()}");
		ResultSet rs=cs.executeQuery();
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getInt(4));
		}
		
		cs.getMoreResults();
		ResultSet rs1=cs.getResultSet();
		System.out.println("-------------------------------------------------------------");
		while(rs1.next())
		{
			System.out.println(rs1.getInt(1)+" "+rs1.getString(2)+" "+rs1.getInt(3)+" "+rs1.getInt(4));
		}
	}
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Callable_Statement_1 c = new Callable_Statement_1();
		c.show_Record();
	}

}
