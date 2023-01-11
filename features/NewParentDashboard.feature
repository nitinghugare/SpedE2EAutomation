@Test
Feature: Test scenario

  Scenario: Verify Add child functionlaity for New Parent user
    Given Open browser and enter URL
    #When Navigated to login page
    When User enters "<username>" and "<password>"
      | abc@gmail.com | 12345 |
    And Clicked on login button
    Then Add new Child "<ChildData>" from the popup
      | test |
    And Verify all elements of parent dashboard is displayed

  Scenario: Verify all elements on parent dashboard are displayed
    Given Open browser and enter URL
    #When Navigated to login page
    When User enters "<username>" and "<password>"
      | abc@gmail.com | 12345 |
    And Clicked on login button
    Then Verify all elements of parent dashboard is displayed
    And Verify Assessment remaining days are displayed on parent Dashboard

  Scenario: Verify Add new child functionlaity for Existing Parent user
    Given Open browser and enter URL
    #When Navigated to login page
    When User enters "<username>" and "<password>"
      | abc@gmail.com | 12345 |
    And Clicked on login button
    And Child is added for existing parent user through parent dashboard
    Then Verify new child is added from parent dashboard

  Scenario: Verify Add new child functionality for Existing Parent user from Parent profile
    Given Open browser and enter URL
    #When Navigated to login page
    When User enters "<username>" and "<password>"
      | abc@gmail.com | 12345 |
    And Clicked on login button
    And Navigated to "<ProfileName>"
    And Click on Add Child button
    Then Add new Child "<ChildData>" from the popup
      | test |
    And Verify new child is added from parent dashboard

  Scenario: Verify Start your Assesment is working as expected
    Given Open browser and enter URL
    #When Navigated to login page
    When User enters "<username>" and "<password>"
      | abc@gmail.com | 12345 |
    And Clicked on login button
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
    And Clicked on login button
    And Navigated to "<ProfileName>"
      | Assesment |
    Then Click on Start your assesment button
    And Verify Elements on Start your assesment popup on assesment page is displayed
    And Click on back button
    
  Scenario: Verify Elements on Start your assesment popup on assesment page is displayed
    Given Open browser and enter URL
    #When Navigated to login page
    When User enters "<username>" and "<password>"
      | abc@gmail.com | 12345 |
    And Clicked on login button
    And Navigated to "<ProfileName>"
      | Assesment |
    Then Click on Start your assesment button
    And Verify Elements on Start your assesment popup on assesment page is displayed
    And Click on back button

	#(Can be split as/ Verify School information can be entered and so on)
    Scenario: Verify Behavioral Assesment can be added 
    Given Open browser and enter URL
    #When Navigated to login page
    When User enters "<username>" and "<password>"
      | abc@gmail.com | 12345 |
    And Clicked on login button
    And Navigated to "<ProfileName>"
      | Assesment |
    Then Click on Start your assesment button
    And Click on Start your assesment button popup
    And Add School information "<DataFile>" in Assesment
    And Verify editable option for school Information is displayed and click on Submit
    And Click on Next Section button
    And Add Reason for referral "<DataFile>" in Assesment
    And Verify editable option for Reason for referral information is displayed and click on Submit
    And Click on Next Section button
    And Add Parent Information "<DataFile>" in Assesment
    | Assesment |
    And Verify editable options for Parent information is displayed and click on Submit
    And Verify Assigned assigments are displayed on Sections page for "<Assesment Name>"
    | Behavioural Assessment |
    And Click on Next Section button
    And Complete Behavioural Assessment Test "<TestNumber>"
    |Test1|
    And Verify editable options for Behavioural Assessment is displayed and click on Submit
		And Click on Next Section button
		And Complete Behavioural Assessment Test "<TestNumber>"
    |Test2|
    And Verify editable options for Behavioural Assessment is displayed and click on Submit
		And Click on Next Section button
		And Complete Behavioural Assessment Test "<TestNumber>"
    |Test3|
    And Verify editable options for Behavioural Assessment is displayed and click on Submit
		And Click on Next Section button
		And Complete Behavioural Assessment Test "<TestNumber>"
    |Test4|
    And Verify editable options for Behavioural Assessment is displayed and click on Submit
		And Click on Next Section button
		And Complete Behavioural Assessment Test "<TestNumber>"
    |Test5|
    And Verify editable options for Behavioural Assessment is displayed and click on Submit
		And Click on Next Section button
		And Complete Behavioural Assessment Test "<TestNumber>"
    |Test6|
    And Verify editable options for Behavioural Assessment is displayed and click on Submit
		And Click on Next Section button
		
		## OT Assesment
		Then Complete OT Screening for Area "<AreaNumber>" and Subarea "<SubAreaNumber>"
		|Area1|SubArea1|
		##Click on Submit button is pending
		And Verify editable options for OT Screening is displayed and click on Submit
		And Click on Next Section button
		## SubArea2 is Pending
		Then Complete OT Screening for Area "<AreaNumber>" and Subarea "<SubAreaNumber>"
		|Area1|SubArea3|
		And Click on Next Section button
		Then Complete OT Screening for Area "<AreaNumber>" and Subarea "<SubAreaNumber>"
		|Area1|SubArea4|
		And Click on Next Section button
		Then Complete OT Screening for Area "<AreaNumber>" and Subarea "<SubAreaNumber>"
		|Area1|SubArea5|
		And Click on Next Section button
		Then Complete OT Screening for Area "<AreaNumber>" and Subarea "<SubAreaNumber>"
		|Area1|SubArea6|
		And Click on Next Section button
		Then Complete OT Screening for Area "<AreaNumber>" and Subarea "<SubAreaNumber>"
		|Area1|SubArea7|
		And Click on Next Section button
		Then Complete OT Screening for Area "<AreaNumber>"
		|Area2|
		And Verify editable options for OT Screening is displayed and click on Submit
		And Click on Next Section button
		Then Complete OT Screening for Area "<AreaNumber>"
		|Area3|
		And Verify editable options for OT Screening is displayed and click on Submit
		And Click on Next Section button
		Then Complete OT Screening for Area "<AreaNumber>"
		|Area4|
		And Verify editable options for OT Screening is displayed and click on Submit
		And Click on Next Section button
		Then Complete OT Screening for Area "<AreaNumber>"
		|Area5|
		And Verify editable options for OT Screening is displayed and click on Submit
		And Click on Next Section button
		Then Complete OT Screening for Area "<AreaNumber>"
		|Area6|
		And Verify editable options for OT Screening is displayed and click on Submit
		And Click on Next Section button
		
		Then Click on Proceed To Next Step button on sections page
			
		Scenario: Complete Worksheets assigned
		#Worksheets
		Given Open browser and enter URL
    #When Navigated to login page
    When User enters "<username>" and "<password>"
      | abc@gmail.com | 12345 |
    And Clicked on login button
    And Navigated to "<ProfileName>"
      | Assesment |
    And Clicked on start worksheet button
    Then verify language and component worksheet dashboard is displayed
    And Click on continue button
    And Complete Language Component worksheet
    #Waiting for 5 mins - Pending to add
    And Click on continue button
    And Complete Numeracy Component worksheet
		
		
		Scenario: Verify parent can schedule meeting with coach
		#Worksheets
		Given Open browser and enter URL
    #When Navigated to login page
    When User enters "<username>" and "<password>"
      | abc@gmail.com | 12345 |
    And Clicked on login button
    And Navigated to "<ProfileName>"
      | Assesment |
  	Then Verify Schedule Meeting options is displayed for "<AssesmentType>"
  		| Educational Assessment |
  	And Verify Schedule Meeting options is displayed for "<AssesmentType>"
  		| Occupational Therapy Assessment |
  	And Schedule Meeting for "<AssesmentType>" and "<Date>" and "<Time>"
  	  | Educational Assessment | 28-12-2022 | 8:30 AM - 9:00 AM |
  	And Verify Meeting is Scheduled for "<AssesmentType>"
  		| Educational Assessment |
  		And Verify Meeting is Scheduled for "<AssesmentType>"
  		| Occupational Therapy Assessment | 
  		
  	
		Scenario: Verify Registration from parent dashbboard page
		#Worksheets
		Given Open browser and enter Parent Registration Dashboard URL
		When Clicked on "<tab>" on parent dashboard page
		| For Children |
		Then Verify Assesment and Therapy options are displayed
		And Click on product "<ProductType>"
		| Educational Assessment |
		And Click on Add to cart
		# Add Child Is Pending
		And verify elements on Select Plan Features popup is displayed
		And Add products to the cart "<ProductType>"
		| Educational Assessment |
		And Verify cart for added product "<ProductType>"
		| Educational Assessment |
		
		Scenario: Verify Registration from parent dashbboard page for therapy products
		#Worksheets
		Given Open browser and enter Parent Registration Dashboard URL
		When Clicked on "<tab>" on parent dashboard page
		| For Children |
		Then Verify Assesment and Therapy options are displayed
		And Click on product "<ProductType>"
		| Remedial Therapy |
		And Click on Add to cart
		# Add Child Is Pending
		And verify elements on Select Plan Features popup is displayed
		And Add products to the cart "<ProductType>"
		| Educational Assessment |
		And Verify cart for added product "<ProductType>"
		| Educational Assessment |
		
		
		Scenario: Coach Assesment and evaluation
    Given Open browser and enter URL
    #When Navigated to login page
    When User enters "suresh.patil@spedathome.com" and "Suresh@123"
    And Clicked on login button
  	Then Remedial Coach dashboard should display
  	And Click on coach options "Total Users"
  	And Verify Child list is displayed
  	#Verify Elements on Child List Page - Pending
  	And Click on child name "Child DEC"
  	#Verfiy Elements on Coach Assesment page are displayed - Pending
  	And Add birth history in parent interviews
  	And Add Interesting Activities in parent interviews
  	And Add Parent emotion details in parent interviews
		
		Then Add Discrepancy Analysis details of "<TypeOfAnalysis>" in Child interview
		| Reading |
		And Add Discrepancy Analysis details of "<TypeOfAnalysis>" in Child interview
		| Spelling |	
		And Add Discrepancy Analysis details of "<TypeOfAnalysis>" in Child interview
		| Grammar |
		And Add Discrepancy Analysis details of "<TypeOfAnalysis>" in Child interview
		| Vocabulary |
		And Add Discrepancy Analysis details of "<TypeOfAnalysis>" in Child interview
		| Comprehension |
		And Add Discrepancy Analysis details of "<TypeOfAnalysis>" in Child interview
		| Maths |
		
		And Add Child Behaviour details in Child interview
		And Add Comments in Child Inteview and click on Save button
		
		Then Select Grade and Cluster for assesment type "<AssesmentType>" in IEP Table
		| Literacy |
		
		Then Select Grade and Cluster for assesment type "<AssesmentType>" in Independent Table
		| Literacy |
		##Group Therapy - Pending
		
		#Pending Not Developed
 		Then Add plan details in ITP Table
 		Then Add plan details in IEP Table
 		
 		Then Verify list of reports is displayed
		