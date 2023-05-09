package com.ar.exam_3;

import java.util.Scanner;

public class Main {
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			UserMainCode user=new UserMainCode();
			
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			int sum=0;
			int[] array=new int[n];
			for(int i=0;i<n;i++)
			{
				array[i]=sc.nextInt();
			}
			int num=sc.nextInt();
			
			user.addAndReverse(array,num);
	}

}
