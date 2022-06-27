package com.Class_Basic_Jdbc_new;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Batch_demo_new {
	Connection con;
	Statement st;
	Batch_demo_new() throws ClassNotFoundException, SQLException
	{
		con=DBConnection.getConnection();
	}
	
	public void execute_demo() throws SQLException
	{
		st=con.createStatement();
		st.addBatch("insert into book values(20,'Playing it my way',1200,7000)");
		st.addBatch("update book set b_name='The Great Warrior' where b_id=14");
		st.addBatch("update book set a_id=007 where b_id=14");
		int a[]=st.executeBatch();
		for(int i=0;i<a.length;i++)
		{
			System.out.println((i+1)+" Row affected");
		}
	}
	public static void main(String args[]) throws SQLException, ClassNotFoundException
	{
		Batch_demo_new b = new Batch_demo_new();
		b.execute_demo();
	}


}
