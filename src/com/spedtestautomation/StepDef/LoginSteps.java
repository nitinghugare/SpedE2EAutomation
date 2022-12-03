package com.spedtestautomation.StepDef;


import java.util.List;

import org.openqa.selenium.WebDriver;

import com.spedtestautomation.DriverManager.WebDriverManager;
import com.spedtestautomation.Pages.LandingPage;
import com.spedtestautomation.Pages.LoginPage;
import com.spedtestautomation.Pages.SpedDashobardPage;

import Utils.DriverUtils;
import Utils.SpedUtility;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class LoginSteps extends WebDriverManager {
	WebDriver driver;

	/*@Given("^Entered Username and password for different roles$")
	public void haveBooksInTheStoreByList(DataTable table) {

			
		List<List<String>> rows = table.asLists(String.class);

		for (List<String> columns : rows) {
			//Add user name and password
			System.out.println(columns.get(0) + "  " + columns.get(1));
		}
	}*/
	
	@Given("^Navigated to login page$")
	public void navigated_to_login_page(DataTable table) {

	}
	
	@When("^User enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String username, String password) {
		LoginPage loginPage = new LoginPage(getDriver());
		loginPage.addUsername(username);
		loginPage.addPassowrd(password);
		
	}
	
	@When("^Clicked on login button&")
	public void click_on_login_button() {
		LoginPage loginPage = new LoginPage(getDriver());
		loginPage.clickOnLoginBtn();
	}

	@Then("^Parent Setup Dashboard should display for new user&")
	public void verifyParentDashboardForNewUser() {
		SpedDashobardPage spedDashobardPage = new SpedDashobardPage(getDriver());
		spedDashobardPage.verifyNewParentDashboardIsDisplayed();
		
	}
	
	@Then("^Remedial Coach dashboard should display&")
	public void verifyRemedialCoachDashboard() {
		
		/*SpedDashobardPage spedDashobardPage = new SpedDashobardPage(getDriver());
		spedDashobardPage.verifyRemedialCoachDasboard();*/
	}
	
	@Then("^OT Coach dashboard should display&")
	public void verifyOTCoachDashboard() {
		SpedDashobardPage spedDashobardPage = new SpedDashobardPage(getDriver());
		spedDashobardPage.verifyOTCoachDasboard();
	}
	
	/*
	 * @Given("^Open browser and enter URL$") public void
	 * open_browser_and_enter_URL() throws Throwable {
	 * 
	 * }
	 */
}
