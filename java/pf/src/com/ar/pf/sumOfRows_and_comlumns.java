package com.ar.pf;

import java.util.Scanner;

public class sumOfRows_and_comlumns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int [][] array=new int[a][b];
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<b;j++)
			{
				array[i][j]=sc.nextInt();			}
		}
		
		///
		int sumOfRows=0;
		for(int i=0;i<a;i++)
		{
			sumOfRows=0;
			for(int j=0;j<b;j++)
			{
				sumOfRows=sumOfRows+array[i][j];
			}
			System.out.print(sumOfRows+" ");
		}
		System.out.println();
		int sumOfColumns=0;
		for(int i=0;i<b;i++)
		{
			sumOfColumns=0;
			for(int j=0;j<a;j++)
			{
				sumOfColumns=sumOfColumns+array[j][i];
				
			}
			System.out.print(sumOfColumns+" ");
		}
	}

}
