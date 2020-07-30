package ui.automation.stepdef;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

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
import ui.automation.pages.Contacts_Page;
import ui.automation.pages.Contacts_Page_Validator;
import ui.automation.pages.Opportunity_Page;
import ui.automation.pages.Opportunity_Page_Validator;

public class Opportunity_Steps {
	PropertiesFileReader obj= new PropertiesFileReader();  
	 private BaseUtil base;
	 private static ExtentReportUtil extentreportUtil= new ExtentReportUtil();
	 SoftAssert softAssert=new SoftAssert();
	 
	 Opportunity_Page opportunityPage = new Opportunity_Page(Driver.browser);
	 Opportunity_Page_Validator opportunityPageValidator = new Opportunity_Page_Validator(opportunityPage);
	 
	

	 @Given("Click on New button on the Opportunities Home screen")
	 public void click_on_New_button_on_the_Opportunities_Home_screen() throws Throwable{
		 opportunityPageValidator.click_New_Button();
		 //Thread.sleep(5000);
		BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "clicking on New button").pass("clicked on New button successfully");
		
	 }

	 @Given("Enter the value for Opportunity Name field")
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

	 @Given("Enter the value for Close Date field")
	 public void enter_the_value_for_Close_Date_field() throws Throwable{
		 Date date = new Date();  
		    Calendar calendar = Calendar.getInstance();		     
		      calendar.setTime(date);
		      calendar.add(Calendar.MONTH, 1);
		      Date dateAsObjAfterAMonth = calendar.getTime() ;
			    SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy"); 
			    String afterDate= formatter.format(dateAsObjAfterAMonth);  
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
	 }

	 @When("user Click's on Save button")
	 public void user_Click_s_on_Save_button() throws Throwable{
		 opportunityPageValidator.click_Save_Button();
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Clicking on Save button").pass("Clicked on Save button successfully");
	 }

	 @Then("Opportunity Record Should be saved")
	 public void opportunity_Record_Should_be_saved() throws Throwable{
	    
	 }
}
