package com.spedtestautomation.Pages;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.JsonReader;
import Utils.SpedUtility;

public class ScheduleMeetingPage extends PageFactory {
	WebDriver driver;
	SpedUtility spedUtility;
	JsonReader jsonReader;
	Map jsonData;

	public ScheduleMeetingPage(WebDriver driver) {
		super();
		this.driver = driver;
		spedUtility = new SpedUtility(driver);
		PageFactory.initElements(driver, this);
		PageFactory.initElements(driver, spedUtility);
	}

	@FindBy(xpath = "//*[@class='worksheet']//div[@class='status-progress']")
	WebElement worksheetDashboard;

	@FindBy(xpath = "//*[@id='selectDateMeetCoach']")
	WebElement selectDateEle;

	@FindBy(xpath = "//*[contains(text(),'Select Time')]")
	WebElement selectTimeEle;
	
	@FindBy(xpath = "//div[@class='modal-content']//span[contains(text(),'Schedule Meeting')]")
	WebElement scheduleMeetingBtn;
	
	@FindBy(xpath = "(//*[@class='meeting-block'])[1]")
	WebElement meetingDetailsBlock;
	
	
	

	public void verifyScheduleMeetingOptionDisplayed(String assesmentType) {
		this.driver.findElement(By.xpath("(//div[contains(text(),'" + assesmentType
				+ "')]/following::span[contains(text(),'Schedule Meeting')])[1]"));
	}

	public void clickOnScheduleMeetinBtn(String assesmentType) {
		spedUtility.clickByXpath("(//div[contains(text(),'" + assesmentType
				+ "')]/following::span[contains(text(),'Schedule Meeting')])[1]");
	}

	public void selectDate(String date) {
		String[] arrOfDate = date.split("-");
		String dateValue = arrOfDate[0];

		selectDateEle.sendKeys(Keys.TAB);

		selectDateEle.sendKeys(dateValue);

		System.out.println("Selected - " + dateValue + "Date");
	}

	public void selectTime(String time) {
		spedUtility.click(selectTimeEle);
		spedUtility.clickByXpath("//*[@class='options dropdown-menu show']/li[contains(text(),'" + time + "')]");
	}
	
	public void clickOnScheduleMeetingOnCoachPopup() {
		spedUtility.click(scheduleMeetingBtn);
	}
	
	public void selectDateAndTime(String type, String date, String time) {
		selectDate(date);
		selectTime(time);
		clickOnScheduleMeetingOnCoachPopup();
	}

	public void verifyScheduledMeeting(String assesmentType) {
		if(spedUtility.isElementDisplayedNotify(meetingDetailsBlock)){
			if(this.driver.findElement(By.xpath("(//*[contains(text(),'"+assesmentType+"')]/following::*[contains(text(),'Reschedule')])[1]")).isDisplayed()){
				System.out.println("Schedule Meeting options are displayed");
			}
		}
		
		
	}

}
