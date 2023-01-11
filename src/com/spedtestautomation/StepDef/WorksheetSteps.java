package com.spedtestautomation.StepDef;


import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;

import com.spedtestautomation.DriverManager.WebDriverManager;
import com.spedtestautomation.Pages.WorksheetPage;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class WorksheetSteps extends WebDriverManager {
	WebDriver driver;

	
	@When("^Clicked on start worksheet button$")
	public void verifyElementsOnParentDashboard() {
		WorksheetPage worksheetPage = new WorksheetPage(getDriver());
		worksheetPage.clickOnStartWorksheetBtn();
	}
	
	
	@Then("^verify language and component worksheet dashboard is displayed$")
	public void verifyDashboard() {  
		WorksheetPage worksheetPage = new WorksheetPage(getDriver());
		worksheetPage.verifyWorksheetDasboard();
	}
	
	@Then("^Click on continue button$")
	public void clickOnContinueBtn() {  
		WorksheetPage worksheetPage = new WorksheetPage(getDriver());
		worksheetPage.clickOnContinueBtn();
	}
	
	@Then("^Complete Language Component worksheet$")
	public void completeLanguageComponentWorksheet() throws FileNotFoundException, IOException, ParseException {  
		WorksheetPage worksheetPage = new WorksheetPage(getDriver());
		worksheetPage.completeLanguageComponentWorkSheet();
	}
	
	@Then("^Complete Numeracy Component worksheet$")
	public void completeNumeracyComponentWorksheet() {  
		WorksheetPage worksheetPage = new WorksheetPage(getDriver());
		worksheetPage.clickOnContinueBtn();
	}
}
	