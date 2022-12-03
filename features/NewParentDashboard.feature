@Test
Feature: Test scenario

  Scenario: Verify Add child functionlaity for New Parent user
    Given Open browser and enter URL
    #When Navigated to login page
    When User enters "<username>" and "<password>"
      | abc@gmail.com | 12345 |
    And Click on login button
    Then Add new Child "<ChildData>" from the popup
      | test |
    And Verify all elements of parent dashboard is displayed

  Scenario: Verify all elements on parent dashboard are displayed
    Given Open browser and enter URL
    #When Navigated to login page
    When User enters "<username>" and "<password>"
      | abc@gmail.com | 12345 |
    And Click on login button
    Then Verify all elements of parent dashboard is displayed
    And Verify Assessment remaining days are displayed on parent Dashboard

  Scenario: Verify Add new child functionlaity for Existing Parent user
    Given Open browser and enter URL
    #When Navigated to login page
    When User enters "<username>" and "<password>"
      | abc@gmail.com | 12345 |
    And Click on login button
    And Child is added for existing parent user through parent dashboard
    Then Verify new child is added from parent dashboard

  Scenario: Verify Add new child functionality for Existing Parent user from Parent profile
    Given Open browser and enter URL
    #When Navigated to login page
    When User enters "<username>" and "<password>"
      | abc@gmail.com | 12345 |
    And Click on login button
    And Navigated to "<ProfileName>"
    And Click on Add Child button
      | Parent Profile |
    Then Add new Child "<ChildData>" from the popup
      | test |
    And Verify new child is added from parent dashboard

  Scenario: Verify Start your Assesment is working as expected
    Given Open browser and enter URL
    #When Navigated to login page
    When User enters "<username>" and "<password>"
      | abc@gmail.com | 12345 |
    And Click on login button
    And Navigated to "<ProfileName>"
      | Assesment |
    Then Click on Start your assesment button
    And Close start your assesment popup
    #Can be another test cases
    When Navigated to "<ProfileName>"
      | Dashboard |
    Then Click on Start your assesment button
    And Close start your assesment popup


	#Pending - Verify Elements on Start your assesment popup on dashboard page is displayed
	
  Scenario: Verify Elements on Start your assesment popup on assesment page is displayed
    Given Open browser and enter URL
    #When Navigated to login page
    When User enters "<username>" and "<password>"
      | abc@gmail.com | 12345 |
    And Click on login button
    And Navigated  	 	to "<ProfileName>"
      | Assesment |
    Then Start your assesment button
    And Verify Elements on Start your assesment popup on assesment page is displayed
    And Click on back button
    
    
    
