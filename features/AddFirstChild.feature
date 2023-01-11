@Execution
Feature: Test scenario

  Scenario: Verify Add child functionlaity for New Parent user
    Given Open browser and enter URL
    #When Navigated to login page
    When User enters "<username>" and "<password>"
      | parent1234@gmail.com | Suresh@123 |
    And Clicked on login button
    Then Add new Child "<ChildData>" from the popup
      | FirstChildDetails |
    And Verify all elements of parent dashboard is displayed