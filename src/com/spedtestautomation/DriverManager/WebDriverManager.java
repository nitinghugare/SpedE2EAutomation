package com.spedtestautomation.DriverManager;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import Utils.DriverUtils;
import Utils.SpedUtility;
import cucumber.api.testng.AbstractTestNGCucumberTests;

public class WebDriverManager extends AbstractTestNGCucumberTests{

	public static WebDriver driver;


	@BeforeTest
	public void webdriverSetUp() {
		System.out.println("+++++> Insider Before Suite");
		driver = DriverUtils.getDriver("chrome");
		System.out.println("+++++> Drievr is : " + driver);
		SpedUtility spedUtility = new SpedUtility(driver);
	}
	
	@AfterTest
	public void cleanWebDriver() {
		driver.close();
	}
	
	public static WebDriver getDriver() {
		return driver;
	}
	
}
