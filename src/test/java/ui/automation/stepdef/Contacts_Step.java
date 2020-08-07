package ui.automation.stepdef;

import org.json.simple.JSONObject;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.GherkinKeyword;

import cigniti.automation.utilities.CommonUtil;
import cigniti.automation.utilities.Driver;
import cigniti.automation.utilities.PropertiesFileReader;
import cigniti.base.BaseUtil;
import cigniti.base.ExtentReportUtil;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import ui.automation.pages.Accounts_Page;
import ui.automation.pages.Accounts_Page_Validator;
import ui.automation.pages.Contacts_Page;
import ui.automation.pages.Contacts_Page_Validator;

public class Contacts_Step {
	PropertiesFileReader obj= new PropertiesFileReader();  
	 private BaseUtil base;
	 private static ExtentReportUtil extentreportUtil= new ExtentReportUtil();
	 SoftAssert softAssert=new SoftAssert();
	 
	 Contacts_Page contactsPage = new Contacts_Page(Driver.browser);
	 Contacts_Page_Validator contactsPageValidator = new Contacts_Page_Validator(contactsPage);

	 
	 @Given("Enter the value for First Name field")
	 public void enter_the_value_for_First_Name_field() throws Throwable{
		 JSONObject input = CommonUtil.readJsonObject("Contacts", "contacts");
			String firstName= input.get("firstName").toString();
			contactsPageValidator.enter_Data_firstName(firstName);
	BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering first name").pass("Entered first name successfully");

	 }

	 @Given("Enter the value for Last Name field")
	 public void enter_the_value_for_Last_Name_field() throws Throwable {
		 JSONObject input = CommonUtil.readJsonObject("Contacts", "contacts");
			String lastName= input.get("lastName").toString();
			contactsPageValidator.enter_Data_lastName(lastName);
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering last name").pass("Entered last name successfully");
	 }

	 @Given("Enter the value for phone field")
	 public void enter_the_value_for_phone_field() throws Throwable{
		 JSONObject input = CommonUtil.readJsonObject("Contacts", "contacts");
			String phone= input.get("phone").toString();
			contactsPageValidator.enter_Data_phone(phone);	
		 BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering phone number").pass("Entered phone number successfully");

	 }

	 @Given("Enter the value for Mobile field")
	 public void enter_the_value_for_Mobile_field() throws Throwable{
		 JSONObject input = CommonUtil.readJsonObject("Contacts", "contacts");
			String mobile= input.get("mobile").toString();
			contactsPageValidator.enter_Data_mobile(mobile);	
		 BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering Mobile number").pass("Entered Mobile number successfully");

	 }

	 @Given("Enter the value for Account name field")
	 public void enter_the_value_for_Account_name_field()throws Throwable {
		 JSONObject input = CommonUtil.readJsonObject("Contacts", "contacts");
			String accountName= input.get("accountName").toString();
			contactsPageValidator.enter_Data_acctName(accountName);	
		 BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering Account name").pass("Entered Account name successfully");

	 }

	 @Given("Enter the value for Email field")
	 public void enter_the_value_for_Email_field()throws Throwable {
		 JSONObject input = CommonUtil.readJsonObject("Contacts", "contacts");
			String email= input.get("email").toString();
			contactsPageValidator.enter_Data_email(email);		
		 BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering Email").pass("Entered Email successfully");

	 }

	 @Given("Enter the value for Designation Level field")
	 public void enter_the_value_for_Designation_Level_field() throws Throwable{
		 JSONObject input = CommonUtil.readJsonObject("Contacts", "contacts");
			String designationLevel= input.get("designationLevel").toString();
			contactsPageValidator.select_DesignationLevel_Drop(designationLevel);			
		 BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering Designation Level").pass("Entered Designation Level successfully");

	 }

	 @Given("Enter the value for Mailing Street field")
	 public void enter_the_value_for_Mailing_Street_field()throws Throwable {
		 JSONObject input = CommonUtil.readJsonObject("Contacts", "contacts");
			String mailingStreet= input.get("mailingStreet").toString();
			contactsPageValidator.enter_Data_mailingStreet(mailingStreet);	
		 BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering Mailing Street").pass("Entered Mailing Street successfully");

	 }

	 @Given("Enter the value for Mailing City field")
	 public void enter_the_value_for_Mailing_City_field() throws Throwable{
		 JSONObject input = CommonUtil.readJsonObject("Contacts", "contacts");
			String mailingCity= input.get("mailingCity").toString();
			contactsPageValidator.enter_Data_mailingCity(mailingCity);	
		 BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering Mailing City").pass("Entered Mailing City successfully");

	 }

	 @Given("Enter the value for Mailing State\\/Province field")
	 public void enter_the_value_for_Mailing_State_Province_field()throws Throwable {
		 JSONObject input = CommonUtil.readJsonObject("Contacts", "contacts");
			String mailingStateProvince= input.get("mailingStateProvince").toString();
			contactsPageValidator.enter_Data_mailingState(mailingStateProvince);	
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering State").pass("Entered Mailing State successfully");

	 }

	 @Given("Enter the value for Mailing Zip\\/Postal Code field")
	 public void enter_the_value_for_Mailing_Zip_Postal_Code_field()throws Throwable {
		 JSONObject input = CommonUtil.readJsonObject("Contacts", "contacts");
			String mailingZipPostalCode= input.get("mailingZipPostalCode").toString();
			contactsPageValidator.enter_Data_mailingPostalCode(mailingZipPostalCode);
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering postalcode").pass("Entered Mailing postalcode successfully");

	 }

	 @Given("Enter the value for Mailing Country field")
	 public void enter_the_value_for_Mailing_Country_field() throws Throwable{
		 JSONObject input = CommonUtil.readJsonObject("Contacts", "contacts");
			String mailingCountry= input.get("mailingCountry").toString();
			contactsPageValidator.enter_Data_mailingCountry(mailingCountry);
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering Country").pass("Entered Mailing Country successfully");

	 }


	 @Then("Record should be saved")
	 public void record_should_be_saved()throws Throwable {
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Record saved").pass("Record saved successfully");

	 }
}
