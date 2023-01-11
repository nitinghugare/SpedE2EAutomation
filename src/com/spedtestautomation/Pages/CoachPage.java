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

public class CoachPage extends PageFactory {
	WebDriver driver;
	SpedUtility spedUtility;
	JsonReader jsonReader;

	public CoachPage(WebDriver driver) {
		super();
		this.driver = driver;
		spedUtility = new SpedUtility(driver);
		PageFactory.initElements(driver, this);
		PageFactory.initElements(driver, spedUtility);
	}

	@FindBy(xpath = "//*[@class='spedu_table_cell_row']")
	WebElement childList;
	
	@FindBy(xpath = "(//*[contains(text(),'Questions For Parents')]/following::ol//*[@data-toggle='dropdown'])[1]")
	WebElement Question1Drpdwn;
	
	@FindBy(xpath = "(//*[contains(text(),'Questions For Parents')]/following::ol//*[@data-toggle='dropdown'])[2]")
	WebElement Question2Drpdwn;
	
	@FindBy(xpath = "(//*[contains(text(),'Questions For Parents')]/following::ol//*[@data-toggle='dropdown'])[3]")
	WebElement Question3Drpdwn;
	
	@FindBy(xpath = "(//*[contains(text(),'Questions For Parents')]/following::ol//*[@data-toggle='dropdown'])[4]")
	WebElement Question4Drpdwn;
	
	@FindBy(xpath = "(//*[contains(text(),'Questions For Parents')]/following::ol//*[@data-toggle='dropdown'])[5]")
	WebElement Question5Drpdwn;
	
	@FindBy(xpath = "(//*[contains(text(),'Questions For Parents')]/following::ol//*[@data-toggle='dropdown'])[6]")
	WebElement Question6Drpdwn;
	
	@FindBy(xpath = "(//*[contains(text(),'Questions For Parents')]/following::ol//*[@data-toggle='dropdown'])[7]")
	WebElement Question7Drpdwn;
	
	@FindBy(xpath = "(//*[contains(text(),'Questions For Parents')]/following::ol//*[@data-toggle='dropdown'])[11]")
	WebElement Question1_1Drpdwn;
	
	@FindBy(xpath = "(//*[contains(text(),'Questions For Parents')]/following::ol//*[@data-toggle='dropdown'])[12]")
	WebElement Question1_2Drpdwn;
	
	@FindBy(xpath = "(//*[contains(text(),'Questions For Parents')]/following::ol//*[@data-toggle='dropdown'])[13]")
	WebElement Question1_3Drpdwn;
	
	@FindBy(xpath = "(//*[contains(text(),'Questions For Parents')]/following::ol//*[@data-toggle='dropdown'])[14]")
	WebElement Question1_4Drpdwn;
	
	@FindBy(xpath = "(//*[contains(text(),'Questions For Parents')]/following::ol//*[@data-toggle='dropdown'])[15]")
	WebElement Question1_5Drpdwn;
	
	@FindBy(xpath = "(//*[contains(text(),'Questions For Parents')]/following::ol//*[@data-toggle='dropdown'])[16]")
	WebElement Question1_6Drpdwn;
	
	@FindBy(xpath = "(//*[contains(text(),'Questions For Parents')]/following::ol//*[@data-toggle='dropdown'])[17]")
	WebElement Question1_7Drpdwn;
	
	@FindBy(xpath = "(//*[contains(text(),'Questions For Parents')]/following::ol//*[@data-toggle='dropdown'])[18]")
	WebElement Question1_8Drpdwn;
	
	@FindBy(xpath = "(//*[contains(text(),'Questions For Parents')]/following::ol//*[@data-toggle='dropdown'])[19]")
	WebElement Question1_9Drpdwn;
	
	@FindBy(xpath = "(//*[contains(text(),'Questions For Parents')]/following::ol//*[@data-toggle='dropdown'])[20]")
	WebElement Question1_10Drpdwn;
	
