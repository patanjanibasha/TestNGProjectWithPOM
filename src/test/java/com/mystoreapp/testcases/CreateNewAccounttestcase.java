package com.mystoreapp.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mystoreapp.base.BaseClass;
import com.mystoreapp.pageobjects.AccountCreationPage;
import com.mystoreapp.pageobjects.HomePage;
import com.mystoreapp.pageobjects.IndexPage;
import com.mystoreapp.pageobjects.LoginPage;

public class CreateNewAccounttestcase extends BaseClass{
	IndexPage indexpage;
	LoginPage loginpage;
	HomePage homepage;
	AccountCreationPage createaccount;
	
	@BeforeMethod
	public void setUp()
	{
		launchApp() ;
		indexpage = new IndexPage();
		System.err.println("launch app  test case called");
	}
	
	@AfterMethod
	public void tearDown()
	{
		 driver.quit();
		System.err.println("Browser Quited");
	}

	@Test
	public void CreateAccountTestCase() 
	{
		indexpage.signInClick();
		loginpage = new LoginPage();
		createaccount = loginpage.AccountCreate("fdd@gmail.com");
		//loginpage.
		
	}
		
}
