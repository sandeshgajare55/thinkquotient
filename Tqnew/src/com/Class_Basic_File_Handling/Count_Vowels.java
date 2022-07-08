package com.Class_Basic_File_Handling;

public class Count_Vowels {
	public static void main(String[] args) {
		String s = "java codingc";
		int j;
		//String arr1[]=	s.split(s);
		char arr[] = s.toCharArray();

		for (int i = 0; i < arr.length; i++)

		{
			int count = 1;
			for (j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
					arr[j] = '\0';
				}

			}
			if (arr[i] != '\0') {
				System.out.println(arr[i] + "---" + count);
			}
		}
	}
}
