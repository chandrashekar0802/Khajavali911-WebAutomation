

Feature: Testing Leads Tab
 
 Scenario: Testing Lead record creation
    Given Give user login to Salesforce with the correct credentials
    And Click on Leads tab
    And Click on New button
    And Enter the value for first name field
    And Enter the value for last name field
    And Enter the value for Phone Field
    And Enter the value for Company field
    And Enter the value for Lead Source field
    And Enter the value for IST representative field
    And Enter the value for Campaign field
    And Enter the value for vertical Grouping field
    And Enter the value for vertical field
    And Enter the value for Sub vertical one field
    And Enter the value for Rating field
    And Enter the value for revenue field
    And Enter the value for Region field
    And Enter the value for Street field
    And Enter the value for City field
    And Enter the value for State/Province field
    And Enter the value for Zip/Postal Code field
    And Enter the value for Country field
    When user clicks on Save button
  	Then Record should  be saved
  	
  	 
 Scenario: Lead Conversion Standard
    Given Give user login to Salesforce with the correct credentials
    And Click on Leads tab
    And Click on one name from existing lead  list on the Leads Home screen
    And Check Convert tab Left side of edit tab in lead detail screen
    And Click on Convert tab
    And Check account accordion with create New and choose existing radio button 
    And Check contact accordion with create New and choose existing radio button 
    And Check opportunity accordion with create New and choose existing radio button 
    And Check record owner field
    And Check converter status field
    And Check radio button for Account (create New) by defult selected
    And Check radio button for Contact(create New) by defult selected
    And Check radio button for opportunity(create New) by defult selected
    And Click on convert button
    And Click on  hyperlink of account name  in account table on pop op 
    And Click on account history hyperlink
    When user  Check the lead convert record on the account history screen
    Then Lead convert record should be displayed
    
    

