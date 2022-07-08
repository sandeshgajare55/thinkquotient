package com.Class_Basic_File_Handling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class outoutWrite {

	public static void main(String[] args) throws IOException {
		File f = new File("D:/data120.txt");
		// ARM (Automatic Resource Management)
		// FileOutputStream fos=new FileOutputStream(f,true);
		try (FileOutputStream fos = new FileOutputStream(f, true))

		{

			String s = "What is Exception Handling?\r\n"
					+ "Exception Handling is a mechanism to handle runtime errors such as ClassNotFoundException, IOException, SQLException, RemoteException "
					+ " are exceptiond\s";
			byte arr[] = s.getBytes();
			fos.write(arr);
			System.out.println("file written succesfully");

		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
