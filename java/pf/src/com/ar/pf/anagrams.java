package com.ar.pf;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class anagrams {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		
		ArrayList<Character> as1=new ArrayList<>();
		ArrayList<Character> as2=new ArrayList<>();
		
		for(int i=0;i<s1.length();i++)
		{
			as1.add(s1.charAt(i));
		}
		for(int i=0;i<s2.length();i++)
		{
			as2.add(s2.charAt(i));
		}
		
//		Collections.sort(as1);
//		Collections.sort(as2);
		if(as1.containsAll(as2) || as2.containsAll(as1))
			System.out.println("Anagram");
		else
			System.out.println("not Anagram");
	}

}
//cognizant
//technologies
//eleven plus two
//twelve plus one