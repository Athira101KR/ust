package com.ar.pf;

import java.util.Scanner;

public class digitSum {
	
	static int sumOfDigits(int n) {
		// TODO Auto-generated method stub
		int rem=0;
		int sum=0;
		while(n>0)
		{
			rem=n%10;
			sum=sum+rem;
			n=n/10;
		}
		return sum;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int res=sumOfDigits(n);
		if(res>=9)
		{
			res=sumOfDigits(res);

		}
		System.out.println(res);
		
	}


}
