package com.Maven_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ChildClass1 extends BaseClass1 {
	public static void main(String[] args) throws Throwable {

		browserLaunch();
		System.out.println("===Method processing Started===");

		launchSite("https://www.facebook.com/");

		waitImpli(5);

		WebElement btn1 = driver.findElement(By.xpath("(//a[@role='button'])[2]"));

		getAtrrib(btn1, "");
		getTheText(btn1);

		clickOnElement(btn1);

		navigateTo("https://www.edureka.co/");
		navigateBack();
		navigateForward();
		navigateRefresh();

		launchSite("http://automationpractice.com/index.php");
		WebElement btn2 = driver.findElement(By.xpath("//a[@class='login']"));
		clickOnElement(btn2);
		Thread.sleep(2000);
		
		//scrollDown();
		//scrollUp();
		
		//Thread.sleep(3000);
		

		WebElement mailid = driver.findElement(By.name("email"));
		sendValues(mailid, "hanmaarun4@gmail.com");

		WebElement password = driver.findElement(By.name("passwd"));
		
		checkEnable(password);
		checkDisplay(password);
		sendValues(password, "123123123");

		WebElement btn3 = driver.findElement(By.name("SubmitLogin"));
		clickOnElement(btn3);
		
		WebElement women = driver.findElement(By.xpath("//a[@title='Women']"));
		mouseAction(women);
		
		driver.findElement(By.xpath("//a[@title='T-shirts'][1]")).click();
		
		WebElement img = driver.findElement(By.xpath("(//img[@class='replace-2x img-responsive'])[2]"));
		img.click();
		Thread.sleep(5000);
		WebElement switchframe = driver.findElement(By.xpath("//iframe[@class='fancybox-iframe']"));
		switchToFrame(switchframe);
		
		Thread.sleep(2000);
				
		
		launchSite("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		WebElement singledropid = driver.findElement(By.id("select-demo"));
		checkMultiple(singledropid);
		
		getTheOptions(singledropid);
		selectSingle(singledropid, "Monday");
		
		
		navigateBack();
		launchSite("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		WebElement multipledropid = driver.findElement(By.id("multi-select"));
		checkMultiple(multipledropid);
		getTheOptions(multipledropid);
		selectMulti(multipledropid, 0);
		selectMulti(multipledropid, 1);
		getAllSelected(multipledropid);
		getFirstSelected(multipledropid);
		
		
		//to try alerts (accept or dismiss alert)
		
		launchSite("http://demo.automationtesting.in/Alerts.html");
		
		driver.findElement(By.xpath("(//a[@data-toggle='tab'])[2]")).click();
		
		WebElement alrtbtn2 = driver.findElement(By.xpath("//button[@onclick='confirmbox()']"));
		clickOnElement(alrtbtn2);
		Thread.sleep(2000);
		confirmAlert();
		
		//to try alerts (simple alert)
		
//		WebElement alertbtn = driver.findElement(By.xpath("//button[@onclick='alertbox()']"));
//		clickOnElement(alertbtn);
//		Thread.sleep(2000);
//		simpleAlert();

		printScreen();

		Thread.sleep(3000);

		// driver.get("https://www.facebook.com/");

		getCurrentUrl();
		getTheTitle();
		// close();
		System.out.println("=== All Methods are Successfully Processed===");

	}

}
