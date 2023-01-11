package com.spedtestautomation.StepDef;


import org.openqa.selenium.WebDriver;

import com.spedtestautomation.DriverManager.WebDriverManager;
import com.spedtestautomation.Pages.ParentDashboardPage;
import com.spedtestautomation.Pages.ParentLandingPage;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ParenDashboardSteps extends WebDriverManager {
	WebDriver driver;

	
	@Then("^Verify all elements of parent dashboard is displayed$")
	public void verifyElementsOnParentDashboard() {
		ParentLandingPage parentLandingPage = new ParentLandingPage(getDriver());
		parentLandingPage.verifyElementsOnParentDashboard();
	}
	
	@Then("^Verify Assessment remaining days are displayed on parent Dashboard$")
	public void verifyAssesmentRemainingDays() {
		ParentDashboardPage parentDashboardPage = new ParentDashboardPage(getDriver());
		parentDashboardPage.verifyAssesmentDaysDisplayed();
	}
	
	 //* Need to check compilation error
	@When("^Navigated to \"([^\"]*)\"$")
	public void navigateTo(String profilName) {
		ParentDashboardPage parentDashboardPage = new ParentDashboardPage(getDriver());
		parentDashboardPage.NavigateTo(profilName);
	}
	
}
