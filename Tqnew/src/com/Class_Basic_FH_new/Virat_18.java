package com.Class_Basic_FH_new;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Virat_18 {
	public static void main(String args[]) throws IOException {
		File f = new File("D:\\virat.txt");
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
		int cnt=0;
		int scnt=0;
		int ncnt=0;
		char c[] = rm.toCharArray();
		for (int i = 0; i < c.length; i++) {
			cnt++;
			// System.out.println(c[i]);
			if (Character.isDigit(c[i])) {
				ncnt++;
				System.out.print(c[i]);
			}
			
			if(Character.isSpaceChar(i))
			{
				scnt++;
			}
		}
		int vcnt=0;
			for (int i = 0; i < c.length; i++) {
				if (c[i]=='a'||c[i]=='i'||c[i]=='e'||c[i]=='o'||c[i]=='u') {
					vcnt++;
				}
		}
			System.out.println();
			System.out.println("Total Count of Character in File : "+cnt);
			System.out.println("Vowel Count in File : "+vcnt);
			System.out.println("Empty Spaces in File : "+scnt);
			System.out.println("Numbers  in File : "+ncnt);
			System.out.println("Words in File : ");


	}

}

