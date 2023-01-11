package com.spedtestautomation.StepDef;

import org.openqa.selenium.WebDriver;

import com.spedtestautomation.DriverManager.WebDriverManager;
import com.spedtestautomation.Pages.ParentDashboardPage;
import com.spedtestautomation.Pages.ParentRegistrationPage;

import Utils.SpedUtility;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ParentRegistrationSteps extends WebDriverManager {

	WebDriver driver;
	
	@When("^Clicked on \"([^\"]*)\" on parent dashboard page$")
	public void clickOnTab(String tabName) throws Throwable {
		ParentRegistrationPage parentRegistrationPage = new ParentRegistrationPage(getDriver());
		parentRegistrationPage.NavigateToTab(tabName);
	}
	
	@Then("^Verify Assesment and Therapy options are displayed$")
	public void verifyAssesmentAndTherapyOptions() throws Throwable {
		ParentRegistrationPage parentRegistrationPage = new ParentRegistrationPage(getDriver());
		parentRegistrationPage.verifyAssesmentOptionsDisplayed();
		parentRegistrationPage.verifyTherapyOptionsDisplayed();
	}
	
	@Then("^Click on product \"([^\"]*)\"$")
	public void clickOnProduct(String productType) throws Throwable {
		ParentRegistrationPage parentRegistrationPage = new ParentRegistrationPage(getDriver());
		parentRegistrationPage.clickOnProduct(productType);
	}
	
	@Then("^Click on Add to cart$")
	public void clickOnAddToCart() throws Throwable {
		ParentRegistrationPage parentRegistrationPage = new ParentRegistrationPage(getDriver());
		parentRegistrationPage.clickOnAddToCart();
	}
	
	@Then("^verify elements on Select Plan Features popup is displayed$")
	public void clickElements() throws Throwable {
		ParentRegistrationPage parentRegistrationPage = new ParentRegistrationPage(getDriver());
		parentRegistrationPage.verifyElementsOnSelectPlanFeatures();
	}
	
	@Then("^Add products to the cart \"([^\"]*)\"$")
	public void addProducts(String productType) throws Throwable {
		ParentRegistrationPage parentRegistrationPage = new ParentRegistrationPage(getDriver());
		parentRegistrationPage.selectAssesmentAndChild(productType);
		parentRegistrationPage.verifyProductAdded();
		parentRegistrationPage.goToCart();
	}
	
	@Then("^Verify cart for added product \"([^\"]*)\"$")
	public void verifyCart(String productType) throws Throwable {
		ParentRegistrationPage parentRegistrationPage = new ParentRegistrationPage(getDriver());
		parentRegistrationPage.verifyProductAddedInCart(productType);
	}
	
}
