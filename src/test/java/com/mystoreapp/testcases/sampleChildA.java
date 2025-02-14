package com.mystoreapp.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class sampleChildA 
{   
	sampleChildA()
	{
		System.out.println("hello world Child A");
	}

	sampleParentA pA = new sampleParentA();
	
	@BeforeMethod
	public void LaunchApp()
	{
		System.out.println("TestA called");
	//	sampleParentA pA = new sampleParentA();
	}
	
	@Test
	public void LoginTest()
	{
		System.out.println("login test called");
	}
	
	@Test
	public void LogoClick()
	{
		System.out.println("logo click  test called");
	}
	
	
}
