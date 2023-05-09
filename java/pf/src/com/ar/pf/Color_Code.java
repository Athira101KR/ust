package com.ar.pf;

import java.util.Scanner;

public class Color_Code {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		
		if(s.matches("[#]{1}[A-F0-9]{6}"))
		{
			System.out.println("Valid");
		}
		else
		{
			System.out.println("Invalid");
		}
			
	}

}
