package com.pomadactin.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel

{
	
	
	public static WebDriver driver;
	 
	 
	 @FindBy (name="radiobutton_0")
	 private WebElement radiobtn;
	 
	 @FindBy (name="continue")
	 private WebElement continuebtn;
	 
	 public SelectHotel(WebDriver pom3)
	 {
		 this.driver=pom3;
		 PageFactory.initElements(pom3, this);
	 }
	 

	 public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getRadiobtn() {
		return radiobtn;
	}

	public WebElement getContinuebtn() {
		return continuebtn;
	}

	
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}
