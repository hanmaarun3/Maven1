package com.pomadactin.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel 

{
	
	public static WebDriver driver;
	
	@FindBy (name="location")
	private WebElement location;
	
	@FindBy (name="hotels")
	private WebElement hotels;
	
	@FindBy (id="room_type")
	private WebElement roomtype;
	
	@FindBy (id="room_nos")
	private WebElement roomno;
	
	
	@FindBy (name="datepick_in")
	private WebElement checkindate;
	
	@FindBy (name="datepick_out")
	private WebElement checkoutdate;
	
	
	@FindBy (name="adult_room")
	private WebElement adultperroom;
	
	
	@FindBy (name="child_room")
	private WebElement childperroom;
	
	
	@FindBy (name="Submit")
	private WebElement submitbtn;
	
	public SearchHotel(WebDriver pom2)
	
	{
		this.driver=pom2;
		PageFactory.initElements(pom2, this);
	}
	
	
	public static WebDriver getDriver() {
		return driver;
	}


	public WebElement getLocation() {
		return location;
	}


	public WebElement getHotels() {
		return hotels;
	}


	public WebElement getRoomtype() {
		return roomtype;
	}


	public WebElement getRoomno() {
		return roomno;
	}


	public WebElement getCheckindate() {
		return checkindate;
	}


	public WebElement getCheckoutdate() {
		return checkoutdate;
	}


	public WebElement getAdultperroom() {
		return adultperroom;
	}


	public WebElement getChildperroom() {
		return childperroom;
	}


	public WebElement getSubmitbtn() {
		return submitbtn;
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
