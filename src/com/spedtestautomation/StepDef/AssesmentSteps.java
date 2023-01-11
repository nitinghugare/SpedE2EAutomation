package com.spedtestautomation.StepDef;


import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.parser.ParseException;
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
	
	@Then("^Click on Start your assesment button$")
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
	
	@Then("^Click on Start your assesment button popup$")
	public void clickOnStartAssOnPopup() {
		AssesmentPage assesmentPage = new AssesmentPage(getDriver());
		assesmentPage.clickOnStartYourAssesment();
	}
	
	@Then("^Add School information \"([^\"]*)\" in Assesment$")
	public void addSchoolInformation(String dataFileName) throws FileNotFoundException, IOException, ParseException {
		AssesmentPage assesmentPage = new AssesmentPage(getDriver());
		assesmentPage.addSchoolInformation(dataFileName);
	}
	
	@Then("^Verify editable option for school Information is displayed and click on Submit$")
	public void ediableSchoolInfoDisplayed() {
		AssesmentPage assesmentPage = new AssesmentPage(getDriver());
		assesmentPage.verifyEditOptionForReview("School Information");
		assesmentPage.clickSubmitBtn();
	}
	
	@Then("^Click on Next Section button$")
	public void clickNextSectionBtn() {
		AssesmentPage assesmentPage = new AssesmentPage(getDriver());
		assesmentPage.clickNextSectionBtn();
	}

	@Then("^Add Reason for referral \"([^\"]*)\" in Assesment$")
	public void addReasonForReferralInAssesment(String dataFileName) throws Throwable {
		AssesmentPage assesmentPage = new AssesmentPage(getDriver());
		assesmentPage.addReasonForReferral(dataFileName);
	}

	@Then("^Verify editable option for Reason for referral information is displayed and click on Submit$")
	public void verifyEditableReasonForReferralInformationIsDisplayedAndClickOnSubmit() throws Throwable {
		AssesmentPage assesmentPage = new AssesmentPage(getDriver());
		assesmentPage.verifyEditOptionForReview("Reason for Referral");
		assesmentPage.clickSubmitBtn();
	}

	@Then("^Add Parent Information \"([^\"]*)\" in Assesment$")
	public void addParentInformationInAssesment(String dataFileName) throws Throwable {
		AssesmentPage assesmentPage = new AssesmentPage(getDriver());
		assesmentPage.addParentInformation(dataFileName);
	}

	@Then("^Verify editable options for Parent information is displayed and click on Submit$")
	public void verifyEditableOptionsForParentInformationIsDisplayedAndClickOnSubmit() throws Throwable {
		AssesmentPage assesmentPage = new AssesmentPage(getDriver());
		assesmentPage.verifyEditOptionForReview("Parent Information");
		assesmentPage.clickSubmitBtn();
	}
	
	@Then("^Verify Assigned assigments are displayed on Sections page for \"([^\"]*)\"$")
	public void verifyAssignedAssesmentsDisplayed(String assesmentType) throws Throwable {
		AssesmentPage assesmentPage = new AssesmentPage(getDriver());
		assesmentPage.verifyTestAssignedOnSectionPage(assesmentType);
	}
	
	@Then("^Verify editable options for Behavioural Assessment is displayed and click on Submit$")
	public void verifyEditableOptionsForBehaviouralAssessmentIsDisplayedAndClickOnSubmit() throws Throwable {
		AssesmentPage assesmentPage = new AssesmentPage(getDriver());
		assesmentPage.verifyEditOptionForReview("Behavioural Assessment");
		assesmentPage.clickSubmitBtn();
	}

	@Then("^Complete Behavioural Assessment Test \"([^\"]*)\"$")
	public void completeBehaviouralAssessmentTest(String testNumber) throws Throwable {
		AssesmentPage assesmentPage = new AssesmentPage(getDriver());
		assesmentPage.completeBehaviouralAssesment(testNumber);
	}
	
	@Then("^Complete OT Screening for Area \"([^\"]*)\" and Subarea \"([^\"]*)\"$")
	public void completeBehaviouralAssessmentTest(String areaNumber, String subAreanumber) throws Throwable {
		AssesmentPage assesmentPage = new AssesmentPage(getDriver());
		assesmentPage.completeOTScreening(areaNumber, subAreanumber);
	}
	
	@Then("^Verify editable options for OT Screening is displayed and click on Submit$")
	public void verifyEditableOptionsForOTScreeningIsDisplayedAndClickOnSubmit() throws Throwable {
		AssesmentPage assesmentPage = new AssesmentPage(getDriver());
		assesmentPage.verifyEditOptionForReview("OT Screening");
		assesmentPage.clickSubmitBtn();
	}

	@Then("^Complete OT Screening for Area \"([^\"]*)\"$")
	public void completeOTScreeningForArea(String areaNumber) throws Throwable {
		AssesmentPage assesmentPage = new AssesmentPage(getDriver());
		assesmentPage.completeOTScreening(areaNumber, "");
	}

	@Then("^Click on Proceed To Next Step button on sections page$")
	public void clickOnProceedToNextStepButtonOnSectionsPage() {
		AssesmentPage assesmentPage = new AssesmentPage(getDriver());
		assesmentPage.clickOnproceedToNextStepBtn();
	}
	
	
}
	