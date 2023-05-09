package com.ar.exam_3;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserMainCode2 user2=new UserMainCode2();
		
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		
		String result=user2.getCombo(s1,s2);
		System.out.print(result);
		
	}

}
