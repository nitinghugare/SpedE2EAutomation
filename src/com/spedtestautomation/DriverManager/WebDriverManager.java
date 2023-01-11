package com.spedtestautomation.DriverManager;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import Utils.DriverUtils;
import Utils.SpedUtility;
import cucumber.api.testng.AbstractTestNGCucumberTests;

public abstract class WebDriverManager {

	public static WebDriver driver;

	@BeforeSuite
	public void webdriverSetUp() {
		System.out.println("+++++> Insider Before Suite");
		driver = DriverUtils.getDriver("chrome");
		System.out.println("+++++> Drievr is : " + driver);
		SpedUtility spedUtility = new SpedUtility(driver);
	}
	
	/*@AfterTest
	public void cleanWebDriver() {
		driver.close();
	}*/
	@BeforeMethod
	public static WebDriver getDriver() {
		return driver;
	}
}
