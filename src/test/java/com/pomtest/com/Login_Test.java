package com.pomtest.com;
import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.pomclass.com.Dress_Purchase;

public class Login_Test {
	
	public static void main(String[] args) throws Throwable 
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Learning Area\\eclipse-workspace\\Selenium_Project\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		
		Dress_Purchase lt = new Dress_Purchase(driver);
		
		lt.getLoginbtn().click();
		lt.getEmail().sendKeys("hanmaarun4@gmail.com");
		lt.getPassword().sendKeys("123123123");
		lt.getSubmitbtn().click();
		

		
		
		
		
		
//		dp.findElement(By.xpath("//a[@class='login']")).click();
//		
//		//signing in using registered mail id
//		dp.findElement(By.name("email")).sendKeys("hanmaarun4@gmail.com");
//		dp.findElement(By.name("passwd")).sendKeys("123123123");
//		dp.findElement(By.name("SubmitLogin")).click();
//		Thread.sleep(5000);
		
//		Thread.sleep(2000);
//		dp.findElement(By.name("email_create")).sendKeys("hanmaarun5@gmail.com");
//		Thread.sleep(2000);
//		dp.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
//		Thread.sleep(3000);
//		dp.findElement(By.xpath("//input[@type='radio']")).click();
//		Thread.sleep(3000);
//		dp.findElement(By.name("customer_firstname")).sendKeys("naruto");
//		dp.findElement(By.name("customer_lastname")).sendKeys("usumaki");
//		dp.findElement(By.name("passwd")).sendKeys("123123123");
//		WebElement day= dp.findElement(By.name("days"));
//		Select s1 = new Select(day);
//		s1.selectByValue("31");
//		WebElement month = dp.findElement(By.name("months"));
//		Select s2 = new Select(month);
//		s2.selectByValue("8");
//		WebElement year = dp.findElement(By.name("years"));
//		Select s3 = new Select(year);
//		s3.selectByValue("1995");
//		dp.findElement(By.name("company")).sendKeys("hanmagroup");
//		dp.findElement(By.name("address1")).sendKeys("no 59, sai kirupa flats");
//		dp.findElement(By.name("address2")).sendKeys("ambattur");
//		dp.findElement(By.name("city")).sendKeys("chennai");
//		Thread.sleep(2000);
//		WebElement state = dp.findElement(By.xpath("//select[@name='id_state']"));
//		Select s4 = new Select(state);
//		s4.selectByVisibleText("Alabama");
//		WebElement zipcode = dp.findElement(By.xpath("(//input[@type='text'])[11]"));
//		zipcode.sendKeys("60053");
//		WebElement country = dp.findElement(By.xpath("//select[@name='id_country']"));
//		Select s5 = new Select(country);
//		s5.selectByValue("21");
//		dp.findElement(By.name("phone")).sendKeys("8148190397");
//		dp.findElement(By.name("phone_mobile")).sendKeys("8148190398");
//		dp.findElement(By.name("alias")).sendKeys("ambattur,chennai");
//		Thread.sleep(2000);
//		dp.findElement(By.name("submitAccount")).click();
//		Thread.sleep(5000);
		
		Actions hov = new Actions(driver);
		WebElement women = lt.getWomen();
		hov.moveToElement(women).build().perform();
		lt.getTshirt().click();
		Thread.sleep(3000);
		
		WebElement img =lt.getImgclick();
		
		Thread.sleep(2000);
		img.click();
		Thread.sleep(5000);
		WebElement fram = lt.getFrame();
		driver.switchTo().frame(fram);
		//*[@id="fancybox-frame1622231126864"]
		//dp.switchTo().frame("thumbnail_1");
		//dp.findElement(By.xpath("//img[@id='thumb_4']")).click();
		
		Thread.sleep(3000);
		lt.getSubbtn().click();
		Thread.sleep(3000);
		WebElement checkout1 = lt.getCheckout1();
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		checkout1.click();
		Thread.sleep(2000);
		lt.getCheckout2().click();
		Thread.sleep(3000);
		lt.getSubbtn2().click();
		Thread.sleep(2000);
		lt.getCheckout3().click();
		Thread.sleep(1000);
		lt.getProcess().click();
		Thread.sleep(3000);
		lt.getTransfer().click();
		Thread.sleep(3000);
		lt.getSubbtn3().click();
		Thread.sleep(2000);
		
		
		
		System.out.println("order is placed successfully ");
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File Destination = new File("C:\\Users\\Learning Area\\eclipse-workspace\\Maven_Project\\Screenshot");
		FileUtils.copyFile(source, Destination);
		
		
		
	}

}
