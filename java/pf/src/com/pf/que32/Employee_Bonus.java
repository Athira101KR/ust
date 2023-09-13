package com.pf.que32;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Scanner;

public class Employee_Bonus {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		HashMap<Integer,String> hm1=new HashMap<>();
		HashMap<Integer,Integer> hm2=new HashMap<>();
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
			String details=sc.nextLine();
			if(details.equals(" "))
				details=sc.nextLine();
			String[] array=details.split(",");
			
			Employee emp=new Employee();
			emp.setId(Integer.parseInt(array[0]));
			SimpleDateFormat sdf=new SimpleDateFormat("dd-mm-yyyy");
			emp.setDob(sdf.parse(array[1]));
			emp.setSalary(Integer.parseInt(array[2]));
			
		}
	}

}
