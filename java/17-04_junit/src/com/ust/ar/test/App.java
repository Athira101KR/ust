package com.ust.ar.test;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Result result=JUnitCore.runClasses(MathematicsTests.class);
		System.out.println(result.getFailureCount());
		for(Failure f:result.getFailures())
		{
			System.out.println(f.getMessage());;
		}
	}

}
