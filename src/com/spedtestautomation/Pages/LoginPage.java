package com.spedtestautomation.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.SpedUtility;

public class LoginPage {
	
	WebDriver driver;
	SpedUtility spedUtility;

	public LoginPage(WebDriver driver) {
		super();
		this.driver = driver;
		spedUtility = new SpedUtility(driver);
		PageFactory.initElements(driver, this);
		PageFactory.initElements(driver, spedUtility);
	}

	@FindBy(xpath = "title")
	WebElement title;
	
	@FindBy(xpath = "//input[@placeholder='Email Address or Phone Number']")
	WebElement usernameEle;
	
	@FindBy(xpath = "//input[@placeholder='Password']")
	WebElement passwordEle;
	
	@FindBy(xpath = "//button[text()='Login']")
	WebElement loginBtn;
	
	
	
	public void clickOnTitle(){
		spedUtility.click(title);
	}
	
	public void addUsername(String username){
		spedUtility.type(usernameEle,username);
	}

	public void addPassowrd(String password){
		spedUtility.type(passwordEle,password);
	}
	
	public void clickOnLoginBtn(){
		spedUtility.click(loginBtn);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
