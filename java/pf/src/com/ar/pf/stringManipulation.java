package com.ar.pf;

import java.util.Scanner;

public class stringManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		
		String newS="";
		if(s.charAt(0)=='j')
		{
			newS=newS+"j";
		}
		if(s.charAt(1)=='b')
		{
			newS=newS+"b";
		}
		
	 newS=newS+	s.substring(2, s.length());
	System.out.print(newS);

	}

}
