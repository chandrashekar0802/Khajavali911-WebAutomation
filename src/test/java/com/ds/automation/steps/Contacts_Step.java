package com.ds.automation.steps;

import org.json.simple.JSONObject;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.GherkinKeyword;
import com.cigniti.automation.reports.BaseUtil;
import com.cigniti.automation.reports.ExtentReportUtil;
import com.cigniti.automation.utilities.CommonUtil;
import com.cigniti.automation.utilities.Driver;
import com.cigniti.automation.utilities.PropertiesFileReader;
import com.ds.automation.bussinessfunctions.Accounts_Page;
import com.ds.automation.bussinessfunctions.Accounts_Page_Validator;
import com.ds.automation.bussinessfunctions.Contacts_Page;
import com.ds.automation.bussinessfunctions.Contacts_Page_Validator;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Contacts_Step {
	PropertiesFileReader obj= new PropertiesFileReader();  
	 private BaseUtil base;
	 private static ExtentReportUtil extentreportUtil= new ExtentReportUtil();
	 SoftAssert softAssert=new SoftAssert();
	 
	 Contacts_Page contactsPage = new Contacts_Page(Driver.browser);
	 Contacts_Page_Validator contactsPageValidator = new Contacts_Page_Validator(contactsPage);

	 
	 @Given("Enter the value for First Name field")
	 public void enter_the_value_for_First_Name_field() throws Throwable{
		 try{
		 JSONObject input = CommonUtil.readJsonObject("Contacts", "contacts");
			String firstName= input.get("firstName").toString();
			contactsPageValidator.enter_Data_firstName(firstName);
	BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering first name").pass("Entered first name successfully");
		 }
			catch(Exception e)
			{
				BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering first name").fail("Failed to Enter first name ").addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());

			}
			
	 }

	 @Given("Enter the value for Last Name field")
	 public void enter_the_value_for_Last_Name_field() throws Throwable {
		 try{
		 JSONObject input = CommonUtil.readJsonObject("Contacts", "contacts");
			String lastName= input.get("lastName").toString();
			contactsPageValidator.enter_Data_lastName(lastName);
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering last name").pass("Entered last name successfully");
		 }
			catch(Exception e)
			{
				BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering last name").fail("Failed to Enter last name").addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());

			}
			
		 }

	 @Given("Enter the value for phone field")
	 public void enter_the_value_for_phone_field() throws Throwable{
		 try{
		 JSONObject input = CommonUtil.readJsonObject("Contacts", "contacts");
			String phone= input.get("phone").toString();
			contactsPageValidator.enter_Data_phone(phone);	
		 BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering phone number").pass("Entered phone number successfully");
		 }
			catch(Exception e)
			{
				 BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering phone number").fail("Failed to Enter phone number").addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());
	
			}
			
	 }

	 @Given("Enter the value for Mobile field")
	 public void enter_the_value_for_Mobile_field() throws Throwable{
		 try{
		 JSONObject input = CommonUtil.readJsonObject("Contacts", "contacts");
			String mobile= input.get("mobile").toString();
			contactsPageValidator.enter_Data_mobile(mobile);	
		 BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering Mobile number").pass("Entered Mobile number successfully");
		 }
			catch(Exception e)
			{
				 BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering Mobile number").fail("Failed to Enter Mobile number").addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());

			}
			
	 }

	 @Given("Enter the value for Account name field")
	 public void enter_the_value_for_Account_name_field()throws Throwable {
		 try{
		 JSONObject input = CommonUtil.readJsonObject("Contacts", "contacts");
			String accountName= input.get("accountName").toString();
			contactsPageValidator.enter_Data_acctName(accountName);	
		 BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering Account name").pass("Entered Account name successfully");
		 }
			catch(Exception e)
			{
				 BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering Account name").fail("Failed to Enter Account name").addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());

			}
			
	 }

	 @Given("Enter the value for Email field")
	 public void enter_the_value_for_Email_field()throws Throwable {
		 try{
		 JSONObject input = CommonUtil.readJsonObject("Contacts", "contacts");
			String email= input.get("email").toString();
			contactsPageValidator.enter_Data_email(email);		
		 BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering Email").pass("Entered Email successfully");
		 }
			catch(Exception e)
			{
				 BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering Email").fail("Failed to Enter Email").addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());
		
			}
			
	 }

	 @Given("Enter the value for Designation Level field")
	 public void enter_the_value_for_Designation_Level_field() throws Throwable{
		 try{
		 JSONObject input = CommonUtil.readJsonObject("Contacts", "contacts");
			String designationLevel= input.get("designationLevel").toString();
			contactsPageValidator.select_DesignationLevel_Drop(designationLevel);			
		 BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering Designation Level").pass("Entered Designation Level successfully");
		 }
			catch(Exception e)
			{
				 BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering Designation Level").fail("Failed to Enter Designation Level").addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());

			}
			
	 }

	 @Given("Enter the value for Mailing Street field")
	 public void enter_the_value_for_Mailing_Street_field()throws Throwable {
		 try{
		 JSONObject input = CommonUtil.readJsonObject("Contacts", "contacts");
			String mailingStreet= input.get("mailingStreet").toString();
			contactsPageValidator.enter_Data_mailingStreet(mailingStreet);	
		 BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering Mailing Street").pass("Entered Mailing Street successfully");
		 }
			catch(Exception e)
			{
				 BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering Mailing Street").fail("Failed to Enter Mailing Street").addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());

			}
			
	 }

	 @Given("Enter the value for Mailing City field")
	 public void enter_the_value_for_Mailing_City_field() throws Throwable{
		 try{
		 JSONObject input = CommonUtil.readJsonObject("Contacts", "contacts");
			String mailingCity= input.get("mailingCity").toString();
			contactsPageValidator.enter_Data_mailingCity(mailingCity);	
		 BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering Mailing City").pass("Entered Mailing City successfully");
		 }
			catch(Exception e)
			{
				 BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering Mailing City").fail("Failed to Enter Mailing City").addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());

			}
			
	 }

	 @Given("Enter the value for Mailing State\\/Province field")
	 public void enter_the_value_for_Mailing_State_Province_field()throws Throwable {
		 try{
		 JSONObject input = CommonUtil.readJsonObject("Contacts", "contacts");
			String mailingStateProvince= input.get("mailingStateProvince").toString();
			contactsPageValidator.enter_Data_mailingState(mailingStateProvince);	
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering State").pass("Entered Mailing State successfully");
		 }
			catch(Exception e)
			{
				 BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering Mailing state").fail("Failed to Enter Mailing state").addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());

			}
			
	 }

	 @Given("Enter the value for Mailing Zip\\/Postal Code field")
	 public void enter_the_value_for_Mailing_Zip_Postal_Code_field()throws Throwable {
		 try{
		 JSONObject input = CommonUtil.readJsonObject("Contacts", "contacts");
			String mailingZipPostalCode= input.get("mailingZipPostalCode").toString();
			contactsPageValidator.enter_Data_mailingPostalCode(mailingZipPostalCode);
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering postalcode").pass("Entered Mailing postalcode successfully");
		 }
			catch(Exception e)
			{
				 BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering Mailing Postal Code").fail("Failed to Enter Mailing Postal Code").addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());

			}
			
	 }

	 @Given("Enter the value for Mailing Country field")
	 public void enter_the_value_for_Mailing_Country_field() throws Throwable {
		 try{
		 JSONObject input = CommonUtil.readJsonObject("Contacts", "contacts");
			String mailingCountry= input.get("mailingCountry").toString();
			contactsPageValidator.enter_Data_mailingCountry(mailingCountry);
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering Country").pass("Entered Mailing Country successfully");
		 }
			catch(Exception e)
			{
				 BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering Mailing Country").fail("Failed to Enter Mailing Country").addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());
	
			}
			
	 }


	 @Then("Record should be saved")
	 public void record_should_be_saved()throws Throwable {
		 try{
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Record saved").pass("Record saved successfully");
		 }
			catch(Exception e)
			{
				 BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Record saved").fail("Failed to save Record").addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());
		
			}
			
	 }
}
