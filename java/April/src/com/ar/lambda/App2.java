package com.ar.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class App2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp=new Employee();
		List<Employee> li=new ArrayList<Employee>();
		Scanner sc=new Scanner(System.in);
		Scanner sc1=new Scanner(System.in);
		System.out.println("enter the number of employees");
		int n=sc.nextInt();
//		for(int i=0;i<n;i++)
//		{
//			Integer id=sc.nextInt();
//			emp.setId(id);	
//			String fname=sc1.nextLine();
//			emp.setFname(fname);
//			String lname=sc1.nextLine();
//			emp.setLname(lname);
//			int salary=sc.nextInt();
//			emp.setSalary(salary);
//			
//			li.add(emp);	
//		}
		//System.out.println(li);
		
		li.add(new Employee(248774,"Neethu"," Nelliparambil Rathimohan",12345));

		li.add(new Employee(249547,"Bhagyalakshmi"," Suresh",23451));

		li.add(new Employee(248825,"Ajay"," C M",45123));

		li.add(new Employee(249532,"kalyan"," Jalaneela",3451));

		li.add(new Employee(249529,"AISWARYA"," P",19000));

		li.add(new Employee(248764,"Ajayakrishnan"," J",10000));
		
		List<Employee> nelist=li.stream().filter(a->a.getSalary()>20000).collect(Collectors.toList());
	
	//List<Employee> newLi=li.stream().collect(Collectors.toList());
//	for(Employee e:newLi) {
	System.out.println(nelist);
	}
	}
	


