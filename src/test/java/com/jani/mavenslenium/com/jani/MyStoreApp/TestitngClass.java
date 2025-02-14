package com.jani.mavenslenium.com.jani.MyStoreApp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestitngClass {
	
	
	public static void main(String[] args) {
		
		
		  ChromeDriver driver = new ChromeDriver();
		  String u="http://orangehrm.qedgetech.com";

		
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			// driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		

		
			driver.get("http://www.automationpractice.pl/index.php");
			//driver.findElement(By.className("login")).click();
			 WebElement ele =driver.findElement(By.xpath("//a[@class='login']"));
			 ele.click();
			 System.err.println(ele.getText());
		
	}

}
