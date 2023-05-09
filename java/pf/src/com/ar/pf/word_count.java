package com.ar.pf;

import java.util.Scanner;

public class word_count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String[] s=new String[n];
		for(int i=0;i<n;i++)
		{
			s[i]=sc.next();
		}		
		int k=sc.nextInt();	
		for(int i=0;i<n;i++)
		{
			String a=s[i];
			int cnt=a.length();			
			if(cnt==k)
				count++;
				
		}
		System.out.println(count);
	}

}
