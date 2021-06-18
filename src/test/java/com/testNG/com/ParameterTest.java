package com.testNG.com;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest

{
	@Parameters({"pname"})
	@Test
	private void empUsername(@Optional("arun") String name) {
		System.out.println("name of the employee:"+name);
	}
	
	@Parameters({"ppassword"})
	@Test
	private void empPasswd(@Optional ("123") String pass) {
		System.out.println("Password for the employee:"+pass);
	}
	
	
	
	
	
	
}
