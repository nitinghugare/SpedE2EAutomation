package com.spedtestautomation.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.SpedUtility;

public class LandingPage {
	
	WebDriver driver;
	SpedUtility spedUtility;

	public LandingPage(WebDriver driver) {
		super();
		this.driver = driver;
		spedUtility = new SpedUtility(driver);
		PageFactory.initElements(driver, this);
		PageFactory.initElements(driver, spedUtility);
	}

	@FindBy(xpath = "title")
	WebElement title;
	
	public void clickOnTitle(){
		spedUtility.click(title);
	}


}
