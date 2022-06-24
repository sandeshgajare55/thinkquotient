package com.Class_Basic_Jdbc_new;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;

public class Commit_Rollback {
	Connection con;
	Statement st;
	Savepoint sav;
	Commit_Rollback() throws ClassNotFoundException, SQLException
	{
		 con=DBConnection.getConnection();
	}
	
	void comiited() throws SQLException 
	{
		con.setAutoCommit(false);
		 st=con.createStatement();
		String s="update department set location='pune' where d_id=12";
		st.executeUpdate(s);
		 sav=con.setSavepoint();
		String s1="update department set location='chennai' where d_id=15";
		st.executeUpdate(s1);
		
	}
	void rollback() throws SQLException
	{
		con.rollback(sav);
	}
	
	void show() throws SQLException
	{
		System.out.println("-------------------");
	ResultSet rs=	st.executeQuery("select * from department");	
	while(rs.next())
	{
		System.out.println(rs.getInt(1)+" "+rs.getString(2)+ " "+rs.getString(3));
	}
		}

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Commit_Rollback c=new Commit_Rollback();
		c.comiited();
		c.show();
		c.rollback();
		c.show();

	}

}
