package com.Class_Basic_Jdbc_new;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;

public class Batch_demo_update_new {
	Connection con;
	Statement st;
	Savepoint save;
	Batch_demo_update_new() throws ClassNotFoundException, SQLException
	{
		 con=DBConnection.getConnection();
	}
	
	void commit() throws SQLException 
	{
		con.setAutoCommit(false);
		 st=con.createStatement();
		String s="update book  set b_name='Tom and Jerry' where b_id=14";
		st.executeUpdate(s);
		save=con.setSavepoint();
		String s1="update book set b_name='Ben10' where b_id=11";
		st.executeUpdate(s1);
		
	}
	void roll_back() throws SQLException
	{
		con.rollback(save);
	}
	
	void show() throws SQLException
	{
		System.out.println("-------------------");
		ResultSet rs=	st.executeQuery("select * from book");	
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+ " "+rs.getInt(3)+" "+rs.getInt(4)+" ");
		}
	}

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Batch_demo_update_new c=new Batch_demo_update_new();
		c.commit();
		c.show();
		c.roll_back();
		c.show();

	}


}
