package com.mettl;

import java.util.Scanner;

public class stringNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String input1=sc.next();
		int input2=sc.nextInt();
		
		if(input1.equals(""))
		{
			System.out.println("null");
		}
		
		else
		{
		  String digits=input1.replaceAll("[a-zA-Z]", "");
	        String alpha=input1.replaceAll("[0-9]", "");
	      //  System.out.println(digits);
	       // System.out.println(alpha);
	       // String[] numArrray=digits.toString();
	        if(input2==1)
	        {
	        	if(alpha.equals(""))
	        	{
	        		System.out.println("ZERO");
	        	}
	        	else
	        	{
	        		System.out.println(alpha);
	        	}
	        }
	        else
	        {
	        	if(digits.equals(""))
	        	{
	        		System.out.println("ZERO");
	        	}
	        	else
	        	{
		           int rem=0,sum=0;
		           for(int i=0;i<digits.length();i++)
		           {
		              int n=48-(digits.charAt(i)) ;
		              sum=sum+Math.abs(n);
		           }
		           System.out.println(sum);
		        }
	        }
		}
	}

}
