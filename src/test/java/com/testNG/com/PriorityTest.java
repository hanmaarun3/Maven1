package com.testNG.com;

import org.testng.annotations.Test;

public class PriorityTest
{
	@Test (priority = 1)
	private void insertKey() {
		System.out.println("The key has been inserted");
	}
	@Test (priority = 2)
	private void gearOne()
	{
	System.out.println("Gear one has been put");
	}
	@Test (priority = 3)
	private void gearTwo()
	{
		System.out.println("Gear two has been put");
	}
	@Test (priority = 4)
	private void stoptheCar()
	{
		System.out.println("the car has been stopped");
	}
	
		
}
