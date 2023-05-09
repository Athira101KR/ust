package com.ar.exam_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UserMainCode3 {

	static String[] fruitSelector(List<String> list1, List<String> list2) {
		// TODO Auto-generated method stub
		
		List<String> newList=new ArrayList<>();
		for(String s:list1)
		{
			char c=s.charAt(s.length()-1);
			if(c=='a'|| c=='A' )
			{	
				continue;
			}
			else if(c=='e'|| c=='E' )
			{
				continue;
			}
			else
				newList.add(s);
		}
		
		for(String s:list2)
		{
			char c=s.charAt(0);
			if(c=='m'|| c=='M' )
			{	
				continue;
			}
			else if(c=='a'|| c=='A' )
			{
				continue;
			}
			else
				newList.add(s);
		}
		
		String[] array=new String[newList.size()];
			array=	newList.toArray(array);
			return array;				
	}

}
