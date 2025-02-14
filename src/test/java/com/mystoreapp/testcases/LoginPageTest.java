package com.mystoreapp.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mystoreapp.base.BaseClass;
import com.mystoreapp.pageobjects.HomePage;
import com.mystoreapp.pageobjects.IndexPage;
import com.mystoreapp.pageobjects.LoginPage;

public class LoginPageTest extends BaseClass
{
	IndexPage indexpage;
	LoginPage loginpage;
	HomePage homepage;
	
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
	public void loginTest() throws Throwable
	{
		indexpage.signInClick();
		loginpage = new LoginPage();
	    homepage = loginpage.login();
		
		String actualResult = homepage.getCurrURL();
		String expectedResult = "http://www.automationpractice.pl/index.php?controller=my-account";
		Assert.assertEquals(actualResult,expectedResult);
	}
}
