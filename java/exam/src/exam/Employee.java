package exam;

import java.util.Date;
import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Scanner sc2=new Scanner(System.in);
		System.out.println("enter number of employees");
		int n=sc.nextInt();
		String eid,date;
		for(int i=0;i<=n;i++)
		{
			eid=sc.nextLine();
			date=sc2.nextLine();
			if(date==null)
				date=sc.nextLine();
		}
	//	Date doj=new Date();
		//System.out.println("doj");
	}

}
