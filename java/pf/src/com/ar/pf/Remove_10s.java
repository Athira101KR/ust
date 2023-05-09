package com.ar.pf;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Remove_10s {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);	
		int n=sc.nextInt();
		int[] array=new int[n];
		List<Integer> newArray=new ArrayList<>();
		for(int i=0;i<n;i++)
		{
			array[i]=sc.nextInt();
		}
		
		for(int i=0;i<n;i++)
		{
			if(array[i]!=10)
			{
				newArray.add(array[i])	;			
			}		
		}

		for(int i=newArray.size();i<n;i++)
		{
			newArray.add(0);
		}
		System.out.println(newArray);
	} 
}
