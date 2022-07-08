package com.Class_Basic_File_Handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Scanner1 {

	public static void main(String[] args) throws FileNotFoundException {
		File f = new File("D:/data.txt");
		Scanner sc = new Scanner(f);

		while (sc.hasNextLine()) {
			System.out.println(sc.nextLine());
		}
		sc.close();

	}

}
