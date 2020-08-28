package ui.automation.stepdef;

import java.util.List;

//import javax.jws.soap.SOAPBinding;

import org.json.simple.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
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
import ui.automation.pages.Leads_Page;
import ui.automation.pages.Leads_Page_Validator;

public class Leads_Steps {
	PropertiesFileReader obj= new PropertiesFileReader();  
	 private BaseUtil base;
	 private static ExtentReportUtil extentreportUtil= new ExtentReportUtil();
	 SoftAssert softAssert=new SoftAssert();
	 
	 Leads_Page leadsPage = new Leads_Page(Driver.browser);
	 Leads_Page_Validator leadsPageValidator = new Leads_Page_Validator(leadsPage);
	 
	/* @Given("Enter the value for first name field")
	 public void enter_the_value_for_First_Name_field() throws Throwable{
		 JSONObject input = CommonUtil.readJsonObject("Leads", "leads");
			String firstName= input.get("firstName").toString();
			leadsPageValidator.enter_Data_firstName(firstName);
	BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering first name").pass("Entered first name successfully");

	 }

	 @Given("Enter the value for last name field")
	 public void enter_the_value_for_Last_Name_field() throws Throwable {
		 JSONObject input = CommonUtil.readJsonObject("Leads", "leads");
			String lastName= input.get("lastName").toString();
			leadsPageValidator.enter_Data_lastName(lastName);
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering last name").pass("Entered last name successfully");
	 }
	 
	 @Given("Enter the value for Company field")
	 public void enter_the_value_for_company_field() throws Throwable{
		 JSONObject input = CommonUtil.readJsonObject("Leads", "leads");
			String company= input.get("Company").toString();
			leadsPageValidator.enter_Data_company(company);	
		 BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering company name").pass("Entered company name successfully");

	 }
	 @Given("Enter the value for Phone Field")
	 public void enter_the_value_for_phone_field() throws Throwable{
		 JSONObject input = CommonUtil.readJsonObject("Leads", "leads");
			String phone= input.get("phone").toString();
			leadsPageValidator.enter_Data_phone(phone);	
		 BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering phone number").pass("Entered phone number successfully");

	 }
	 @Given("Enter the value for Lead Source field")
	 public void enter_the_value_for_LeadSource_field() throws Throwable{
		 JSONObject input = CommonUtil.readJsonObject("Leads", "leads");
			String leadSource= input.get("leadSource").toString();
			leadsPageValidator.select_LeasSource_Drop(leadSource);	
		 BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering lead Source").pass("Entered lead Source successfully");

	 }
	 @Given("Enter the value for IST representative field")
	 public void Enter_the_value_for_IST_representative_field()throws Throwable
		{
		 JSONObject input = CommonUtil.readJsonObject("Leads", "leads");
			String ISTrepresentative= input.get("ISTrepresentative").toString();
			leadsPageValidator.select_ISTRepresentative_Drop(ISTrepresentative);	
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering the value for IST Representative field").pass("Entered the value for IST Representative field successfully");
	
		}
	 @Given("Enter the value for Campaign field")
	 public void Enter_the_value_for_IST_Campaign_field()throws Throwable
		{
		 JSONObject input = CommonUtil.readJsonObject("Leads", "leads");
			String campaign= input.get("campaign").toString();
			leadsPageValidator.select_Campaign_Drop(campaign);	
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering the value for campaign field").pass("Entered the value for campaign field successfully");
	
		}
	 @Given("Enter the value for vertical Grouping field")
	 public void Enter_the_value_for_Vertical_Grouping_field()throws Throwable
		{
		 JSONObject input = CommonUtil.readJsonObject("Leads", "leads");
			String verticalGrouping= input.get("verticalGrouping").toString();
			leadsPageValidator.select_vertical_groupingDrop(verticalGrouping);
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering the value for Vertical Grouping field").pass("Entered the value for Vertical Grouping field successfully");
		}
	 
	 @Given("Enter the value for Sub vertical one field")
	 public void Enter_the_value_for_Sub_Vertical_one_field()throws Throwable
		{
		 JSONObject input = CommonUtil.readJsonObject("Leads", "leads");
			String SubVertical1= input.get("SubVertical1").toString();
			leadsPageValidator.select_sub_vertical_oneDrop(SubVertical1);
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering the value for Sub Vertical one field").pass("Entered the value for Sub Vertical one field successfully");

		}
	 
	 @Given("Enter the value for vertical field")
	 public void Enter_the_value_for_Vertical_field()throws Throwable
		{
		 JSONObject input = CommonUtil.readJsonObject("Leads", "leads");
			String Vertical= input.get("Vertical").toString();
			leadsPageValidator.select_vertical_Drop(Vertical);
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering the value for Vertical field").pass("Entered the value for Vertical field successfully");

		}
	 @Given("Enter the value for revenue field")
	 public void Enter_the_value_for_revenue_field()throws Throwable
		{
		 JSONObject input = CommonUtil.readJsonObject("Leads", "leads");
			String Revenue= input.get("Revenue").toString();
			leadsPageValidator.enter_Data_Revenue(Revenue);			
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering the value for Revenue field").pass("Entered the value for Revenue field successfully");

		}
	 
	 @Given("Enter the value for Rating field")
	 public void Enter_the_value_for_Rating_field()throws Throwable
		{
		 JSONObject input = CommonUtil.readJsonObject("Leads", "leads");
			String rating= input.get("rating").toString();
			leadsPageValidator.select_Rating_Drop(rating);
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering the value for rating field").pass("Entered the value for rating field successfully");

		}
	 @Given("Enter the value for Street field")
	 public void enter_the_value_for_Street_field()throws Throwable {
		 JSONObject input = CommonUtil.readJsonObject("Leads", "leads");
			String street= input.get("street").toString();
			leadsPageValidator.enter_Data_Street(street);
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering the value for Street field").pass("Entered the value for  Street field successfully");
			
	 }

	 @Given("Enter the value for City field")
	 public void enter_the_value_for_City_field() throws Throwable{
		 JSONObject input = CommonUtil.readJsonObject("Leads", "leads");
			String city= input.get("city").toString();
			leadsPageValidator.enter_Data_City(city);
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering the value for city field").pass("Entered the value for city field successfully");
			
	 }

	 @Given("Enter the value for State\\/Province field")
	 public void enter_the_value_for_State_Province_field() throws Throwable{
		 JSONObject input = CommonUtil.readJsonObject("Leads", "leads");
			String stateProvince= input.get("stateProvince").toString();
			leadsPageValidator.enter_Data_State(stateProvince);
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering the value for state field").pass("Entered the value for state field successfully");

	 }

	 @Given("Enter the value for Zip\\/Postal Code field")
	 public void enter_the_value_for_Zip_Postal_Code_field()throws Throwable {
		 JSONObject input = CommonUtil.readJsonObject("Leads", "leads");
			String zipPostalCode= input.get("zipPostalCode").toString();
			leadsPageValidator.enter_Data_Postal(zipPostalCode);
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering the value for Postal Code field").pass("Entered the value for Postal Code field successfully");

	 }

	 @Given("Enter the value for Country field")
	 public void enter_the_value_for_Country_field() throws Throwable{
		 JSONObject input = CommonUtil.readJsonObject("Leads", "leads");
			String country= input.get("country").toString();
			leadsPageValidator.enter_Data_Country(country);
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering the value for country field").pass("Entered the value for country field successfully");

	 }	 
	 
	 @Given("Enter the value for Region field")
	 public void enter_the_value_for_Region_field() throws Throwable{
		 JSONObject input = CommonUtil.readJsonObject("Leads", "leads");
			String Region= input.get("Region").toString();
			leadsPageValidator.select_Region_Drop(Region);
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering the value for Region field").pass("Entered the value for Region field successfully");

	 }*/
	 


