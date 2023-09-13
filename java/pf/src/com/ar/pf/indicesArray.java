package com.ar.pf;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class indicesArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int array[]=new int[n];
		for(int i=0;i<n;i++)
		{
			array[i]=sc.nextInt();
		}		
		int sortedArray[]=new int[array.length];
		sortedArray=array.clone();
		Arrays.sort(sortedArray);
		List<Integer> li=new ArrayList<>();		
		for(int i=0;i<array.length;i++)
		{
			int ele=array[i];
			for(int j=0;j<array.length;j++)
			{
				if(!li.contains(j))
				{
					if(ele==sortedArray[j])
					{
						li.add(j);
						break;
					}
				}
			}
		}
		System.out.println(li);
	}

}
