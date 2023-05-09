package com.ar.exam_3;

public class UserMainCode2 {

	static String getCombo(String s1, String s2) {
		// TODO Auto-generated method stub
		String newString="";
		
		if(s1.length()>s2.length())
		{
			newString= s1+s2+s1;
		}
		else
		{
			newString= s2+s1+s2;
		}
		return newString;
	}

}