	@FindBy(xpath = "(//*[contains(text(),'Questions For Parents')]/following::ol//*[@data-toggle='dropdown'])[17]")
	WebElement Question2_1Drpdwn;
	
	@FindBy(xpath = "(//*[contains(text(),'Questions For Parents')]/following::ol//*[@data-toggle='dropdown'])[18]")
	WebElement Question2_2Drpdwn;
	
	@FindBy(xpath = "(//*[contains(text(),'Questions For Parents')]/following::ol//*[@data-toggle='dropdown'])[19]")
	WebElement Question2_3Drpdwn;
	
	@FindBy(xpath = "(//*[contains(text(),'Questions For Parents')]/following::ol//*[@data-toggle='dropdown'])[20]")
	WebElement Question2_4Drpdwn;
	
	@FindBy(xpath = "(//*[contains(text(),'Questions For Parents')]/following::ol//*[@data-toggle='dropdown'])[21]")
	WebElement Question2_5Drpdwn;
	
	@FindBy(xpath = "(//*[contains(text(),'Questions For Parents')]/following::ol//*[@data-toggle='dropdown'])[22]")
	WebElement Question2_6Drpdwn;
	
	@FindBy(xpath = "(//*[contains(text(),'Questions For Parents')]/following::ol//*[@data-toggle='dropdown'])[23]")
	WebElement Question2_7Drpdwn;
	

	@FindBy(xpath = "(//div[contains(@class,'child-marks_table')]//td[2])[1]")
	WebElement Question3_1Drpdwn;
	
	@FindBy(xpath = "(//div[contains(@class,'child-marks_table')]//td[2])[2]")
	WebElement Question3_2Drpdwn;
	
	@FindBy(xpath = "(//div[contains(@class,'child-marks_table')]//td[2])[3]")
	WebElement Question3_3Drpdwn;
	
	@FindBy(xpath = "(//div[contains(@class,'child-marks_table')]//td[2])[4]")
	WebElement Question3_4Drpdwn;
	
	@FindBy(xpath = "(//div[contains(@class,'child-marks_table')]//td[2])[5]")
	WebElement Question3_5Drpdwn;
	
	@FindBy(xpath = "(//div[@data-toggle='dropdown'])[27]")
	WebElement Question4_1Drpdwn;
	
	@FindBy(xpath = "(//div[@data-toggle='dropdown'])[28]")
	WebElement Question4_2Drpdwn;
	
	@FindBy(xpath = "(//div[@data-toggle='dropdown'])[29]")
	WebElement Question4_3Drpdwn;
	
	@FindBy(xpath = "(//div[@data-toggle='dropdown'])[30]")
	WebElement Question4_4Drpdwn;
	
	@FindBy(xpath = "(//div[@data-toggle='dropdown'])[31]")
	WebElement Question4_5Drpdwn;
	
	@FindBy(xpath = "(//span[contains(text(),'Save & Next')])[1]")
	WebElement SaveAndNextBtn;
	
	@FindBy(xpath = "//*[contains(text(),'Ok')]")
	WebElement SavedPopup;
	
	@FindBy(xpath = "//*[text()='Save']")
	WebElement SaveBtn;
	
	@FindBy(xpath = "//*[@placeholder='Enter your Comments']")
	WebElement commentsTextBox;
	
	@FindBy(xpath = "//*[text()='Grade']/following::div[@class='spedu-select'][1]")
	WebElement gradeDrpdwn;
	
	@FindBy(xpath = "//*[text()='Cluster']/following::div[@class='spedu-select'][1]")
	WebElement clusterDrpdwn;
	
	
	public void clickOnCoachOption(String option){
		spedUtility.clickByXpath(String.format("//*[contains(@class,'coach-dashboard_status')]//following::*[contains(text(),'%s')]",option));
		
	}
	
