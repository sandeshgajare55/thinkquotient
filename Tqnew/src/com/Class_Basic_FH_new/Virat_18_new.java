package com.Class_Basic_FH_new;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Virat_18_new {
	public static void main(String args[]) throws IOException {
		File f = new File("D:\\viratnew.txt");
		FileWriter fw = new FileWriter(f);
		if (f.createNewFile()) {
			System.out.println("New File Created ");
		} else {
			System.out.println("File Exists");
		}
		String s = "Virat Kohli score 85 runs in Odi Match";
		fw.write(s);
		fw.close();
		String rm = " ";
		Scanner myReader = new Scanner(f);
		while (myReader.hasNextLine()) {
			rm = myReader.nextLine();
			System.out.println(rm);
		}
		String t = rm.toLowerCase();
		String g = t.substring(0, 11);
		System.out.println(g);
		for (int i = 0; i <= (t.length() - g.length()); i++) {
			if (t.substring(i, (i + g.length())).equalsIgnoreCase(g)) {
				System.out.println(g + " is substring of main string, match found at: " + ++i);
			}
		}

	}

}
