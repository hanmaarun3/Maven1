package com.pomadactin.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 

{
	
	public static WebDriver driver;
	 
	 
	 @FindBy(name="username")
	 private WebElement username;
	 
	 @FindBy (name="password")
	 private WebElement password;
	 
	 @FindBy (name="login")
	 private WebElement loginbtn;
	 
	 
	 
	 
	 
	 
	 
	 public LoginPage(WebDriver pom1)
	 {
		 this.driver=pom1;
		 PageFactory.initElements(pom1, this);
		
	 }
	 
	 public static WebDriver getDriver() {
			return driver;
		}

		public WebElement getUsername() {
			return username;
		}

		public WebElement getPassword() {
			return password;
		}

		public WebElement getLoginbtn() {
			return loginbtn;
		}

	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	
}
