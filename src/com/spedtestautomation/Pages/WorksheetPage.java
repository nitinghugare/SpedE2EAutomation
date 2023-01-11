package com.spedtestautomation.Pages;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.JsonReader;
import Utils.SpedUtility;

public class WorksheetPage extends PageFactory {
	WebDriver driver;
	SpedUtility spedUtility;
	JsonReader jsonReader;
	Map jsonData;

	public WorksheetPage(WebDriver driver) {
		super();
		this.driver = driver;
		spedUtility = new SpedUtility(driver);
		PageFactory.initElements(driver, this);
		PageFactory.initElements(driver, spedUtility);
	}

	@FindBy(xpath = "//*[@class='worksheet']//div[@class='status-progress']")
	WebElement worksheetDashboard;

	@FindBy(xpath = "//*[contains(text(),'Start Worksheet')]")
	WebElement startWorkSheetBtn;
	
	@FindBy(xpath = "//*[text()='Continue']")
	WebElement continueBtn;
	
	@FindBy(xpath = "//*[contains(@class,'btn btn-purple')]")
	WebElement nextBtn;
	
	@FindBy(xpath = "//*[contains(text(),'Submit')]")
	WebElement submitBtn;
	

	public void clickOnStartWorksheetBtn() {
		spedUtility.click(startWorkSheetBtn);
	}

	public void verifyWorksheetDasboard(){
		spedUtility.isElementDisplayed(worksheetDashboard);
	}
	
	public void clickOnContinueBtn(){
		spedUtility.click(continueBtn);
	}
	
