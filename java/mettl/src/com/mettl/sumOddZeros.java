package com.mettl;

import java.util.ArrayList;
import java.util.List;

// -25064   neozee
// 16338 poeooe

public class sumOddZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input1=16338;
		int rem=0;
		int input=input1;
		String s="";
		List<Integer> li=new ArrayList<>();
		input=Math.abs(input);
		while(input>0)
		{
			rem=input%10;
			li.add(rem);
			input=input/10;
		}	
		if(input1>0)
		{
			s="p";
		}
		else
		{
			s="n";
		}
		for(int i=li.size()-1;i>=0;i--)
		{
			if(li.get(i)==0)
			{
				s=s+"z";
			}
			else if(li.get(i)%2==0)
			{
				s=s+"e";
			}
			else
			{
				s=s+"o";
			}
		}		
		System.out.println(s);
	}

}
