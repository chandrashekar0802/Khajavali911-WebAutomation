 
Feature: Contact record creation
 
  Scenario: Testing Contact record creation
    Given Give user login to Salesforce with the correct credentials
    And Click on Contacts tab
    And Click on New button on the Contacts Home screen
    And Enter the value for First Name field
    And Enter the value for Last Name field
    And Enter the value for phone field
    And Enter the value for Mobile field
    And Enter the value for Account name field
    And Enter the value for Email field
    And Enter the value for Designation Level field
    And Enter the value for Mailing Street field
    And Enter the value for Mailing City field
    And Enter the value for Mailing State/Province field
    And Enter the value for Mailing Zip/Postal Code field
    And Enter the value for Mailing Country field
    When user clicks on Save button
    Then Record should be saved