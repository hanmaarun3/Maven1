package com.testNG.com;

import org.testng.annotations.Test;

public class Dependancy 


{
	@Test (priority = 1)
	private void requirement() {
		System.out.println("the requirements have been gathered");
	}
	@Test (dependsOnMethods = "requirement")
	private void designtheOutline() {
		System.out.println("the project outline has been designed");
	}
	@Test (dependsOnMethods = "designtheOutline")
	private void developtheCode() {

		System.out.println("code development started");
	}
	@Test (dependsOnMethods = "developtheCode")
	private void testtheCode() {
		System.out.println("the code is given for testing");
	}
	@Test (dependsOnMethods = "testtheCode")
	private void recodingtheSoftware() {
		System.out.println("the code has been rebuilt");
	}
	@Test (dependsOnMethods = "recodingtheSoftware")
	private void finaTest() {
		System.out.println("the testing is completed");
	}
	@Test (dependsOnMethods = "finaTest")
	private void deployment() {
		System.out.println("the software is been delivered");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
