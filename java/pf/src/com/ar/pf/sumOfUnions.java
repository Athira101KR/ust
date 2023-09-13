package com.ar.pf;

import java.util.Scanner;

public class sumOfUnions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int sum=0;
		int ij=0;
		int m=sc.nextInt();
		int n=sc.nextInt();
		int array[][]=new int[m][n];
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				array[i][j]=sc.nextInt();
			}			
		}
		int a=sc.nextInt();
		int b=sc.nextInt();
		int rowSum=0,colSum=0;
		for(int i=a;i<=a;i++)
		{
			for(int j=0;j<n;j++)
			{
				rowSum=rowSum+array[i][j];
				ij=array[a][b];
			}
		}
		for(int i=0;i<m;i++)
		{
			for(int j=b;j<=b;j++)
			{
				colSum=colSum+array[i][j];
			}
		}
		
		sum=(rowSum+colSum)-ij;
		System.out.println(sum);
	}

}
