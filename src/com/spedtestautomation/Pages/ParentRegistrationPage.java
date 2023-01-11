package com.spedtestautomation.Pages;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.JsonReader;
import Utils.SpedUtility;

public class ParentRegistrationPage extends PageFactory {
	WebDriver driver;
	SpedUtility spedUtility;
	JsonReader jsonReader;

	public ParentRegistrationPage(WebDriver driver) {
		super();
		this.driver = driver;
		spedUtility = new SpedUtility(driver);
		PageFactory.initElements(driver, this);
		PageFactory.initElements(driver, spedUtility);
	}

	@FindBy(xpath = "//*[contains(text(),' Assessment remaining days')]")
	WebElement assesmentRemainingDays;
	
	@FindBy(xpath = "//*[contains(text(),'Add to Cart')]")
	WebElement addToCartBtn;
	
	@FindBy(xpath = "//span[contains(text(),'Occupational Therapy Assessment')]/preceding::span[@class='checkbox']")
	WebElement OTAssesmentCheckBox;
	
	@FindBy(xpath = "//span[contains(text(),'Educational Assessment')]/preceding::span[@class='checkbox']")
	WebElement educationalAssesmentCheckBox;
	
	@FindBy(xpath = "//*[contains(@class,'child-info child')]")
	WebElement childInfo;
	
	@FindBy(xpath = "//*[contains(@class,'add-child-btn')]")
	WebElement addChildBtn;
	
	@FindBy(xpath = "//*[contains(text(),'Continue')]")
	WebElement continueBtn;
	
	@FindBy(xpath = "//*[text()='We have successfully updated your cart']")
	WebElement productAdded;
	
	@FindBy(xpath = "//*[contains(text(),'Go to Cart')]")
	WebElement goToCartBtn;
	
	
	public void NavigateToTab(String tabName){
		spedUtility.clickByXpath(String.format("//*[text()='%s']", tabName));
	}
	
	public void verifyAssesmentOptionsDisplayed(){
		String elements = "//div[contains(text(),'Assessment') and @class='menu-title']/following::div[@class='title' and contains(text(),'Assessment')]";
		
		List <WebElement> options = this.driver.findElements(By.xpath(elements));
		if(options.size() == 2){
			for(WebElement each : options){
				System.out.println("Assesment Option : " + each.getText() + "Is Displayed");
			}
		} else {
			System.out.println("Failed : options are not displayed");
		}
	}
	
	public void verifyTherapyOptionsDisplayed(){
		String elements = "//div[contains(text(),'Therapy') and @class='menu-title']/following::div[@class='title' and contains(text(),'Therapy')]";
		
		List <WebElement> options = this.driver.findElements(By.xpath(elements));
		if(options.size() == 2){
			for(WebElement each : options){
				System.out.println("Therapy Option : " + each.getText() + "Is Displayed");
			}
		} else {
			System.out.println("Failed : options are not displayed");
		}
	}
	
	public void clickOnProduct(String productType){
		spedUtility.clickByXpath(String.format("//*[text()='%s']", productType));
	}
	
	public void clickOnAddToCart(){
		spedUtility.click(addToCartBtn);
	}
	
	public void verifyElementsOnSelectPlanFeatures(){
		Map<WebElement, String> elements = new HashMap<WebElement, String>();
		elements.put(OTAssesmentCheckBox, "OT Assesment CheckBox");
		elements.put(educationalAssesmentCheckBox, "Educational Assesment CheckBox");
		elements.put(childInfo, "Child Information");
		elements.put(addChildBtn, "Add Child Button");
		elements.put(continueBtn, "Continue Button");

		for (Map.Entry<WebElement, String> eachEntry : elements.entrySet()) {
			if(spedUtility.isElementDisplayedNotify(eachEntry.getKey())){
				System.out.println(eachEntry.getValue() + " : on Select Plan Features Popup is displayed");
			} else{
				System.out.println("Failed - "+ eachEntry.getValue() + " : on Select Plan Features Popup is not displayed");
			}
		}
	}
	
	public void selectAssesmentAndChild(String assesmentType){
		 if(assesmentType.equals("Occupational Therapy Assessment")){
			 spedUtility.click(OTAssesmentCheckBox);
		 }else{
			 spedUtility.click(educationalAssesmentCheckBox);
		 }
		 spedUtility.click(childInfo);
		 System.out.println("First Child Selected");
		 spedUtility.click(continueBtn);
	}
	
	public void verifyProductAdded(){
		if(spedUtility.isElementDisplayedNotify(productAdded)){
			System.out.println("Product Added Succesfully");
		}else{
			System.out.println("Failed : Adding product is failed");
		}
	}
	
	public void goToCart(){
		spedUtility.click(goToCartBtn);
	}
	
	public void verifyProductAddedInCart(String producuctType){
		String elements = "//*[@class='cart-product-item']//div[contains(text(),'"+producuctType+"')]";
		if(producuctType.equals("Remedial Therapy") || producuctType.equals("Occupational Therapy")){
			String compProduct = "//*[@class='cart-product-item-wrap']//div[contains(text(),'"+producuctType+"')]";
			verifyCartElement(compProduct, producuctType);
		} 
		verifyCartElement(elements, producuctType);
	}
	
	public void verifyCartElement(String elements, String producuctType){
		List <WebElement> options = this.driver.findElements(By.xpath(elements));
		if(options.size() == 2){
			for(WebElement each : options){
				if(each.findElement(By.xpath("//following::div[@class='remove btn-cart-remove']")).isDisplayed()){
					System.out.println("Cart is Updated for product : " + producuctType);
				}
			}
		} else {
			System.out.println("Failed : Product Is not added in the cart");
		}
	}
	
}
