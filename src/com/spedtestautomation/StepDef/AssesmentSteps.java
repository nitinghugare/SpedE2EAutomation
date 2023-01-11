package com.spedtestautomation.StepDef;


import org.openqa.selenium.WebDriver;

import com.spedtestautomation.DriverManager.WebDriverManager;
import com.spedtestautomation.Pages.AssesmentPage;
import com.spedtestautomation.Pages.ParentDashboardPage;

import cucumber.api.java.en.Then;

public class AssesmentSteps extends WebDriverManager {
	WebDriver driver;

	
	@Then("^Verify all elements on start your assesment popup on parent dashboard page is dispalyed$")
	public void verifyElementsOnParentDashboard() {
		AssesmentPage assesmentPage = new AssesmentPage(getDriver());
		assesmentPage.clickOnQuestionnaire();
		assesmentPage.clickOnStartYourAssesment();
	}
	
	@Then("^Start your assesment button$")
	public void clickOnStartYourAssesment() {
		AssesmentPage assesmentPage = new AssesmentPage(getDriver());
		assesmentPage.clickOnStartYourAssesment();
	}
	
	@Then("^Verify Elements on Start your assesment popup on assesment page is displayed$")
	public void verifyElementsOfAssesmentPage() {
		AssesmentPage assesmentPage = new AssesmentPage(getDriver());
		assesmentPage.clickOnStartYourAssesment();
		assesmentPage.verifyElementsOfAssesmentPage();
	}
	
	@Then("^Click on back button$")
	public void verifybackbuttonfunctionality() {
		AssesmentPage assesmentPage = new AssesmentPage(getDriver());
		ParentDashboardPage parentDashboardPage = new ParentDashboardPage(getDriver());
		assesmentPage.clickOnBackBtn();
		parentDashboardPage.NavigateTo("Dashboard");
	}
	
	
}
