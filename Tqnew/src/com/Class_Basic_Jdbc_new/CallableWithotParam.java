package com.Class_Basic_Jdbc_new;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CallableWithotParam {
	Connection con;
	
	CallableWithotParam() throws ClassNotFoundException, SQLException
	{
	 con=	DBConnection.getConnection();
	}
	
	void show_records() throws SQLException
	{
		String s="{call without_param()}";
		CallableStatement cb=con.prepareCall(s);
		
	      ResultSet rs= cb.executeQuery();
	      while(rs.next())
	      {
	      System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4)+" "+rs.getInt(5)+" "+rs.getString(6));
	      }
		
		System.out.println("------------------");
		boolean b=cb.getMoreResults();
		ResultSet rs1=cb.getResultSet();
		while(rs1.next())
	      {
	      System.out.println(rs1.getInt(1)+" "+rs1.getString(2)+" "+rs1.getInt(3)+" "+rs1.getString(4)+" "+rs1.getInt(5)+" "+rs1.getString(6));
	      }
	}
		
	

	public static void main(String[] args) throws  SQLException, ClassNotFoundException {
		CallableWithotParam cp=new CallableWithotParam();
		cp.show_records();
		

	}

}
