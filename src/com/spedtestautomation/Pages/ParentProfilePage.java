package com.spedtestautomation.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.JsonReader;
import Utils.SpedUtility;

public class ParentProfilePage extends PageFactory {
	WebDriver driver;
	SpedUtility spedUtility;
	JsonReader jsonReader;

	public ParentProfilePage(WebDriver driver) {
		super();
		this.driver = driver;
		spedUtility = new SpedUtility(driver);
		PageFactory.initElements(driver, this);
		PageFactory.initElements(driver, spedUtility);
	}

	@FindBy(xpath = "//div[contains(@class,'add-child')]")
	WebElement addChildBtn;
	
	public void clickOnAddChildOnParentProfile() {
		if(spedUtility.isElementDisplayedNotify(addChildBtn)){
			spedUtility.click(addChildBtn);
		} else {
			System.out.println("Second Child is already added");
		}
	}

}
