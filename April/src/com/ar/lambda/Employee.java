package com.ar.lambda;

public class Employee {
	private Integer id;
	private String fname;
	private String lname;
	private Integer salary;
	
	
	Employee(){}


	public Employee(Integer id, String fname, String lname, Integer salary) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.salary = salary;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getFname() {
		return fname;
	}


	public void setFname(String fname) {
		this.fname = fname;
	}


	public String getLname() {
		return lname;
	}


	public void setLname(String lname) {
		this.lname = lname;
	}


	public Integer getSalary() {
		return salary;
	}


	public void setSalary(Integer salary) {
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", fname=" + fname + ", lname=" + lname + ", salary=" + salary + "]";
	}
	
//	public static Employee createData(String details)
//	{
//		Employee employee=new Employee();
//		employee.setId(id);
//	}

}
