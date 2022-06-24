package com.Class_Basic_Jdbc_new;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Batch_demo {
	Connection con;
	Statement st;
	Batch_demo() throws ClassNotFoundException, SQLException
	{
		con=DBConnection.getConnection();
	}
	
	public void execute() throws SQLException
	{
		st=con.createStatement();
		st.addBatch("insert into departments values(11,'Engineering',1200,7000)");
		st.addBatch("update departments set department_id=1100 where department_id=20");
		
		int arr[]=st.executeBatch();
		
		System.out.println(arr);
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println((i+1)+" Row affected");
		}
		
		
		
	}
	public static void main(String args[]) throws SQLException, ClassNotFoundException
	{

		Batch_demo b = new Batch_demo();
		b.execute();
	}

}
