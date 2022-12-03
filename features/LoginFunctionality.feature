@Test
Feature: Test scenario
  Scenario Outline: Verify Login with New Parent Credentials
    Given Open browser and enter URL
    #When Navigated to login page
    When User enters "<username>" and "<password>"
    When Clicked on login button
    Then Parent Setup Dashboard should display for new user
    Examples: 
      | username       | password|
      | abc@gmail.com  | 12345   |
    
    Scenario Outline: Verify Login with Remedial Coach Credentials
    Given Open browser and enter URL	
    When Navigated to login page
    When User enters "<username>" and "<password>"
    And Clicked on login button
    Then Remedial Coach dashboard should display
    Examples: 
      | username       | password|
      | abc@gmail.com  | 12345   |
    
    Scenario Outline: Verify Login with OT Coach Credentials
    Given Open browser and enter URL
    When Navigated to login page
    Then User enters "<username>" and "<password>"
    And Click on login button
    Then OT Coach dashboard should display
    Examples: 
      | username       | password|
      | abc@gmail.com  | 12345   |
