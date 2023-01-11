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

public class ParentInterviewSteps extends WebDriverManager {

	WebDriver driver;
	
	@Then("^Add birth history in parent interviews$")
	public void clickOnTab() throws Throwable {
		CoachPage coachPage = new CoachPage(getDriver());
		coachPage.addBirthHistoryInCoachAssesment();
		coachPage.clickOnSaveAndNext();
		coachPage.closeSavedPopup();
	}
	
	@Then("^Add Interesting Activities in parent interviews$")
	public void addInterestingActivitiesInParentInterviews() throws Throwable {
		CoachPage coachPage = new CoachPage(getDriver());
		coachPage.addInterestingActivitiesInCoachAssesment();
		coachPage.clickOnSaveAndNext();
		coachPage.closeSavedPopup();
	}
	
	@Then("^Add Parent emotion details in parent interviews$")
	public void addParentEmotionDetailsInParentInterviews() throws Throwable {
		CoachPage coachPage = new CoachPage(getDriver());
		coachPage.addParentEmotionsInCoachAssesment();
		coachPage.clickOnSaveAndNext();
		coachPage.closeSavedPopup();
	}
	
	@Then("^Add Discrepancy Analysis details of \"([^\"]*)\" in Child interview$")
	public void addChildInterviewDetailsInChildInterview(String typeOfAnalysis) throws Throwable {
		CoachPage coachPage = new CoachPage(getDriver());
		coachPage.addDiscrepancyAnalysisInChildInterview(typeOfAnalysis);
		coachPage.clickOnSaveAndNext();
		//coachPage.closeSavedPopup();
	}
	
	@Then("^Add Child Behaviour details in Child interview$")
	public void addChildBehaviourDetailsInChildInterview() throws Throwable {
		CoachPage coachPage = new CoachPage(getDriver());
		coachPage.addParentEmotionsInCoachAssesment();
		coachPage.clickOnSaveAndNext();
		coachPage.closeSavedPopup();
	}
	
	@Then("^Add Comments in Child Inteview and click on Save button$")
	public void addCommentsClickOnSaveButton() throws Throwable {
		CoachPage coachPage = new CoachPage(getDriver());
		coachPage.addComments("Test Automation");
		coachPage.clickOnSaveBtn();
		coachPage.closeSavedPopup();
	}
	
	@Then("^Select Grade and Cluster for assesment type \"([^\"]*)\" in IEP Table$")
	public void selectGradeAndCluster(String assesmentType) throws Throwable {
		CoachPage coachPage = new CoachPage(getDriver());
		coachPage.selectOptions(assesmentType,"IEPTable");
		coachPage.clickOnSaveAndNext();
		coachPage.closeSavedPopup();
	}
	
	@Then("^Select Grade and Cluster for assesment type \"([^\"]*)\" in Independent Table$")
	public void selectGradeAndClusterInIndependentTable(String assesmentType) throws Throwable {
		CoachPage coachPage = new CoachPage(getDriver());
		coachPage.selectOptions(assesmentType,"IndependentTable");
		coachPage.clickOnSaveAndNext();
		coachPage.closeSavedPopup();
	}
	
	/**
	 * Pending - Developemnt Is not completed
	 */
	@Then("^Add plan details in ITP Table$")
	public void addPlanDetailsInITPTable(String assesmentType) throws Throwable {
		CoachPage coachPage = new CoachPage(getDriver());
		coachPage.selectOptions(assesmentType,"IndependentTable");
		coachPage.clickOnSaveAndNext();
		coachPage.closeSavedPopup();
	}
	
	/**
	 * Pending - Developemnt Is not completed
	 */
	@Then("^Add plan details in IEP Table$")
	public void addPlanDetailsInIEPTable(String assesmentType) throws Throwable {
		CoachPage coachPage = new CoachPage(getDriver());
		coachPage.selectOptions(assesmentType,"IndependentTable");
		coachPage.clickOnSaveAndNext();
		coachPage.closeSavedPopup();
	}
	
	@Then("^Verify list of reports is displayed$")
	public void verifyListOfReportsIsDisplayed() throws Throwable {
		CoachPage coachPage = new CoachPage(getDriver());
		//coachPage.selectOptions(assesmentType,"IndependentTable");
		coachPage.clickOnSaveAndNext();
		coachPage.closeSavedPopup();
	}
	

}
