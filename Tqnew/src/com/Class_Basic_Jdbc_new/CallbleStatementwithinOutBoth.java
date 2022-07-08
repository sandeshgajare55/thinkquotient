package com.Class_Basic_Jdbc_new;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;

public class CallbleStatementwithinOutBoth {
	Connection con;

	CallbleStatementwithinOutBoth() throws ClassNotFoundException, SQLException {
		con = DBConnection.getConnection();
	}

	void show_records() throws SQLException {
		String s = "{call inout1(?)}";
		CallableStatement cb = con.prepareCall(s);
		cb.setInt(1, 3);
		cb.registerOutParameter(1, Types.INTEGER);

		boolean b = cb.execute();
		if (b != true) {
			int min_sal = cb.getInt(1);
			System.out.println("minimum salaryis" + min_sal);
		}
	}

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		try {
			CallbleStatementwithinOutBoth cb;

			cb = new CallbleStatementwithinOutBoth();
			cb.show_records();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
