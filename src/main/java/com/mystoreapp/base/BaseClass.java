package com.mystoreapp.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.mystoreapp.actiondriver.Action;

public class BaseClass 
{
	public static Properties prop;
	public static WebDriver driver;
	
		@BeforeTest
		public void loadConfig() 
		{
			//driver.findElement(By.id("id")).click();
			try 
			{
				prop = new Properties();
				FileInputStream ip = new FileInputStream(System.getProperty("user.dir") + "\\Configaration\\config.properties");
				
				prop.load(ip);
			} 
			catch (FileNotFoundException e)
			{
				e.printStackTrace();
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
			System.err.println("config  called");
		}
		/**
		 * 
		 */
		
		public void launchApp() 
		{
			// chrome driver setup code here 
			
			String browserName = prop.getProperty("browser");		
			
			if (browserName.equalsIgnoreCase("Chrome")) 
			{
				driver = new ChromeDriver();
			} 
			else if (browserName.equalsIgnoreCase("FireFox")) 
			{
				driver = new FirefoxDriver();
			} 
			else if (browserName.equalsIgnoreCase("IE")) 
			{
			}
			
			Action.implicitWait(driver,10);
			Action.pageLoadTimeOut(driver, 20);
			driver.get(prop.getProperty("url"));
			
		}
}
