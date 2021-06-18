package com.pomadactin.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotel 

{
	
public static WebDriver driver;
	
	@FindBy (name="first_name")
	private WebElement firstname;
	
	@FindBy (name="last_name")
	private WebElement lastname;
	
	@FindBy (name="address")
	private WebElement billaddr;
	
	
	@FindBy (name="cc_num")
	private WebElement ccnum;
	
	@FindBy (name="cc_type")
	private WebElement cctype;
	
	@FindBy (name="cc_exp_month")
	private WebElement ccexpmonth;
	
	@FindBy (name="cc_exp_year")
	private WebElement ccexpyear;
	
	
	@FindBy (name="cc_cvv")
	private WebElement cccvv;
	
	@FindBy (name="book_now")
	private WebElement bookbtn;
	
	public BookHotel(WebDriver pom4)
	{
		this.driver=pom4;
		PageFactory.initElements(pom4, this);
		
	}
	
	
	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getBilladdr() {
		return billaddr;
	}

	public WebElement getCcnum() {
		return ccnum;
	}

	public WebElement getCctype() {
		return cctype;
	}

	public WebElement getCcexpmonth() {
		return ccexpmonth;
	}

	public WebElement getCcexpyear() {
		return ccexpyear;
	}

	public WebElement getCccvv() {
		return cccvv;
	}

	public WebElement getBookbtn() {
		return bookbtn;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
