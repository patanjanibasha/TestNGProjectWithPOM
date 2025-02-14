/**
 * 
 */
package com.mystoreapp.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystoreapp.actiondriver.Action;
import com.mystoreapp.base.BaseClass;

/**
 * 
 */
public class HomePage extends BaseClass
{

	
	@FindBy(xpath="//span[text()='Add my first address']")
	private WebElement myWishList;
	
	@FindBy(xpath = "//span[text()='Order history and details']")
	private WebElement orderHistory;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	
	public boolean addMyFirstOrder() throws Throwable {
		return Action.isDisplayed(driver, myWishList);
	}
	
	public boolean validateOrderHistory() throws Throwable {
		return Action.isDisplayed(driver, orderHistory);
	}
	
	public String getCurrURL() throws Throwable {
		String homePageURL=Action.getCurrentURL(driver);
		return homePageURL;
	}
}
