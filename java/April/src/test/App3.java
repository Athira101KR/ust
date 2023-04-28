package test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class App3 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		List<Employee> empList=new ArrayList<Employee>();
		
		empList.add(new Employee(248774,"Neethu"," Nelliparambil Rathimohan","EEE",10.0));

		empList.add(new Employee(249547,"Bhagyalakshmi"," Suresh","CSE",10.0));

		empList.add(new Employee(248825,"Ajay"," C M","EEE",10.0));

		empList.add(new Employee(249532,"kalyan"," Jalaneela","ECE",10.0));

		empList.add(new Employee(249529,"AISWARYA"," P","EEE",10.0));

		empList.add(new Employee(248764,"Ajayakrishnan"," J","CSE",10.0));
	
//	 result = empList.stream().collect(Collectors.groupingBy(Employee::department,Collectors.counting(Employee::getDepartment())));
	}

}
