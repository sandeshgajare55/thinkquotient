package com.Class_Basic_File_Handling;

import java.io.File;
import java.io.IOException;

public class File1 {

	public static void main(String[] args) throws IOException {
		File f=new File("D:/data123.txt");
boolean	 b=	f.createNewFile();
System.out.println(b);
System.out.println(	f.canRead());

System.out.println(f.canWrite());
System.out.println(f.getAbsolutePath());
System.out.println(f.getTotalSpace());
File f1=new File("D:/khadija/data123.txt");
System.out.println(f1.mkdir());
File f2=new File("D:/khadija");

String s[]=f2.list();
for(int i=0;i<s.length;i++)
{
	System.out.println(s[i]);
}

	}

}
