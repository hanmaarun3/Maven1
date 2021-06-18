package com.pomclass.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dress_Purchase 
{
	
	public static WebDriver driver;
	
	@FindBy(xpath="//a[@class='login']")
	private WebElement loginbtn;
	
	@FindBy(name="email")
	private WebElement email;
	
	@FindBy(name="passwd")
	private WebElement password;
	
	@FindBy(name="SubmitLogin")
	private WebElement submitbtn;
	
	@FindBy(xpath="//a[@title='Women']")
	private WebElement women;
	
	
	@FindBy (xpath="//a[@title='T-shirts'][1]")
	private WebElement tshirt;
	
	@FindBy (xpath="(//img[@class='replace-2x img-responsive'])[2]")
	private WebElement imgclick;
	
	@FindBy(xpath="//iframe[@class='fancybox-iframe']")
	private WebElement frame;
	
	@FindBy(name="Submit")
	private WebElement subbtn;
	
	@FindBy (xpath="//a[@title='Proceed to checkout']")
	private WebElement checkout1;
	
	@FindBy (xpath="(//a[@title='Proceed to checkout'])[2]")
	private WebElement checkout2;
	
	@FindBy (xpath="(//button[@type='submit'])[2]")
	private WebElement subbtn2;
	
	@FindBy (name="cgv")
	private WebElement checkout3;
	
	@FindBy (name="processCarrier")
	private WebElement process;
	
	@FindBy (xpath="//a[@class='bankwire']")
	private WebElement transfer;
	
	@FindBy (xpath="(//button[@type='submit'])[2]")
	private WebElement subbtn3;
	
	

	public Dress_Purchase(WebDriver pom1) 
	{
		this.driver=pom1;
		PageFactory.initElements(pom1, this);
	}
	

	public static WebDriver getDriver() 
	{
		return driver;
	}

	public WebElement getLoginbtn() 
	{
		return loginbtn;
	}

	public WebElement getEmail() 
	{
		return email;
	}

	public WebElement getPassword()
	{
		return password;
	}

	public WebElement getSubmitbtn() 
	{
		return submitbtn;
	}

		
	
	public WebElement getWomen() {
		return women;
	}


	public WebElement getTshirt() {
		return tshirt;
	}


	public WebElement getImgclick() {
		return imgclick;
	}


	public WebElement getFrame() {
		return frame;
	}


	public WebElement getSubbtn() {
		return subbtn;
	}


	public WebElement getCheckout1() {
		return checkout1;
	}


	public WebElement getCheckout2() {
		return checkout2;
	}


	public WebElement getSubbtn2() {
		return subbtn2;
	}


	public WebElement getCheckout3() {
		return checkout3;
	}


	public WebElement getProcess() {
		return process;
	}


	public WebElement getTransfer() {
		return transfer;
	}


	public WebElement getSubbtn3() {
		return subbtn3;
	}

	
	
	
	
	
	
	
	
}
