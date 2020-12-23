package com.ds.automation.steps;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.json.simple.JSONObject;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.GherkinKeyword;
import com.cigniti.automation.reports.BaseUtil;
import com.cigniti.automation.reports.ExtentReportUtil;
import com.cigniti.automation.utilities.CommonUtil;
import com.cigniti.automation.utilities.Driver;
import com.cigniti.automation.utilities.PropertiesFileReader;
import com.cigniti.automation.utilities.Selenide;
import com.ds.automation.bussinessfunctions.Contacts_Page;
import com.ds.automation.bussinessfunctions.Contacts_Page_Validator;
import com.ds.automation.bussinessfunctions.Opportunity_Page;
import com.ds.automation.bussinessfunctions.Opportunity_Page_Validator;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Opportunity_Steps extends Selenide{
	PropertiesFileReader obj= new PropertiesFileReader();  
	 private BaseUtil base;
	 private static ExtentReportUtil extentreportUtil= new ExtentReportUtil();
	 SoftAssert softAssert=new SoftAssert();
	 public static String ClosingDate = "";
	 Opportunity_Page opportunityPage = new Opportunity_Page(Driver.browser);
	 Opportunity_Page_Validator opportunityPageValidator = new Opportunity_Page_Validator(opportunityPage);
	 

	/* @Given("Enter the value for Opportunity Name field")
	 public void enter_the_value_for_Opportunity_Name_field() throws Throwable{
		 JSONObject input = CommonUtil.readJsonObject("Opportunity", "createOpportunity");
			String opportunityName= input.get("opportunityName").toString();
			opportunityPageValidator.enter_Data_opportunityName(opportunityName);
	BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering opportunity name").pass("Entered opportunity Name successfully");		 
	 }

	 @Given("Enter the value for account Name field")
	 public void enter_the_value_for_account_Name_field() throws Throwable{
		 JSONObject input = CommonUtil.readJsonObject("Opportunity", "createOpportunity");
			String accountName= input.get("accountName").toString();
			opportunityPageValidator.enter_Data_acctName(accountName);
	BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering account name").pass("Entered account Name successfully");
		 
	 }

	 @Given("Enter the value for Close Date field {int}")
	 public void enter_the_value_for_Close_Date_field(Integer days) throws Throwable{
		 Date date = new Date();  
		    Calendar calendar = Calendar.getInstance();		     
		      calendar.setTime(date);
		      calendar.add(Calendar.DAY_OF_MONTH, days);
		      Date dateAsObjAfterAMonth = calendar.getTime() ;
			    SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy"); 
			    String afterDate= formatter.format(dateAsObjAfterAMonth);  
			    ClosingDate=afterDate;
		 opportunityPageValidator.enter_Data_closeDate(afterDate);
	BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering Close Date").pass("Entered Close Date successfully");
		 
	 }

	 @Given("Enter the value for Stage field")
	 public void enter_the_value_for_Stage_field() throws Throwable{
		 JSONObject input = CommonUtil.readJsonObject("Opportunity", "createOpportunity");
			String stage= input.get("stage").toString();
			opportunityPageValidator.select_stage_Drop(stage);
	BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering stage").pass("Entered stage successfully");
		 
	 }

	 @Given("Enter the value for Type field")
	 public void enter_the_value_for_Type_field() throws Throwable{
		 JSONObject input = CommonUtil.readJsonObject("Opportunity", "createOpportunity");
			String type= input.get("type").toString();
			opportunityPageValidator.select_type_Drop(type);
	BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering type").pass("Entered type successfully");
		 
	 }

	 @Given("Enter the value for Probability field")
	 public void enter_the_value_for_Probability_field() throws Throwable {
		 JSONObject input = CommonUtil.readJsonObject("Opportunity", "createOpportunity");
			String probability= input.get("probability").toString();
			opportunityPageValidator.enter_Data_probability(probability);
	BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering probability").pass("Entered probability successfully");
	 }

	 @Given("Enter the value for Amount field")
	 public void enter_the_value_for_Amount_field() throws Throwable {
		 JSONObject input = CommonUtil.readJsonObject("Opportunity", "createOpportunity");
			String Amount= input.get("Amount").toString();
			opportunityPageValidator.enter_Data_amount(Amount);
	BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering Amount").pass("Entered Amount successfully");
	 }

	 @Given("Enter the value for Risks, Competition and Comments field")
	 public void enter_the_value_for_Risks_Competition_and_Comments_field()throws Throwable {
		 JSONObject input = CommonUtil.readJsonObject("Opportunity", "createOpportunity");
			String risksCompetitionComments= input.get("risksCompetitionComments").toString();
			opportunityPageValidator.enter_Data_riskCompetitionComments(risksCompetitionComments);
	BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering risks,Competition and Comments").pass("Entered risks,Competition and Comments successfully");
	 }*/

	 @Then("Opportunity Record Should be saved")
	 public void opportunity_Record_Should_be_saved() throws Throwable{
		//boolean isPresent =opportunityPageValidator.Validate_OpportunityCreate_Msg();
//softAssert.assertTrue(isPresent,"Record is not saved");
BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Opportunity Record").pass("Opportunity Record created successfully");

	 }
	 @Given("Click on one Opportunities name from existing Opportunities list on the  Home screen")
	 public void click_on_one_Opportunities_name_from_existing_Opportunities_list_on_the_Home_screen() throws Throwable{
		 opportunityPageValidator.click_firstOpportunityInOpportunityHomeScreen_link();
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Clicking on one Opportunities name").pass("Clicked on one Opportunities name successfully");

	 }

	/* @Given("Check on Products tab which is displayed under Related at right pane")
	 public void check_on_Products_tab_which_is_displayed_under_Related_at_right_pane() throws Throwable{
		 waitTime();
		 JavascriptExecutor js = (JavascriptExecutor) Driver.browser;
			js.executeScript("window.scrollBy(0,200)");
		 opportunityPageValidator.click_productsDrpdownInRightPane_link();
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Clicking on Products tab").pass("Clicked on Products tab successfully");

	 }*/

	/* @Given("Click on Add Products from drop down")
	 public void click_on_Add_Products_from_drop_down()throws Throwable {
		 opportunityPageValidator.click_addProductInDrpdwn();
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Clicking on Add Products").pass("Clicked on Add Products successfully");

	 }*/

	/* @Given("Select valid Product Checkbox and Click on Next")
	 public void select_valid_Product_Checkbox_and_Click_on_Next() throws Throwable{
		 JSONObject input = CommonUtil.readJsonObject("Opportunity", "createProduct");
			String productCheckbox= input.get("productCheckbox").toString();
		 opportunityPageValidator.click_CheckBoxForProductNameInAddProduct(productCheckbox);
		 opportunityPageValidator.click_Next_Btn();
		BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Clicking on Checkbox").pass("Clicked on checkbox and then clicked on next button successfully");

	 }*/

	/* @Given("Enter the value for Quantity field")
	 public void enter_the_value_for_Quantity_field()throws Throwable {
		 JSONObject input = CommonUtil.readJsonObject("Opportunity", "createProduct");
			String Quantity= input.get("Quantity").toString();
			System.out.println("uantity is"+Quantity);
			opportunityPageValidator.enter_Data_quantity(Quantity);
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "entering Quantity").pass("entered Quantity successfully");

	 }

	 @Given("Enter the value for Date field")
	 public void enter_the_value_for_Date_field() throws Throwable{
		 Date date = new Date();
		 SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy"); 
		    String todayDate= formatter.format(date);  
		 opportunityPageValidator.enter_Data_date(todayDate);
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "entering  Date").pass("entered  Date successfully");

	 }*/

	 @Then("record should be Saved")
	 public void record_should_be_Saved() throws Throwable{
		 opportunityPageValidator.Validate_ProductRecord_Update();
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "record should be Saved").pass("record  Saved successfully");

	 }
	 @When("Verifying the Close Date field in Details page")
	 public void verifying_the_Close_Date_field_in_Details_page() throws Throwable{
		 opportunityPageValidator.CloseDate_present_InDetailsPage();
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Verifying Close Date").pass("Verifying Close Date successfully");

	 }

	 @Then("Close Date field should display the value which we have updated in the setting when greater than Close date is selected")
	 public void close_Date_field_should_display_the_value_which_we_have_updated_in_the_setting_when_greater_than_Close_date_is_selected() throws Throwable{
		 String date = opportunityPageValidator.CloseDate_Value_InDetailsPage();
		 softAssert.assertTrue(ClosingDate==date,"Dates are not eual");
		 BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Close Date field").pass("Close Date field is display the value which we have updated");

	 }
	/* @Given("Enter the {string}")
	 public void enter_the(String amount) throws Throwable{
			opportunityPageValidator.enter_Data_amount(amount);
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering Amount").pass("Entered Amount successfully");
	 }
	 @Given("Enter the value for Stage field {string}")
	 public void enter_the_value_for_Stage_field(String stage)throws Throwable {
		 opportunityPageValidator.select_stage_Drop(stage);
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering stage").pass("Entered stage successfully");
	 }*/
	 @Given("Verify the Close date should be updated with Current date")
	 public void verify_the_Close_date_should_be_updated_with_Current_date() throws Throwable{
		 String uiDate = opportunityPageValidator.CloseDate_Value_InDetailsPage();
		 Date date = new Date();
		 SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy"); 
		    String todayDate= formatter.format(date);  
		    Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(uiDate); 
		    Date date2=new SimpleDateFormat("dd/MM/yyyy").parse(todayDate); 
		    if(date1.equals(date2))
		    {
		    	 BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Close Date field").pass("Close Date field is display the value which we have updated");
		    }
		    else{
		    	softAssert.fail("Dates are not equal");
		    }		
	 }

	 @Given("Click on Edit button for created opportunity")
	 public void click_on_Edit_button_for_created_opportunity() throws Throwable{
		 opportunityPageValidator.click_NextBtn_Opportinities();
	 }

	 @Then("Close date should display with Previous updated value")
	 public void close_date_should_display_with_Previous_updated_value() throws Throwable{
		 waitTime();
		 String uiDateUpdated = opportunityPageValidator.CloseDate_Value_InDetailsPage();
		 Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(uiDateUpdated); 
		    Date date2=new SimpleDateFormat("dd/MM/yyyy").parse(ClosingDate); 
		    if(date1.equals(date2))
		    {
		    	 BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Close Date field").pass("Close date should display with Previous updated value");
		    }
		    else{
		    	softAssert.fail("Dates are not equal");
		    }
	 }
}
