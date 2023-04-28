
class A {

	///public A() {}
	public A() {
		System.out.println("Constructor A");
	}	
}

class B extends A{

	public B()
	{
		System.out.println("Constructor B");
	}	
}

class C extends B
{
	public C()
	{
		System.out.println("Constructor C");
	}
}

class D extends C
{
	public D()
	{
		System.out.println("Constructor D");
	}
}

public class App4
{
	public static void mian(String[] args)
	{
		D d=new D();
	}
}