	 @Given("Check account accordion with create New and choose existing radio button")
	 public void check_account_accordion_with_create_New_and_choose_existing_radio_button() throws Throwable{
		Thread.sleep(5000);
		 List<WebElement>  oRadioButton = Driver.browser.findElements(By.xpath("//legend[text()='Account']/following-sibling::div//span[@class='slds-radio_faux']"));
		 boolean bValue = false;
		 boolean bValue1 = false;
		 
		 bValue = oRadioButton.get(0).isSelected();
		 bValue1 = oRadioButton.get(1).isSelected();
		 System.out.println();
	 }

	 @Given("Check contact accordion with create New and choose existing radio button")
	 public void check_contact_accordion_with_create_New_and_choose_existing_radio_button()throws Throwable {
	    
	 }

	 @Given("Check opportunity accordion with create New and choose existing radio button")
	 public void check_opportunity_accordion_with_create_New_and_choose_existing_radio_button() throws Throwable{
	    
	 }

	 @Given("Check record owner field")
	 public void check_record_owner_field() throws Throwable{
	     
	 }

	 @Given("Check converter status field")
	 public void check_converter_status_field() throws Throwable{
	    
	 }

	 @Given("Check radio button for Account \\(create New) by defult selected")
	 public void check_radio_button_for_Account_create_New_by_defult_selected()throws Throwable {
	    
	 }

	 @Given("Check radio button for Contact\\(create New) by defult selected")
	 public void check_radio_button_for_Contact_create_New_by_defult_selected() throws Throwable{
	     
	 }

	 @Given("Check radio button for opportunity\\(create New) by defult selected")
	 public void check_radio_button_for_opportunity_create_New_by_defult_selected()throws Throwable {
	    
	 }

	

	 @Given("Click on  hyperlink of account name  in account table on pop op")
	 public void click_on_hyperlink_of_account_name_in_account_table_on_pop_op() throws Throwable{
	   
	 }

	 @Given("Click on account history hyperlink")
	 public void click_on_account_history_hyperlink() throws Throwable{
	    
	 }

	 @When("user  Check the lead convert record on the account history screen")
	 public void user_Check_the_lead_convert_record_on_the_account_history_screen() throws Throwable{
	    
	 }

	 @Then("Lead convert record should be displayed")
	 public void lead_convert_record_should_be_displayed()throws Throwable {
	   
	 }
}
