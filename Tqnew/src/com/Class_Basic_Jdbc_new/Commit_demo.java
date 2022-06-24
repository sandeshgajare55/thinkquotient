package com.Class_Basic_Jdbc_new;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;

public class Commit_demo {
	Connection con;
	Statement st;
	Savepoint sav;
	Commit_demo() throws ClassNotFoundException, SQLException
	{
		 con=DBConnection.getConnection();
	}
	
	void comiited() throws SQLException 
	{
		con.setAutoCommit(false);
		 st=con.createStatement();
		String s="update departments set location_id=5000 where department_id=10";
		st.executeUpdate(s);
		 sav=con.setSavepoint();
		String s1="update departments set location_id=6000 where department_id=1100";
		st.executeUpdate(s1);
		
	}
	void rollback() throws SQLException
	{
		con.rollback(sav);
	}
	
	void show() throws SQLException
	{
		System.out.println("-------------------");
	ResultSet rs=	st.executeQuery("select * from departments");	
	while(rs.next())
	{
		System.out.println(rs.getInt(1)+" "+rs.getString(2)+ " "+rs.getInt(3)+" "+rs.getInt(4));
	}
		}

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Commit_demo c=new Commit_demo();
		c.comiited();
		c.show();
		c.rollback();
		c.show();

	}

}
