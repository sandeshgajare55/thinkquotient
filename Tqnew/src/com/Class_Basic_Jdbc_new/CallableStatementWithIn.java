package com.Class_Basic_Jdbc_new;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Scanner;

public class CallableStatementWithIn {
	
Connection con;
	
CallableStatementWithIn () throws ClassNotFoundException, SQLException
	{
	 con=	DBConnection.getConnection();
	}
	
	void show_records() throws SQLException
	{
		String s="{call new_procedure(?,?)}";
		CallableStatement cb=con.prepareCall(s);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter supplier id");
		String id=sc.next();
		cb.setString(1, id);
		cb.registerOutParameter(2, Types.INTEGER);
		
	boolean b=	cb.execute();
	System.out.println(b);
	
	if(b!=true)
	{
		int max=cb.getInt(2);
		System.out.println("Total salary is"+max);
	}
		
		
	}
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		CallableStatementWithIn cs=new CallableStatementWithIn();
		cs.show_records();

	}

}
