package com.mettl;

import java.util.ArrayList;
import java.util.List;

public class primeSum {
	
	static  boolean isPrime(int n)
	{
		int flag=0;
		
		if(n==2)
		{
			flag=0;
		}
		else if(n<2)
		{
			flag=1;
		}
		else
		{
			for(int i=2;i<=n/i;i++)
			{
				if(n%i==0)
					flag=1;
				else
					flag=0;
			}
	}	
	if(flag==0)
	{
		return true;
	}
	else
	{
		return false;
	}
	//return false;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		String sums="";
		int n=1234561179;
//		int n=84696;
//		int n=18471111;
		List<Integer>li=new ArrayList<>();
		
	while(n>0)
	{
		int rem=n%10;
		li.add(rem);
		n=n/10;	
	}
	
	for(int i=li.size()-1;i>=0;i--)
	{
		if(isPrime(li.get(i)))
		{
			//System.out.println(li.get(i));
			sums=""+li.get(i);
			System.out.print(sums);
			sum=sum+li.get(i);
		}
	}
	if(sum==0)
	{
		sums=li.get(li.size()-1)+":"+li.get(0);
	}
	else
	{
	sums=":"+sum;
	}
	System.out.print(sums);

	}

}
