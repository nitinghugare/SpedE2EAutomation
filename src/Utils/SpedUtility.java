package Utils;

import java.util.List;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SpedUtility extends PageFactory{

	WebDriver driver;
	
	public SpedUtility(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public void getURL(String url){
		this.driver.get(url);
		this.driver.manage().window().maximize();
	}
	
	public void click(WebElement element){
		seleniumWait(element);
		element.click();	
	}
	
	public int getElementsSize(List <WebElement> elements){
		return elements.size();
	}
	
	public void clickByXpath(String value){
		seleniumWait(driver.findElement(By.xpath(value)));
		driver.findElement(By.xpath(value)).click();
	}
	
	public void seleniumWait(WebElement element){
		WebDriverWait wait=new WebDriverWait(this.driver,20);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public void type(WebElement element, String value){
		seleniumWait(element);
		element.clear();
		element.sendKeys(value);	
	}
	
	public void isElementDisplayed(WebElement element){
		if(element.isDisplayed()){
			WebDriverWait wait=new WebDriverWait(this.driver,20);
			wait.until(ExpectedConditions.visibilityOf(element));
			Logger.getLogger("Given Element is displayed");
		}else{
			Logger.getLogger("Given Element is not displayed");
		}
	}
	
	public boolean isElementDisplayedNotify(WebElement element){
		if(element.isDisplayed()){
			WebDriverWait wait=new WebDriverWait(this.driver,20);
			wait.until(ExpectedConditions.visibilityOf(element));
			Logger.getLogger("Given Element is displayed");
			return true;
		}else{
			Logger.getLogger("Given Element is not displayed");
			return false;
		}
	}

	public void selectFromDropdwonByText(WebElement element,String text){
		seleniumWait(element);
		Select drpdwnEle = new Select(element);
		drpdwnEle.selectByValue(text);
	}
}
