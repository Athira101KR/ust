package com.ar.pf;

public class incrementSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int test=0;
		String str= "143";
		char[] array=new char[str.length()];
		array=str.toCharArray();
		
		for(int i=0;i<array.length;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				if(array[i]<array[j])
				{
					int a= array[i]-48;
					int b=array[j]-48;
					if(sum==0)
						sum=a+b;
					else
					{
						sum=sum+b;
					}
					j=array.length;
				}
				else
				{
					test=array[i]-48;
				}
			}
			if(test!=0)
			{
				sum=test;
				i=array.length;
			}
		}
		System.out.println(sum);
	}

}
