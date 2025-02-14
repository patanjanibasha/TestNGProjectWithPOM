/**
 * 
 */
package com.mystoreapp.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.mystoreapp.actiondriver.Action;
import com.mystoreapp.base.BaseClass;

/**
 * 
 */
public class AddToCartPage extends BaseClass
{
	Action action = new Action();

	@FindBy(id="product_enteredQuantity_29")
	WebElement itemQuantity;
	
	@FindBy(id="product_attribute_12")
	WebElement itemText;
	
	@FindBy(id="add-to-cart-button-29")
	WebElement addToCartBtn;
	
	@FindBy(xpath="//span[text() ='Shopping cart']")
	WebElement mouseHoverOnShoppingCartBtn;
	
	@FindBy(xpath="//Button[text() ='Go to cart']")
	WebElement clickOnGotoCartBtn;
	
	public void enterQuantity(String quantity1) throws Throwable {
		action.type(itemQuantity, quantity1);
	}
	
	public void enterText(String txt) throws Throwable 
	
	{
		action.type(itemText, txt);
	}
	
	public void clickOnAddToCart() throws Throwable 
	{
		action.click(driver, addToCartBtn);
	}
	
	public void mouseHoverOnShoppingCart() throws Throwable 
	{
		action.click(driver, mouseHoverOnShoppingCartBtn);
	}
	
	public void gotoCart() throws Throwable 
	{
		action.click(driver, clickOnGotoCartBtn);
	}
	/*
	public boolean validateAddtoCart() throws Throwable 
	{
		action.fluentWait(getDriver(), addToCartMessag, 10);
		return action.isDisplayed(getDriver(), addToCartMessag);
	}
	
	public OrderPage clickOnCheckOut() throws Throwable 
	{
		action.fluentWait(getDriver(), proceedToCheckOutBtn, 10);
		action.JSClick(getDriver(), proceedToCheckOutBtn);
		return new OrderPage();
	}
*/
}