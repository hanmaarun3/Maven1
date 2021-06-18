package com.testNG.com;

import org.testng.annotations.Test;

public class InvocationTest 
{

		
	@Test (priority = 1)
	private void requirement() {
		System.out.println("the requirements have been gathered");
	}
	@Test 
	private void designtheOutline() {
		System.out.println("the project outline has been designed");
	}
	@Test (invocationCount = 3)
	private void developtheCode() {

		System.out.println("code development started");
	}
	@Test (invocationCount = 5)
	private void testtheCode() {
		System.out.println("the code is given for testing");
	}
	@Test 
	private void recodingtheSoftware() {
		System.out.println("the code has been rebuilt");
	}
	@Test 
	private void finaTest() {
		System.out.println("the testing is completed");
	}
	@Test 
	private void deployment() {
		System.out.println("the software is been delivered");
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
}
