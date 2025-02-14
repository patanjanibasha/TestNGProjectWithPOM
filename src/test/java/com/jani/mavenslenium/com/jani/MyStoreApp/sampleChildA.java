package com.jani.mavenslenium.com.jani.MyStoreApp;

import org.testng.annotations.BeforeMethod;

public class sampleChildA extends sampleParentA
{

	sampleParentA pA = new sampleParentA();
	
	@BeforeMethod
	public void TestA()
	{
		System.out.println("TestA called");
		sampleParentA pA = new sampleParentA();
	}
}
