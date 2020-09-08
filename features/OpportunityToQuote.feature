
#@tag
Feature: Create Opportunity
Scenario: Testing Opportunity record creation
    Given Give user login to Salesforce with the correct credentials
		And Click on Opportunities tab
    And Click on New button
    And Enter the value for Opportunity Name field
    And Enter the value for account Name field
    And Enter the value for Close Date field 30
    And Enter the value for Stage field "Sales Qualification"
    And Enter the value for Type field
    And Enter the value for Probability field
    And Enter the value for Amount field
    And Enter the value for Risks, Competition and Comments field
    And user clicks on Save button
    And Click on Edit button
    And Enter the value for Stage field "Contract Finalization"
    And user clicks on Save button
    And Check on Products tab which is displayed under Related at right pane
    And Click on Choose Price Book from drop down
    And Select one valid Price Book Checkbox and Click on Save
    And Click on Add Products from drop down
    And Select valid Product Checkbox and Click on Next
    And Enter the value for Quantity field
    And Enter the value for Date field
    And user clicks on Save button
    And Scroll on Related List Views to Quotes
    And Click on the twistie icon and select New Quote
    And Enter the value for Quote Name field
    And Enter the value for Expiration Date field 30
    And  the value for Status field
    And user clicks on Save button
    And Click on Quote Object
    And Open one Quote from existing Quotes
    And Add Products if Products are not available under Quote Line Items
    And Click on Create PDF button at top right corner
    When user  Preview the PDF and Click on Save to Quote
    Then PDF should be  saved under Quote PDF's  with default PDF name as QuoteName
     
     
     