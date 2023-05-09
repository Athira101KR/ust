package com.ar.exam_3;

import java.util.Scanner;
import java.util.regex.Pattern;

public class password_generator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		String fname=sc.next();
		String lname=sc.next();
		int age=sc.nextInt();
		
		
		
		String p1=fname.substring(1, 3);
		fname=fname.toUpperCase();
		String p2=lname.substring(lname.length()-3,lname.length());
		
		System.out.print(fname.charAt(0)+p1+p2+"@"+age);
		
		
	}

}
