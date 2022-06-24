package com.Class_Basic_Jdbc_new;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchUpdate {
	Connection con;
	Statement st;
	BatchUpdate() throws ClassNotFoundException, SQLException
	{
	 con=DBConnection.getConnection();
	}
	
	void execute() throws SQLException
	{
	 st=con.createStatement();
		st.addBatch("insert into item values(1011,'cococola',40,'E110')");
		st.addBatch("update item set s_id='E111' where item_id=1003");
		st.addBatch("update item set s_id='E102' where item_id=1004");
		
		int arr[]=st.executeBatch();
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println((i+1) +".. row affected");
		}
		
	}
   void show() throws SQLException
   {
	   st=con.createStatement();
	ResultSet rs=   st.executeQuery("select * from item");
	while(rs.next())
	{
		System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4));
	}
   }
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		BatchUpdate b=new BatchUpdate();
		b.execute();
		b.show();

	}

}
