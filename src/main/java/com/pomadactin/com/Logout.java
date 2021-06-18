package com.pomadactin.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout

{

	public static WebDriver driver;
		
	
	@FindBy (name="logout")
	private WebElement logoutbtn;
	
	public Logout(WebDriver pom5)
	{
		this.driver=pom5;
		PageFactory.initElements(pom5, this);
	}
	
		
	public static WebDriver getDriver() {
		return driver;
	}


	public WebElement getLogoutbtn() {
		return logoutbtn;
	}


	
	
	
	
	
	
	
	
}
