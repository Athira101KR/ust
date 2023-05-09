package com.ar.pf;

import java.util.Scanner;

public class String_Processing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		int n=sc.nextInt();
		s1=s1.toUpperCase();
		s2=s2.toUpperCase();
		//System.out.println(s1.charAt(n)+" "+s2.charAt(n));
		
		if(s1.charAt(n)==s2.charAt(n))
		{
			System.out.println("TRUE");
		}
		else
		{
			System.out.println("FALSE");
		}
		
	}

}
