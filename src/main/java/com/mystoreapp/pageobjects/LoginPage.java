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
public class LoginPage extends BaseClass
{
	@FindBy(id="email")
	private WebElement userName;
	
	@FindBy(id="passwd")
	private WebElement password;

	@FindBy(id="SubmitLogin")
	private WebElement signInBtn;
	
	@FindBy(name="email_create")
	private WebElement emailForNewAccount;
	
	@FindBy(name="SubmitCreate")
	private WebElement createNewAccountBtn;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	

	public HomePage login()
	{
		Action.type(userName, prop.getProperty("username") );
		Action.type(password, prop.getProperty("password"));
		Action.click(driver, signInBtn);

		return new HomePage();
	}
	
	public AccountCreationPage AccountCreate(String newEmail)
	{
		Action.type(emailForNewAccount,newEmail);
		Action.click(driver, createNewAccountBtn);
		
		return new AccountCreationPage();
	}
}
