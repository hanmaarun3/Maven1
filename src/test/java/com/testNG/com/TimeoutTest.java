package com.testNG.com;

import org.testng.annotations.Test;

public class TimeoutTest {
	
	
		
	@Test 
	private void requirement() {
		System.out.println("the requirements have been gathered");
	}
	@Test (timeOut = 2000)
	private void designtheOutline() throws InterruptedException {
		System.out.println("the project outline has been designed");
		Thread.sleep(1000);
		System.out.println("The next phase has been started");
	}
	@Test (timeOut = 4000)
	private void developtheCode() {

		System.out.println("code development started");
	}


}
