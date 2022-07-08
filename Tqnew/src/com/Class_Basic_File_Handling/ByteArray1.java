package com.Class_Basic_File_Handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArray1 {

	public static void main(String[] args) throws IOException {
File f=new File("D:/data130.txt");
		
		FileOutputStream fos=new FileOutputStream(f);
		
		String s="File handling is a mechanism to perform read and write operations on files";
		byte arr[]=s.getBytes();
		fos.write(arr, 10, 20);
		System.out.println("file written sucessfully");
		fos.close();
		

	}

}
