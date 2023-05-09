package com.ar.pf;

import java.util.Scanner;

public class logic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int sum=0;
		int[] array=new int[3];
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		if(a==13)
			sum=c;
		else if(c==13)
			sum=a+b;
		else
			sum=a+b+c;
		System.out.println(sum);
	}

}
