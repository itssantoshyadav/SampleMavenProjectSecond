package com.org.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseClass {

	WebDriver driver;

	@BeforeSuite
	public void beforemethod() {
		driver= new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//textarea[@aria-label='Search']")).sendKeys("Hello");
		
	}

	@AfterSuite
	public void afterMethod() {
		driver.quit();
	}

}
