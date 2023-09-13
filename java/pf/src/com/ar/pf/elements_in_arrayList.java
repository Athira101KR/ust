package com.ar.pf;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class elements_in_arrayList {

	static List<Integer> checker(int[] a,int[] b)
	{
		List<Integer> list=new ArrayList<>();
		for(int i=0;i<a.length;i++)
		{
			int count=0;
			for(int j=0;j<b.length;j++)
			{
				if(a[i]!=b[j])
				{
					count=1;
				}
				else
				{
					count=0;
					break;
				}
			}
			if(count==1)
				list.add(a[i]);
		}
		System.out.println(list);
		return list;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {9,1,3,3};
		int[] b= {1,3,5,6};
		Arrays.sort(a);
		Arrays.sort(b);
		
		List<Integer> res = checker(a,b);
		res.addAll(checker(b,a));
		
		System.out.println(res);
	}

}
