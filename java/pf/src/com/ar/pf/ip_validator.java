package com.ar.pf;

import java.util.Scanner;

public class ip_validator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		
		if(s.matches("[0-255]{3}+\\.+[0-255]{3}+\\.+[0-255]{3}+\\.+[0-255]{3}"))
			System.out.println("Valid");
		else
			System.out.println("Invalid");
	}

}
//132.145.184.210   132.145.184.290
//112.115.201.210