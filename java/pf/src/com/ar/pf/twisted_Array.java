package com.ar.pf;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class twisted_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] array=new int[n];
		int[] arrayOriginal=new int[n];
		for(int i=0;i<n;i++)
		{
			array[i]=sc.nextInt();
			
		}
		
		int k=sc.nextInt();
		arrayOriginal=array.clone();
		Arrays.sort(array);
		List<Integer> li=new ArrayList<>();
//		System.out.println(Arrays.toString(arrayOriginal));
//		System.out.println(Arrays.toString(array));
		
		for(int i=0;i<k;i++)
		{
			li.add(array[i]);
		}
		//System.out.println(li);
		//System.out.println(Arrays.toString(arrayOriginal));
		for(int i=0;i<n;i++)
		{
				int ele=arrayOriginal[i];		
				int t=0;
				for(int j=0;j<li.size();j++)
				{
					if(li.get(j)!=ele)			
					{
						t=1;		
					}
					else
					{
						t=0;break;
					}
					//System.out.println(ele+"!="+li.get(j));		
				}
				if(t==1)
					li.add(ele);
				//System.out.println("---------");
		}
		System.out.println(li);
	}



}
