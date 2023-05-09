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
		
		ArrayList<String> as1=new ArrayList<>(Arrays.asList(s1));
		ArrayList<String> as2=new ArrayList<>(Arrays.asList(s2));
		
		//as1=(ArrayList<String>) Arrays.asList(s1);
		
		Collections.sort(as1);
		Collections.sort(as2);
		System.out.println(as1+"  "+as2);
		
		if(as1.containsAll(as2) && as2.containsAll(as1))
			System.out.println("Anagram");
		else
			System.out.println("not Anagram");
	}

}

//eleven plus two
//twelve plus one