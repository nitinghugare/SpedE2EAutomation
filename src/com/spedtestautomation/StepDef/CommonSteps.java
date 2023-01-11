package com.spedtestautomation.StepDef;

import org.openqa.selenium.WebDriver;

import com.spedtestautomation.DriverManager.WebDriverManager;
import com.spedtestautomation.Pages.ParentDashboardPage;

import Utils.SpedUtility;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CommonSteps extends WebDriverManager {

	WebDriver driver;

	
	@Given("^Open browser and enter URL$")
	public void openBrowserAndEnterUrl() throws Throwable {
		SpedUtility spedUtility = new SpedUtility(getDriver());
		spedUtility.getURL("http://qa.spedathome.com/");
		
	}
	
	@Given("^Open browser and enter Parent Registration Dashboard URL$")
	public void openBrowserAndEnterParentDashboardUrl() throws Throwable {
		SpedUtility spedUtility = new SpedUtility(getDriver());
		spedUtility.getURL("https://spedathome.com/#");
		
	}
	
	
	@Then("^Close start your assesment popup$")
	public void clickOnStartYourAssesment() {
		ParentDashboardPage parentDashboardPage = new ParentDashboardPage(getDriver());
		parentDashboardPage.clickOnCloseAssesmentPopup();
	}

	/*@Given("^Open browser and enter URL$")
	public void open_browser_and_enter_URL() throws Throwable {
		
	}*/
	
}
