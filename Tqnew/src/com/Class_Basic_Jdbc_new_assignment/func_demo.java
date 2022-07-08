package com.Class_Basic_Jdbc_new_assignment;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.sql.Types;

public class func_demo {
	Connection con;
	
	func_demo() throws ClassNotFoundException, SQLException
	{
		con=DBConnection.getConnection();
	}
	
	void show() throws SQLException
	{
	
		CallableStatement cb=con.prepareCall("{?=call Admission_date(?)}");
		cb.registerOutParameter(1, Types.INTEGER);
		cb.setDate(2,Date.valueOf("2020-05-10"));
		boolean b=cb.execute();
		if(b!=true)
		{
			int id=cb.getInt(1);
			System.out.println(" Patient ID : "+id);
		}
	}
	
	public static void main(String args[]) throws ClassNotFoundException, SQLException
	{
		func_demo f= new func_demo();
		f.show();
	}

	

}
