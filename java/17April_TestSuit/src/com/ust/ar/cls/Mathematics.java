package com.ust.ar.cls;

public class Mathematics {
	int a,b;
	
	public Mathematics() {}

	public Mathematics(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
	
	public int add()
	{
		return a+b;
	}
	public int sub()
	{
		return a-b;
	}
	public int pro()
	{
		return a*b;
	}
	public int div()
	{
		return a/b;
	}
}