	public void completeLanguageComponentWorkSheet() throws FileNotFoundException, IOException, ParseException{
		Map jsonData;
		jsonData = jsonReader.readJson("Language_Component", "QA");
		String question1 = jsonReader.getDataValue(jsonData, "Reading & Writing 1 - Question1");
		String question2 = jsonReader.getDataValue(jsonData, "Reading & Writing 2 - Question1");
		String question3 = jsonReader.getDataValue(jsonData, "Reading & Writing 2 - Question2");
		String question4 = jsonReader.getDataValue(jsonData, "Reading & Writing 2 - Question3");
		
		String question2_1 = jsonReader.getDataValue(jsonData, "Spelling 1 - Question1");
		String question2_2 = jsonReader.getDataValue(jsonData, "Spelling 1 - Question2");
		String question2_3 = jsonReader.getDataValue(jsonData, "Spelling 1 - Question3");
		String question2_4 = jsonReader.getDataValue(jsonData, "Spelling 1 - Question4");
		String question2_5 = jsonReader.getDataValue(jsonData, "Spelling 1 - Question5");
		
		String question3_1 = jsonReader.getDataValue(jsonData, "Spelling 2 - Question1");
		String question3_2 = jsonReader.getDataValue(jsonData, "Spelling 2 - Question2");
		String question3_3 = jsonReader.getDataValue(jsonData, "Spelling 2 - Question3");
		String question3_4 = jsonReader.getDataValue(jsonData, "Spelling 2 - Question4");
		String question3_5 = jsonReader.getDataValue(jsonData, "Spelling 2 - Question5");
		
		String question4_1 = jsonReader.getDataValue(jsonData, "Grammar 1 - Question1");
		String question4_2 = jsonReader.getDataValue(jsonData, "Grammar 1 - Question2");
		String question4_3 = jsonReader.getDataValue(jsonData, "Grammar 1 - Question3");
		String question4_4 = jsonReader.getDataValue(jsonData, "Grammar 1 - Question4");
		String question4_5 = jsonReader.getDataValue(jsonData, "Grammar 1 - Question5");
		String question4_6 = jsonReader.getDataValue(jsonData, "Grammar 1 - Question6");
		String question4_7 = jsonReader.getDataValue(jsonData, "Grammar 1 - Question7");
		String question4_8 = jsonReader.getDataValue(jsonData, "Grammar 1 - Question8");
		String question4_9 = jsonReader.getDataValue(jsonData, "Grammar 1 - Question9");
		String question4_10 = jsonReader.getDataValue(jsonData, "Grammar 1 - Question10");
		
		String question5_1 = jsonReader.getDataValue(jsonData, "Grammar 2 - Question1");
		String question5_2 = jsonReader.getDataValue(jsonData, "Grammar 2 - Question2");
		String question5_3 = jsonReader.getDataValue(jsonData, "Grammar 2 - Question3");
		String question5_4 = jsonReader.getDataValue(jsonData, "Grammar 2 - Question4");
		String question5_5 = jsonReader.getDataValue(jsonData, "Grammar 2 - Question5");
		String question5_6 = jsonReader.getDataValue(jsonData, "Grammar 2 - Question6");
		String question5_7 = jsonReader.getDataValue(jsonData, "Grammar 2 - Question7");
		String question5_8 = jsonReader.getDataValue(jsonData, "Grammar 2 - Question8");
		String question5_9 = jsonReader.getDataValue(jsonData, "Grammar 2 - Question9");
		String question5_10 = jsonReader.getDataValue(jsonData, "Grammar 2 - Questionq0");
		
		String question6_1 = jsonReader.getDataValue(jsonData, "Vocabulary 1 - Question1");
		String question6_2 = jsonReader.getDataValue(jsonData, "Vocabulary 1 - Question2");
		String question6_3 = jsonReader.getDataValue(jsonData, "Vocabulary 1 - Question3");
		String question6_4 = jsonReader.getDataValue(jsonData, "Vocabulary 1 - Question4");
		String question6_5 = jsonReader.getDataValue(jsonData, "Vocabulary 1 - Question5");
		String question6_6 = jsonReader.getDataValue(jsonData, "Vocabulary 1 - Question6");
		String question6_7 = jsonReader.getDataValue(jsonData, "Vocabulary 1 - Question7");
		String question6_8 = jsonReader.getDataValue(jsonData, "Vocabulary 1 - Question8");
		String question6_9 = jsonReader.getDataValue(jsonData, "Vocabulary 1 - Question9");
		String question6_10 = jsonReader.getDataValue(jsonData, "Vocabulary 1 - Question10");
		
		String question7_1 = jsonReader.getDataValue(jsonData, "Vocabulary 2 - Question1");
		String question7_2 = jsonReader.getDataValue(jsonData, "Vocabulary 2 - Question2");
		String question7_3 = jsonReader.getDataValue(jsonData, "Vocabulary 2 - Question3");
		String question7_4 = jsonReader.getDataValue(jsonData, "Vocabulary 2 - Question4");
		String question7_5 = jsonReader.getDataValue(jsonData, "Vocabulary 2 - Question5");
		String question7_6 = jsonReader.getDataValue(jsonData, "Vocabulary 2 - Question6");
		String question7_7 = jsonReader.getDataValue(jsonData, "Vocabulary 2 - Question7");
		String question7_8 = jsonReader.getDataValue(jsonData, "Vocabulary 2 - Question8");
		String question7_9 = jsonReader.getDataValue(jsonData, "Vocabulary 2 - Question9");
		String question7_10 = jsonReader.getDataValue(jsonData, "Vocabulary 2 - Question10");
		
		String question8_1 = jsonReader.getDataValue(jsonData, "Comprehension 1 - Question1");
		String question8_2 = jsonReader.getDataValue(jsonData, "Comprehension 1 - Question2");
		String question8_3 = jsonReader.getDataValue(jsonData, "Comprehension 1 - Question3");
		String question8_4 = jsonReader.getDataValue(jsonData, "Comprehension 1 - Question4");
		String question8_5 = jsonReader.getDataValue(jsonData, "Comprehension 1 - Question5");
		String question8_6 = jsonReader.getDataValue(jsonData, "Comprehension 1 - Question6");
		String question8_7 = jsonReader.getDataValue(jsonData, "Comprehension 1 - Question7");
		String question8_8 = jsonReader.getDataValue(jsonData, "Comprehension 1 - Question8");
		String question8_9 = jsonReader.getDataValue(jsonData, "Comprehension 1 - Question9");
		String question8_10 = jsonReader.getDataValue(jsonData, "Comprehension 1 - Question10");
		
		String question9_1 = jsonReader.getDataValue(jsonData, "Comprehension 2 - Question1");
		String question9_2 = jsonReader.getDataValue(jsonData, "Comprehension 2 - Question2");
		String question9_3 = jsonReader.getDataValue(jsonData, "Comprehension 2 - Question3");
		String question9_4 = jsonReader.getDataValue(jsonData, "Comprehension 2 - Question4");
		String question9_5 = jsonReader.getDataValue(jsonData, "Comprehension 2 - Question5");
		String question9_6 = jsonReader.getDataValue(jsonData, "Comprehension 2 - Question6");
		String question9_7 = jsonReader.getDataValue(jsonData, "Comprehension 2 - Question7");
		String question9_8 = jsonReader.getDataValue(jsonData, "Comprehension 2 - Question8");
		String question9_9 = jsonReader.getDataValue(jsonData, "Comprehension 2 - Question9");
		String question9_10 = jsonReader.getDataValue(jsonData, "Comprehension 2 - Question10");
		
		/*Comprehension 3? - Need to confirm*/
		
		clickOnContinueBtn();
		
		spedUtility.clickByXpath("//*[text()='"+question1+"']");
		spedUtility.click(nextBtn);
		
		spedUtility.clickByXpath("//*[text()='"+question2+"']");
		spedUtility.click(nextBtn);
		
		spedUtility.clickByXpath("//*[text()='"+question3+"']");
		spedUtility.click(nextBtn);
		
		spedUtility.clickByXpath("//*[text()='"+question4+"']");
		spedUtility.click(submitBtn);
		
		clickOnContinueBtn();
		
		spedUtility.clickByXpath("//*[text()='"+question2_1+"']");
		spedUtility.click(nextBtn);
		
		spedUtility.clickByXpath("//*[text()='"+question2_2+"']");
		spedUtility.click(nextBtn);
		
		spedUtility.clickByXpath("//*[text()='"+question2_3+"']");
		spedUtility.click(nextBtn);
		
		spedUtility.clickByXpath("//*[text()='"+question2_4+"']");
		spedUtility.click(nextBtn);
		
		spedUtility.clickByXpath("//*[text()='"+question2_5+"']");
		spedUtility.click(submitBtn);
		
		clickOnContinueBtn();
		
		spedUtility.clickByXpath("//*[text()='"+question3_1+"']");
		spedUtility.click(nextBtn);
		
		spedUtility.clickByXpath("//*[text()='"+question3_2+"']");
		spedUtility.click(nextBtn);
		
		spedUtility.clickByXpath("//*[text()='"+question3_3+"']");
		spedUtility.click(nextBtn);
		
		spedUtility.clickByXpath("//*[text()='"+question3_4+"']");
		spedUtility.click(nextBtn);
		
		spedUtility.clickByXpath("//*[text()='"+question3_5+"']");
		spedUtility.click(submitBtn);
		
		clickOnContinueBtn();
		
		spedUtility.clickByXpath("//*[text()='"+question4_1+"']");
		spedUtility.click(nextBtn);
		
		spedUtility.clickByXpath("//*[text()='"+question4_2+"']");
		spedUtility.click(nextBtn);
		
		spedUtility.clickByXpath("//*[text()='"+question4_3+"']");
		spedUtility.click(nextBtn);
		
		spedUtility.clickByXpath("//*[text()='"+question4_4+"']");
		spedUtility.click(nextBtn);
		
		spedUtility.clickByXpath("//*[text()='"+question4_5+"']");
		spedUtility.click(nextBtn);
		
		spedUtility.clickByXpath("//*[text()='"+question4_6+"']");
		spedUtility.click(nextBtn);
		
		spedUtility.clickByXpath("//*[text()='"+question4_7+"']");
		spedUtility.click(nextBtn);
		
		spedUtility.clickByXpath("//*[text()='"+question4_8+"']");
		spedUtility.click(nextBtn);
		
		spedUtility.clickByXpath("//*[text()='"+question4_9+"']");
		spedUtility.click(nextBtn);
		
		spedUtility.clickByXpath("//*[text()='"+question4_10+"']");
		spedUtility.click(submitBtn);
		
		clickOnContinueBtn();
		
		spedUtility.clickByXpath("//*[text()='"+question5_1+"']");
		spedUtility.click(nextBtn);
		
		spedUtility.clickByXpath("//*[text()='"+question5_2+"']");
		spedUtility.click(nextBtn);
		
		spedUtility.clickByXpath("//*[text()='"+question5_3+"']");
		spedUtility.click(nextBtn);
		
		spedUtility.clickByXpath("//*[text()='"+question5_4+"']");
		spedUtility.click(nextBtn);
		
		spedUtility.clickByXpath("//*[text()='"+question5_5+"']");
		spedUtility.click(nextBtn);
		
		spedUtility.clickByXpath("//*[text()='"+question5_6+"']");
		spedUtility.click(nextBtn);
		
		spedUtility.clickByXpath("//*[text()='"+question5_7+"']");
		spedUtility.click(nextBtn);
		
		spedUtility.clickByXpath("//*[text()='"+question5_8+"']");
		spedUtility.click(nextBtn);
		
		spedUtility.clickByXpath("//*[text()='"+question5_9+"']");
		spedUtility.click(nextBtn);
		
		spedUtility.clickByXpath("//*[text()='"+question5_10+"']");
		spedUtility.click(submitBtn);
		
		clickOnContinueBtn();
		
		spedUtility.clickByXpath("//*[text()='"+question6_1+"']");
		spedUtility.click(nextBtn);
		
		spedUtility.clickByXpath("//*[text()='"+question6_2+"']");
		spedUtility.click(nextBtn);
		
		spedUtility.clickByXpath("//*[text()='"+question6_3+"']");
		spedUtility.click(nextBtn);
		
		spedUtility.clickByXpath("//*[text()='"+question6_4+"']");
		spedUtility.click(nextBtn);
		
		spedUtility.clickByXpath("//*[text()='"+question6_5+"']");
		spedUtility.click(nextBtn);
		
		spedUtility.clickByXpath("//*[text()='"+question6_6+"']");
		spedUtility.click(nextBtn);
		
		spedUtility.clickByXpath("//*[text()='"+question6_7+"']");
		spedUtility.click(nextBtn);
		
		spedUtility.clickByXpath("//*[text()='"+question6_8+"']");
		spedUtility.click(nextBtn);
		
		spedUtility.clickByXpath("//*[text()='"+question6_9+"']");
		spedUtility.click(nextBtn);
		
		spedUtility.clickByXpath("//*[text()='"+question6_10+"']");
		spedUtility.click(submitBtn);
		
		clickOnContinueBtn();
		
		spedUtility.clickByXpath("//*[text()='"+question7_1+"']");
		spedUtility.click(nextBtn);
		
		spedUtility.clickByXpath("//*[text()='"+question7_2+"']");
		spedUtility.click(nextBtn);
		
		spedUtility.clickByXpath("//*[text()='"+question7_3+"']");
		spedUtility.click(nextBtn);
		
		spedUtility.clickByXpath("//*[text()='"+question7_4+"']");
		spedUtility.click(nextBtn);
		
		spedUtility.clickByXpath("//*[text()='"+question7_5+"']");
		spedUtility.click(nextBtn);
		
		spedUtility.clickByXpath("//*[text()='"+question7_6+"']");
		spedUtility.click(nextBtn);
		
		spedUtility.clickByXpath("//*[text()='"+question7_7+"']");
		spedUtility.click(nextBtn);
		
		spedUtility.clickByXpath("//*[text()='"+question7_8+"']");
		spedUtility.click(nextBtn);
		
		spedUtility.clickByXpath("//*[text()='"+question7_9+"']");
		spedUtility.click(nextBtn);
		
		spedUtility.clickByXpath("//*[text()='"+question7_10+"']");
		spedUtility.click(submitBtn);
		
		clickOnContinueBtn();
		
		spedUtility.clickByXpath("//*[text()='"+question8_1+"']");
		spedUtility.click(nextBtn);
		
		spedUtility.clickByXpath("//*[text()='"+question8_2+"']");
		spedUtility.click(nextBtn);
		
		spedUtility.clickByXpath("//*[text()='"+question8_3+"']");
		spedUtility.click(nextBtn);
		
		spedUtility.clickByXpath("//*[text()='"+question8_4+"']");
		spedUtility.click(nextBtn);
		
		spedUtility.clickByXpath("//*[text()='"+question8_5+"']");
		spedUtility.click(nextBtn);
		
		spedUtility.clickByXpath("//*[text()='"+question8_6+"']");
		spedUtility.click(nextBtn);
		
		spedUtility.clickByXpath("//*[text()='"+question8_7+"']");
		spedUtility.click(nextBtn);
		
		spedUtility.clickByXpath("//*[text()='"+question8_8+"']");
		spedUtility.click(nextBtn);
		
		spedUtility.clickByXpath("//*[text()='"+question8_9+"']");
		spedUtility.click(nextBtn);
		
		spedUtility.clickByXpath("//*[text()='"+question8_10+"']");
		spedUtility.click(submitBtn);
		
		clickOnContinueBtn();
		
		spedUtility.clickByXpath("//*[text()='"+question7_1+"']");
		spedUtility.click(nextBtn);
		
		spedUtility.clickByXpath("//*[text()='"+question7_2+"']");
		spedUtility.click(nextBtn);
		
		spedUtility.clickByXpath("//*[text()='"+question7_3+"']");
		spedUtility.click(nextBtn);
		
		spedUtility.clickByXpath("//*[text()='"+question7_4+"']");
		spedUtility.click(nextBtn);
		
		spedUtility.clickByXpath("//*[text()='"+question7_5+"']");
		spedUtility.click(nextBtn);
		
		spedUtility.clickByXpath("//*[text()='"+question7_6+"']");
		spedUtility.click(nextBtn);
		
		spedUtility.clickByXpath("//*[text()='"+question7_7+"']");
		spedUtility.click(nextBtn);
		
		spedUtility.clickByXpath("//*[text()='"+question7_8+"']");
		spedUtility.click(nextBtn);
		
		spedUtility.clickByXpath("//*[text()='"+question7_9+"']");
		spedUtility.click(nextBtn);
		
		spedUtility.clickByXpath("//*[text()='"+question7_10+"']");
		spedUtility.click(submitBtn);
		
		clickOnContinueBtn();
		
		spedUtility.clickByXpath("//*[text()='"+question8_1+"']");
		spedUtility.click(nextBtn);
		
		spedUtility.clickByXpath("//*[text()='"+question8_2+"']");
		spedUtility.click(nextBtn);
		
		spedUtility.clickByXpath("//*[text()='"+question8_3+"']");
		spedUtility.click(nextBtn);
		
		spedUtility.clickByXpath("//*[text()='"+question8_4+"']");
		spedUtility.click(nextBtn);
		
		spedUtility.clickByXpath("//*[text()='"+question8_5+"']");
		spedUtility.click(nextBtn);
		
		spedUtility.clickByXpath("//*[text()='"+question8_6+"']");
		spedUtility.click(nextBtn);
		
		spedUtility.clickByXpath("//*[text()='"+question8_7+"']");
		spedUtility.click(nextBtn);
		
		spedUtility.clickByXpath("//*[text()='"+question8_8+"']");
		spedUtility.click(nextBtn);
		
		spedUtility.clickByXpath("//*[text()='"+question8_9+"']");
		spedUtility.click(nextBtn);
		
		spedUtility.clickByXpath("//*[text()='"+question8_10+"']");
		spedUtility.click(submitBtn);
		
		clickOnContinueBtn();
		
		spedUtility.clickByXpath("//*[text()='"+question9_1+"']");
		spedUtility.click(nextBtn);
		
		spedUtility.clickByXpath("//*[text()='"+question9_2+"']");
		spedUtility.click(nextBtn);
		
		spedUtility.clickByXpath("//*[text()='"+question9_3+"']");
		spedUtility.click(nextBtn);
		
		spedUtility.clickByXpath("//*[text()='"+question9_4+"']");
		spedUtility.click(nextBtn);
		
		spedUtility.clickByXpath("//*[text()='"+question9_5+"']");
		spedUtility.click(nextBtn);
		
		spedUtility.clickByXpath("//*[text()='"+question9_6+"']");
		spedUtility.click(nextBtn);
		
		spedUtility.clickByXpath("//*[text()='"+question9_7+"']");
		spedUtility.click(nextBtn);
		
		spedUtility.clickByXpath("//*[text()='"+question9_8+"']");
		spedUtility.click(nextBtn);
		
		spedUtility.clickByXpath("//*[text()='"+question9_9+"']");
		spedUtility.click(nextBtn);
		
		spedUtility.clickByXpath("//*[text()='"+question9_10+"']");
		spedUtility.click(submitBtn);
		
		clickOnContinueBtn();
	}
	