	public void childListDisplayed(){
		if(spedUtility.isElementDisplayedNotify(childList)){
			System.out.println("Child List is displayed");
		} else {
			System.out.println("Failed : Child list is not displayed");
		}
	}
	
	public void clickOnChildName(String childName){
		spedUtility.clickByXpath(String.format("//*[@class='spedu_table_cell_row']//div[contains(text(),'%s')]",childName));
		
	}
	
	public void addBirthHistoryInCoachAssesment() throws FileNotFoundException, IOException, ParseException{
		Map jsonData;
		jsonData = jsonReader.readJson("Coach_Assesment", "QA");
		String question1 = jsonReader.getDataValue(jsonData, "Problems in the antenatal phase of pregnancy");
		String question2 = jsonReader.getDataValue(jsonData, "type of delivery");
		String question3 = jsonReader.getDataValue(jsonData, "weight of the baby at birth");
		String question4 = jsonReader.getDataValue(jsonData, "history of neonatal jaundice");
		String question5 = jsonReader.getDataValue(jsonData, "history of neonatal convulsions");
		String question6 = jsonReader.getDataValue(jsonData, "Describe the pregnancy");
		String question7 = jsonReader.getDataValue(jsonData, "Did the baby cry immediately after birth");
		
		spedUtility.click(Question1Drpdwn);
		spedUtility.clickByXpath(String.format("(//li[contains(text(),'Select Option')]//following-sibling::li[contains(text(),'%s') and @value='0'])[1]", question1));
		
		spedUtility.click(Question2Drpdwn);
		spedUtility.clickByXpath(String.format("(//li[contains(text(),'Select Option')]//following-sibling::li[contains(text(),'%s') and @value='0'])[1]", question2));
		
		spedUtility.click(Question3Drpdwn);
		spedUtility.clickByXpath(String.format("(//li[contains(text(),'Select Option')]//following-sibling::li[contains(text(),'%s') and @value='0'])[1]", question3));
		
		spedUtility.click(Question4Drpdwn);
		spedUtility.clickByXpath(String.format("(//li[contains(text(),'Select Option')]//following-sibling::li[contains(text(),'%s') and @value='0'])[2]", question4));
		
		spedUtility.click(Question5Drpdwn);
		spedUtility.clickByXpath(String.format("(//li[contains(text(),'Select Option')]//following-sibling::li[contains(text(),'%s') and @value='0'])[3]", question5));
		
		spedUtility.click(Question6Drpdwn);
		spedUtility.clickByXpath(String.format("(//li[contains(text(),'Select Option')]//following-sibling::li[contains(text(),'%s') and @value='0'])[1]", question6));
		
		spedUtility.click(Question7Drpdwn);
		spedUtility.clickByXpath(String.format("(//li[contains(text(),'Select Option')]//following-sibling::li[contains(text(),'%s') and @value='0'])[4]", question7));
	}
	
	public void clickOnSaveAndNext(){
		spedUtility.click(SaveAndNextBtn);
	}
	
	public void closeSavedPopup(){
		spedUtility.click(SavedPopup);
	}
	
	public void clickOnSaveBtn(){
		spedUtility.click(SaveBtn);
	}
	
