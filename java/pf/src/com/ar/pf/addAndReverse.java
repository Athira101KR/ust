package com.ar.pf;

import java.util.Scanner;

public class addAndReverse {
	
	static void rev(int sum)
	{
		int rem=0,rev=0;
		
		while(sum>0)
		{
			rem=sum%10;
			rev=rev*10+rem;
			sum=sum/10;
		}
		System.out.println(rev);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		int[] array=new int[n];
		for(int i=0;i<n;i++)
		{
			array[i]=sc.nextInt();
		}
		int num=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			if(array[i]>num)
			{
				sum=sum+array[i];
			}
		}
		
		rev(sum);

	}

}
