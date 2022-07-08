package com.Class_Basic_File_Handling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyingData {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("D:/data123.txt");
		FileOutputStream fos=new FileOutputStream("D:/myfile.txt");
		int x=0;
		
		while((x=fis.read())!=-1)
		{
			System.out.print((char)x);
			fos.write(x);
			
		}

	}

}
