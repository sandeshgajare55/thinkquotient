package com.Class_Basic_File_Handling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ByteArray {

	public static void main(String[] args) throws IOException {
		File f=new File("d:/data.txt");
		FileInputStream fis=new FileInputStream(f);
		
		byte arr[]=new byte[60];
		
	/*	fis.read(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print((char)arr[i]);
		}*/
		
		
		fis.read(arr,0,10);
		
		for(int i=0;i<10;i++)
		{
			System.out.print((char)arr[i]);
		}

	}

}
