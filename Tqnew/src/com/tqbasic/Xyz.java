package com.tqbasic;

public class Xyz {
		public static void main(String[] args) {
			int a[]= {0,0,4,3,2,4,9,2};
			int s[]=new int[a.length];
			int k=0;
			boolean Zero=false;
			for(int i=0;i<a.length;i++)
			{
				boolean flag=false;
				for(int j=i+1;j<a.length;j++)
				{
					if(a[i]==a[j])
					{
						flag=true;
						break;
					}
				}
				if(flag==false)
				{
					s[k]=a[i];
					k++;
				}
			}
			System.out.println("Original Array");
			for(int z:a)
			{
				System.out.print(z+" ");
			}
			System.out.println();
			System.out.println("Array with no Repeated elements : ");
			for(int x=0;x<a.length;x++)
			{
				if(a[x]==0)
				{
					Zero=true;
					break;
				}
			}
			for(int z=0;z<a.length;z++)
			{
				if(s[z]!=0)
				{
					System.out.print(s[z]+" ");
				}
				
			}
			if(Zero==true)
			{
				System.out.print(0+" ");
			}

		}

	}


