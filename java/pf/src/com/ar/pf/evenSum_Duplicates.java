package com.ar.pf;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class evenSum_Duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		int[] array=new int[n];
		for(int i=0;i<n;i++)
		{
			array[i]=sc.nextInt();
		}
		
		Set<Integer> set=new LinkedHashSet<>();
		for(int i=0;i<n;i++)
		{
			if(array[i]%2==0)
				set.add(array[i]);
		}
		if(set.isEmpty())
			System.out.println(-1);
		else
		{
			for(Integer k:set)
			{
				sum=sum+k;
			}
			System.out.println(sum);
		}
	}

}
