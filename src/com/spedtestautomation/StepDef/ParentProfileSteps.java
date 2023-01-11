package com.spedtestautomation.StepDef;


import org.openqa.selenium.WebDriver;

import com.spedtestautomation.DriverManager.WebDriverManager;
import com.spedtestautomation.Pages.ParentDashboardPage;
import com.spedtestautomation.Pages.ParentProfilePage;

import cucumber.api.java.en.When;

public class ParentProfileSteps extends WebDriverManager {
	WebDriver driver;

	@When("^Click on Add Child button$")
	public void navigateTo(String profilName) {
		ParentProfilePage parentProfilePage = new ParentProfilePage(getDriver());
		parentProfilePage.clickOnAddChildOnParentProfile();
	}
	
}
