package com.mystoreapp.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystoreapp.actiondriver.Action;
import com.mystoreapp.base.BaseClass;

public class IndexPage extends BaseClass
{
	// login link click
	@FindBy(xpath = "//a[@class='login']") 
	WebElement signInLink;
	
	// logo image
	@FindBy(xpath = "//img[@class='logo img-responsive']")
	WebElement logoImg;
	
	// search box
	@FindBy(id="search_query_top")
	WebElement searchTextBox;

	// search button
	@FindBy(name="submit_search")
	WebElement searchBtn;
	
	public IndexPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public LoginPage signInClick()
	{
		try 
		{
		Action.click(driver, signInLink);
		}
		catch(Exception e )
		{
			System.err.println(e);
		}
		
		return new LoginPage();
	
	}
	
	public boolean logoClick()
	{
		return Action.isDisplayed(driver, logoImg);
	}
	
	public String getMyAppStoreTitle()
	{
		String myStoreTitle = driver.getTitle();
		return myStoreTitle;
	}
	
	public SearchResultPage searchProduct(String productname)
	{
		Action.type(searchTextBox, productname);
		Action.click(driver, searchBtn);
		return new SearchResultPage();
	}

	
}
