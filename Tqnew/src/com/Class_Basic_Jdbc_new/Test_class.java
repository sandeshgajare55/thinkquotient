package com.Class_Basic_Jdbc_new;

public class Test_class{
	
	public static void main(String ar[])
	{
		int a[]= {11,12,15,13,14,17,16,18,19,21};
		int size=a.length;
		int b[]= new int [size];
		int e=0;
		int o=1;
		for(int i=0;i<size;i++)
		{
				if(i%2==0)
				{
					b[e]=a[i];
					e++;
				}
				else
				{
					b[o]=a[i];
					o++;
				}
			}
		
		for(int i=0;i<size;i++)
		{
			System.out.println(b[i]);
		}
		
	}
}