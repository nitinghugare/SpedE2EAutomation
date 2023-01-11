package com.spedtestautomation.Pages;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
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

	@FindBy(xpath = "//*[@placeholder='Type your Answer here']")
	WebElement schoolNameEle;

	@FindBy(xpath = "//*[text()='Next']/parent::button")
	WebElement nextBtn;

	@FindBy(xpath = "//div[@class='dropdown-container']/select")
	WebElement assesmentInfoDrpdwn;

	@FindBy(xpath = "//button[text()='Review']")
	WebElement reviewBtn;

	@FindBy(xpath = "//*[contains(@class,'review-questions')]//following::div[contains(@class,'edit-question')]")
	WebElement editOptionsOnReview;

	@FindBy(xpath = "//button[text()='Submit']")
	WebElement submitBtn;

	@FindBy(xpath = "//*[text()='Next Section']")
	WebElement nextSectionBtn;
	
	@FindBy(xpath = "//*[text()='Proceed to Next Step']")
	WebElement proceedToNextStep;
	
	public void verifyElementsOnAssesmentPage() {
		Map<WebElement, String> elements = new HashMap<WebElement, String>();
		elements.put(progressBar, "Progress bar");
		elements.put(questionnaireBlock, "Questionnaire Block");
		elements.put(playWorksheetsBlock, "Play Worksheets Block");
		elements.put(meetYourCoach, "Meet Your Coach");
		elements.put(yourChildsReportBlock, "Your Childs Report Block");

		for (Map.Entry<WebElement, String> eachEntry : elements.entrySet()) {
			if (spedUtility.isElementDisplayedNotify(eachEntry.getKey())) {
				System.out.println(eachEntry.getValue() + " : on Assesment Page is displayed");
			} else {
				System.out.println("Failed - " + eachEntry.getValue() + " : on Assesment Page is not displayed");
			}
		}

	}

	public void clickOnQuestionnaire() {
		spedUtility.click(questionnaireDrpDwn);
	}

	public void clickOnBackBtn() {
		spedUtility.click(backBtn);
	}

	public void clickOnStartYourAssesment() {
		if (spedUtility.isElementDisplayedNotify(questionnaireDrpDwn)) {
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
			if (spedUtility.isElementDisplayedNotify(eachEntry.getKey())) {
				System.out.println(eachEntry.getValue() + " : on Start your assesment pop up displayed");
			} else {
				System.out.println(
						"Failed - " + eachEntry.getValue() + " : on Start your assesment pop up is not displayed");
			}
		}

	}

	public void addSchoolInformation(String jsonDataFileName)
			throws FileNotFoundException, IOException, ParseException {
		jsonData = jsonReader.readJson(jsonDataFileName, "QA");
		String schoolName = jsonReader.getDataValue(jsonData, "SchoolName");
		String chilGrade = jsonReader.getDataValue(jsonData, "Grade");
		String schoolType = jsonReader.getDataValue(jsonData, "Type of school");
		String schoolBoard = jsonReader.getDataValue(jsonData, "Board of the school");
		String repeatedGrade = jsonReader.getDataValue(jsonData, "Any Grade Repeated");
		String schoolAttendedNo = jsonReader.getDataValue(jsonData, "How many schools attended");
		String gradeInCurrentSchool = jsonReader.getDataValue(jsonData, "Grade in current school");
		String gradeOfProblemDetected = jsonReader.getDataValue(jsonData, "Grade in which problem detected");
		String remedialEduProvided = jsonReader.getDataValue(jsonData, "School Have Remedial Education");

		spedUtility.type(schoolNameEle, schoolName);
		spedUtility.click(nextBtn);

		spedUtility.selectFromDropdwonByText(assesmentInfoDrpdwn, chilGrade);
		spedUtility.click(nextBtn);

		spedUtility.clickByXpath("//*[@data-option='" + schoolType + "']");
		spedUtility.click(nextBtn);

		spedUtility.selectFromDropdwonByText(assesmentInfoDrpdwn, schoolBoard);
		spedUtility.click(nextBtn);

		spedUtility.clickByXpath("//*[@data-option='" + repeatedGrade + "']");
		spedUtility.click(nextBtn);

		spedUtility.selectFromDropdwonByText(assesmentInfoDrpdwn, schoolAttendedNo);
		spedUtility.click(nextBtn);

		spedUtility.selectFromDropdwonByText(assesmentInfoDrpdwn, gradeInCurrentSchool);
		spedUtility.click(nextBtn);
		;

		spedUtility.selectFromDropdwonByText(assesmentInfoDrpdwn, gradeOfProblemDetected);
		spedUtility.click(nextBtn);

		spedUtility.clickByXpath("//*[@data-option='" + remedialEduProvided + "']");
		// spedUtility.click(nextBtn);

		spedUtility.click(reviewBtn);

	}

	public void verifyEditOptionForReview(String editOptionFor) {
		int editOptionSize = 0;
		if (editOptionFor.equals("School Information")) {
			editOptionSize = 9;
		}
		if (editOptionFor.equals("Reason for Referral")) {
			editOptionSize = 32;
		}
		if (editOptionFor.equals("Parent Information")) { 
			editOptionSize = 15;
		}
		if (editOptionFor.equals("Behavioural Assessment")) {
			spedUtility.seleniumWait(this.driver.findElement(By.xpath("//*[@class='col page-title']//span")));
			String testNumber = this.driver.findElement(By.xpath("//*[@class='col page-title']//span")).getText();
			if(testNumber.contains("Test 1") || testNumber.contains("Test 1")){	
				editOptionSize = 9;
			}
			if(testNumber.contains("Test 3")){	
				editOptionSize = 8;
			}
			if(testNumber.contains("Test 4")){	
				editOptionSize = 14;
			}
			if(testNumber.contains("Test 5")){	
				editOptionSize = 7;
			}
			if(testNumber.contains("Test 6")){	
				editOptionSize = 40;
			}
			
		}
		if(editOptionFor.equals("OT Screening")){
			spedUtility.seleniumWait(this.driver.findElement(By.xpath("//*[@class='col page-title']//span")));
			String testNumber = this.driver.findElement(By.xpath("//*[@class='col page-title']//span")).getText();
			if(testNumber.contains("Area 1")){	
				editOptionSize = 12;
			}
			if(testNumber.contains("Area 2")){	
				editOptionSize = 25;
			}
			if(testNumber.contains("Area 3")){	
				editOptionSize = 33;
			}
			if(testNumber.contains("Area 4")){	
				editOptionSize = 19;
			}
			if(testNumber.contains("Area 5")){	
				editOptionSize = 7;
			}
		}
		List<WebElement> editableOptions = this.driver.findElements(
				By.xpath("//*[contains(@class,'review-questions')]//following::div[contains(@class,'edit-question')]"));
		if (editableOptions.size() == editOptionSize) {
			System.out.println("Edit options are displayed");
		}
		for (WebElement element : editableOptions) {
			if (!spedUtility.isElementDisplayedNotify(element)) {
				System.out.println("Failed : Edit options are not displayed");
			}
		}
	}

	public void clickSubmitBtn() {
		spedUtility.click(submitBtn);
	}

	public void clickNextSectionBtn() {
		spedUtility.click(nextSectionBtn);
	}

	public void addReasonForReferral(String jsonDataFileName)
			throws FileNotFoundException, IOException, ParseException {
		jsonData = jsonReader.readJson(jsonDataFileName, "QA");
		String averageScore = jsonReader.getDataValue(jsonData, "Average Academic Score");
		String problemInAreaOfReading = jsonReader.getDataValue(jsonData, "Child Have Problem In Area Of Reading");
		String problemInAreaOfWriting = jsonReader.getDataValue(jsonData, "Child Have Problem In Area Of Writing");
		String problemInAreaOfSpelling = jsonReader.getDataValue(jsonData, "Child Have Problem In Area Of Spelling");
		String problemInAreaOfMaths = jsonReader.getDataValue(jsonData, "Child Have Problem In Area Of Maths");
		String subject = jsonReader.getDataValue(jsonData, "Subject in Which Faces Difficulties");
		String oralOrWritten = jsonReader.getDataValue(jsonData, "Oral Work Better than written work");
		String concentration = jsonReader.getDataValue(jsonData, "Difficulty in concentration");
		String hyperactive = jsonReader.getDataValue(jsonData, "Child Is Hyperactive");

		String angerIssues = jsonReader.getDataValue(jsonData, "Prone to temper tantrums/Anger Issue");
		String tellLies = jsonReader.getDataValue(jsonData, "Often tell lies");
		String worried = jsonReader.getDataValue(jsonData, "excessively worried/nervous");
		String loenlyOrTearful = jsonReader.getDataValue(jsonData, "seem lonely or tearful");
		String repetitiveBehaviour = jsonReader.getDataValue(jsonData, "exhibit repetitive behaviour");

		String speechAndLanguageDifficulties = jsonReader.getDataValue(jsonData, "speech and language difficulties");
		String easierToUseGestures = jsonReader.getDataValue(jsonData, "easier to use gestures");
		String awkwardnessWhileRunningJumping = jsonReader.getDataValue(jsonData,
				"awkwardness while running or jumping");
		String stairsClimbing = jsonReader.getDataValue(jsonData,
				"difficulty alternating feet while climbing the stairs");
		String difficultyThrowingBigBall = jsonReader.getDataValue(jsonData, "difficulty throwing a big ball");

		String difficultyButtoning = jsonReader.getDataValue(jsonData, "difficulty buttoning");
		String difficultyUsingEraser = jsonReader.getDataValue(jsonData, "difficulty using an eraser");
		String itemPicking = jsonReader.getDataValue(jsonData, "difficulty picking up tiny items");
		String socialising = jsonReader.getDataValue(jsonData, "difficulty socialising");
		String busyInOwnWorld = jsonReader.getDataValue(jsonData, "busy in own world");

		String difficultyEatingIndependently = jsonReader.getDataValue(jsonData, "difficulty eating independently");
		String difficultyDressingIndependently = jsonReader.getDataValue(jsonData, "difficulty dressing independently");
		String needAssistanceInToilet = jsonReader.getDataValue(jsonData, "need assistance in toilet");
		String preferPlayingAlone = jsonReader.getDataValue(jsonData, "prefer playing alone");
		String regularFightsWhilePlaying = jsonReader.getDataValue(jsonData, "regular fights while playing");

		String avoidTouchingCertainTextures = jsonReader.getDataValue(jsonData, "avoid touching certain textures");
		String avoidPlaygroundEquipment = jsonReader.getDataValue(jsonData, "avoid playground equipment");
		String heightIssues = jsonReader.getDataValue(jsonData, "Height Issues");

		spedUtility.selectFromDropdwonByText(assesmentInfoDrpdwn, averageScore);
		spedUtility.click(nextBtn);

		spedUtility.selectFromDropdwonByText(assesmentInfoDrpdwn, problemInAreaOfReading);
		spedUtility.click(nextBtn);

		spedUtility.selectFromDropdwonByText(assesmentInfoDrpdwn, problemInAreaOfWriting);
		spedUtility.click(nextBtn);

		spedUtility.selectFromDropdwonByText(assesmentInfoDrpdwn, problemInAreaOfSpelling);
		spedUtility.click(nextBtn);
		;

		spedUtility.selectFromDropdwonByText(assesmentInfoDrpdwn, problemInAreaOfMaths);
		spedUtility.click(nextBtn);

		spedUtility.selectFromDropdwonByText(assesmentInfoDrpdwn, subject);
		spedUtility.click(nextBtn);

		spedUtility.clickByXpath("//*[@data-option='" + oralOrWritten + "']");
		spedUtility.click(nextBtn);

		spedUtility.clickByXpath("//*[@data-option='" + concentration + "']");
		spedUtility.click(nextBtn);

		spedUtility.clickByXpath("//*[@data-option='" + hyperactive + "']");
		spedUtility.click(nextBtn);

		spedUtility.clickByXpath("//*[@data-option='" + angerIssues + "']");
		spedUtility.click(nextBtn);

		spedUtility.clickByXpath("//*[@data-option='" + tellLies + "']");
		spedUtility.click(nextBtn);

		spedUtility.clickByXpath("//*[@data-option='" + worried + "']");
		spedUtility.click(nextBtn);

		spedUtility.clickByXpath("//*[@data-option='" + loenlyOrTearful + "']");
		spedUtility.click(nextBtn);

		spedUtility.clickByXpath("//*[@data-option='" + repetitiveBehaviour + "']");
		spedUtility.click(nextBtn);

		spedUtility.clickByXpath("//*[@data-option='" + speechAndLanguageDifficulties + "']");
		spedUtility.click(nextBtn);

		spedUtility.clickByXpath("//*[@data-option='" + easierToUseGestures + "']");
		spedUtility.click(nextBtn);

		spedUtility.clickByXpath("//*[@data-option='" + awkwardnessWhileRunningJumping + "']");
		spedUtility.click(nextBtn);

		spedUtility.clickByXpath("//*[@data-option='" + stairsClimbing + "']");
		spedUtility.click(nextBtn);

		spedUtility.clickByXpath("//*[@data-option='" + difficultyThrowingBigBall + "']");
		spedUtility.click(nextBtn);

		spedUtility.clickByXpath("//*[@data-option='" + difficultyButtoning + "']");
		spedUtility.click(nextBtn);

		spedUtility.clickByXpath("//*[@data-option='" + difficultyUsingEraser + "']");
		spedUtility.click(nextBtn);

		spedUtility.clickByXpath("//*[@data-option='" + itemPicking + "']");
		spedUtility.click(nextBtn);

		spedUtility.clickByXpath("//*[@data-option='" + socialising + "']");
		spedUtility.click(nextBtn);

		spedUtility.clickByXpath("//*[@data-option='" + busyInOwnWorld + "']");
		spedUtility.click(nextBtn);

		spedUtility.clickByXpath("//*[@data-option='" + difficultyEatingIndependently + "']");
		spedUtility.click(nextBtn);

		spedUtility.clickByXpath("//*[@data-option='" + difficultyDressingIndependently + "']");
		spedUtility.click(nextBtn);

		spedUtility.clickByXpath("//*[@data-option='" + needAssistanceInToilet + "']");
		spedUtility.click(nextBtn);

		spedUtility.clickByXpath("//*[@data-option='" + preferPlayingAlone + "']");
		spedUtility.click(nextBtn);

		spedUtility.clickByXpath("//*[@data-option='" + regularFightsWhilePlaying + "']");
		spedUtility.click(nextBtn);

		spedUtility.clickByXpath("//*[@data-option='" + avoidTouchingCertainTextures + "']");
		spedUtility.click(nextBtn);

		spedUtility.clickByXpath("//*[@data-option='" + avoidPlaygroundEquipment + "']");
		spedUtility.click(nextBtn);

		spedUtility.clickByXpath("//*[@data-option='" + heightIssues + "']");

		spedUtility.click(reviewBtn);

	}

	public void addParentInformation(String jsonDataFileName)
			throws FileNotFoundException, IOException, ParseException {
		jsonData = jsonReader.readJson(jsonDataFileName, "QA");
		String history = jsonReader.getDataValue(jsonData, "child have a history of seizures");
		String historyOfMeningitis = jsonReader.getDataValue(jsonData, "history of meningitis");
		String historyOfHeadInjury = jsonReader.getDataValue(jsonData, "history of any head injury");
		String historyOfBedwetting = jsonReader.getDataValue(jsonData, "history of bedwetting");
		String historyofHeadache = jsonReader.getDataValue(jsonData, "history of headache");
		String historyOfAsthma = jsonReader.getDataValue(jsonData, "history of asthma");
		String problemsWithVision = jsonReader.getDataValue(jsonData, "problems with his vision");
		String problemsWithHearing = jsonReader.getDataValue(jsonData, "problems with his hearing");
		String anySurgeries = jsonReader.getDataValue(jsonData, "had any surgeries");
		String motorMilestonesOnTime = jsonReader.getDataValue(jsonData, "motor milestones on time");
		String socioAdaptiveSkills = jsonReader.getDataValue(jsonData, "problems with his/her socio-adaptive skills");
		String speechMilestones = jsonReader.getDataValue(jsonData, "speech milestones");
		String childsDexterity = jsonReader.getDataValue(jsonData, "child's dexterity");
		String academicDifficultiesInFamily = jsonReader.getDataValue(jsonData, "academic difficulties in the family");
		String typeOfFamily = jsonReader.getDataValue(jsonData, "type Of Family");

		spedUtility.clickByXpath("//*[@data-option='" + history + "']");
		spedUtility.click(nextBtn);

		spedUtility.clickByXpath("//*[@data-option='" + historyOfMeningitis + "']");
		spedUtility.click(nextBtn);

		spedUtility.clickByXpath("//*[@data-option='" + historyOfHeadInjury + "']");
		spedUtility.click(nextBtn);

		spedUtility.clickByXpath("//*[@data-option='" + historyOfBedwetting + "']");
		spedUtility.click(nextBtn);

		spedUtility.clickByXpath("//*[@data-option='" + historyofHeadache + "']");
		spedUtility.click(nextBtn);

		spedUtility.clickByXpath("//*[@data-option='" + historyOfAsthma + "']");
		spedUtility.click(nextBtn);

		spedUtility.clickByXpath("//*[@data-option='" + problemsWithVision + "']");
		spedUtility.click(nextBtn);

		spedUtility.clickByXpath("//*[@data-option='" + problemsWithHearing + "']");
		spedUtility.click(nextBtn);

		spedUtility.clickByXpath("//*[@data-option='" + anySurgeries + "']");
		spedUtility.click(nextBtn);

		spedUtility.clickByXpath("//*[@data-option='" + motorMilestonesOnTime + "']");
		spedUtility.click(nextBtn);

		spedUtility.clickByXpath("//*[@data-option='" + socioAdaptiveSkills + "']");
		spedUtility.click(nextBtn);

		spedUtility.clickByXpath("//*[@data-option='" + speechMilestones + "']");
		spedUtility.click(nextBtn);

		spedUtility.selectFromDropdwonByText(assesmentInfoDrpdwn, childsDexterity);
		spedUtility.click(nextBtn);

		spedUtility.clickByXpath("//*[@data-option='" + academicDifficultiesInFamily + "']");
		spedUtility.click(nextBtn);

		spedUtility.clickByXpath("//*[@data-option='" + typeOfFamily + "']");
		spedUtility.click(nextBtn);

		spedUtility.click(reviewBtn);

	}

	public void verifyTestAssignedOnSectionPage(String assesmentType) {
		if (assesmentType.equalsIgnoreCase("Behavioural Assessment")) {
			List<WebElement> assignedTests = this.driver
					.findElements(By.xpath("//*[text()='" + assesmentType + "']/following::ul[1]//li"));
			if (assignedTests.size() == 6) {
				System.out.println("All Assigned tests are displayed on section page");
			}
		} else {

		}
	}

	public void completeBehaviouralAssesment(String testNumber) throws FileNotFoundException, IOException, ParseException {
		if(testNumber.equals("Test1")) {
			jsonData = jsonReader.readJson("BehaviouralAssesment" + testNumber, "QA");
			String payAttentionToDetails = jsonReader.getDataValue(jsonData, "Pay attention to details");
			String difficultyKeepingAttention = jsonReader.getDataValue(jsonData, "Difficulty keeping attention");
			String doesNotListenWhenSpokenDirectly = jsonReader.getDataValue(jsonData,
					"Does not listen when spoken directly");
			String doesNotFollowThroughWhenGivenDirections = jsonReader.getDataValue(jsonData,
					"Does not follow through when given directions");
			String difficultyOrganisingTasks = jsonReader.getDataValue(jsonData, " Difficulty organising tasks");
			String avoidTasks = jsonReader.getDataValue(jsonData, "start tasks that require ongoing mental effort");
			String losesThingsNecessaryForTasks = jsonReader.getDataValue(jsonData, "Loses things necessary for tasks");
			String easilyDistracted = jsonReader.getDataValue(jsonData, "Easily distracted");
			String forgetfulInDailyActivities = jsonReader.getDataValue(jsonData, "Forgetful in daily activities");

			spedUtility.selectFromDropdwonByText(assesmentInfoDrpdwn, payAttentionToDetails);
			spedUtility.click(nextBtn);

			spedUtility.selectFromDropdwonByText(assesmentInfoDrpdwn, difficultyKeepingAttention);
			spedUtility.click(nextBtn);

			spedUtility.selectFromDropdwonByText(assesmentInfoDrpdwn, doesNotListenWhenSpokenDirectly);
			spedUtility.click(nextBtn);

			spedUtility.clickByXpath("//*[@data-option='" + doesNotFollowThroughWhenGivenDirections + "']");
			spedUtility.click(nextBtn);

			spedUtility.selectFromDropdwonByText(assesmentInfoDrpdwn, difficultyOrganisingTasks);
			spedUtility.click(nextBtn);

			spedUtility.selectFromDropdwonByText(assesmentInfoDrpdwn, avoidTasks);
			spedUtility.click(nextBtn);

			spedUtility.selectFromDropdwonByText(assesmentInfoDrpdwn, losesThingsNecessaryForTasks);
			spedUtility.click(nextBtn);

			spedUtility.selectFromDropdwonByText(assesmentInfoDrpdwn, easilyDistracted);
			spedUtility.click(nextBtn);

			spedUtility.selectFromDropdwonByText(assesmentInfoDrpdwn, forgetfulInDailyActivities);
			spedUtility.click(nextBtn);
		}
		if(testNumber.equals("Test2")) {
			jsonData = jsonReader.readJson("BehaviouralAssesment" + testNumber, "QA");
			String FidgetsWithHands = jsonReader.getDataValue(jsonData, "Fidgets with hands or feet or squirms in seat");
			String leavesSeat = jsonReader.getDataValue(jsonData, "Leaves seat when remaining seated is expected");
			String runAbout = jsonReader.getDataValue(jsonData,
					"Runs about or climbs too much");
			String hasDifficultyPlayingQuietPlay = jsonReader.getDataValue(jsonData,
					"Has difficulty playing or beginning quiet play activities");
			String drivenByMotor = jsonReader.getDataValue(jsonData, "Acts as if 'driven by a motor'");
			String talksTooMuch = jsonReader.getDataValue(jsonData, "Talks too much");
			String blurtsOutAnswers = jsonReader.getDataValue(jsonData, "Blurts out answers");
			String hasDifficultyWaiting = jsonReader.getDataValue(jsonData, "Has difficulty waiting");
			String interruptsIntrudes = jsonReader.getDataValue(jsonData, "Interrupts or intrudes in on other's conversations");

			spedUtility.selectFromDropdwonByText(assesmentInfoDrpdwn, FidgetsWithHands);
			spedUtility.click(nextBtn);

			spedUtility.selectFromDropdwonByText(assesmentInfoDrpdwn, leavesSeat);
			spedUtility.click(nextBtn);

			spedUtility.selectFromDropdwonByText(assesmentInfoDrpdwn, runAbout);
			spedUtility.click(nextBtn);

			spedUtility.selectFromDropdwonByText(assesmentInfoDrpdwn, hasDifficultyPlayingQuietPlay);
			spedUtility.click(nextBtn);

			spedUtility.selectFromDropdwonByText(assesmentInfoDrpdwn, drivenByMotor);
			spedUtility.click(nextBtn);

			spedUtility.selectFromDropdwonByText(assesmentInfoDrpdwn, talksTooMuch);
			spedUtility.click(nextBtn);

			spedUtility.selectFromDropdwonByText(assesmentInfoDrpdwn, blurtsOutAnswers);
			spedUtility.click(nextBtn);

			spedUtility.selectFromDropdwonByText(assesmentInfoDrpdwn, hasDifficultyWaiting);
			spedUtility.click(nextBtn);
			
			spedUtility.selectFromDropdwonByText(assesmentInfoDrpdwn, interruptsIntrudes);
			spedUtility.click(nextBtn);
		}
		if(testNumber.equals("Test3")) {
			jsonData = jsonReader.readJson("BehaviouralAssesment" + testNumber, "QA");
			String arguesWithAdults = jsonReader.getDataValue(jsonData, "Argues with adults");
			String losesTemper = jsonReader.getDataValue(jsonData, "Loses temper");
			String activelyDefiesOrRefusesToGo = jsonReader.getDataValue(jsonData,
					"Actively defies or refuses to go");
			String deliberatelyAnnoysPeople = jsonReader.getDataValue(jsonData,
					"Deliberately annoys people");
			String blamesOthers = jsonReader.getDataValue(jsonData, "Blames others for his or her mistakes");
			String easilyAnnoyedByOthers = jsonReader.getDataValue(jsonData, "Easily annoyed by others");
			String isAngryOrResentful = jsonReader.getDataValue(jsonData, "Is angry or resentful");
			String isSpiteful = jsonReader.getDataValue(jsonData, "Is spiteful and wants to get even");

			spedUtility.selectFromDropdwonByText(assesmentInfoDrpdwn, arguesWithAdults);
			spedUtility.click(nextBtn);

			spedUtility.selectFromDropdwonByText(assesmentInfoDrpdwn, losesTemper);
			spedUtility.click(nextBtn);

			spedUtility.selectFromDropdwonByText(assesmentInfoDrpdwn, activelyDefiesOrRefusesToGo);
			spedUtility.click(nextBtn);

			spedUtility.clickByXpath("//*[@data-option='" + deliberatelyAnnoysPeople + "']");
			spedUtility.click(nextBtn);


			spedUtility.selectFromDropdwonByText(assesmentInfoDrpdwn, blamesOthers);
			spedUtility.click(nextBtn);

			spedUtility.selectFromDropdwonByText(assesmentInfoDrpdwn, easilyAnnoyedByOthers);
			spedUtility.click(nextBtn);

			spedUtility.selectFromDropdwonByText(assesmentInfoDrpdwn, isAngryOrResentful);
			spedUtility.click(nextBtn);

			spedUtility.selectFromDropdwonByText(assesmentInfoDrpdwn, isSpiteful);
			spedUtility.click(nextBtn);
		}
		if(testNumber.equals("Test4")) {
			jsonData = jsonReader.readJson("BehaviouralAssesment" + testNumber, "QA");
			String bulliesThreatens = jsonReader.getDataValue(jsonData, "Bullies, threatens or intimidates others");
			String startsPhysicalFights = jsonReader.getDataValue(jsonData, "Starts physical fights");
			String liesTogetOutOfTrouble = jsonReader.getDataValue(jsonData,
					"Lies to get out of trouble");
			String isTruantFromSchool = jsonReader.getDataValue(jsonData,
					"Is truant from school");
			String isPhysicallyCruel = jsonReader.getDataValue(jsonData, "Is physically cruel to people");
			String hasStolenThings = jsonReader.getDataValue(jsonData, "Has stolen things that have value");
			String deliberatelyDestroysOthersProperty = jsonReader.getDataValue(jsonData, "Deliberately destroys others' property");
			String hasUsedWeapon = jsonReader.getDataValue(jsonData, "Has used a weapon");
			String isPhysicallyCruelToAnimals = jsonReader.getDataValue(jsonData, "Is physically cruel to animals");
			String hasDeliberatelySetFires = jsonReader.getDataValue(jsonData, "Has deliberately set fires");
			String hasBrokenIntoSomeoneHome = jsonReader.getDataValue(jsonData, "Has broken into someone else's home");
			String hasStayedOutAtNight = jsonReader.getDataValue(jsonData, "Has stayed out at night");
			
			String hasRunAway = jsonReader.getDataValue(jsonData, "Has run away from home overnight");
			String forcedIntoSexualActivity = jsonReader.getDataValue(jsonData, "Has forced someone into sexual activity");
			

			spedUtility.selectFromDropdwonByText(assesmentInfoDrpdwn, bulliesThreatens);
			spedUtility.click(nextBtn);

			spedUtility.selectFromDropdwonByText(assesmentInfoDrpdwn, startsPhysicalFights);
			spedUtility.click(nextBtn);

			spedUtility.selectFromDropdwonByText(assesmentInfoDrpdwn, liesTogetOutOfTrouble);
			spedUtility.click(nextBtn);

			spedUtility.selectFromDropdwonByText(assesmentInfoDrpdwn, isTruantFromSchool);
			spedUtility.click(nextBtn);

			spedUtility.selectFromDropdwonByText(assesmentInfoDrpdwn, isPhysicallyCruel);
			spedUtility.click(nextBtn);

			spedUtility.selectFromDropdwonByText(assesmentInfoDrpdwn, hasStolenThings);
			spedUtility.click(nextBtn);

			spedUtility.selectFromDropdwonByText(assesmentInfoDrpdwn, deliberatelyDestroysOthersProperty);
			spedUtility.click(nextBtn);
			
			spedUtility.selectFromDropdwonByText(assesmentInfoDrpdwn, hasUsedWeapon);
			spedUtility.click(nextBtn);

			spedUtility.selectFromDropdwonByText(assesmentInfoDrpdwn, isPhysicallyCruelToAnimals);
			spedUtility.click(nextBtn);

			spedUtility.selectFromDropdwonByText(assesmentInfoDrpdwn, hasDeliberatelySetFires);
			spedUtility.click(nextBtn);

			spedUtility.selectFromDropdwonByText(assesmentInfoDrpdwn, hasBrokenIntoSomeoneHome);
			spedUtility.click(nextBtn);

			spedUtility.selectFromDropdwonByText(assesmentInfoDrpdwn, hasStayedOutAtNight);
			spedUtility.click(nextBtn);

			spedUtility.selectFromDropdwonByText(assesmentInfoDrpdwn, hasRunAway);
			spedUtility.click(nextBtn);

			spedUtility.selectFromDropdwonByText(assesmentInfoDrpdwn, forcedIntoSexualActivity);
			spedUtility.click(nextBtn);
		}
		if(testNumber.equals("Test5")) {
			jsonData = jsonReader.readJson("BehaviouralAssesment" + testNumber, "QA");
			String isFearfulAnxiousWorried = jsonReader.getDataValue(jsonData, "Is fearful, anxious, or worried");
			String isAfraidToTryNewThings = jsonReader.getDataValue(jsonData, "Is afraid to try new things");
			String feelsWorthless = jsonReader.getDataValue(jsonData,
					"Feels worthless or inferior");
			String blamesSelfForProblems = jsonReader.getDataValue(jsonData,
					"Blames self for problems");
			String feelsLonelyUnwantedOrUnloved = jsonReader.getDataValue(jsonData, "Feels lonely, unwanted, or unloved");
			String isSadUnhappy = jsonReader.getDataValue(jsonData, "Is sad, unhappy, or depressed");
			String isSelfConscious = jsonReader.getDataValue(jsonData, "Is self-conscious");

			spedUtility.selectFromDropdwonByText(assesmentInfoDrpdwn, isFearfulAnxiousWorried);
			spedUtility.click(nextBtn);

			spedUtility.selectFromDropdwonByText(assesmentInfoDrpdwn, isAfraidToTryNewThings);
			spedUtility.click(nextBtn);

			spedUtility.selectFromDropdwonByText(assesmentInfoDrpdwn, feelsWorthless);
			spedUtility.click(nextBtn);

			spedUtility.selectFromDropdwonByText(assesmentInfoDrpdwn, blamesSelfForProblems);
			spedUtility.click(nextBtn);

			spedUtility.selectFromDropdwonByText(assesmentInfoDrpdwn, blamesSelfForProblems);
			spedUtility.click(nextBtn);

			spedUtility.selectFromDropdwonByText(assesmentInfoDrpdwn, feelsLonelyUnwantedOrUnloved);
			spedUtility.click(nextBtn);

			spedUtility.selectFromDropdwonByText(assesmentInfoDrpdwn, isSadUnhappy);
			spedUtility.click(nextBtn);
			
			spedUtility.selectFromDropdwonByText(assesmentInfoDrpdwn, isSelfConscious);
			spedUtility.click(nextBtn);
		}
		if(testNumber.equals("Test6")) {
			jsonData = jsonReader.readJson("BehaviouralAssesment" + testNumber, "QA");
			String poorEyeContact = jsonReader.getDataValue(jsonData, "Has poor eye contact");
			String lacksSocialSmiles = jsonReader.getDataValue(jsonData, "Lacks social smiles");
			String remainsAloof = jsonReader.getDataValue(jsonData,
					"Remains aloof");
			String doesNotReachOutOthers = jsonReader.getDataValue(jsonData,
					"Does not reach out to others");
			String unableToRelateToPeople = jsonReader.getDataValue(jsonData, "Unable to relate to people");
			String unableToRespond = jsonReader.getDataValue(jsonData, "Unable to respond to social/environmental cues");
			String engagesInSolitary = jsonReader.getDataValue(jsonData, "Engages in solitary and repetitive play activities");
			String unableToTakeTurns = jsonReader.getDataValue(jsonData, "Unable to take turns");
			String doesNotMaintaiRelationships = jsonReader.getDataValue(jsonData, "Does not maintain peer relationships");
			String showsInappropriateEmotionalResponse = jsonReader.getDataValue(jsonData,
					"Shows inappropriate emotional response");
			String showsExaggeratedEmotions = jsonReader.getDataValue(jsonData,
					"Shows exaggerated emotions");
			String question12 = jsonReader.getDataValue(jsonData, "Engages in self-stimulating emotions");
			String question13 = jsonReader.getDataValue(jsonData, "Lacks fear of danger");
			String question14 = jsonReader.getDataValue(jsonData, "Excited or agitated for no apparent reason");
			String question15 = jsonReader.getDataValue(jsonData, "Acquired speech and lost it");
			String question16 = jsonReader.getDataValue(jsonData, "Has difficulty in using non-verbal language");
			String question17 = jsonReader.getDataValue(jsonData, "Engages in stereotyped and repetitive use of language");
			String question18 = jsonReader.getDataValue(jsonData, "Engages in echolalic speech");
			String question19 = jsonReader.getDataValue(jsonData, "Produces infantile squeals/unusual noises");
			String question20 = jsonReader.getDataValue(jsonData, "Unable to initiate or sustain conversation");
			String question21 = jsonReader.getDataValue(jsonData, "Uses jargon or meaningless words");
			String question22 = jsonReader.getDataValue(jsonData, "Uses pronoun reversals");
			String question23 = jsonReader.getDataValue(jsonData, "Unable to grasp pragmatics of communication");
			String question24 = jsonReader.getDataValue(jsonData, "Engages in stereotyped and repetitive motor mannerisms");
			String question25 = jsonReader.getDataValue(jsonData, "Shows attachment to inanimate objects");
			String question26 = jsonReader.getDataValue(jsonData, "Shows hyperactivity/restlessness");
			String question27 = jsonReader.getDataValue(jsonData, "Exhibits aggressive behaviour");
			String question28 = jsonReader.getDataValue(jsonData, "Throws temper tantrums");
			String question29 = jsonReader.getDataValue(jsonData, "Engages in self-injurious behaviour");
			String question30 = jsonReader.getDataValue(jsonData, "Insists on sameness");
			
			String question31 = jsonReader.getDataValue(jsonData, "Unusually sensitive to sensory stimuli");
			String question32 = jsonReader.getDataValue(jsonData, "Stares into space for long periods of time");
			String question33 = jsonReader.getDataValue(jsonData, "Has difficulty in tracking objects");
			String question34 = jsonReader.getDataValue(jsonData, "Has unusual vision");
			String question35 = jsonReader.getDataValue(jsonData, "Insensitive to pain");
			String question36 = jsonReader.getDataValue(jsonData, "Responds to objects/people unusually");
			String question37 = jsonReader.getDataValue(jsonData, "Inconsistent attention and concentration");
			String question38 = jsonReader.getDataValue(jsonData, "Shows delay in responding");
			String question39 = jsonReader.getDataValue(jsonData, "Has unusual memory of some kind");
			String question40 = jsonReader.getDataValue(jsonData, "Has 'savant' ability");

			spedUtility.selectFromDropdwonByText(assesmentInfoDrpdwn, poorEyeContact);
			spedUtility.click(nextBtn);

			spedUtility.selectFromDropdwonByText(assesmentInfoDrpdwn, lacksSocialSmiles);
			spedUtility.click(nextBtn);

			spedUtility.selectFromDropdwonByText(assesmentInfoDrpdwn, remainsAloof);
			spedUtility.click(nextBtn);

			spedUtility.selectFromDropdwonByText(assesmentInfoDrpdwn, doesNotReachOutOthers);
			spedUtility.click(nextBtn);

			spedUtility.selectFromDropdwonByText(assesmentInfoDrpdwn, unableToRelateToPeople);
			spedUtility.click(nextBtn);

			spedUtility.selectFromDropdwonByText(assesmentInfoDrpdwn, unableToRespond);
			spedUtility.click(nextBtn);

			spedUtility.selectFromDropdwonByText(assesmentInfoDrpdwn, engagesInSolitary);
			spedUtility.click(nextBtn);
			
			spedUtility.selectFromDropdwonByText(assesmentInfoDrpdwn, unableToTakeTurns);
			spedUtility.click(nextBtn);
			
			spedUtility.selectFromDropdwonByText(assesmentInfoDrpdwn, doesNotMaintaiRelationships);
			spedUtility.click(nextBtn);

			spedUtility.selectFromDropdwonByText(assesmentInfoDrpdwn, showsInappropriateEmotionalResponse);
			spedUtility.click(nextBtn);

			spedUtility.selectFromDropdwonByText(assesmentInfoDrpdwn, showsExaggeratedEmotions);
			spedUtility.click(nextBtn);

			spedUtility.selectFromDropdwonByText(assesmentInfoDrpdwn, question12);
			spedUtility.click(nextBtn);

			spedUtility.selectFromDropdwonByText(assesmentInfoDrpdwn, question13);
			spedUtility.click(nextBtn);

			spedUtility.selectFromDropdwonByText(assesmentInfoDrpdwn, question14);
			spedUtility.click(nextBtn);

			spedUtility.selectFromDropdwonByText(assesmentInfoDrpdwn, question15);
			spedUtility.click(nextBtn);
			
			spedUtility.selectFromDropdwonByText(assesmentInfoDrpdwn, question16);
			spedUtility.click(nextBtn);
			
			spedUtility.selectFromDropdwonByText(assesmentInfoDrpdwn, question17);
			spedUtility.click(nextBtn);

			spedUtility.selectFromDropdwonByText(assesmentInfoDrpdwn, question18);
			spedUtility.click(nextBtn);

			spedUtility.selectFromDropdwonByText(assesmentInfoDrpdwn, question19);
			spedUtility.click(nextBtn);

			spedUtility.selectFromDropdwonByText(assesmentInfoDrpdwn, question20);
			spedUtility.click(nextBtn);
			
			spedUtility.selectFromDropdwonByText(assesmentInfoDrpdwn, question21);
			spedUtility.click(nextBtn);
			
			spedUtility.selectFromDropdwonByText(assesmentInfoDrpdwn, question22);
			spedUtility.click(nextBtn);

			spedUtility.selectFromDropdwonByText(assesmentInfoDrpdwn, question23);
			spedUtility.click(nextBtn);

			spedUtility.selectFromDropdwonByText(assesmentInfoDrpdwn, question24);
			spedUtility.click(nextBtn);

			spedUtility.selectFromDropdwonByText(assesmentInfoDrpdwn, question25);
			spedUtility.click(nextBtn);
			
			spedUtility.selectFromDropdwonByText(assesmentInfoDrpdwn, question26);
			spedUtility.click(nextBtn);
			
			spedUtility.selectFromDropdwonByText(assesmentInfoDrpdwn, question27);
			spedUtility.click(nextBtn);

			spedUtility.selectFromDropdwonByText(assesmentInfoDrpdwn, question28);
			spedUtility.click(nextBtn);

			spedUtility.selectFromDropdwonByText(assesmentInfoDrpdwn, question29);
			spedUtility.click(nextBtn);

			spedUtility.selectFromDropdwonByText(assesmentInfoDrpdwn, question30);
			spedUtility.click(nextBtn);
			
			spedUtility.selectFromDropdwonByText(assesmentInfoDrpdwn, question31);
			spedUtility.click(nextBtn);
			
			spedUtility.selectFromDropdwonByText(assesmentInfoDrpdwn, question32);
			spedUtility.click(nextBtn);

			spedUtility.selectFromDropdwonByText(assesmentInfoDrpdwn, question33);
			spedUtility.click(nextBtn);

			spedUtility.selectFromDropdwonByText(assesmentInfoDrpdwn, question34);
			spedUtility.click(nextBtn);

			spedUtility.selectFromDropdwonByText(assesmentInfoDrpdwn, question35);
			spedUtility.click(nextBtn);
			
			spedUtility.selectFromDropdwonByText(assesmentInfoDrpdwn, question36);
			spedUtility.click(nextBtn);
			
			spedUtility.selectFromDropdwonByText(assesmentInfoDrpdwn, question37);
			spedUtility.click(nextBtn);

			spedUtility.selectFromDropdwonByText(assesmentInfoDrpdwn, question38);
			spedUtility.click(nextBtn);

			spedUtility.selectFromDropdwonByText(assesmentInfoDrpdwn, question39);
			spedUtility.click(nextBtn);

			spedUtility.selectFromDropdwonByText(assesmentInfoDrpdwn, question40);
			spedUtility.click(nextBtn);
		}
	}
	
	public void completeOTScreening (String areaNumber, String subAreanumber) {
		if(areaNumber.equals("Area1")){
			if(subAreanumber.equals("SubArea1")){
				String question1 = jsonReader.getDataValue(jsonData, "Does the child avoid touching certain textures"); 
				String question2 = jsonReader.getDataValue(jsonData, "Does the child resist friendly or affectionate touch"); 
				String question3 = jsonReader.getDataValue(jsonData, "Does the child refuse to walk barefoot"); 
				String question4 = jsonReader.getDataValue(jsonData, "Is the child distressed about having hair"); 
				String question5 = jsonReader.getDataValue(jsonData, "Does the child avoid/dislike/aversive to messy play"); 
				String question6 = jsonReader.getDataValue(jsonData, "Does the child thoroughly enjoy or wants to have messy play with sand, mud, water, glue etc?"); 
				String question7 = jsonReader.getDataValue(jsonData, "Is the child not aware that their hands or face are dirty");
				String question8 = jsonReader.getDataValue(jsonData, "Does the child crave touch");
				String question9 = jsonReader.getDataValue(jsonData, "Is the child not bothered by injuries");
				String question10 = jsonReader.getDataValue(jsonData, "Is the child unable to identify objects only by feeling them");
				String question11 = jsonReader.getDataValue(jsonData, "Is the child unable to identify which part of their body was touched"); 
				String question12 = jsonReader.getDataValue(jsonData, "Does the child have difficulty figuring out physical characteristics of objects using touch"); 
				
				spedUtility.clickByXpath("//*[@data-option='" + question1 + "']");
				spedUtility.click(nextBtn);
				
				spedUtility.clickByXpath("//*[@data-option='" + question2 + "']");
				spedUtility.click(nextBtn);
				
				spedUtility.clickByXpath("//*[@data-option='" + question3 + "']");
				spedUtility.click(nextBtn);
				
				spedUtility.clickByXpath("//*[@data-option='" + question4 + "']");
				spedUtility.click(nextBtn);
				
				spedUtility.clickByXpath("//*[@data-option='" + question5 + "']");
				spedUtility.click(nextBtn);
				
				spedUtility.clickByXpath("//*[@data-option='" + question6 + "']");
				spedUtility.click(nextBtn);
				
				spedUtility.clickByXpath("//*[@data-option='" + question7 + "']");
				spedUtility.click(nextBtn);
				
				spedUtility.clickByXpath("//*[@data-option='" + question8 + "']");
				spedUtility.click(nextBtn);
				
				spedUtility.clickByXpath("//*[@data-option='" + question9 + "']");
				spedUtility.click(nextBtn);
				
				spedUtility.clickByXpath("//*[@data-option='" + question10 + "']");
				spedUtility.click(nextBtn);
				
				spedUtility.clickByXpath("//*[@data-option='" + question11 + "']");
				spedUtility.click(nextBtn);
				
				spedUtility.clickByXpath("//*[@data-option='" + question12 + "']");
				spedUtility.click(nextBtn);
			}
			if(subAreanumber.equals("SubArea3")){
				String question1 = jsonReader.getDataValue(jsonData, "Does the child grind his/her teeth throughout the day?"); 
				String question2 = jsonReader.getDataValue(jsonData, "Does the child have toe walking?"); 
				String question3 = jsonReader.getDataValue(jsonData, "Does the child love jumping off from furniture or from high places"); 
				String question4 = jsonReader.getDataValue(jsonData, "Does the child seem to do everything with too much force"); 
				String question5 = jsonReader.getDataValue(jsonData, "Does the child often rip/tear the paper while erasing"); 
				String question6 = jsonReader.getDataValue(jsonData, "Does the child have difficulty regulating pressure when writing/drawing"); 
				
				
				spedUtility.clickByXpath("//*[@data-option='" + question1 + "']");
				spedUtility.click(nextBtn);
				
				spedUtility.clickByXpath("//*[@data-option='" + question2 + "']");
				spedUtility.click(nextBtn);
				
				spedUtility.clickByXpath("//*[@data-option='" + question3 + "']");
				spedUtility.click(nextBtn);
				
				spedUtility.clickByXpath("//*[@data-option='" + question4 + "']");
				spedUtility.click(nextBtn);
				
				spedUtility.clickByXpath("//*[@data-option='" + question5 + "']");
				spedUtility.click(nextBtn);
				
				spedUtility.clickByXpath("//*[@data-option='" + question6 + "']");
				spedUtility.click(nextBtn);
			}
			if(subAreanumber.equals("SubArea4")){
				String question1 = jsonReader.getDataValue(jsonData, "Does the child rub his/her eyes, has watery eyes or gets headaches after reading or watching TV"); 
				String question2 = jsonReader.getDataValue(jsonData, "Is the child sensitive to bright lights; will squint, cover eyes, cry and/or get headache from lights"); 
				String question3 = jsonReader.getDataValue(jsonData, "Is the child easily distracted by other visual stimuli in the room"); 
				String question4 = jsonReader.getDataValue(jsonData, "Does the child have difficulty locating items among other items"); 
				String question5 = jsonReader.getDataValue(jsonData, "Does the child have difficulty finding differences in pictures, words, symbols, or objects"); 
				String question6 = jsonReader.getDataValue(jsonData, "Does the child have difficulty telling the difference between similar printed letters or figures"); 
				
				
				spedUtility.clickByXpath("//*[@data-option='" + question1 + "']");
				spedUtility.click(nextBtn);
				
				spedUtility.clickByXpath("//*[@data-option='" + question2 + "']");
				spedUtility.click(nextBtn);
				
				spedUtility.clickByXpath("//*[@data-option='" + question3 + "']");
				spedUtility.click(nextBtn);
				
				spedUtility.clickByXpath("//*[@data-option='" + question4 + "']");
				spedUtility.click(nextBtn);
				
				spedUtility.clickByXpath("//*[@data-option='" + question5 + "']");
				spedUtility.click(nextBtn);
				
				spedUtility.clickByXpath("//*[@data-option='" + question6 + "']");
				spedUtility.click(nextBtn);
			}
			if(subAreanumber.equals("SubArea5")){
				String question1 = jsonReader.getDataValue(jsonData, "Does the child run away, cry, and/or covers ears around loud or unexpected sounds"); 
				String question2 = jsonReader.getDataValue(jsonData, "Is the child fearful of sounds of vacuum, hairdryer, mixer, drilling machine, fire crackers"); 
				String question3 = jsonReader.getDataValue(jsonData, "Is the child distracted by sounds not normally noticed by others"); 
				String question4 = jsonReader.getDataValue(jsonData, "Does the child love excessively loud music or TV"); 
				String question5 = jsonReader.getDataValue(jsonData, "Does the child often not respond to verbal cues or to their name when called"); 
				spedUtility.clickByXpath("//*[@data-option='" + question1 + "']");
				spedUtility.click(nextBtn);
				
				spedUtility.clickByXpath("//*[@data-option='" + question2 + "']");
				spedUtility.click(nextBtn);
				
				spedUtility.clickByXpath("//*[@data-option='" + question3 + "']");
				spedUtility.click(nextBtn);
				
				spedUtility.clickByXpath("//*[@data-option='" + question4 + "']");
				spedUtility.click(nextBtn);
				
				spedUtility.clickByXpath("//*[@data-option='" + question5 + "']");
				spedUtility.click(nextBtn);
			}
			if(subAreanumber.equals("SubArea6")){
				String question1 = jsonReader.getDataValue(jsonData, "Is the child a picky eater, has extreme food preferences"); 
				String question2 = jsonReader.getDataValue(jsonData, "Does the child have difficulty with sucking, chewing, and swallowing"); 
				String question3 = jsonReader.getDataValue(jsonData, "Does the child resist/ refuse/ is extremely fearful of going to the dentist or having dental work done"); 
				String question4 = jsonReader.getDataValue(jsonData, "Does the child prefer foods with intense flavour");
				String question5 = jsonReader.getDataValue(jsonData, "Does the child lick, taste, or chew inedible objects");
				String question6 = jsonReader.getDataValue(jsonData, "Does the child have excessive drooling after the teething stage");
				spedUtility.clickByXpath("//*[@data-option='" + question1 + "']");
				spedUtility.click(nextBtn);
				
				spedUtility.clickByXpath("//*[@data-option='" + question2 + "']");
				spedUtility.click(nextBtn);
				
				spedUtility.clickByXpath("//*[@data-option='" + question3 + "']");
				spedUtility.click(nextBtn);
				
				spedUtility.clickByXpath("//*[@data-option='" + question4 + "']");
				spedUtility.click(nextBtn);
				
				spedUtility.clickByXpath("//*[@data-option='" + question5 + "']");
				spedUtility.click(nextBtn);
				
				spedUtility.clickByXpath("//*[@data-option='" + question6 + "']");
				spedUtility.click(nextBtn);
			}
			if(subAreanumber.equals("SubArea7")){
				String question1 = jsonReader.getDataValue(jsonData, "Is the child bothered/irritated by smell of perfume or cologne");
				String question2 = jsonReader.getDataValue(jsonData, "Does the child react negatively or dislikes smells which do not usually bother or noticed by other people");
				String question3 = jsonReader.getDataValue(jsonData, "Is the child bothered by household or cooking smell"); 
				String question4 = jsonReader.getDataValue(jsonData, "Does the child have difficulty discriminating or telling difference about unpleasant odours/smell");
				String question5 = jsonReader.getDataValue(jsonData, "Does the child make excessive use of smelling when introduced to objects, people, or places");
				String question6 = jsonReader.getDataValue(jsonData, "Does the child fail to notice or ignore unpleasant odours");
				spedUtility.clickByXpath("//*[@data-option='" + question1 + "']");
				spedUtility.click(nextBtn);
				
				spedUtility.clickByXpath("//*[@data-option='" + question2 + "']"); 
				spedUtility.click(nextBtn);
				
				spedUtility.clickByXpath("//*[@data-option='" + question3 + "']");
				spedUtility.click(nextBtn);
				
				spedUtility.clickByXpath("//*[@data-option='" + question4 + "']");
				spedUtility.click(nextBtn);
				
				spedUtility.clickByXpath("//*[@data-option='" + question5 + "']");
				spedUtility.click(nextBtn);
				
				spedUtility.clickByXpath("//*[@data-option='" + question6 + "']");
				spedUtility.click(nextBtn);
			}
		}
		if(areaNumber.equals("Area2")){
			String question1 = jsonReader.getDataValue(jsonData, "Does the child have difficulty discriminating between symbols"); 
			String question2 = jsonReader.getDataValue(jsonData, "Does the child misread, substitute or omit words"); 
			String question3 = jsonReader.getDataValue(jsonData, "Does the child show confusions between b/d, u/v, m/n, r/n, n/h, p/q/g"); 
			String question4 = jsonReader.getDataValue(jsonData, "Does the child lose his/her place when copying from the blackboard or textbook"); 
			String question5 = jsonReader.getDataValue(jsonData, "Does the child have difficulty picking out things in a complex picture"); 
			String question6 = jsonReader.getDataValue(jsonData, "Is the child unable to attend to individual words on an overcrowded page"); 
			String question7 = jsonReader.getDataValue(jsonData, "Does the child have difficulty setting up games correctly e.g. board facing the right way, all cards facing up");
			String question8 = jsonReader.getDataValue(jsonData, "Does the child confuses 'b', 'd', 'p', 'q', 'g' etc. in reading and spelling");
			String question9 = jsonReader.getDataValue(jsonData, "Does the child reverse numbers and figures when writing e.g. 'b' and 'd', 's' and '3'");
			String question10 = jsonReader.getDataValue(jsonData, "Does the child have poor grasp of spatial terms e.g. in, out, over, above, below, through, under, between etc.");
			String question11 = jsonReader.getDataValue(jsonData, "Does the child read from right to left e.g. mad for dam, tap for pat"); 
			String question12 = jsonReader.getDataValue(jsonData, "Does the child have difficulty reproducing numbers and shapes (can't visually recall them)");
			String question13 = jsonReader.getDataValue(jsonData, "Does the child get sequences of numbers incorrect e.g. 1459 as 1549"); 
			String question14 = jsonReader.getDataValue(jsonData, "Does the child have difficulty following a sequence of events to solve a problem"); 
			String question15 = jsonReader.getDataValue(jsonData, "Does the child make poor drawings in cultural subjects and geometry"); 
			String question16 = jsonReader.getDataValue(jsonData, "Does the child have poor handwriting (difficulty integrating different movements especially in cursive writing)"); 
			String question17 = jsonReader.getDataValue(jsonData, "Does the child have difficulty reproducing a figure, letter or numeral from the blackboard or a book"); 
			String question18 = jsonReader.getDataValue(jsonData, "Does the child have difficulty recognizing a word if presented in upper case as opposed to lowercase"); 
			String question19 = jsonReader.getDataValue(jsonData, "Does the child have a problem in recognising words/letters if written in different handwriting or style"); 
			String question20 = jsonReader.getDataValue(jsonData, "Does the child have difficulty projecting the idea of a shape onto something familiar to him/her e.g. a door is rectangular");
			
			String question21 = jsonReader.getDataValue(jsonData, "Does the child have difficulty distinguishing between similar forms"); 
			String question22 = jsonReader.getDataValue(jsonData, "Does the child show confusions with similar looking words");
			String question23 = jsonReader.getDataValue(jsonData, "Does the child have non-fluent reading (reads word by word)"); 
			String question24 = jsonReader.getDataValue(jsonData, "Does the child have difficulty combining phonic combinations to build a word"); 
			String question25 = jsonReader.getDataValue(jsonData, "Does the child have difficulty completing a drawing or letter if given only a part of that drawing/letter"); 
			
			
			spedUtility.clickByXpath("//*[@data-option='" + question1 + "']");
			spedUtility.click(nextBtn);
			
			spedUtility.clickByXpath("//*[@data-option='" + question2 + "']");
			spedUtility.click(nextBtn);
			
			spedUtility.clickByXpath("//*[@data-option='" + question3 + "']");
			spedUtility.click(nextBtn);
			
			spedUtility.clickByXpath("//*[@data-option='" + question4 + "']");
			spedUtility.click(nextBtn);
			
			spedUtility.clickByXpath("//*[@data-option='" + question5 + "']");
			spedUtility.click(nextBtn);
			
			spedUtility.clickByXpath("//*[@data-option='" + question6 + "']");
			spedUtility.click(nextBtn);
			
			spedUtility.clickByXpath("//*[@data-option='" + question7 + "']");
			spedUtility.click(nextBtn);
			
			spedUtility.clickByXpath("//*[@data-option='" + question8 + "']");
			spedUtility.click(nextBtn);
			
			spedUtility.clickByXpath("//*[@data-option='" + question9 + "']");
			spedUtility.click(nextBtn);
			
			spedUtility.clickByXpath("//*[@data-option='" + question10 + "']");
			spedUtility.click(nextBtn);
			
			spedUtility.clickByXpath("//*[@data-option='" + question11 + "']");
			spedUtility.click(nextBtn);
			
			spedUtility.clickByXpath("//*[@data-option='" + question12 + "']");
			spedUtility.click(nextBtn);
			
			spedUtility.clickByXpath("//*[@data-option='" + question13 + "']");
			spedUtility.click(nextBtn);
			
			spedUtility.clickByXpath("//*[@data-option='" + question14 + "']");
			spedUtility.click(nextBtn);
			
			spedUtility.clickByXpath("//*[@data-option='" + question15 + "']");
			spedUtility.click(nextBtn);
			
			spedUtility.clickByXpath("//*[@data-option='" + question16 + "']");
			spedUtility.click(nextBtn);
			
			spedUtility.clickByXpath("//*[@data-option='" + question17 + "']");
			spedUtility.click(nextBtn);
			
			spedUtility.clickByXpath("//*[@data-option='" + question18 + "']");
			spedUtility.click(nextBtn);
			
			spedUtility.clickByXpath("//*[@data-option='" + question19 + "']");
			spedUtility.click(nextBtn);
			
			spedUtility.clickByXpath("//*[@data-option='" + question20 + "']");
			spedUtility.click(nextBtn);
			
			spedUtility.clickByXpath("//*[@data-option='" + question21 + "']");
			spedUtility.click(nextBtn);
			
			spedUtility.clickByXpath("//*[@data-option='" + question22 + "']");
			spedUtility.click(nextBtn);
			
			spedUtility.clickByXpath("//*[@data-option='" + question23 + "']");
			spedUtility.click(nextBtn);
			
			spedUtility.clickByXpath("//*[@data-option='" + question24 + "']");
			spedUtility.click(nextBtn);
			
			spedUtility.clickByXpath("//*[@data-option='" + question25 + "']");
			spedUtility.click(nextBtn);
		}
		if(areaNumber.equals("Area3")){
			String question1 = jsonReader.getDataValue(jsonData, "Does the child follow home or school rules in the absence of an adult's immediate presence"); 
			String question2 = jsonReader.getDataValue(jsonData, "Does the child handle conflict with peers without getting into physical fights"); 
			String question3 = jsonReader.getDataValue(jsonData, "Can the child calm down or de-escalate quickly from an emotionally charged situation when prompted by an adult"); 
			String question4 = jsonReader.getDataValue(jsonData, "Does the child remember to follow a routine chore after school without reminders"); 
			String question5 = jsonReader.getDataValue(jsonData, "Does the child keep track of changing daily changing schedules (different activities after school)"); 
			String question6 = jsonReader.getDataValue(jsonData, "Does the child bring books, papers, assignments to and from school"); 
			String question7 = jsonReader.getDataValue(jsonData, "Does the child overreact to losing a game or not being selected for an award");
			String question8 = jsonReader.getDataValue(jsonData, "Does the child act with restraint in response to teasing");
			String question9 = jsonReader.getDataValue(jsonData, "Can the child accept not getting what he/she wants when working/playing in a group");
			String question10 = jsonReader.getDataValue(jsonData, "Can the child complete a chore that takes 30-60 minutes (may need a break)");
			String question11 = jsonReader.getDataValue(jsonData, "Is the child able to attend sports practice, extracurricular class, etc. for 60-90 minutes"); 
			String question12 = jsonReader.getDataValue(jsonData, "Can the child spend 30-60 minutes on homework assignments");
			String question13 = jsonReader.getDataValue(jsonData, "Is the child able to follow a three- to four-step routine that has been practiced"); 
			String question14 = jsonReader.getDataValue(jsonData, "Can the child follow established homework schedule (may need reminder to get started)"); 
			String question15 = jsonReader.getDataValue(jsonData, "Can the child complete three to four classroom assignments in a row"); 
			String question16 = jsonReader.getDataValue(jsonData, "Can the child carry out long-term projects for school, with most steps broken down by someone else"); 
			String question17 = jsonReader.getDataValue(jsonData, "Can the child figure out how to save money for a more expensive purchase"); 
			String question18 = jsonReader.getDataValue(jsonData, "Can the child make plans to do something special with a friend (e.g. friends get together/night over)"); 
			String question19 = jsonReader.getDataValue(jsonData, "Does the child keep track of homework materials and assignments"); 
			String question20 = jsonReader.getDataValue(jsonData, "Can the child put belongings in appropriate places in the bedroom or other locations in the house");
			
			String question21 = jsonReader.getDataValue(jsonData, "Does the child bring in toys from outdoors after use or at the end of day (may need a reminder)"); 
			String question22 = jsonReader.getDataValue(jsonData, "Can the child complete daily routines within reasonable time limits without assistance");
			String question23 = jsonReader.getDataValue(jsonData, "Can the child adjust homework schedule to allow for other activities"); 
			String question24 = jsonReader.getDataValue(jsonData, "Is the child able to start long-term projects enough in advance to reduce time crunch (may need help with this)"); 
			String question25 = jsonReader.getDataValue(jsonData, "Can the child maintain a hobby over several months");
			String question26 = jsonReader.getDataValue(jsonData, "Is the child able to follow a practice schedule to get better at a desired skill"); 
			String question27 = jsonReader.getDataValue(jsonData, "Can the child save allowance for 3-4 weeks to make a desired purchase");
			String question28 = jsonReader.getDataValue(jsonData, "Can the child 'shift gears' when plans have to change due to unforeseen circumstance"); 
			String question29 = jsonReader.getDataValue(jsonData, "Can the child do 'open-ended' homework assignments (may need assistance)"); 
			String question30 = jsonReader.getDataValue(jsonData, "Does the child 'get stuck' on things (e.g. disappointments, slights)");
			String question31 = jsonReader.getDataValue(jsonData, "Is the child able to anticipate in advance the result of a course of action and make adjustments accordingly"); 
			String question32 = jsonReader.getDataValue(jsonData, "Does the child enjoy the problem-solving component of school assignments or video games");
			String question33 = jsonReader.getDataValue(jsonData, "Can the child articulate several solutions to problems and explain the best one"); 
			
			spedUtility.selectFromDropdwonByText(assesmentInfoDrpdwn, question1);
			spedUtility.click(nextBtn);
			
			spedUtility.selectFromDropdwonByText(assesmentInfoDrpdwn, question2);
			spedUtility.click(nextBtn);

			spedUtility.selectFromDropdwonByText(assesmentInfoDrpdwn, question3);
			spedUtility.click(nextBtn);

			spedUtility.selectFromDropdwonByText(assesmentInfoDrpdwn, question4);
			spedUtility.click(nextBtn);

			spedUtility.selectFromDropdwonByText(assesmentInfoDrpdwn, question5);
			spedUtility.click(nextBtn);
			
			spedUtility.selectFromDropdwonByText(assesmentInfoDrpdwn, question6);
			spedUtility.click(nextBtn);
			
			spedUtility.selectFromDropdwonByText(assesmentInfoDrpdwn, question7);
			spedUtility.click(nextBtn);

			spedUtility.selectFromDropdwonByText(assesmentInfoDrpdwn, question8);
			spedUtility.click(nextBtn);

			spedUtility.selectFromDropdwonByText(assesmentInfoDrpdwn, question9);
			spedUtility.click(nextBtn);

			spedUtility.selectFromDropdwonByText(assesmentInfoDrpdwn, question10);
			spedUtility.click(nextBtn);
			
			spedUtility.selectFromDropdwonByText(assesmentInfoDrpdwn, question11);
			spedUtility.click(nextBtn);
			
			spedUtility.selectFromDropdwonByText(assesmentInfoDrpdwn, question12);
			spedUtility.click(nextBtn);

			spedUtility.selectFromDropdwonByText(assesmentInfoDrpdwn, question13);
			spedUtility.click(nextBtn);

			spedUtility.selectFromDropdwonByText(assesmentInfoDrpdwn, question14);
			spedUtility.click(nextBtn);

			spedUtility.selectFromDropdwonByText(assesmentInfoDrpdwn, question15);
			spedUtility.click(nextBtn);
			
			spedUtility.selectFromDropdwonByText(assesmentInfoDrpdwn, question16);
			spedUtility.click(nextBtn);
			
			spedUtility.selectFromDropdwonByText(assesmentInfoDrpdwn, question17);
			spedUtility.click(nextBtn);

			spedUtility.selectFromDropdwonByText(assesmentInfoDrpdwn, question18);
			spedUtility.click(nextBtn);

			spedUtility.selectFromDropdwonByText(assesmentInfoDrpdwn, question19);
			spedUtility.click(nextBtn);

			spedUtility.selectFromDropdwonByText(assesmentInfoDrpdwn, question20);
			spedUtility.click(nextBtn);
			
			spedUtility.selectFromDropdwonByText(assesmentInfoDrpdwn, question21);
			spedUtility.click(nextBtn);
			
			spedUtility.selectFromDropdwonByText(assesmentInfoDrpdwn, question22);
			spedUtility.click(nextBtn);

			spedUtility.selectFromDropdwonByText(assesmentInfoDrpdwn, question23);
			spedUtility.click(nextBtn);

			spedUtility.selectFromDropdwonByText(assesmentInfoDrpdwn, question24);
			spedUtility.click(nextBtn);

			spedUtility.selectFromDropdwonByText(assesmentInfoDrpdwn, question25);
			spedUtility.click(nextBtn);
			
			spedUtility.selectFromDropdwonByText(assesmentInfoDrpdwn, question26);
			spedUtility.click(nextBtn);
			
			spedUtility.selectFromDropdwonByText(assesmentInfoDrpdwn, question27);
			spedUtility.click(nextBtn);

			spedUtility.selectFromDropdwonByText(assesmentInfoDrpdwn, question28);
			spedUtility.click(nextBtn);

			spedUtility.selectFromDropdwonByText(assesmentInfoDrpdwn, question29);
			spedUtility.click(nextBtn);

			spedUtility.selectFromDropdwonByText(assesmentInfoDrpdwn, question30);
			spedUtility.click(nextBtn);
			
			spedUtility.selectFromDropdwonByText(assesmentInfoDrpdwn, question31);
			spedUtility.click(nextBtn);
			
			spedUtility.selectFromDropdwonByText(assesmentInfoDrpdwn, question32);
			spedUtility.click(nextBtn);

			spedUtility.selectFromDropdwonByText(assesmentInfoDrpdwn, question33);
			spedUtility.click(nextBtn);
		}
		if(areaNumber.equals("Area4")){
			String question1 = jsonReader.getDataValue(jsonData, "Does the child have trouble kicking a football"); 
			String question2 = jsonReader.getDataValue(jsonData, "Does the child fall easily"); 
			String question3 = jsonReader.getDataValue(jsonData, "Does the child have difficulty on unstable surfaces like skates"); 
			String question4 = jsonReader.getDataValue(jsonData, "Does the child bumps into chairs, desks"); 
			String question5 = jsonReader.getDataValue(jsonData, "Does the child avoid or have difficulty performing tasks which require extremities to cross the midline?"); 
			String question6 = jsonReader.getDataValue(jsonData, "Does the child have difficulty catching a ball thrown to him/her"); 
			String question7 = jsonReader.getDataValue(jsonData, "Does the child have difficulty clapping overhead");
			String question8 = jsonReader.getDataValue(jsonData, "Does the child have difficulty performing jumping jacks");
			String question9 = jsonReader.getDataValue(jsonData, "Does the child stabilize the paper with the other hand while writing");
			String question10 = jsonReader.getDataValue(jsonData, "Does the child prefer sedentary activities");
			String question11 = jsonReader.getDataValue(jsonData, "Does the child have difficulty in activities involving pushing or pulling"); 
			String question12 = jsonReader.getDataValue(jsonData, "Does the child have difficulty lifting heavy objects");
			String question13 = jsonReader.getDataValue(jsonData, "Does the child have difficulty with hopping, jumping, skipping or running, as compared to others his/her age"); 
			String question14 = jsonReader.getDataValue(jsonData, "Does the child hesitate to climb or play with playground equipment"); 
			String question15 = jsonReader.getDataValue(jsonData, "Is the child's hand dominance not well established (if he/she is above five years of age)"); 
			String question16 = jsonReader.getDataValue(jsonData, "Does the child have difficulty using scissors, colouring, writing"); 
			String question17 = jsonReader.getDataValue(jsonData, "Does the child hold the pencil/crayon too tightly or too lightly"); 
			String question18 = jsonReader.getDataValue(jsonData, "Does the child have difficulty manipulating small objects (pegs, beads, coins)"); 
			String question19 = jsonReader.getDataValue(jsonData, "Does the child have difficulty with buttoning, zipping, tying shoe laces"); 
			
			spedUtility.clickByXpath("//*[@data-option='" + question1 + "']");
			spedUtility.click(nextBtn);
			
			spedUtility.clickByXpath("//*[@data-option='" + question2 + "']");
			spedUtility.click(nextBtn);
			
			spedUtility.clickByXpath("//*[@data-option='" + question3 + "']");
			spedUtility.click(nextBtn);
			
			spedUtility.clickByXpath("//*[@data-option='" + question4 + "']");
			spedUtility.click(nextBtn);
			
			spedUtility.clickByXpath("//*[@data-option='" + question5 + "']");
			spedUtility.click(nextBtn);
			
			spedUtility.clickByXpath("//*[@data-option='" + question6 + "']");
			spedUtility.click(nextBtn);
			
			spedUtility.clickByXpath("//*[@data-option='" + question7 + "']");
			spedUtility.click(nextBtn);
			
			spedUtility.clickByXpath("//*[@data-option='" + question8 + "']");
			spedUtility.click(nextBtn);
			
			spedUtility.clickByXpath("//*[@data-option='" + question9 + "']");
			spedUtility.click(nextBtn);
			
			spedUtility.clickByXpath("//*[@data-option='" + question10 + "']");
			spedUtility.click(nextBtn);
			
			spedUtility.clickByXpath("//*[@data-option='" + question11 + "']");
			spedUtility.click(nextBtn);
			
			spedUtility.clickByXpath("//*[@data-option='" + question12 + "']");
			spedUtility.click(nextBtn);
			
			spedUtility.clickByXpath("//*[@data-option='" + question13 + "']");
			spedUtility.click(nextBtn);
			
			spedUtility.clickByXpath("//*[@data-option='" + question14 + "']");
			spedUtility.click(nextBtn);
			
			spedUtility.clickByXpath("//*[@data-option='" + question15 + "']");
			spedUtility.click(nextBtn);
			
			spedUtility.clickByXpath("//*[@data-option='" + question16 + "']");
			spedUtility.click(nextBtn);
			
			spedUtility.clickByXpath("//*[@data-option='" + question17 + "']");
			spedUtility.click(nextBtn);
			
			spedUtility.clickByXpath("//*[@data-option='" + question18 + "']");
			spedUtility.click(nextBtn);
			
			spedUtility.clickByXpath("//*[@data-option='" + question19 + "']");
			spedUtility.click(nextBtn);
		}
		if(areaNumber.equals("Area5")){
			String question1 = jsonReader.getDataValue(jsonData, "Does the child approach others but not know what to do next"); 
			String question2 = jsonReader.getDataValue(jsonData, "Does the child follow rules of the game"); 
			String question3 = jsonReader.getDataValue(jsonData, "Is the child more interested in objects than people"); 
			String question4 = jsonReader.getDataValue(jsonData, "Does the child interrupt others conversation or activity"); 
			String question5 = jsonReader.getDataValue(jsonData, "Does the child socialize better with older children or adults"); 
			String question6 = jsonReader.getDataValue(jsonData, "Does the child approach other children at a garden or a party"); 
			String question7 = jsonReader.getDataValue(jsonData, "Does the child show Inappropriate conduct in a social situation");
			
			spedUtility.clickByXpath("//*[@data-option='" + question1 + "']");
			spedUtility.click(nextBtn);
			
			spedUtility.clickByXpath("//*[@data-option='" + question2 + "']");
			spedUtility.click(nextBtn);
			
			spedUtility.clickByXpath("//*[@data-option='" + question3 + "']");
			spedUtility.click(nextBtn);
			
			spedUtility.clickByXpath("//*[@data-option='" + question4 + "']");
			spedUtility.click(nextBtn);
			
			spedUtility.clickByXpath("//*[@data-option='" + question5 + "']");
			spedUtility.click(nextBtn);
			
			spedUtility.clickByXpath("//*[@data-option='" + question6 + "']");
			spedUtility.click(nextBtn);
			
			spedUtility.clickByXpath("//*[@data-option='" + question7 + "']");
			spedUtility.click(nextBtn);
		}
		if(areaNumber.equals("Area6")){
			String question1 = jsonReader.getDataValue(jsonData, "Does the child use sounds instead of speech to communicate"); 
			String question2 = jsonReader.getDataValue(jsonData, "Does the child use only gestures"); 
			String question3 = jsonReader.getDataValue(jsonData, "Does the child engage in a two-way conversation"); 
			String question4 = jsonReader.getDataValue(jsonData, "Does the child repeat the same sounds/ words/ phrases out of context"); 
			String question5 = jsonReader.getDataValue(jsonData, "Does the child have clear pronunciation"); 
			String question6 = jsonReader.getDataValue(jsonData, "Which of the following does a child use most often? (If any option is yes, don’t ask the rest)"); 
			String question7 = jsonReader.getDataValue(jsonData, "Does the child understand what is said? Follows commands: (If any option yes, don’t ask the rest)");
			String question8 = jsonReader.getDataValue(jsonData, "Does the child retell stories/ experiences/ narrate incidents");
			String question9 = jsonReader.getDataValue(jsonData, "Does the child use only syllables");
			String question10 = jsonReader.getDataValue(jsonData, "Does the child use a combination of words and gestures");
			String question11 = jsonReader.getDataValue(jsonData, "Does the child use only single words"); 
			String question12 = jsonReader.getDataValue(jsonData, "Does the child poduces sounds like spoken language, but is unintelligible (e.g. jargon-like)");
			String question13 = jsonReader.getDataValue(jsonData, "Does the child uses many single words, or take a break in between each word and then talk"); 
			String question14 = jsonReader.getDataValue(jsonData, "Does the child use single words and/or short phrases"); 
			String question15 = jsonReader.getDataValue(jsonData, "Does the child use grammatically incorrect sentences"); 
			
			spedUtility.clickByXpath("//*[@data-option='" + question1 + "']");
			spedUtility.click(nextBtn);
			
			spedUtility.clickByXpath("//*[@data-option='" + question2 + "']");
			spedUtility.click(nextBtn);
			
			spedUtility.clickByXpath("//*[@data-option='" + question3 + "']");
			spedUtility.click(nextBtn);
			
			spedUtility.clickByXpath("//*[@data-option='" + question4 + "']");
			spedUtility.click(nextBtn);
			
			spedUtility.clickByXpath("//*[@data-option='" + question5 + "']");
			spedUtility.click(nextBtn);
			
			spedUtility.clickByXpath("//*[@data-option='" + question6 + "']");
			spedUtility.click(nextBtn);
			
			spedUtility.selectFromDropdwonByText(assesmentInfoDrpdwn, question7);
			spedUtility.click(nextBtn);
			
			spedUtility.clickByXpath("//*[@data-option='" + question8 + "']");
			spedUtility.click(nextBtn);
			
			spedUtility.clickByXpath("//*[@data-option='" + question9 + "']");
			spedUtility.click(nextBtn);
			
			spedUtility.clickByXpath("//*[@data-option='" + question10 + "']");
			spedUtility.click(nextBtn);
			
			spedUtility.clickByXpath("//*[@data-option='" + question11 + "']");
			spedUtility.click(nextBtn);
			
			spedUtility.clickByXpath("//*[@data-option='" + question12 + "']");
			spedUtility.click(nextBtn);
			
			spedUtility.clickByXpath("//*[@data-option='" + question13 + "']");
			spedUtility.click(nextBtn);
			
			spedUtility.clickByXpath("//*[@data-option='" + question14 + "']");
			spedUtility.click(nextBtn);
			
			spedUtility.clickByXpath("//*[@data-option='" + question15 + "']");
			spedUtility.click(nextBtn);
		}
	}
	
	public void clickOnproceedToNextStepBtn() {
		spedUtility.click(proceedToNextStep);
	}
	

}
