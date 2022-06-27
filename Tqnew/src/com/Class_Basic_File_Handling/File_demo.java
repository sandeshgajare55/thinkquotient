package com.Class_Basic_File_Handling;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class File_demo {
	public static void main(String args[]) throws IOException
	{
		File f= new File("D://sandesh.txt");
		System.out.println("File Created");
		FileInputStream fis = new FileInputStream(f);
		System.out.println(fis);
		System.out.println(fis.read());
		
	}

}
