package com.ar.exam_3;

import java.util.Scanner;

public class sum_of_digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int sum=0;
		for(int i=0;i<str.length();i++)
		{		
				if(str.charAt(i)=='1')
				{
					sum=sum+1;
				}

				else if(str.charAt(i)=='2')
				{
					sum=sum+2;
				}
				else if(str.charAt(i)=='3')
				{
					sum=sum+3;
				}
				else if(str.charAt(i)=='4')
				{
					sum=sum+4;
				}
				else if(str.charAt(i)=='5')
				{
							sum=sum+5;
							//System.out.println(sum);
						}
				else if(str.charAt(i)=='6')
				{
						sum=sum+6;
				}
				else if(str.charAt(i)=='7')
				{
						sum=sum+7;
				}
				else if(str.charAt(i)=='8')
				{
						sum=sum+8;
				}
				else if(str.charAt(i)=='9')
				{
						sum=sum+9;
				}
				
				else
				{
					continue;
				}
		}
		if(sum>0)
			System.out.println(sum);
		else
			System.out.println(-1);
	}

}
