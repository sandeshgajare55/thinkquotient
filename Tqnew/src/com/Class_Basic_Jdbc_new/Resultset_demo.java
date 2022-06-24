package com.Class_Basic_Jdbc_new;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Resultset_demo{
	Connection con;
	ResultSet rs;
	Statement st;
	Resultset_demo() throws ClassNotFoundException, SQLException
	{
	 con=	DBConnection.getConnection();
	
	}
	
	void show() throws SQLException
	{
		System.out.println("-----------------------");
		
		st=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE); 
		rs=st.executeQuery("select * from departments");
		while(rs.next())
		{
		
		System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getInt(4));
		}
		
		
		}
	
	void first() throws SQLException
	{
		System.out.println("----------first------------");
		st=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE); 
		rs.first();
		System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getInt(4));
		
	}
	
	void last() throws SQLException
	{
		System.out.println("----------Last------------");
		st=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE); 
		rs.last();
		System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getInt(4));
		
	}
	void second() throws SQLException
	{
		System.out.println("----------second------------");
		st=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE); 
		rs.absolute(2);
		System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getInt(4));
		
	}
	
	void reverse() throws SQLException
	{
		System.out.println("----------Backword------------");
		st=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE); 
		rs.afterLast();
		while(rs.previous())
		{
		System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getInt(4));
		}
		
	}
	
	
	void update(int id) throws SQLException
	{
		rs.beforeFirst();
		while(rs.next())
		{
			if(rs.getInt(10)==id)
			{
			rs.updateInt(3, 1000);
			rs.updateRow();
			}
		}
		
	}
	
	void delete(int id) throws SQLException
	{

		rs.beforeFirst();
		while(rs.next())
		{
			if(rs.getInt(1)==id)
			{
			rs.deleteRow();
			}
		}
		
		
	}
	
	void insert() throws SQLException
	{
		rs.moveToInsertRow();
		rs.updateInt(1, 1008);
		rs.updateString(2, "Fishing");
		rs.updateInt(3, 200);
		rs.insertRow();
	}


	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Resultset_demo rs=new Resultset_demo();
		rs.show();
		rs.first();
		rs.last();
		rs.second();
		rs.reverse();
		//rs.update(1004);
		//rs.show();
		
	//	rs.delete(1008);
	//	rs.show();
		
		rs.insert();
		

	}

}
