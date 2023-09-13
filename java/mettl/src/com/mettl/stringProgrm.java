package com.mettl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class stringProgrm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String input1=sc.nextLine();
		int input2=sc.nextInt();
		String res1="";
		List<Integer> li=new ArrayList<>();
		
		for(int i=0;i<input1.length();i++)
		{
			if(input1.charAt(i)>64 && input1.charAt(i)<90)
			{					
				//System.out.println(count);
				li.add(i);
			}
		}
		
		StringTokenizer st=new StringTokenizer(input1);
		while(st.hasMoreTokens())
		{
			String s=st.nextToken();
			for(int i=s.length()-1;i>=0;i--)
			{		
				res1=res1+s.charAt(i);
			}
			res1=res1+" ";
			
		}
		
		if(input2==0)
		{
			System.out.println(res1);
		}
		else
		{
			char cn = 0;
			res1=res1.toLowerCase();
			//System.out.println(res1);
			for(int i=0;i<res1.length();i++)
			{
				if(li.contains(i))
				{
//					System.out.println(res1.charAt(i)-32);
					int c=res1.charAt(i)-32;
					cn=(char)c;
					//System.out.println((char)c);
					res1=res1.replace(res1.charAt(i),cn);
				}
				//res1=res1.replace(res1.charAt(i),cn);
			}
			
			System.out.println(res1);
			
		}
		//System.out.println(li);
		
	}

}
