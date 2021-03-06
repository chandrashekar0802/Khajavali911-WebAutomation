
 
Feature: Account record creation
  #@tag
  Scenario: Testing Account record creation
    Given Give user login to Salesforce with the correct credentials
    And Click on Accounts tab
    And Click on New button
    And Enter the value for Account Name field
    And Enter the value for Parent Account Name field
    And Enter the value for Phone field
    And Enter the value for Status field
    And Enter the value for Vertical Grouping field
    And Enter the value for Sub Vertical one field
    And Enter the value for Vertical field
    And Enter the value for IST Representative field
    And Enter the value for Revenue field
    And Enter the value for Billing Street field
  	And Enter the value for Billing City field
  	And Enter the value for Billing State/Province field
  	And Enter the value for Billing Zip/Postal Code field
  	And Enter the value for Billing Country field
  	When user clicks on Save button
  	Then Record should  be saved

    
      Scenario: Create the approval process when status indicator field is selected won, approval request should send to manager
    Given Give user login to Salesforce with the correct credentials
    And Click on Accounts tab