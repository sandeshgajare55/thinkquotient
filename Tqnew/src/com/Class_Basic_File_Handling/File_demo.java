package com.Class_Basic_File_Handling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class File_demo {
	File f;
	String name, path, abs;
	int size;

	File_demo(String f_name) {
		f = new File(f_name);

		if (f.exists() == true) {
			if (f.isFile()) {
				System.out.println("File is Present....");

				name = f.getName();
				System.out.println("File Name is : " + name);

				path = f.getPath();
				System.out.println("File Path is : " + path);

				abs = f.getAbsolutePath();
				System.out.println("File Absolute Path : " + abs);

				if (f.canRead() == true) {
					System.out.println("You Can read this File ");
				}

				size = (int) f.length();
				System.out.println("Length of File is : " + size);
			}
		} else {
			System.out.println("Sorry File is Not Present ");
		}

	}

	public static void main(String args[]) throws IOException {
		File_demo f = new File_demo("C:\\Users\\DELL\\Desktop\\SandeshGajare.txt");
	}

}