	public void addInterestingActivitiesInCoachAssesment() throws FileNotFoundException, IOException, ParseException{
		Map jsonData;
		jsonData = jsonReader.readJson("Coach_Assesment", "QA");
		String question1 = jsonReader.getDataValue(jsonData, "Relationship with parents");
		String question2 = jsonReader.getDataValue(jsonData, "Relationship with siblings");
		String question3 = jsonReader.getDataValue(jsonData, "Relationship with peers");
		String question4 = jsonReader.getDataValue(jsonData, "Participates in organised activities");
		String question5 = jsonReader.getDataValue(jsonData, "Computer proficiency");
		String question6 = jsonReader.getDataValue(jsonData, "School Liking");
		String question7 = jsonReader.getDataValue(jsonData, "Outdoor games");
		String question8 = jsonReader.getDataValue(jsonData, "Indoor games");
		String question9 = jsonReader.getDataValue(jsonData, "TV / Mobile");
		String question10 = jsonReader.getDataValue(jsonData, "Music Fine Art");
		
		spedUtility.click(Question1_1Drpdwn);
		spedUtility.clickByXpath(String.format("(//li[contains(text(),'Select Option')]//following-sibling::li[contains(text(),'%s') and @value='0'])[5]", question1));
		
		spedUtility.click(Question1_2Drpdwn);
		spedUtility.clickByXpath(String.format("(//li[contains(text(),'Select Option')]//following-sibling::li[contains(text(),'%s') and @value='0'])[6]", question2));
		
		spedUtility.click(Question1_3Drpdwn);
		spedUtility.clickByXpath(String.format("(//li[contains(text(),'Select Option')]//following-sibling::li[contains(text(),'%s') and @value='0'])[7]", question3));
		
		spedUtility.click(Question1_4Drpdwn);
		spedUtility.clickByXpath(String.format("(//li[contains(text(),'Select Option')]//following-sibling::li[contains(text(),'%s') and @value='0'])[8]", question4));
		
		spedUtility.click(Question1_5Drpdwn);
		spedUtility.clickByXpath(String.format("(//li[contains(text(),'Select Option')]//following-sibling::li[contains(text(),'%s') and @value='0'])[2]", question5));
		
		spedUtility.click(Question1_6Drpdwn);
		spedUtility.clickByXpath(String.format("(//li[contains(text(),'Select Option')]//following-sibling::li[contains(text(),'%s') and @value='0'])[6]", question6));
		
		spedUtility.click(Question1_7Drpdwn);
		spedUtility.clickByXpath(String.format("(//li[contains(text(),'Select Option')]//following-sibling::li[contains(text(),'%s') and @value='0'])[7]", question7));
		
		spedUtility.click(Question1_8Drpdwn);
		spedUtility.clickByXpath(String.format("(//li[contains(text(),'Select Option')]//following-sibling::li[contains(text(),'%s') and @value='0'])[8]", question8));
		
		spedUtility.click(Question1_9Drpdwn);
		spedUtility.clickByXpath(String.format("(//li[contains(text(),'Select Option')]//following-sibling::li[contains(text(),'%s') and @value='0'])[9]", question9));
		
		spedUtility.click(Question1_10Drpdwn);
		spedUtility.clickByXpath(String.format("(//li[contains(text(),'Select Option')]//following-sibling::li[contains(text(),'%s') and @value='0'])[10]", question10));
	}
	
