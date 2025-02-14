package com.mystoreapp.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mystoreapp.base.BaseClass;
import com.mystoreapp.pageobjects.HomePage;
import com.mystoreapp.pageobjects.IndexPage;
import com.mystoreapp.pageobjects.LoginPage;

public class HomePageTestCase extends BaseClass{

	IndexPage indexpage;
	LoginPage loginpage;
	HomePage homepage;
	
	@BeforeMethod
	public void setUp()
	{
		launchApp() ;
		System.err.println("launch app  test case called");
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
		System.err.println("Browser Quited");
	}
	
	@Test
	 public void WishListTestCase() throws Throwable
	 {
		indexpage = new IndexPage();
		 indexpage.signInClick();
		 
		 loginpage= new LoginPage();
		 loginpage = new LoginPage();
		 
		 homepage = new HomePage();
		 homepage = loginpage.login(); 
		    
		 homepage = new HomePage();
		 boolean res =  homepage.addMyFirstOrder();
		 System.err.println();
		 Assert.assertTrue(res);
	 }
	
	
	@Test
	 public void OrderHistoryDetailsTestCase() throws Throwable
	 {
		indexpage = new IndexPage();
		 indexpage.signInClick();
		 
		 loginpage= new LoginPage();
		 loginpage = new LoginPage();
		 
		 homepage = new HomePage();
		 homepage = loginpage.login(); 
		    
		 homepage = new HomePage();
		 boolean res =  homepage.validateOrderHistory();
		 System.err.println();
		 Assert.assertTrue(res);
	 }
}
