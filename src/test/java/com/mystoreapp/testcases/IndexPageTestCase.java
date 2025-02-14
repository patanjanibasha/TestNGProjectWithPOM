package com.mystoreapp.testcases;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mystoreapp.base.BaseClass;
import com.mystoreapp.pageobjects.IndexPage;
import com.mystoreapp.pageobjects.LoginPage;

public class IndexPageTestCase extends BaseClass
{
	
	IndexPage indexpage;
	
	
	@BeforeMethod
	public void setUp()
	{
		launchApp() ;
		System.err.println("launch app  test case called");
	}
	
	@Test
	public void verifyLogo()
	{
		indexpage = new IndexPage();
		boolean res = indexpage.logoClick();
		Assert.assertTrue(res);
		System.err.println("Verift logo test case called");
	}
	
	@Test
	public void verifyTitle()
	{
		indexpage = new IndexPage();
		String appStoreTitle = indexpage.getMyAppStoreTitle();
		System.out.println(appStoreTitle + "---   appStoreTitle");
		Assert.assertEquals(appStoreTitle,"My Shop");
		System.err.println("Verift title test case called");
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
		System.err.println("Browser Quited");
	}
}
