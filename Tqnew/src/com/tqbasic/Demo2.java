package com.tqbasic;
import java.util.Scanner;
public class Demo2 {
	public static void main(String ar[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st String :  ");
		String s1=sc.nextLine();
		System.out.println("Enter 2nd  String :  ");
		String s2=sc.nextLine();
		int cnt=0;
		char c1[]=s1.toCharArray();
		char c2[]=s2.toCharArray();
		boolean flag=false;
		
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		for(int i=0;i<c1.length;i++)
		{
			 
			for(int j=0;j<c2.length;j++)
			{
				flag=false;
					if(s1.charAt(i)==(s2.charAt(j)))
						{cnt++;	
						flag=true;
						}else
						{
							flag=false;
						}
							
			}
		}
		
		//System.out.println(s1.length());
		//System.out.println(cnt);
		if(cnt==s1.length() && cnt==s2.length() && flag==true)
		{
			System.out.println("Yes");
		}
		else
			System.out.println("No");
		
	}

}
