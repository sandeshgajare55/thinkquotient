package com.Class_Basic_Jdbc_new_assignment;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import com.Class_Basic_Jdbc_new.DBConnection;

public class A_Patient_demo {
	Connection con;
	Statement st;
	Scanner sc;
	ResultSet rs;
	
	public A_Patient_demo() throws ClassNotFoundException, SQLException
	{
		con=DBConnection.getConnection();	
	}
	
	public void show_Agewise() throws ClassNotFoundException, SQLException
	{
		  Statement st= con.createStatement();
		  String s="Select * from patient where age>=50";
		  st.executeQuery(s);
		  System.out.println("Query Executed....");
			ResultSet rs = st.executeQuery(s);
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getInt(4)+" "+rs.getString(5)+" "+rs.getDate(6));
			}
		  
	}
	public void update_Record() throws SQLException, ClassNotFoundException
	{
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		LocalDateTime now = LocalDateTime.now();    
		st= con.createStatement();
		PreparedStatement pst;	
		sc= new Scanner(System.in);
		String q="update patient set p_name=?,age=?,weigth=?,email=?,a_date=? where p_id=?";
		pst=con.prepareStatement(q);
		System.out.println("Enter PATIENT ID to Update Details : ");
		int id =sc.nextInt();
		System.out.println("Enter Patient Name to Update : ");
		String name=sc.next(); 
		System.out.println("Enter Patient age to Update : ");
		int age=sc.nextInt();
		System.out.println("Enter Patient Weigth to Update : ");
		float w=sc.nextFloat();
		System.out.println("Enter Patient email to Update : ");
		String email=sc.next();
		Date date=null;
		pst.setInt(6,id);
		pst.setDate(5, date);
		pst.setString(1, name);
		pst.setInt(2, age);
		pst.setFloat(3, w);
		pst.setString(4, email);
		
		  
		 int i= pst.executeUpdate();
		 System.out.println(i+"   row Updated");
		
	}
	
	public void insert_Patient() throws SQLException
	{
		con.setAutoCommit(false);
		st= con.createStatement();
		PreparedStatement pst;	
		sc= new Scanner(System.in);
		String s="insert into patient values(?,?,?,?,?,?)";
		pst=con.prepareStatement(s);
		System.out.println("Enter Values to Insert in Paitent Table : ");
		System.out.println("Enter Patient ID to Insert Details : ");
		int id =sc.nextInt();
		System.out.println("Enter Patient  Name  : ");
		String name=sc.next(); 
		System.out.println("Enter Patient age : ");
		int a=sc.nextInt();
		System.out.println("Enter Patient weight  : ");
		float w=sc.nextInt();
		System.out.println("Enter Patient  Email : ");
		String email=sc.next(); 
		Date date=null; 
		pst.setInt(1, id);
		pst.setString(2, name);
		pst.setInt(3, a);
		pst.setFloat(4, w);
		pst.setString(5, email);
		pst.setDate(6, date);
		int i= pst.executeUpdate();
		System.out.println(i+"   row inserted");
		con.commit();
		
	}
		
	public void delete_Patient() throws SQLException
	{
			PreparedStatement pst;	
		  sc= new Scanner(System.in);
		  String s="delete from patient where p_id=?";
		  pst= con.prepareStatement(s); 
		  System.out.println("Enter the Patient Id of which you want to delete record : ");
		  int id=sc.nextInt();
		  pst.setInt(1,id);
		  int i= pst.executeUpdate(s);
		  System.out.println(i+"   row deleted");
	
	}
	
	void show_Resultset() throws SQLException
	{
		System.out.println("-----------------------");
		
		st=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE); 
		rs=st.executeQuery("select * from Patient");
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getInt(4)+" "+rs.getString(5)+" "+rs.getDate(6));
		}
		
		
		}
	void delete_Resultset(int id) throws SQLException
	{	
		st=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE); 
		rs=st.executeQuery("select * from patient");
		//int aid=sc.nextInt();
		rs.beforeFirst();
		while(rs.next())
		{
			if(rs.getInt(1)==id)
			{
			rs.deleteRow();
			}
			
		}
		System.out.println(1+" Row Deleted");
		
		
		}
	
	public static void main(String args[]) throws ClassNotFoundException, SQLException
	{
		A_Patient_demo A= new A_Patient_demo();
		//A.show_Agewise();
		//A.update_Record();
		//A.insert_Patient();
		//A.delete_Patient();
		//A.show_Resultset();
		A.delete_Resultset(108);
	}

}
