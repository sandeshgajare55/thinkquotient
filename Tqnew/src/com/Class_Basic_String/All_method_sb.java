package com.Class_Basic_String;

public class All_method_sb {
	public static void main(String ar[]) {
		StringBuffer sb = new StringBuffer("Jackson");
		StringBuffer sb2 = new StringBuffer("Daniel");

		System.out.println(sb.equals(sb2));//reference check
		System.out.println(sb.charAt(2));//return element at particular index
		System.out.println(sb.compareTo(sb2));
		System.out.println(sb.capacity());//capacity of buffer
		sb.setLength(3);
		System.out.println(sb.length());
		System.out.println(sb);
		System.out.println(sb2.replace(1, 3,"DON"));
		
	}
}
