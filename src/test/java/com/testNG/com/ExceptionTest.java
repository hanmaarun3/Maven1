package com.testNG.com;

import org.testng.annotations.Test;

public class ExceptionTest 

{
		@Test (expectedExceptions = ArithmeticException.class)
		private void calculation() 
		{
			int a = 5;
			int b = a/0;
			System.out.println("the output"+b);
		}
}
