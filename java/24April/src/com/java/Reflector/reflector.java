package com.java.Reflector;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class reflector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e=new Employee();
		Class c=e.getClass();
		
		Method[] methods=c.getDeclaredMethods();
		for(Method method:methods)
		{
			if(Modifier.isPublic(method.getModifiers()));
				System.out.println(method);
		}
	}

}
