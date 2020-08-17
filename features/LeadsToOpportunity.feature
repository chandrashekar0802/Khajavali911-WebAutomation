
@tag
Feature: Create Lead and Convert
 Scenario: Testing Lead record creation and Converting to Account, Contact and Opportunity
    Given Give user login to Salesforce with the correct credentials
    And Click on Leads tab
    And Click on New button
    And Enter the value for Lead Status field
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
    And user clicks on Save button
    And Click on Edit button
    And Change Lead Status field value to "Qualified"
    And user clicks on Save button
    #And Click on one name from existing lead  list on the Leads Home screen
    And Click on Convert tab
    And Select radio button for Account create New
    And Select radio button for Contact choose existing
    And Search for matching contact  and select one contact name form list
    #And Check radio button for Opportunity create new is by default selected and opportunity choose existing is disable mode
     And Click on convert button
     And Click on hyperlink of Account name in account table on Your lead has been converted layout sceen
     And Click on Account History hyperlink
     And Check the lead convert record on the Account History screen
    
    
    
    