package com.testNG.com;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert 
{
	@Test
	public  void username() {
		
		String expected = "john 456";
		String actual = "john 123";
		Assert.assertEquals(actual, expected);
		System.out.println("number 1 the expected is equal to actual");
		

	}
	
	@Test
	public void userpassword()
	{
		
		String expected = "john smith";
		String actual = "john smith";
		Assert.assertEquals(actual, expected);
		System.out.println("number 2 The expected is equal to actual");
	}
	

}
