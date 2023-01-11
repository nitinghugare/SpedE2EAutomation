package com.spedtestautomation.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.DriverUtils;
import Utils.SpedUtility;

public class SpedDashobardPage extends PageFactory {
	WebDriver driver;
	SpedUtility spedUtility;

	public SpedDashobardPage(WebDriver driver) {
		super();
		this.driver = driver;
		spedUtility = new SpedUtility(driver);
		PageFactory.initElements(driver, this);
		PageFactory.initElements(driver, spedUtility);
	}

	@FindBy(xpath = "title")
	WebElement title;
	
	@FindBy(xpath = "//*[@id='welcome-modal-title' and contains(text(),'Hello,')]")
	WebElement newParentDashboard;
	
	@FindBy(xpath = "//*[contains(@class,'nav nav-pills')][1]")
	WebElement OTCoachDashboard;

	
	public void verifyNewParentDashboardIsDisplayed(){
		spedUtility.isElementDisplayed(newParentDashboard);
	}
	
	public void verifyRemedialCoachDasboard(){
		//spedUtility.isElementDisplayed(OTCoachDashboard);
	}
	
	public void verifyOTCoachDasboard(){
		spedUtility.isElementDisplayed(OTCoachDashboard);
	}
	
	public void clickOnTitle(){
		spedUtility.click(title);
	}

}
