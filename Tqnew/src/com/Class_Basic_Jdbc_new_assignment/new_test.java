package com.Class_Basic_Jdbc_new_assignment;
import java.util.Arrays;
import java.util.Scanner;
public class new_test {
	
	public static void main(String args[])
	{
		int arr[] =new int[10];
		int size=arr.length;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Array");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		Arrays.sort(arr);
		System.out.println(arr);
		
		for(int i=0;i<size;i+=2)
		{
			int temp = arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=temp;
		}
		
		for(int i=0;i<size;i++)
		{
			System.out.println(" "+arr[i]);
		}
	}

}
