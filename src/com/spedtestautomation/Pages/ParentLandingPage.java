package com.spedtestautomation.Pages;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Utils.JsonReader;
import Utils.SpedUtility;

public class ParentLandingPage extends PageFactory {
	WebDriver driver;
	SpedUtility spedUtility;
	JsonReader jsonReader;
	Map jsonData;

	public ParentLandingPage(WebDriver driver) {
		super();
		this.driver = driver;
		spedUtility = new SpedUtility(driver);
		PageFactory.initElements(driver, this);
		PageFactory.initElements(driver, spedUtility);
	}

	@FindBy(xpath = "//*[contains(@class,'modal welcomemodal')]//*[@class='modal-content']")
	WebElement welcomePopup;
	
	@FindBy(xpath = "title")
	WebElement title;

	@FindBy(xpath = "//span[text()='Next']")
	WebElement nextBtn;

	@FindBy(xpath = "//input[@placeholder='First name']")
	WebElement childName;

	@FindBy(xpath = "//input[@type='date']")
	WebElement childDOB;

	@FindBy(xpath = "//*[text()='Select Gender']")
	WebElement selectGenderDrpDwn;

	@FindBy(xpath = "//input[@placeholder='Religion']")
	WebElement religionEle;

	@FindBy(xpath = "//*[text()='Select Mother Tongue']")
	WebElement selectMotherToungeDrpdwn;

	@FindBy(xpath = "//*[text()='Select Spoken Language']")
	WebElement languageDrpdwn;

	@FindBy(xpath = "//*[@placeholder='Address']']")
	WebElement addressEle;

	@FindBy(xpath = "//*[text()='Select Country']")
	WebElement countryDrpdwn;

	@FindBy(xpath = "//*[@placeholder='Zip Code']")
	WebElement zipCodeEle;

	@FindBy(xpath = "//*[text()='Select State']")
	WebElement stateDrpdwn;

	@FindBy(xpath = "//*[text()='Add Child']/parent::button")
	WebElement addChildButton;

	@FindBy(xpath = "//span[text()='Dashboard']")
	WebElement parentDashboardBtn;

	@FindBy(xpath = "//span[text()='Assessment']")
	WebElement assesmentBtn;

	@FindBy(xpath = "//span[text()='Therapy Sessions']")
	WebElement therapySessionBtn;

	@FindBy(xpath = "//span[text()='Assignment']")
	WebElement assignmentBtn;

	@FindBy(xpath = "//span[text()='Practice Resources']")
	WebElement practicalResourcesBtn;

	@FindBy(xpath = "(//*[contains(@class,'welcome-block')])[1]")
	WebElement parentWelcomeBlock;

	@FindBy(xpath = "(//*[contains(@class,'right-side-col child-scoreboard')])[1]")
	WebElement childScorecardBlock;

	@FindBy(xpath = "(//*[contains(@class,'assesment-block')])[1]")
	WebElement assesmentBlock;

	public void addChildDetails(String jsonDataFileName) throws FileNotFoundException, IOException, ParseException {
		jsonData = jsonReader.readJson(jsonDataFileName, "QA");
		String childNameValue = jsonReader.getDataValue(jsonData, "ChildName");
		String DOB = jsonReader.getDataValue(jsonData, "DOB");
		String gender = jsonReader.getDataValue(jsonData, "Gender");
		String religion = jsonReader.getDataValue(jsonData, "Religion");
		String motherTounge = jsonReader.getDataValue(jsonData, "MotherTounge");
		String spokenLanguage = jsonReader.getDataValue(jsonData, "SpokenLanguage");
		String address = jsonReader.getDataValue(jsonData, "Address");
		String country = jsonReader.getDataValue(jsonData, "Country");
		String zipCode = jsonReader.getDataValue(jsonData, "ZipCode");

		if(spedUtility.isElementDisplayedNotify(welcomePopup)){
			Assert.assertTrue(true, "Welcome Popup is displayed");
			spedUtility.click(nextBtn);
		} else {
			Assert.assertFalse(false,"Failed - Welcome Popup is not displayed");
		}
		
		spedUtility.type(childName, childNameValue);
		// SelectDateFromCalender Method to be added
		/*spedUtility.click(selectGenderDrpDwn);
		spedUtility.clickByXpath(String.format("[text()='Select Gender']/following::li[text()='%s']", gender));

		spedUtility.type(religionEle, religion);

		spedUtility.click(selectMotherToungeDrpdwn);
		spedUtility.clickByXpath(
				String.format("[text()='Select Mother Tongue']/following::li[text()='%s']", motherTounge));

		spedUtility.click(languageDrpdwn);
		spedUtility.clickByXpath(
				String.format("[text()='Select Spoken Language']/following::li[text()='%s']", spokenLanguage));

		spedUtility.type(addressEle, address);

		spedUtility.click(countryDrpdwn);
		spedUtility.clickByXpath(String.format("[text()='Select Country']/following::li[text()='%s']", country));

		if (country.equals("India")) {
			String state = jsonReader.getDataValue(jsonData, "State");
			spedUtility.click(stateDrpdwn);
			spedUtility
					.clickByXpath(String.format("[text()='Select Spoken Language']/following::li[text()='%s']", state));
		}

		spedUtility.type(zipCodeEle, zipCode);*/

		spedUtility.isElementDisplayed(parentWelcomeBlock);
	}

	public void clickOnAddChildBtn() {
		spedUtility.click(addChildButton);
	}

	public void verifyElementsOnParentDashboard() {
		Map<WebElement, String> elements = new HashMap<WebElement, String>();
		elements.put(parentDashboardBtn, "Parent Dashboard Button");
		elements.put(assesmentBtn, "Assesment Button");
		elements.put(therapySessionBtn, "Therapy Session button");
		elements.put(assignmentBtn, "Assignment button");
		elements.put(practicalResourcesBtn, "Practical Resources Button");
		elements.put(parentWelcomeBlock, "Welcome Block");
		elements.put(childScorecardBlock, "Child Scorecard Block");
		elements.put(assesmentBlock, "Assesment Block");

		for (Map.Entry<WebElement, String> eachEntry : elements.entrySet()) {
			if(spedUtility.isElementDisplayedNotify(eachEntry.getKey())){
				System.out.println(eachEntry.getValue() + " : on Parent Dashboard is displayed");
			} else{
				System.out.println("Failed - "+ eachEntry.getValue() + " : on Parent Dashboard is not displayed");
			}
		}

	}

}
