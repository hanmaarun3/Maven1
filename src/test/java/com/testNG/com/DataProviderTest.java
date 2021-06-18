package com.testNG.com;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest 
{
	@Test (dataProvider = "data2")
	private void empDetails(String name, String pass)
	{
		System.out.println("Name of the employee:"+name);
		System.out.println("Password of the employee:"+pass);
	}
	
	@DataProvider (name = "data1")
	private Object[][] inputData() {
		
		return new Object[][] 
				
	{
			{"arun","318"},{"renu","2409"},{"jack","24"}
			
	};}
	
	@DataProvider (name = "data2")
	private Object[][] inputData2() {
		
		return new Object[][] 
				
	{
			{"king","318"},{"queen","2409"},{"prince","24"}
			
	};
		
	}
	
}
		
