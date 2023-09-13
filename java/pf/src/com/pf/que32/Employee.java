package com.pf.que32;

import java.util.Date;

public class Employee {
	private int id;
	private Date dob;
	private int salary;
	
	public Employee() {}

	public Employee(int id, Date dob, int salary) {
		super();
		this.id = id;
		this.dob = dob;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", dob=" + dob + ", salary=" + salary + "]";
	}
	
	
}
