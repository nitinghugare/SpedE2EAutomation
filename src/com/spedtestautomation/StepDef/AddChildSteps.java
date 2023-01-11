package com.spedtestautomation.StepDef;


import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;

import com.spedtestautomation.DriverManager.WebDriverManager;
import com.spedtestautomation.Pages.ParentDashboardPage;
import com.spedtestautomation.Pages.ParentLandingPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddChildSteps extends WebDriverManager {
	WebDriver driver;

	// Need to Check Compilation error
	@Then("^Add new Child \"([^\"]*)\" from the popup$")
	public void addChildDetails(String dataFileName) throws FileNotFoundException, IOException, ParseException {
		ParentLandingPage parentLandingPage = new ParentLandingPage(getDriver());
		parentLandingPage.addChildDetails(dataFileName);
		parentLandingPage.clickOnAddChildBtn();
	}
	
	@When("^Child is added for existing parent user through parent dashboard$")
	public void addChildFromParentDashboard(String dataFileName) throws FileNotFoundException, IOException, ParseException {
		ParentLandingPage parentLandingPage = new ParentLandingPage(getDriver());
		ParentDashboardPage parentDashboardPage = new ParentDashboardPage(getDriver());
		parentDashboardPage.clickOnParentProfileDropdown();
		parentDashboardPage.clickOnAddNewChildButton();
		
		parentLandingPage.addChildDetails(dataFileName);
		
		parentLandingPage.clickOnAddChildBtn();
	}
	
	@Given("^Verify new child is added from parent dashboard$")
	public void verifyNewChildIsAdded(String dataFileName) throws FileNotFoundException, IOException, ParseException {
		ParentDashboardPage parentDashboardPage = new ParentDashboardPage(getDriver());
		parentDashboardPage.verifyBothChildsAddedOnParentDashboard();
	}
	
	
}
