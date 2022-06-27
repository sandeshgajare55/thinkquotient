package com.Class_Basic_Jdbc_new;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Book_demo {
		Connection con;
		Statement st;
		PreparedStatement pst;	
		Scanner sc;
	Book_demo() throws ClassNotFoundException, SQLException
		{
		 con=	DBConnection.getConnection();
		}

	public void insert() throws SQLException
	{
		st= con.createStatement();
		PreparedStatement pst;	
		sc= new Scanner(System.in);
		String s="insert into book values(?,?,?,?)";
		pst=con.prepareStatement(s);
		System.out.println("Enter Values to Insert : ");
		System.out.println("Enter Book ID to Insert Details : ");
		int id =sc.nextInt();
		System.out.println("Enter Book Name  : ");
		String name=sc.next(); 
		System.out.println("Enter Book's author ID : ");
		int aid=sc.nextInt();
		System.out.println("Enter Book's price : ");
		int price=sc.nextInt();
		pst.setInt(1, id);
		pst.setString(2, name);
		pst.setInt(3, aid);
		pst.setInt(4, price);
		int i= pst.executeUpdate();
		System.out.println(i+"   row inserted");
		
	}
	public void update() throws SQLException, ClassNotFoundException
	{
		st= con.createStatement();
		PreparedStatement pst;	
		sc= new Scanner(System.in);
		String q="update book set b_name=?,a_id=?,price=? where b_id=?";
		pst=con.prepareStatement(q);
		System.out.println("Enter Book ID to Update Details : ");
		int id =sc.nextInt();
		System.out.println("Enter Book Name to Update : ");
		String name=sc.next(); 
		System.out.println("Enter Book's author ID to Update : ");
		int aid=sc.nextInt();
		System.out.println("Enter Book's price to Update : ");
		int price=sc.nextInt();
		pst.setInt(4, id);
		pst.setString(1, name);
		pst.setInt(2, aid);
		pst.setInt(3, price);
		  
		 int i= pst.executeUpdate();
		 System.out.println(i+"   row Updated");
		
	}
	
	public void delete() throws SQLException
	{
		st= con.createStatement();
		PreparedStatement pst;	
		sc= new Scanner(System.in);
		String q="delete from book where b_id=?";
		pst=con.prepareStatement(q);
		System.out.println("Enter the Book Id which record need to be deleted");
		int id=sc.nextInt();
		pst.setInt(1, id);
		 int i= pst.executeUpdate();
		 System.out.println(i+"   row Deleted");
		
	}
	public static void main(String ar[]) throws ClassNotFoundException, SQLException
	{
		Scanner sc = new Scanner(System.in);
		Book_demo b= new Book_demo();
		int ch=0;
		System.out.println("Enter the Choice to Perfom following operations "
				+ " 1.Insert"
				+ " 2.Update"
				+ " 3.Delete"
				+ " 4.Main Menu");
	   			ch=sc.nextInt();
	   
	   switch(ch)
	   {
	   
	   case 1:b.insert();
	   			break;
	   case 2:b.update();
			   break;
	   case 3:b.delete();
	   			break;
	   case 4: System.out.println("Enter the Choice to Perfom following operations "
				+ " 1.Insert"
				+ " 2.Update"
				+ " 3.Delete"
				+ " 4.Main Menu");
	   			ch=sc.nextInt();
	   
			
	   }

	}

}
