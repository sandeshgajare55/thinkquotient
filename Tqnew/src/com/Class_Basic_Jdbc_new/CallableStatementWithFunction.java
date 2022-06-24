package com.Class_Basic_Jdbc_new;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.sql.Types;
public class CallableStatementWithFunction {
	Connection con;
	CallableStatementWithFunction() throws ClassNotFoundException, SQLException
	{
	con=	DBConnection.getConnection();
	}
	
	
	
	void show() throws SQLException
	{
	
		CallableStatement cb=con.prepareCall("{?=call date_diff1(?)}");
		cb.registerOutParameter(1, Types.INTEGER);
		cb.setDate(2,Date.valueOf("2021-07-22"));
		boolean b=cb.execute();
		if(b!=true)
		{
			int months=cb.getInt(1);
			System.out.println(" nof months.."+months);
		}
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		CallableStatementWithFunction cf=new CallableStatementWithFunction();
		cf.show();

	}

}
