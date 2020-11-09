
@tag
Feature: Create Lead and Convert
 Scenario: Create and convert Lead to an Opportunity
    Given Give user login to Salesforce with the correct credentials
    When Click on Leads tab
    And Click on New button
    Then New Lead Creation window should open
    When Enter the value for Lead Status field
    And Enter the value for Salutation field
    And Enter the value for first name field
    And Enter the value for last name field
    And Enter the value for Phone Field
    And Enter the value for Company field
    And Enter the value for Fax field
    And Enter the value for Title field
    And Enter the value for Website field
    And Enter the value for Lead Source field
    And Enter the value for email field
    And Enter the value for Ownership field
    And Enter the value for IST representative field
    And Enter the value for Revenue Range field
    And Enter the value for Campaign field
    And Enter the value for Contact Locaton field
    And Enter the value for BDM field
    And Enter the value for vertical Grouping field
    And Enter the value for vertical field
    And Enter the value for Sub vertical one field
    And Enter the value for Business Unit field
    And Enter the value for Rating field
    And Enter the value for revenue field
    And Enter the value for Region field
    And Enter the value for Street field
    And Enter the value for City field
    And Enter the value for State/Province field
    And Enter the value for Zip/Postal Code field
    And Enter the value for Country field
    When user clicks on Save button
    Then New Lead created successfully
    When Click on Edit button
    And Change Lead Status field value to "Qualified"
    And user clicks on Save button
    When Click on Convert tab
    Then Convert Lead Window should open
    When Select radio button for Contact choose existing
    And Search for matching contact  and select one contact name form list
    When Click on convert button
    Then Lead should be converted
    When Click on hyperlink of Account name in account table on Your lead has been converted layout sceen
    And Click on Account History hyperlink
    And Check the lead convert record on the Account History screen
    And Click on Leads tab
    When Click on New button
    Then New Lead Creation window should open
    When Enter the value for Lead Status field
    And Enter the value for Salutation field
    And Enter the value for first name field
    And Enter the value for last name field
    And Enter the value for Phone Field
    And Enter the value for Company field
    And Enter the value for Fax field
    And Enter the value for Title field
    And Enter the value for Website field
    And Enter the value for Lead Source field
    And Enter the value for email field
    And Enter the value for Ownership field
    And Enter the value for IST representative field
    And Enter the value for Revenue Range field
    And Enter the value for Campaign field
    And Enter the value for Contact Locaton field
    And Enter the value for BDM field
    And Enter the value for vertical Grouping field
    And Enter the value for vertical field
    And Enter the value for Sub vertical one field
    And Enter the value for Business Unit field
    And Enter the value for Rating field
    And Enter the value for revenue field
    And Enter the value for Region field
    And Enter the value for Street field
    And Enter the value for City field
    And Enter the value for State/Province field
    And Enter the value for Zip/Postal Code field
    And Enter the value for Country field
    When user clicks on Save button
    Then New Lead created successfully
    When Click on Convert tab
    Then Convert Lead Window should open
    When Select radio button for Account Choose existing
    And Search for matching Account and select one Account name form list
    And Select radio button for Contact create New
    And Select radio button for Opportunity choose existing
    And Select one record from Opportunity grid
    When Click on convert button
    Then Lead should be converted
    When Click on hyperlink of Account name in account table on Your lead has been converted layout sceen
    And Click on Account History hyperlink
    And Check the lead convert record on the Account History screen
    And Click on Leads tab
    When Click on New button
    Then New Lead Creation window should open
    When Enter the value for Lead Status field
    And Enter the value for Salutation field
    And Enter the value for first name field
    And Enter the value for last name field
    And Enter the value for Phone Field
    And Enter the value for Company field
    And Enter the value for Fax field
    And Enter the value for Title field
    And Enter the value for Website field
    And Enter the value for Lead Source field
    And Enter the value for email field
    And Enter the value for Ownership field
    And Enter the value for IST representative field
    And Enter the value for Revenue Range field
    And Enter the value for Campaign field
    And Enter the value for Contact Locaton field
    And Enter the value for BDM field
    And Enter the value for vertical Grouping field
    And Enter the value for vertical field
    And Enter the value for Sub vertical one field
    And Enter the value for Business Unit field
    And Enter the value for Rating field
    And Enter the value for revenue field
    And Enter the value for Region field
    And Enter the value for Street field
    And Enter the value for City field
    And Enter the value for State/Province field
    And Enter the value for Zip/Postal Code field
    And Enter the value for Country field
    When user clicks on Save button
    Then New Lead created successfully
    When Click on Convert tab
    Then Convert Lead Window should open
    When Select radio button for Account Choose existing
    And Search for matching Account and select one Account name form list
    And Select radio button for Contact choose existing
    And Search for matching contact for Selected Account and select one contact name from list 
    And Select radio button for Opportunity create New
    When Click on convert button
    Then Lead should be converted
    When Click on hyperlink of Account name in account table on Your lead has been converted layout sceen
    And Click on Account History hyperlink
    Then Check the Lead convert record on the Account History screen
    
    