	public void addParentEmotionsInCoachAssesment() throws FileNotFoundException, IOException, ParseException{
		Map jsonData;
		jsonData = jsonReader.readJson("Coach_Assesment", "QA");
		String question2_1 = jsonReader.getDataValue(jsonData, "Who noticed the problem first");
		String question2_2 = jsonReader.getDataValue(jsonData, "Do you think a child tries hard without success");
		String question2_3 = jsonReader.getDataValue(jsonData, "Does the child feel he/she is a failure");
		String question2_4 = jsonReader.getDataValue(jsonData, "Does the child give up easily");
		String question2_5 = jsonReader.getDataValue(jsonData, "Does the child get aggressive / withdrawn");
		String question2_6 = jsonReader.getDataValue(jsonData, "Is the teacher's attitude towards the child sympathetic");
		String question2_7 = jsonReader.getDataValue(jsonData, "Is the child unfairly punished in his/her school for his/her studies");
		String parentEmotion = jsonReader.getDataValue(jsonData, "Select Parental Emotions");
		
		
		spedUtility.click(Question2_1Drpdwn);
		spedUtility.clickByXpath(String.format("(//li[contains(text(),'Select Option')]//following-sibling::li[contains(text(),'%s') and @value='0'])[3]", question2_1));
		
		spedUtility.click(Question2_2Drpdwn);
		spedUtility.clickByXpath(String.format("(//li[contains(text(),'Select Option')]//following-sibling::li[contains(text(),'%s') and @value='0'])[13]", question2_2));
		
		spedUtility.click(Question2_3Drpdwn);
		spedUtility.clickByXpath(String.format("(//li[contains(text(),'Select Option')]//following-sibling::li[contains(text(),'%s') and @value='0'])[14]", question2_3));
		
		spedUtility.click(Question2_4Drpdwn);
		spedUtility.clickByXpath(String.format("(//li[contains(text(),'Select Option')]//following-sibling::li[contains(text(),'%s') and @value='0'])[15]", question2_4));
		
		spedUtility.click(Question2_5Drpdwn);
		spedUtility.clickByXpath(String.format("(//li[contains(text(),'Select Option')]//following-sibling::li[contains(text(),'%s') and @value='0'])[16]", question2_5));
		
		spedUtility.click(Question2_6Drpdwn);
		spedUtility.clickByXpath(String.format("(//li[contains(text(),'Select Option')]//following-sibling::li[contains(text(),'%s') and @value='0'])[17]", question2_6));
		
		spedUtility.click(Question2_7Drpdwn);
		spedUtility.clickByXpath(String.format("(//li[contains(text(),'Select Option')]//following-sibling::li[contains(text(),'%s') and @value='0'])[18]", question2_7));
		
		spedUtility.clickByXpath(String.format("//div[contains(text(),'%s')]", parentEmotion));
	}
	
	public void addDiscrepancyAnalysisInChildInterview(String typeOfAnalysis) throws FileNotFoundException, IOException, ParseException{
		String dropdownOption = "//*[@class='options dropdown-menu show']/li[contains(text(),'%s')]";
		Map jsonData;
		jsonData = jsonReader.readJson("Coach_Assesment", "QA");
		String question1 = jsonReader.getDataValue(jsonData, "Question1");
		String question2 = jsonReader.getDataValue(jsonData, "Question2");
		String question3 = null , question4 = null, question5 = null;
		if(!typeOfAnalysis.equals("Vocabulary")){
			question3 = jsonReader.getDataValue(jsonData, "Question3");
			question4 = jsonReader.getDataValue(jsonData, "Question4");
			question5 = jsonReader.getDataValue(jsonData, "Question5");
		}
		
		
		clickOnTypeOfDiscrepancyAnalysis(typeOfAnalysis);

		spedUtility.click(Question3_1Drpdwn);
		spedUtility.clickByXpath(String.format(dropdownOption, question1));
		
		spedUtility.click(Question3_2Drpdwn);
		spedUtility.clickByXpath(String.format(dropdownOption, question2));
		
		if(!typeOfAnalysis.equals("Vocabulary")){
			spedUtility.click(Question3_3Drpdwn);
			spedUtility.clickByXpath(String.format(dropdownOption, question3));
			
			spedUtility.click(Question3_4Drpdwn);
			spedUtility.clickByXpath(String.format(dropdownOption, question4));
			
			spedUtility.click(Question3_5Drpdwn);
			spedUtility.clickByXpath(String.format(dropdownOption, question5));
		}
	}
	
	public void clickOnTypeOfDiscrepancyAnalysis(String tabName){
		spedUtility.clickByXpath(String.format("//div[contains(text(),'%s')]/parent::label/parent::li", tabName));
	}
	
