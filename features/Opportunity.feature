 @tag
Feature: Testing Opportunity tab
 
  Scenario: Testing Opportunity record creation
    Given Give user login to Salesforce with the correct credentials
    And Click on Opportunities tab
    And Click on New button on the Opportunities Home screen
    And Enter the value for Opportunity Name field
    And Enter the value for account Name field
    And Enter the value for Close Date field
    And Enter the value for Stage field
    And Enter the value for Type field
    And Enter the value for Probability field
    And Enter the value for Amount field
    And Enter the value for Risks, Competition and Comments field
    When user Click's on Save button
    Then Opportunity Record Should be saved