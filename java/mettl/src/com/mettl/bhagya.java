package com.mettl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class bhagya {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		List<String> names=new ArrayList<>();
		List<String> names2=new ArrayList<>();
		List<String> res=new ArrayList<>();
		
		for(int i=0;i<5;i++)
		{
			names.add(sc.nextLine());
		}
		System.out.println(names);
		Collections.sort(names);
		//Collections.sort(names,(a,b)->a.compareTo(b));
		System.out.println(names);
	
		Comparator<String> C=(a,b)->{
			if(a.length()==b.length()) {
				return a.compareTo(b);
			}
			else return a.length()-b.length();
		};
		Collections.sort(names,C);
		System.out.println(names);
	}

}
//[z, abc, xyz, abcdef, qwertyui]