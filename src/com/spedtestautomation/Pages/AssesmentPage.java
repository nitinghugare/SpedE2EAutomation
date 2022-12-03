package com.spedtestautomation.Pages;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.JsonReader;
import Utils.SpedUtility;

public class AssesmentPage extends PageFactory {
	WebDriver driver;
	SpedUtility spedUtility;
	JsonReader jsonReader;
	Map jsonData;

	public AssesmentPage(WebDriver driver) {
		super();
		this.driver = driver;
		spedUtility = new SpedUtility(driver);
		PageFactory.initElements(driver, this);
		PageFactory.initElements(driver, spedUtility);
	}

	@FindBy(xpath = "title")
	WebElement title;

	@FindBy(xpath = "(//*[contains(text(),'Progress')]/parent::div)[1]")
	WebElement progressBar;

	@FindBy(xpath = "(//*[contains(@class,'accordion-details')])[1]")
	WebElement questionnaireBlock;

	@FindBy(xpath = "(//*[contains(@class,'accordion-details')])[2]")
	WebElement playWorksheetsBlock;

	@FindBy(xpath = "(//*[contains(@class,'accordion-details')])[3]")
	WebElement meetYourCoach;

	@FindBy(xpath = "//input[@placeholder='Religion']")
	WebElement yourChildsReportBlock;

	@FindBy(xpath = "//*[@class='accordion-collapse collapse']/parent::div")
	WebElement questionnaireDrpDwn;
	
	@FindBy(xpath = "//span[text()='School Information']")
	WebElement schoolInfoIndicator;
	
	@FindBy(xpath = "//span[text()='Reason for Referral']")
	WebElement reasonForReferralIndicator;
	
	@FindBy(xpath = "//span[text()='Parent Information']")
	WebElement parentInformationIndicator;
	
	@FindBy(xpath = "//span[text()='Behavioural Assessment']")
	WebElement BehaviouralAssessmentIndicator;
	
	@FindBy(xpath = "//span[text()='OT Screening")
	WebElement otScreeningIndicator;
	
	@FindBy(xpath = "//div[contains(@class,'instructions')]")
	WebElement instructionsBlock;
	
	@FindBy(xpath = "//*[text()='Start Assessment']")
	WebElement startAssesmentBtn;
	
	@FindBy(xpath = "//*[text()='Back']")
	WebElement backBtn;
	
	
	public void verifyElementsOnAssesmentPage() {
		Map<WebElement, String> elements = new HashMap<WebElement, String>();
		elements.put(progressBar, "Progress bar");
		elements.put(questionnaireBlock, "Questionnaire Block");
		elements.put(playWorksheetsBlock, "Play Worksheets Block");
		elements.put(meetYourCoach, "Meet Your Coach");
		elements.put(yourChildsReportBlock, "Your Childs Report Block");

		for (Map.Entry<WebElement, String> eachEntry : elements.entrySet()) {
			if(spedUtility.isElementDisplayedNotify(eachEntry.getKey())){
				System.out.println(eachEntry.getValue() + " : on Assesment Page is displayed");
			} else{
				System.out.println("Failed - "+ eachEntry.getValue() + " : on Assesment Page is not displayed");
			}
		}

	}
	
	public void clickOnQuestionnaire(){
		spedUtility.click(questionnaireDrpDwn);
	}
	
	public void clickOnBackBtn(){
		spedUtility.click(backBtn);
	}
	
	public void clickOnStartYourAssesment(){
		if(spedUtility.isElementDisplayedNotify(questionnaireDrpDwn)){
			this.clickOnQuestionnaire();
		}
		spedUtility.click(startAssesmentBtn);
		
	}
	
	public void verifyElementsOfAssesmentPage() {
		Map<WebElement, String> elements = new HashMap<WebElement, String>();
		elements.put(schoolInfoIndicator, "School Information Indicator");
		elements.put(reasonForReferralIndicator, "Reason For Referral Indicator");
		elements.put(parentInformationIndicator, "Parent Information Indicator");
		elements.put(BehaviouralAssessmentIndicator, "Behavioural Assessment Indicatorh");
		elements.put(otScreeningIndicator, "OT Screening Indicator");
		elements.put(instructionsBlock, "Instructions Block");
		elements.put(startAssesmentBtn, "Start Assesment Btn");
		elements.put(backBtn, "Back Btn");

		for (Map.Entry<WebElement, String> eachEntry : elements.entrySet()) {
			if(spedUtility.isElementDisplayedNotify(eachEntry.getKey())){
				System.out.println(eachEntry.getValue() + " : on Start your assesment pop up displayed");
			} else{
				System.out.println("Failed - "+ eachEntry.getValue() + " : on Start your assesment pop up is not displayed");
			}
		}

	}

}
