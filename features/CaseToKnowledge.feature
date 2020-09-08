@tag
Feature: Create Case
Scenario: Testing cases record creation
    Given Give user login to Salesforce with the correct credentials
    And Click on Case Object
    And Click on Cases New button
    And Enter the value for contact name field
    And Enter the value for account name field
    And Enter the value for status field
    And Enter the value for Case Origin field
    And Enter the value for Priority  field
    And Enter the value for type field
    And Enter the value for Case Reason field
    And Enter the value for Subject field
    And Enter the value for Description field
    And Enter the value for Internal Comments field
    And Enter the value for Web Email field
    And Enter the value for Web Name field
    And Enter the value for Web Company field
    And Enter the value for Web Phone field
    And user clicks on Save button
    And Click on Edit button
    And Check Assign Using Active Assignment rule Check box
    And user clicks on Save button
    And Click on Related Tab
    And Click on New Task
    And Enter the value for Subject  field
    And Enter the date for due date field
    And Enter the data for Comments field
    And Enter the data for status field
    And Enter the value for Priority field
    And user clicks on Save button
    And Mouse over on user name and click on switch to sales force classic
    And Click on Case Link
    And Click on hyperlink of one case number on the cases Home screen
    And check the solution grid
    And Enter the value in finding solution field
    And Click on Find solution button
    And Click on select hyperlink from one solution's record 
    And Click on close case button under system information grid
    And select  value from the status field
    When select  value from the Case Reason field
    Then Click on save button
    And Change to lightening view
    
    
    
    
    
    
    
   
    
    
     