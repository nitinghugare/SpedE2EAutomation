package com.spedtestautomation.StepDef;

import org.openqa.selenium.WebDriver;

import com.spedtestautomation.DriverManager.WebDriverManager;
import com.spedtestautomation.Pages.CoachPage;
import com.spedtestautomation.Pages.ParentDashboardPage;
import com.spedtestautomation.Pages.ParentRegistrationPage;

import Utils.SpedUtility;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CoachSteps extends WebDriverManager {

	WebDriver driver;
	
	@Then("^Click on coach options \"([^\"]*)\"$")
	public void clickOnTab(String option) throws Throwable {
		CoachPage coachPage = new CoachPage(getDriver());
		coachPage.clickOnCoachOption(option);
	}
	
	@Then("^Verify Child list is displayed$")
	public void verifyChildListDisplayed() throws Throwable {
		CoachPage coachPage = new CoachPage(getDriver());
		coachPage.childListDisplayed();
	}
	
	@Then("^Click on child name \"([^\"]*)\"$")
	public void clickOnChildName(String childName) throws Throwable {
		CoachPage coachPage = new CoachPage(getDriver());
		coachPage.clickOnChildName(childName);
	}
	
}
