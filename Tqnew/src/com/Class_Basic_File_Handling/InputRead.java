package com.Class_Basic_File_Handling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputRead {

	public static void main(String[] args) throws IOException {
		File f=new File("D:/data123.txt");
	
		FileInputStream fis=new FileInputStream(f);
		int x=0;
		while((x=fis.read())!=-1)
		{
		System.out.print((char)x);
		}

	}

}


