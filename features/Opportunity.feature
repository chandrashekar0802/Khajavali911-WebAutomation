
Feature: Testing Opportunity tab

  Scenario: Testing Opportunity record creation
    Given Give user login to Salesforce with the correct credentials
    And Click on Opportunities tab
    And Click on New button
    And Enter the value for Opportunity Name field
    And Enter the value for account Name field
    And Enter the value for Close Date field 30
    And Enter the value for Stage field
    And Enter the value for Type field
    And Enter the value for Probability field
    And Enter the value for Amount field
    And Enter the value for Risks, Competition and Comments field
    When user clicks on Save button
    Then Opportunity Record Should be saved
   
   
     Scenario: Testing to create new Product record under opportunity
    Given Give user login to Salesforce with the correct credentials
    And Click on Opportunities tab
    And Click on one Opportunities name from existing Opportunities list on the  Home screen
    And Check on Products tab which is displayed under Related at right pane
    And Click on Add Products from drop down
    And Select valid Product Checkbox and Click on Next
    And Enter the value for Quantity field
    And Enter the value for Date field
    When user clicks on Save button
    Then record should be Saved
   
   
    Scenario: Testing Opportunity Close Date greater than Expected Close Date
    Given Give user login to Salesforce with the correct credentials
    And Click on Opportunities tab
    And Click on New button
    And Enter the value for Opportunity Name field
    And Enter the value for account Name field
    And Enter the value for Close Date field 10
    And Enter the value for Stage field
    And Enter the value for Type field
    And Enter the value for Probability field
    And Enter the value for Amount field
    And Enter the value for Risks, Competition and Comments field
    And user clicks on Save button
    And Opportunity Record Should be saved
    When Verifying the Close Date field in Details page
    Then Close Date field should display the value which we have updated in the setting when greater than Close date is selected
    
    
      Scenario Outline: Testing the Opportunity Amount is less than or greater than the Amount range
    Given Give user login to Salesforce with the correct credentials
    And Click on Opportunities tab
    And Click on New button
    And Enter the value for Opportunity Name field
    And Enter the value for account Name field
    And Enter the value for Close Date field 30
    And Enter the value for Stage field
    And Enter the value for Type field
    And Enter the value for Probability field
    And Enter the "<amount1>"
    And Enter the value for Risks, Competition and Comments field
    And user clicks on Save button
     And Enter the "<amount2>"
    And user clicks on Save button
    Then Opportunity Record Should be saved
    
    Examples:
    
    |amount1|amount2|
    |0			|100		|
    
    
     Scenario: Testing the Opportunity Close Date is updated with Current date when Stage is Close Lost
    Given Give user login to Salesforce with the correct credentials
    And Click on Opportunities tab
    And Click on New button
    And Enter the value for Opportunity Name field
    And Enter the value for account Name field
    And Enter the value for Close Date field 10
    And Enter the value for Stage field "Closed Lost"
    And Enter the value for Type field
    And Enter the value for Probability field
    And Enter the value for Amount field
    And Enter the value for Risks, Competition and Comments field
    And user clicks on Save button
    And Verify the Close date should be updated with Current date
    And Click on Edit button for created opportunity
     And Enter the value for Close Date field 5
    And Enter the value for Stage field "Closed Lost"
    When user clicks on Save button
    Then Close date should display with Previous updated value