	public void addChildBehaviourInChildInterview() throws FileNotFoundException, IOException, ParseException{
		Map jsonData;
		jsonData = jsonReader.readJson("Coach_Assesment", "QA");
		String question4_1 = jsonReader.getDataValue(jsonData, "Emotions");
		String question4_2 = jsonReader.getDataValue(jsonData, "Cooperation");
		String question4_3 = jsonReader.getDataValue(jsonData, "Behaviour");
		String question4_4 = jsonReader.getDataValue(jsonData, "Eye Contact");
		String question4_5 = jsonReader.getDataValue(jsonData, "Intelligence");
		
		
		spedUtility.click(Question4_1Drpdwn);
		spedUtility.clickByXpath(String.format("//li[text()='%s']", question4_1));
	
		spedUtility.click(Question4_2Drpdwn);
		spedUtility.clickByXpath(String.format("//li[text()='%s']", question4_2));
		
		spedUtility.click(Question4_3Drpdwn);
		spedUtility.clickByXpath(String.format("//li[text()='%s']", question4_3));
		
		spedUtility.click(Question4_4Drpdwn);
		spedUtility.clickByXpath(String.format("//li[text()='%s']", question4_4));
		
		spedUtility.click(Question4_5Drpdwn);
		spedUtility.clickByXpath(String.format("//li[text()='%s']", question4_5));
		
	}
	
	public void addComments(String comment){
		spedUtility.type(commentsTextBox, comment);
	}
	
	public void clickOnTypeOfIEP(String assesmentType,String tabName){
		if(assesmentType!=""){
			spedUtility.clickByXpath(String.format("(//li[text()='%s'])[1]", assesmentType));
		}
		spedUtility.clickByXpath(String.format("//div[contains(text(),'%s')]/parent::label/parent::li", tabName));
	}
	
	public void selectGradeAndCluster(String grade, String cluster){
		spedUtility.click(gradeDrpdwn);
		spedUtility.clickByXpath(String.format("//li[@class='option' and text()='%s']", grade));
		
		spedUtility.click(clusterDrpdwn);
		spedUtility.clickByXpath(String.format("//li[@class='option' and text()='%s']", cluster));
	}

	
	public void selectOptions(String assesmentType,String tableName) throws FileNotFoundException, IOException, ParseException{
		Map jsonData;
		jsonData = jsonReader.readJson("SelectGradeAndCluster"+tableName, "QA");
		String grade1 = jsonReader.getDataValue(jsonData, "GradeForReadingWriting");
		String cluster1 =  jsonReader.getDataValue(jsonData, "ClusterForReadingWriting");
		String grade2 = jsonReader.getDataValue(jsonData, "GradeForSpelling");
		String cluster2 = jsonReader.getDataValue(jsonData, "ClusterForSpelling");
		String grade3 = jsonReader.getDataValue(jsonData, "GradeForGrammar");
		String cluster3 = jsonReader.getDataValue(jsonData, "ClusterForGrammar");
		String grade4 = jsonReader.getDataValue(jsonData, "GradeForVocabulary");
		String cluster4 = jsonReader.getDataValue(jsonData, "ClusterForVocabulary");
		String grade5 = jsonReader.getDataValue(jsonData, "GradeForComprehension");
		String cluster5 = jsonReader.getDataValue(jsonData, "ClusterForComprehension");
		String grade6 = jsonReader.getDataValue(jsonData, "GradeForPhonicssightwords");
		String cluster6 = jsonReader.getDataValue(jsonData, "ClusterForPhonicssightwords");
		
		clickOnTypeOfIEP(assesmentType, "Reading & Writing");
		selectGradeAndCluster(grade1, cluster1);
		
		clickOnTypeOfIEP("", "Spelling");
		selectGradeAndCluster(grade2, cluster2);
		
		clickOnTypeOfIEP("", "Grammar");
		selectGradeAndCluster(grade3, cluster3);
		
		clickOnTypeOfIEP("", "Vocabulary");
		selectGradeAndCluster(grade4, cluster4);
		
		clickOnTypeOfIEP("", "Comprehension");
		selectGradeAndCluster(grade5, cluster5);
		
		clickOnTypeOfIEP("", "Phonics+sight words");
		selectGradeAndCluster(grade6, cluster6);
		
	}
}