	public void completeNumeracyComponentWorkSheet() throws FileNotFoundException, IOException, ParseException {
		Map jsonData;
		jsonData = jsonReader.readJson("Numeracy_Component", "QA");
		String question1 = jsonReader.getDataValue(jsonData, "Number Operations and Number Sense 1 - Question1");
		String question2 = jsonReader.getDataValue(jsonData, "Number Operations and Number Sense 1 - Question2");
		String question3 = jsonReader.getDataValue(jsonData, "Number Operations and Number Sense 1 - Question3");
		String question4 = jsonReader.getDataValue(jsonData, "Number Operations and Number Sense 1 - Question4");
		String question5 = jsonReader.getDataValue(jsonData, "Number Operations and Number Sense 1 - Question5");
		String question6 = jsonReader.getDataValue(jsonData, "Number Operations and Number Sense 1 - Question6");
		String question7 = jsonReader.getDataValue(jsonData, "Number Operations and Number Sense 1 - Question7");
		String question8 = jsonReader.getDataValue(jsonData, "Number Operations and Number Sense 1 - Question8");
		String question9 = jsonReader.getDataValue(jsonData, "Number Operations and Number Sense 1 - Question9");
		String question10 = jsonReader.getDataValue(jsonData, "Number Operations and Number Sense 1 - Question10");
		
		String question2_1 = jsonReader.getDataValue(jsonData, "Number Operations and Number Sense 2 - Question1");
		String question2_2 = jsonReader.getDataValue(jsonData, "Number Operations and Number Sense 2 - Question2");
		String question2_3 = jsonReader.getDataValue(jsonData, "Number Operations and Number Sense 2 - Question3");
		String question2_4 = jsonReader.getDataValue(jsonData, "Number Operations and Number Sense 2 - Question4");
		String question2_5 = jsonReader.getDataValue(jsonData, "Number Operations and Number Sense 2 - Question5");
		String question2_6 = jsonReader.getDataValue(jsonData, "Number Operations and Number Sense 2 - Question6");
		String question2_7 = jsonReader.getDataValue(jsonData, "Number Operations and Number Sense 2 - Question7");
		String question2_8 = jsonReader.getDataValue(jsonData, "Number Operations and Number Sense 2 - Question8");
		String question2_9 = jsonReader.getDataValue(jsonData, "Number Operations and Number Sense 2 - Question9");
		String question2_10 = jsonReader.getDataValue(jsonData, "Number Operations and Number Sense 2 - Question10");
		
		/**
		 * Number Operations and Number Sense 2 - How many questions are there??
		 * */
		
		/**
		  * Has Picture to choose from in Measurement 1 - Answer : 1 or 2
		  */
		String question3_1 = jsonReader.getDataValue(jsonData, "Measurement 1 - Question1");
		 
		
		String question4_1 = jsonReader.getDataValue(jsonData, "Measurement 2 - Question1");
		String question4_2 = jsonReader.getDataValue(jsonData, "Measurement 2 - Question2");
		String question4_3 = jsonReader.getDataValue(jsonData, "Measurement 2 - Question3");
		String question4_4 = jsonReader.getDataValue(jsonData, "Measurement 2 - Question4");
		String question4_5 = jsonReader.getDataValue(jsonData, "Measurement 2 - Question5");
		String question4_6 = jsonReader.getDataValue(jsonData, "Measurement 2 - Question6");
		String question4_7 = jsonReader.getDataValue(jsonData, "Measurement 2 - Question7");
		String question4_8 = jsonReader.getDataValue(jsonData, "Measurement 2 - Question8");
		String question4_9 = jsonReader.getDataValue(jsonData, "Measurement 2 - Question9");
		String question4_10 = jsonReader.getDataValue(jsonData, "Measurement 2 - Question10");
		
		String question5_1 = jsonReader.getDataValue(jsonData, "Algebra 1 - Question1");
		String question5_2 = jsonReader.getDataValue(jsonData, "Algebra 1 - Question2");
		String question5_3 = jsonReader.getDataValue(jsonData, "Algebra 1 - Question3");
		String question5_4 = jsonReader.getDataValue(jsonData, "Algebra 1 - Question4");
		String question5_5 = jsonReader.getDataValue(jsonData, "Algebra 1 - Question5");
		
		String question6_1 = jsonReader.getDataValue(jsonData, "Algebra 2 - Question1");
		String question6_2 = jsonReader.getDataValue(jsonData, "Algebra 2 - Question2");
		String question6_3 = jsonReader.getDataValue(jsonData, "Algebra 2 - Question3");
		String question6_4 = jsonReader.getDataValue(jsonData, "Algebra 2 - Question4");
		String question6_5 = jsonReader.getDataValue(jsonData, "Algebra 2 - Question5");
		
		String question7_1 = jsonReader.getDataValue(jsonData, "Geometry 1 - Question1");
		String question7_2 = jsonReader.getDataValue(jsonData, "Geometry 1 - Question2");
		String question7_3 = jsonReader.getDataValue(jsonData, "Geometry 1 - Question3");
		String question7_4 = jsonReader.getDataValue(jsonData, "Geometry 1 - Question4");
		String question7_5 = jsonReader.getDataValue(jsonData, "Geometry 1 - Question5");
		String question7_6 = jsonReader.getDataValue(jsonData, "Geometry 1 - Question6");
		String question7_7 = jsonReader.getDataValue(jsonData, "Geometry 1 - Question7");
		String question7_8 = jsonReader.getDataValue(jsonData, "Geometry 1 - Question8");
		String question7_9 = jsonReader.getDataValue(jsonData, "Geometry 1 - Question9");
		String question7_10 = jsonReader.getDataValue(jsonData, "Geometry 1 - Question10");
		
		String question8_1 = jsonReader.getDataValue(jsonData, "Geometry 2 - Question1");
		String question8_2 = jsonReader.getDataValue(jsonData, "Geometry 2 - Question2");
		String question8_3 = jsonReader.getDataValue(jsonData, "Geometry 2 - Question3");
		String question8_4 = jsonReader.getDataValue(jsonData, "Geometry 2 - Question4");
		String question8_5 = jsonReader.getDataValue(jsonData, "Geometry 2 - Question5");
		String question8_6 = jsonReader.getDataValue(jsonData, "Geometry 2 - Question6");
		String question8_7 = jsonReader.getDataValue(jsonData, "Geometry 2 - Question7");
		String question8_8 = jsonReader.getDataValue(jsonData, "Geometry 2 - Question8");
		String question8_9 = jsonReader.getDataValue(jsonData, "Geometry 2 - Question9");
		String question8_10 = jsonReader.getDataValue(jsonData, "Geometry 2 - Question10");
		
		String question9_1 = jsonReader.getDataValue(jsonData, "Data Handling 1 - Question1");
		String question9_2 = jsonReader.getDataValue(jsonData, "Data Handling 1 - Question2");
		String question9_3 = jsonReader.getDataValue(jsonData, "Data Handling 1 - Question3");
		String question9_4 = jsonReader.getDataValue(jsonData, "Data Handling 1 - Question4");
		String question9_5 = jsonReader.getDataValue(jsonData, "Data Handling 1 - Question5");
		
		String question10_1 = jsonReader.getDataValue(jsonData, "Data Handling 2 - Question1");
		String question10_2 = jsonReader.getDataValue(jsonData, "Data Handling 2 - Question2");
		String question10_3 = jsonReader.getDataValue(jsonData, "Data Handling 2 - Question3");
		String question10_4 = jsonReader.getDataValue(jsonData, "Data Handling 2 - Question4");
		String question10_5 = jsonReader.getDataValue(jsonData, "Data Handling 2 - Question5");
		
		clickOnContinueBtn();
		
		spedUtility.clickByXpath("//*[text()='"+question1+"']");
		spedUtility.click(nextBtn);
		
		spedUtility.clickByXpath("//*[text()='"+question2+"']");
		spedUtility.click(nextBtn);
		
		spedUtility.clickByXpath("//*[text()='"+question3+"']");
		spedUtility.click(nextBtn);
		
		spedUtility.clickByXpath("//*[text()='"+question4+"']");
		spedUtility.click(nextBtn);
		
		spedUtility.clickByXpath("//*[text()='"+question5+"']");
		spedUtility.click(nextBtn);
		
		spedUtility.clickByXpath("//*[text()='"+question6+"']");
		spedUtility.click(nextBtn);
		
		spedUtility.clickByXpath("//*[text()='"+question7+"']");
		spedUtility.click(nextBtn);
		
		spedUtility.clickByXpath("//*[text()='"+question8+"']");
		spedUtility.click(nextBtn);
		
		spedUtility.clickByXpath("//*[text()='"+question9+"']");
		spedUtility.click(nextBtn);
		
		spedUtility.clickByXpath("//*[text()='"+question10+"']");
		spedUtility.click(submitBtn);
		
		clickOnContinueBtn();
		
		spedUtility.clickByXpath("//*[text()='"+question2_1+"']");
		spedUtility.click(nextBtn);
		
		spedUtility.clickByXpath("//*[text()='"+question2_2+"']");
		spedUtility.click(nextBtn);
		
		spedUtility.clickByXpath("//*[text()='"+question2_3+"']");
		spedUtility.click(nextBtn);
		
		spedUtility.clickByXpath("//*[text()='"+question2_4+"']");
		spedUtility.click(nextBtn);
		
		spedUtility.clickByXpath("//*[text()='"+question2_5+"']");
		spedUtility.click(nextBtn);
		
		spedUtility.clickByXpath("//*[text()='"+question2_6+"']");
		spedUtility.click(nextBtn);
		
		spedUtility.clickByXpath("//*[text()='"+question2_7+"']");
		spedUtility.click(nextBtn);
		
		spedUtility.clickByXpath("//*[text()='"+question2_8+"']");
		spedUtility.click(nextBtn);
		
		spedUtility.clickByXpath("//*[text()='"+question2_9+"']");
		spedUtility.click(nextBtn);
		
		spedUtility.clickByXpath("//*[text()='"+question2_10+"']");
		spedUtility.click(submitBtn);
		
		clickOnContinueBtn();
		
		spedUtility.clickByXpath("(//*[@class='worksheet-question-options-wrap']//div[@class='image-wrap'])["+ question3_1 +"]");
		spedUtility.click(submitBtn);
		
		clickOnContinueBtn();
		
		spedUtility.clickByXpath("(//*[@class='worksheet-question-options-wrap']//div[@class='image-wrap'])["+ question4_1 +"]");
		spedUtility.click(nextBtn);
		
		spedUtility.clickByXpath("(//*[@class='worksheet-question-options-wrap']//div[@class='image-wrap'])["+ question4_2 +"]");
		spedUtility.click(nextBtn);
		
		spedUtility.clickByXpath("(//*[@class='worksheet-question-options-wrap']//div[@class='image-wrap'])["+ question4_3 +"]");
		spedUtility.click(nextBtn);
		
		spedUtility.clickByXpath("(//*[@class='worksheet-question-options-wrap']//div[@class='image-wrap'])["+ question4_4 +"]");
		spedUtility.click(nextBtn);
		
		spedUtility.clickByXpath("(//*[@class='worksheet-question-options-wrap']//div[@class='image-wrap'])["+ question4_5 +"]");
		spedUtility.click(nextBtn);
		
		spedUtility.clickByXpath("(//*[@class='worksheet-question-options-wrap']//div[@class='image-wrap'])["+ question4_6 +"]");
		spedUtility.click(nextBtn);
		
		spedUtility.clickByXpath("(//*[@class='worksheet-question-options-wrap']//div[@class='image-wrap'])["+ question4_7 +"]");
		spedUtility.click(nextBtn);
		
		spedUtility.clickByXpath("//*[text()='"+question4_8+"']");
		spedUtility.click(nextBtn);
		
		spedUtility.clickByXpath("//*[text()='"+question4_9+"']");
		spedUtility.click(nextBtn);
		
		spedUtility.clickByXpath("(//*[@class='worksheet-question-options-wrap']//div[@class='image-wrap'])["+ question4_10 +"]");
		spedUtility.click(submitBtn);
		
		clickOnContinueBtn();
		
		spedUtility.clickByXpath("(//*[@class='worksheet-question-options-wrap']//div[@class='image-wrap'])["+ question5_1 +"]");
		spedUtility.click(nextBtn);
		
		spedUtility.clickByXpath("(//*[@class='worksheet-question-options-wrap']//div[@class='image-wrap'])["+ question5_2 +"]");
		spedUtility.click(nextBtn);
		
		spedUtility.clickByXpath("(//*[@class='worksheet-question-options-wrap']//div[@class='image-wrap'])["+ question5_3 +"]");
		spedUtility.click(nextBtn);
		
		spedUtility.clickByXpath("(//*[@class='worksheet-question-options-wrap']//div[@class='image-wrap'])["+ question5_4 +"]");
		spedUtility.click(nextBtn);
		
		spedUtility.clickByXpath("(//*[@class='worksheet-question-options-wrap']//div[@class='image-wrap'])["+ question5_5 +"]");
		spedUtility.click(submitBtn);
		
		clickOnContinueBtn();
		
		spedUtility.clickByXpath("(//*[@class='worksheet-question-options-wrap']//div[@class='image-wrap'])["+ question6_1 +"]");
		spedUtility.click(nextBtn);
		
		spedUtility.clickByXpath("(//*[@class='worksheet-question-options-wrap']//div[@class='image-wrap'])["+ question6_2 +"]");
		spedUtility.click(nextBtn);
		
		spedUtility.clickByXpath("(//*[@class='worksheet-question-options-wrap']//div[@class='image-wrap'])["+ question6_3 +"]");
		spedUtility.click(nextBtn);
		
		spedUtility.clickByXpath("(//*[@class='worksheet-question-options-wrap']//div[@class='image-wrap'])["+ question6_4 +"]");
		spedUtility.click(nextBtn);
		
		spedUtility.clickByXpath("(//*[@class='worksheet-question-options-wrap']//div[@class='image-wrap'])["+ question6_5 +"]");
		spedUtility.click(submitBtn);
		
		clickOnContinueBtn();
		
		spedUtility.clickByXpath("(//*[@class='worksheet-question-options-wrap']//div[@class='image-wrap'])["+ question7_1 +"]");
		spedUtility.click(nextBtn);
		
		spedUtility.clickByXpath("(//*[@class='worksheet-question-options-wrap']//div[@class='image-wrap'])["+ question7_2 +"]");
		spedUtility.click(nextBtn);
		
		spedUtility.clickByXpath("(//*[@class='worksheet-question-options-wrap']//div[@class='image-wrap'])["+ question7_3 +"]");
		spedUtility.click(nextBtn);
		
		spedUtility.clickByXpath("(//*[@class='worksheet-question-options-wrap']//div[@class='image-wrap'])["+ question7_4 +"]");
		spedUtility.click(nextBtn);
		
		spedUtility.clickByXpath("(//*[@class='worksheet-question-options-wrap']//div[@class='image-wrap'])["+ question7_5 +"]");
		spedUtility.click(nextBtn);
		
		spedUtility.clickByXpath("(//*[@class='worksheet-question-options-wrap']//div[@class='image-wrap'])["+ question7_6 +"]");
		spedUtility.click(nextBtn);
		
		spedUtility.clickByXpath("(//*[@class='worksheet-question-options-wrap']//div[@class='image-wrap'])["+ question7_7 +"]");
		spedUtility.click(nextBtn);
		
		spedUtility.clickByXpath("(//*[@class='worksheet-question-options-wrap']//div[@class='image-wrap'])["+ question7_8 +"]");
		spedUtility.click(nextBtn);
		
		spedUtility.clickByXpath("(//*[@class='worksheet-question-options-wrap']//div[@class='image-wrap'])["+ question7_9 +"]");
		spedUtility.click(nextBtn);
		
		spedUtility.clickByXpath("(//*[@class='worksheet-question-options-wrap']//div[@class='image-wrap'])["+ question7_10 +"]");
		spedUtility.click(submitBtn);

		clickOnContinueBtn();
		
		spedUtility.clickByXpath("(//*[@class='worksheet-question-options-wrap']//div[@class='image-wrap'])["+ question8_1 +"]");
		spedUtility.click(nextBtn);
		
		spedUtility.clickByXpath("(//*[@class='worksheet-question-options-wrap']//div[@class='image-wrap'])["+ question8_2 +"]");
		spedUtility.click(nextBtn);
		
		spedUtility.clickByXpath("(//*[@class='worksheet-question-options-wrap']//div[@class='image-wrap'])["+ question8_3 +"]");
		spedUtility.click(nextBtn);
		
		spedUtility.clickByXpath("(//*[@class='worksheet-question-options-wrap']//div[@class='image-wrap'])["+ question8_4 +"]");
		spedUtility.click(nextBtn);
		
		spedUtility.clickByXpath("(//*[@class='worksheet-question-options-wrap']//div[@class='image-wrap'])["+ question8_5 +"]");
		spedUtility.click(nextBtn);
		
		spedUtility.clickByXpath("(//*[@class='worksheet-question-options-wrap']//div[@class='image-wrap'])["+ question8_6 +"]");
		spedUtility.click(nextBtn);
		
		spedUtility.clickByXpath("(//*[@class='worksheet-question-options-wrap']//div[@class='image-wrap'])["+ question8_7 +"]");
		spedUtility.click(nextBtn);
		
		spedUtility.clickByXpath("(//*[@class='worksheet-question-options-wrap']//div[@class='image-wrap'])["+ question8_8 +"]");
		spedUtility.click(nextBtn);
		
		spedUtility.clickByXpath("(//*[@class='worksheet-question-options-wrap']//div[@class='image-wrap'])["+ question8_9 +"]");
		spedUtility.click(nextBtn);
		
		spedUtility.clickByXpath("(//*[@class='worksheet-question-options-wrap']//div[@class='image-wrap'])["+ question8_10 +"]");
		spedUtility.click(submitBtn);

		clickOnContinueBtn();
		
		spedUtility.clickByXpath("//*[text()='"+question9_1+"']");
		spedUtility.click(nextBtn);
		
		spedUtility.clickByXpath("//*[text()='"+question9_2+"']");
		spedUtility.click(nextBtn);
		
		spedUtility.clickByXpath("//*[text()='"+question9_3+"']");
		spedUtility.click(nextBtn);
		
		spedUtility.clickByXpath("//*[text()='"+question9_4+"']");
		spedUtility.click(nextBtn);
		
		spedUtility.clickByXpath("//*[text()='"+question9_5+"']");
		spedUtility.click(submitBtn);
		
		clickOnContinueBtn();
		
		spedUtility.clickByXpath("//*[text()='"+question10_1+"']");
		spedUtility.click(nextBtn);
		
		spedUtility.clickByXpath("//*[text()='"+question10_2+"']");
		spedUtility.click(nextBtn);
		
		spedUtility.clickByXpath("//*[text()='"+question10_3+"']");
		spedUtility.click(nextBtn);
		
		spedUtility.clickByXpath("//*[text()='"+question10_4+"']");
		spedUtility.click(nextBtn);
		
		spedUtility.clickByXpath("//*[text()='"+question10_5+"']");
		spedUtility.click(submitBtn);
		
		clickOnContinueBtn();
		
	}

}
