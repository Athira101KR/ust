package com.ar.pf;

import java.util.Scanner;

public class chessBoard {

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
				array[i][j]=sc.nextInt();			
			}
		}
		
		int count=0;
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<b-1;j++)
			{
				if(array[i][j]==array[i][j+1])
				{
					count++;
				}
				else
					continue;
			}
		}
		if(count>0)
		{
			System.out.println("false");
			System.out.println(count);
		}
		else
		{
			System.out.println("true");
		}
	}

}
