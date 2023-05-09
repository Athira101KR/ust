package com.ar.pf;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;

//cogniz$#45Ant

public class Flush_Characters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		
//		List<String> list=new ArrayList<>();
//		Pattern pattern=Pattern.compile("[#$0-9]+");
//		Matcher matcher=pattern.matcher(s);
//		while(matcher.find())
//		{
//			list.add(matcher.group());
//		}
//		System.out.println(list);
		
		String newS=s.replaceAll("[a-zA-Z]", "");
		System.out.println(newS);

	}

}
