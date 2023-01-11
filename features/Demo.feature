@TestDemo
Feature: Test scenario

  Scenario: Verify Login with New Parent Credentials
    Given Open browser and enter URL
    #When Navigated to login page
    When User enters "parent1234@gmail.com" and "Suresh@123"
    When Clicked on login button
  	Then Parent Setup Dashboard should display for new user

  Scenario: Verify Login with Remedial Coach Credentials
    Given Open browser and enter URL
    #When Navigated to login page
    When User enters "suresh.patil@spedathome.com" and "Suresh@123"
    And Clicked on login button
  	Then Remedial Coach dashboard should display
  	
  Scenario: Verify Login with OT Coach Credentials
    Given Open browser and enter URL
    #When Navigated to login page
    When User enters "harshil.panchal@spedathome.com" and "OT@123"
    And Clicked on login button
		Then OT Coach dashboard should display