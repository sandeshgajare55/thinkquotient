package com.Class_Basic_File_Handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReader1 {

	public static void main(String[] args) throws FileNotFoundException   {
		File f=new File("d:/data.txt");
		FileReader fr=new FileReader(f);
		FileWriter fw=null;
		try {
		int x=0;
		try {
			while((x=fr.read())!=-1)

					{
				System.out.print((char)x);
					}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			fr.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		File f1=new File("d:/data11.txt");
		
			fw = new FileWriter(f1);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			String s="welcome to java";
			fw.write(s);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
		try {
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}

	}

}
