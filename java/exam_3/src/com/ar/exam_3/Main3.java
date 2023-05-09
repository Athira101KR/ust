package com.ar.exam_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserMainCode3 user3=new UserMainCode3();
		
		Scanner sc=new Scanner(System.in);
		Scanner sc2=new Scanner(System.in);
		int m=sc2.nextInt();
		List<String> list1=new ArrayList<>();
		for(int i=0;i<m;i++)
		{
			list1.add(sc.nextLine());
		}
		
		int n=sc2.nextInt();
		List<String> list2=new ArrayList<>();
		for(int i=0;i<n;i++)
		{
			list2.add(sc.nextLine());
		}

		
		String[] array=user3.fruitSelector(list1,list2);
		
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}
		
	}

}
