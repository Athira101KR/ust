package com.ar.exam_3;


import java.util.Scanner;

public class UserMainCode {
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
	
	static void addAndReverse(int[] array,int num)
	{
		int sum=0;
		
		for(int i=0;i<array.length;i++)
		{
			if(array[i]>num)
			{
				sum=sum+array[i];
			}
		}
		
		rev(sum);
		
	}
	
}

