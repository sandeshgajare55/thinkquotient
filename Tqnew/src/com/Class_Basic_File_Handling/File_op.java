package com.Class_Basic_File_Handling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class File_op {

	File f;
	FileInputStream inp;
	FileOutputStream out;

	public File_op(String string) throws FileNotFoundException {
		f = new File(string);
		inp = new FileInputStream(f);
		out = new FileOutputStream(f, true);
	}

	public void write() throws IOException {
		System.out.println("Enter the data to write in file : ");
		int c = System.in.read();

		while (c != -1) {
			out.write(c);
			out.flush();
			c = System.in.read();
		}
		System.out.println("Data Saved...");
	}

	public void read() throws IOException {
		int c = inp.read();

		while (c != -1) {
			System.out.println((char) c);
			c = inp.read();
		}
	}

	public static void main(String args[]) throws IOException, FileNotFoundException {
		File_op fn = new File_op("abc.txt");
		fn.write();
		System.out.println("Contents of File....");
		fn.read();
	}
}
