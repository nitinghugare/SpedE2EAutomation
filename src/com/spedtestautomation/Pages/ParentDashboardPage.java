package com.spedtestautomation.Pages;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.JsonReader;
import Utils.SpedUtility;

public class ParentDashboardPage extends PageFactory {
	WebDriver driver;
	SpedUtility spedUtility;
	JsonReader jsonReader;

	public ParentDashboardPage(WebDriver driver) {
		super();
		this.driver = driver;
		spedUtility = new SpedUtility(driver);
		PageFactory.initElements(driver, this);
		PageFactory.initElements(driver, spedUtility);
	}

	@FindBy(xpath = "//*[contains(text(),' Assessment remaining days')]")
	WebElement assesmentRemainingDays;
	
	@FindBy(xpath = "(//*[contains(@class,'assesment-notice')])[2]")
	WebElement assesmentDays;

	@FindBy(xpath = "//span[text()='Next']")
	WebElement nextBtn;
	
	@FindBy(xpath = "//*[contains(@class,'profile-info dropdown')]//div[3]")
	WebElement parentProfileDrpdwn;
	
	@FindBy(xpath = "//*[text()='Add Child']")
	WebElement addChildBtn;
	
	@FindBy(xpath = "//li[contains(@class,'child-info')]")
	List <WebElement> addedChilds;
	
	@FindBy(xpath = "//*[contains(text(),'Start Assessment')]")
	WebElement startAssesmentBtn;
	
	@FindBy(xpath = "(//*[@data-dismiss='modal'])[1]")
	WebElement closeModal;
	
	@FindBy(xpath = "//span[text()='Back']")
	WebElement backBtn;
	
	public void verifyAssesmentDaysDisplayed() {
		if(spedUtility.isElementDisplayedNotify(assesmentRemainingDays)){
			System.out.println(assesmentDays.getText());
		}else{
			System.out.println("Assesment is expired : ");
			
			//Need to add Extend assesment period
		}
	}
	
	public void clickOnParentProfileDropdown() {
		if(spedUtility.isElementDisplayedNotify(parentProfileDrpdwn)){
			spedUtility.click(parentProfileDrpdwn);
		}else{
			System.out.println("Failed : Parent Profile Dropdown is not displayed");
		}
	}

	public void clickOnAddNewChildButton() {
		if(spedUtility.isElementDisplayedNotify(addChildBtn)){
			spedUtility.click(addChildBtn);
		}else{
			System.out.println("Failed : Add Child Button is not displayed");
		}
	}
	
	public void verifyBothChildsAddedOnParentDashboard() {
		if(spedUtility.getElementsSize(addedChilds) > 1){
			System.out.println("Both the childeren added succesfully");
		} else {
			System.out.println("Failed : Added Children are not displayed");
		}
	}
	 
	public void NavigateTo(String profileName){
		spedUtility.clickByXpath(String.format("//span[text()='%s']", profileName));
	}
	
	public void clickOnStartYourAssesment(String profileName){
		spedUtility.seleniumWait(startAssesmentBtn);
		spedUtility.click(startAssesmentBtn);
	}
	
	public void clickOnCloseAssesmentPopup(){
		if(spedUtility.isElementDisplayedNotify(closeModal)){
			spedUtility.click(closeModal);
		} else {
			spedUtility.click(backBtn);
		}
	}
	

}
