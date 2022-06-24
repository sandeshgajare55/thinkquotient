package com.Class_Basic_1D_Array;

public class Copy_Array {
	public static void main(String args[])
	{
		int A[]= {1,3,5,7};
		int B[]= {2,4,6,8};
		int s1=A.length;
		int s2=B.length;
		int k=0;
		int C[]= new int[s1+s2];
		for (int i = 0; i <A.length; i++)
		{
			C[k]=A[i];
			k++;
		}
		
		for (int i = 0; i <B.length; i++)
		{
			C[k]=B[i];
			k++;
		}
		 for (int i = 0; i <C.length; i++) {
		        System.out.print( C[i] + " " );
		    }
	}

}
