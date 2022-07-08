package com.Class_Basic_Jdbc_new_assignment;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Scanner;

public class Doctor_demo {
	Connection con;
	CallableStatement cb;
	Scanner sc;
	public Doctor_demo() throws ClassNotFoundException, SQLException {
	con=DBConnection.getConnection();
	}
	
	public void show() throws SQLException
	{
		String s="{call doctor(?,?)}";
		sc= new Scanner(System.in);
		System.out.println("Enter the Doctor name to get it speciality : ");
		String n=sc.next();
		cb=con.prepareCall(s);
		cb.setString(1, n);
		cb.registerOutParameter(2,Types.VARCHAR);
		boolean b=cb.execute();
		if(b!=true)
		{
			String spl=cb.getString(2);
			System.out.println("Doctor Specilality : "+spl);
		}
	}
		
	public static void main(String args[]) throws ClassNotFoundException, SQLException
	{
		Doctor_demo d = new Doctor_demo();
		d.show();
	}

}
