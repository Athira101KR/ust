
package com.ar.pf;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Find_common_characters_and_unique_characters_instring {
	
	static StringBuffer nonCommon(StringBuffer sb)
	{
		for(int i=0;i<sb.length();i++)
		{
			for(int j=i+1;j<sb.length();j++)
			{
				if(sb.charAt(i)==sb.charAt(j))
				{
					sb.deleteCharAt(j);
					sb.deleteCharAt(i);
				}	
			}		
		}
		System.out.println(sb);
		return sb;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String inOne=sc.nextLine();
		String inTwo=sc.nextLine();
		
		StringBuffer sb1=new StringBuffer(inOne);
		StringBuffer sb2=new StringBuffer(inTwo);

		StringBuffer res1=nonCommon(sb1);
		
		StringBuffer res2=nonCommon(sb2);
		
		int count=0;
		for(int i=0;i<res1.length();i++)
		{
			for(int j=0;j<res2.length();j++)
			{
				if(res1.charAt(i)==res2.charAt(j))
				{
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
