package com.testNG.com;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SimpleAnnotation 
{
	
	@BeforeSuite
	private void siteSetup()
	{
		System.out.println("Setup");
	}
	
	@BeforeTest
	private void browser()
	{
		System.out.println("The Browser is chrome");
	}
	
	@BeforeClass
	private void url() {
		System.out.println("amazon");
	}
	
	@BeforeMethod
	private void login() {
		System.out.println("Loginpage");
	}
	
	@Test
	private void oneplusSearch() {
		System.out.println("search oneplus");
	}
	
	@Test
	private void addToCart() 
	{
	System.out.println("added to cart");
	}
	
	@AfterMethod
	private void logout() {
		System.out.println("logoutpage");
	}
	
	@AfterClass
	private void close() {
		System.out.println("close the browser");
	}
	
	@AfterTest
	private void verification() {
		System.out.println("the verification is done");
	}
	
	@AfterSuite
	private void deleteCookies() {
		System.out.println("the cookies are deleted");
	}
	
		
	
	}
