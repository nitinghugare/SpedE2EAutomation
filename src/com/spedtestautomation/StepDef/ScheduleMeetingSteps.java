package com.spedtestautomation.StepDef;


import org.openqa.selenium.WebDriver;

import com.spedtestautomation.DriverManager.WebDriverManager;
import com.spedtestautomation.Pages.ScheduleMeetingPage;

import cucumber.api.java.en.Then;

public class ScheduleMeetingSteps extends WebDriverManager {
	WebDriver driver;

	@Then("^Verify Schedule Meeting options is displayed for \"([^\"]*)\"$")
	public void verifyDashboard(String type) {  
		ScheduleMeetingPage scheduleMeetingPage = new ScheduleMeetingPage(getDriver());
		scheduleMeetingPage.verifyScheduleMeetingOptionDisplayed(type);
	}
	
	@Then("^Schedule Meeting for \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void verifyDashboard(String type, String date, String time) {  
		ScheduleMeetingPage scheduleMeetingPage = new ScheduleMeetingPage(getDriver());
		scheduleMeetingPage.clickOnScheduleMeetinBtn(type);
		scheduleMeetingPage.selectDateAndTime(type, date, time);
	}
	
	@Then("^Verify Meeting is Scheduled for \"([^\"]*)\"$")
	public void verufyMeetingIsScheduled(String assesmentType) {  
		ScheduleMeetingPage scheduleMeetingPage = new ScheduleMeetingPage(getDriver());
		scheduleMeetingPage.verifyScheduledMeeting(assesmentType);
	}
	
	
	
}
	