package com.testNG.com;

import org.testng.annotations.Test;

public class GroupingTest 
{

	
	@Test 
	private void requirement() {
		System.out.println("the requirements have been gathered");
	}
	@Test
	private void designtheOutline() {
		System.out.println("the project outline has been designed");
	}
	@Test 
	private void developtheCode() {

		System.out.println("code development started");
	}
	@Test 
	private void testtheCode() {
		System.out.println("the code is given for testing");
	}
	@Test (groups = "exclude1")
	private void recodingtheSoftware() {
		System.out.println("the code has been rebuilt");
	}
	@Test (groups = "include1")
	private void finaTest() {
		System.out.println("the testing is completed");
	}
	@Test 
	private void deployment() {
		System.out.println("the software is been delivered");
}
}
