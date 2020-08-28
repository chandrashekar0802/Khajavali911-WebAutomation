package ui.automation.stepdef;

import java.util.Random;

import org.json.simple.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.GherkinKeyword;

import cigniti.automation.utilities.CommonUtil;
import cigniti.automation.utilities.Driver;
import cigniti.automation.utilities.PropertiesFileReader;
import cigniti.automation.utilities.Selenide;
import cigniti.base.BaseUtil;
import cigniti.base.ExtentReportUtil;
import cucumber.api.java.en.Given;
import ui.automation.pages.Accounts_Page;
import ui.automation.pages.Accounts_Page_Validator;
import ui.automation.pages.LeadsToOpportunity_Page_Validator;
import ui.automation.pages.LeadsToOpportunity_Pages;

public class LeadsToOpportunity_Steps extends Selenide {
	PropertiesFileReader obj= new PropertiesFileReader();  
	private BaseUtil base;
	private static ExtentReportUtil extentreportUtil= new ExtentReportUtil();
	SoftAssert softAssert=new SoftAssert();

	LeadsToOpportunity_Pages leadsToOpportunityPages = new LeadsToOpportunity_Pages(Driver.browser);
	LeadsToOpportunity_Page_Validator leadsToOpportunityPageValidator = new LeadsToOpportunity_Page_Validator(leadsToOpportunityPages);

	@Given("Enter the value for first name field")
	public void enter_the_value_for_First_Name_field() throws Throwable{
		try{
			Random rand = new Random();
			JSONObject input = CommonUtil.readJsonObject("LeadsToOpportunity", "leadsToOpportunity");
			String firstName= input.get("firstName").toString();
			String alteredName =firstName+rand.nextInt(10);
			leadsToOpportunityPageValidator.enter_Data_firstName(alteredName);
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering first name").pass("Entered first name successfully");
		}		 
		catch(Exception e)
		{
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering first name").fail("Failed to Enter first name").addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());
			Assert.fail("Failed to Enter first name");
		}
	}

	@Given("Enter the value for last name field")
	public void enter_the_value_for_Last_Name_field() throws Throwable {
		try{
			Random rand = new Random();
			JSONObject input = CommonUtil.readJsonObject("LeadsToOpportunity", "leadsToOpportunity");
			String lastName= input.get("lastName").toString();
			String alteredName =lastName+rand.nextInt(10);
			leadsToOpportunityPageValidator.enter_Data_lastName(alteredName);
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering last name").pass("Entered last name successfully");
		}		 
		catch(Exception e)
		{
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering last name").fail("Failed to Enter last name").addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());
			Assert.fail("Failed to Enter first name");
		}
	}

	@Given("Enter the value for Company field")
	public void enter_the_value_for_company_field() throws Throwable{
		try{
			JSONObject input = CommonUtil.readJsonObject("LeadsToOpportunity", "leadsToOpportunity");
			String company= input.get("Company").toString();
			leadsToOpportunityPageValidator.enter_Data_company(company);	
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering company name").pass("Entered company name successfully");
		}		 
		catch(Exception e)
		{
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering company name").fail("Failed to Enter company name").addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());
			Assert.fail("Failed to Enter company name");
		}
	}
	@Given("Enter the value for Phone Field")
	public void enter_the_value_for_phone_field() throws Throwable{
		try{
			JSONObject input = CommonUtil.readJsonObject("LeadsToOpportunity", "leadsToOpportunity");
			String phone= input.get("phone").toString();
			leadsToOpportunityPageValidator.enter_Data_phone(phone);	
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering phone number").pass("Entered phone number successfully");
		}		 
		catch(Exception e)
		{
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering phone number").fail("Failed to Enter phone number").addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());
			Assert.fail("Failed to Enter phone number");
		}
	}
	@Given("Enter the value for Lead Source field")
	public void enter_the_value_for_LeadSource_field() throws Throwable{
		try{
			JSONObject input = CommonUtil.readJsonObject("LeadsToOpportunity", "leadsToOpportunity");
			String leadSource= input.get("leadSource").toString();
			leadsToOpportunityPageValidator.select_LeasSource_Drop(leadSource);	
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering lead Source").pass("Entered lead Source successfully");
		}		 
		catch(Exception e)
		{
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering lead Source").fail("Failed to Enter lead Source").addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());
			Assert.fail("Failed to Enter lead Source");
		}
	}
	@Given("Enter the value for IST representative field")
	public void Enter_the_value_for_IST_representative_field()throws Throwable
	{
		try{
			JSONObject input = CommonUtil.readJsonObject("LeadsToOpportunity", "leadsToOpportunity");
			String ISTrepresentative= input.get("ISTrepresentative").toString();
			leadsToOpportunityPageValidator.select_ISTRepresentative_Drop(ISTrepresentative);	
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering the value for IST Representative field").pass("Entered the value for IST Representative field successfully");
		}		 
		catch(Exception e)
		{
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering the value for IST Representative field").fail("Failed to Enter the value for IST Representative field").addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());
			Assert.fail("Failed to Enter the value for IST Representative field");
		}
	}
	@Given("Enter the value for Campaign field")
	public void Enter_the_value_for_IST_Campaign_field()throws Throwable
	{
		try{
			JSONObject input = CommonUtil.readJsonObject("LeadsToOpportunity", "leadsToOpportunity");
			String campaign= input.get("campaign").toString();
			leadsToOpportunityPageValidator.select_Campaign_Drop(campaign);	
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering the value for campaign field").pass("Entered the value for campaign field successfully");
		}		 
		catch(Exception e)
		{
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering the value for campaign field").fail("Failed to Enter the value for campaign field").addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());
			Assert.fail("Failed to Enter the value for campaign field");
		}
	}
	@Given("Enter the value for vertical Grouping field")
	public void Enter_the_value_for_Vertical_Grouping_field()throws Throwable
	{
		try{
			JSONObject input = CommonUtil.readJsonObject("LeadsToOpportunity", "leadsToOpportunity");
			String verticalGrouping= input.get("verticalGrouping").toString();
			leadsToOpportunityPageValidator.select_vertical_groupingDrop(verticalGrouping);
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering the value for Vertical Grouping field").pass("Entered the value for Vertical Grouping field successfully");

		}		 
		catch(Exception e)
		{
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering the value for Vertical Grouping field").fail("Failed to Enter the value for Vertical Grouping field").addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());
			Assert.fail("Failed to Enter the value for Vertical Grouping field");
		}
	}

	@Given("Enter the value for Sub vertical one field")
	public void Enter_the_value_for_Sub_Vertical_one_field()throws Throwable
	{
		try{
			JSONObject input = CommonUtil.readJsonObject("LeadsToOpportunity", "leadsToOpportunity");
			String SubVertical= input.get("SubVertical").toString();
			leadsToOpportunityPageValidator.select_sub_vertical_oneDrop(SubVertical);
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering the value for Sub Vertical one field").pass("Entered the value for Sub Vertical one field successfully");
		}		 
		catch(Exception e)
		{
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering the value for Sub Vertical one field").fail("Failed to Enter the value for Sub Vertical one field").addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());
			Assert.fail("Failed to Enter the value for Sub Vertical one field");
		}
	}

	@Given("Enter the value for vertical field")
	public void Enter_the_value_for_Vertical_field()throws Throwable
	{
		try{
			JSONObject input = CommonUtil.readJsonObject("LeadsToOpportunity", "leadsToOpportunity");
			String Vertical= input.get("Vertical").toString();
			leadsToOpportunityPageValidator.select_vertical_Drop(Vertical);
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering the value for Vertical field").pass("Entered the value for Vertical field successfully");
		}		 
		catch(Exception e)
		{
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering the value for Vertical field").fail("Failed to Enter the value for Vertical field").addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());
			Assert.fail("Failed to Enter the value for Vertical field");
		}
	}
	@Given("Enter the value for revenue field")
	public void Enter_the_value_for_revenue_field()throws Throwable
	{
		try{
			JSONObject input = CommonUtil.readJsonObject("LeadsToOpportunity", "leadsToOpportunity");
			String Revenue= input.get("Revenue").toString();
			leadsToOpportunityPageValidator.enter_Data_Revenue(Revenue);			
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering the value for Revenue field").pass("Entered the value for Revenue field successfully");
		}		 
		catch(Exception e)
		{
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering the value for Revenue field").fail("Failed to Enter the value for Revenue field").addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());
			Assert.fail("Failed to Enter the value for Revenue field");
		}
	}

	@Given("Enter the value for Rating field")
	public void Enter_the_value_for_Rating_field()throws Throwable
	{
		try{
			JSONObject input = CommonUtil.readJsonObject("LeadsToOpportunity", "leadsToOpportunity");
			String rating= input.get("rating").toString();
			leadsToOpportunityPageValidator.select_Rating_Drop(rating);
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering the value for rating field").pass("Entered the value for rating field successfully");
		}		 
		catch(Exception e)
		{
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering the value for rating field").fail("Failed to Enter the value for rating field").addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());
			Assert.fail("Failed to Enter the value for rating field");
		}
	}
	@Given("Enter the value for Street field")
	public void enter_the_value_for_Street_field()throws Throwable {
		try{
			JSONObject input = CommonUtil.readJsonObject("LeadsToOpportunity", "leadsToOpportunity");
			String street= input.get("street").toString();
			leadsToOpportunityPageValidator.enter_Data_Street(street);
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering the value for Street field").pass("Entered the value for  Street field successfully");
		}		 
		catch(Exception e)
		{
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering the value for Street field").fail("Failed to Enter the value for Street field").addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());
			Assert.fail("Failed to Enter the value for Street field");
		}
	}

	@Given("Enter the value for City field")
	public void enter_the_value_for_City_field() throws Throwable{
		try{
			JSONObject input = CommonUtil.readJsonObject("LeadsToOpportunity", "leadsToOpportunity");
			String city= input.get("city").toString();
			leadsToOpportunityPageValidator.enter_Data_City(city);
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering the value for city field").pass("Entered the value for city field successfully");
		}		 
		catch(Exception e)
		{
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering the value for city field").fail("Failed to Enter the value for city field").addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());
			Assert.fail("Failed to Enter the value for city field");
		}
	}

	@Given("Enter the value for State\\/Province field")
	public void enter_the_value_for_State_Province_field() throws Throwable{
		try{
			JSONObject input = CommonUtil.readJsonObject("LeadsToOpportunity", "leadsToOpportunity");
			String stateProvince= input.get("stateProvince").toString();
			leadsToOpportunityPageValidator.enter_Data_State(stateProvince);
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering the value for state field").pass("Entered the value for state field successfully");
		}		 
		catch(Exception e)
		{
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering the value for state field").fail("Failed to Enter the value for state field").addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());
			Assert.fail("Failed to Enter the value for state field");
		}
	}

	@Given("Enter the value for Zip\\/Postal Code field")
	public void enter_the_value_for_Zip_Postal_Code_field()throws Throwable {
		try{
			JSONObject input = CommonUtil.readJsonObject("LeadsToOpportunity", "leadsToOpportunity");
			String zipPostalCode= input.get("zipPostalCode").toString();
			leadsToOpportunityPageValidator.enter_Data_Postal(zipPostalCode);
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering the value for Postal Code field").pass("Entered the value for Postal Code field successfully");
		}		 
		catch(Exception e)
		{
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering the value for Postal Code field").fail("Failed to Enter the value for Postal Code field").addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());
			Assert.fail("Failed to Enter the value for Postal Code field");
		}
	}

	@Given("Enter the value for Country field")
	public void enter_the_value_for_Country_field() throws Throwable{
		try{
			JSONObject input = CommonUtil.readJsonObject("LeadsToOpportunity", "leadsToOpportunity");
			String country= input.get("country").toString();
			leadsToOpportunityPageValidator.enter_Data_Country(country);
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering the value for country field").pass("Entered the value for country field successfully");
		}		 
		catch(Exception e)
		{
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering the value for country field").fail("Failed to Enter the value for country field").addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());
			Assert.fail("Failed to Enter the value for country field");
		}
	}	 

	@Given("Enter the value for Region field")
	public void enter_the_value_for_Region_field() throws Throwable{
		try{
			JSONObject input = CommonUtil.readJsonObject("LeadsToOpportunity", "leadsToOpportunity");
			String Region= input.get("Region").toString();
			leadsToOpportunityPageValidator.select_Region_Drop(Region);
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering the value for Region field").pass("Entered the value for Region field successfully");
		}		 
		catch(Exception e)
		{
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering the value for Region field").fail("Failed to Enter the value for Region field").addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());
			Assert.fail("Failed to Enter the value for Region field");
		}
	} 

	//
	@Given("Click on one name from existing lead  list on the Leads Home screen")
	public void click_on_one_existing_lead_on_the_Home_screen() throws Throwable{
		try{
		/*	smallwaitTime();
			Driver.browser.findElement(By.xpath("//a[@title='Select List View']")).click();
			smallwaitTime();
			Driver.browser.findElement(By.xpath("//ul[contains(@id,'virtualAutocompleteListbox')]/li[6]/a")).click();
			smallwaitTime();*/
			leadsToOpportunityPageValidator.click_firstLeadInLeadsHomeScreen_link();
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Clicking on one Lead name").pass("Clicked on one Lead name successfully");
		}		 
		catch(Exception e)
		{
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Clicking on one Lead name").fail("Failed to Click on one Lead name").addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());
			Assert.fail("Failed to Click on one Lead name");
		}
	}

	/*	 @Given("Check Convert tab Left side of edit tab in lead detail screen")
	 public void check_Convert_tab_Left_side_of_edit_tab_in_lead_detail_screen() throws Throwable{
		 String str = leadsToOpportunityPageValidator.convertTab_Leftside_Edit_Btn();
		 softAssert.assertEquals(str.equals("Conver"), true);
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Check Convert tab").pass("Checking of Convert tab Left side of edit tab in lead detail screen successfully");

		 if(str.equals("Convert")){
		 }
		 else
		 {
			//	BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Check Convert tab").fail("Checking of Convert tab Left side of edit tab in lead detail screen successfully").a;

		 }
	 }*/

	@Given("Click on Convert tab")
	public void click_on_Convert_tab() throws Throwable{
		try{
			waitTime();
			// Thread.sleep(3000);;
			smallwaitTime();
			boolean flag = leadsToOpportunityPageValidator.click_Convert_Tab();
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Click on Convert tab").pass("Clicked on Convert tab successfully");
		}		 
		catch(Exception e)
		{
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Click on Convert tab").fail("Failed to Click on Convert tab").addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());
			Assert.fail("Failed to Click on Convert tab");
		}
	}
	//new
	@Given("^Enter the value for Lead Status field$")
	public void enterTheValueForLeadStatusField() throws Throwable {
		try{
			JSONObject input = CommonUtil.readJsonObject("LeadsToOpportunity", "leadsToOpportunity");
			String leadStatus= input.get("leadStatus").toString();
			leadsToOpportunityPageValidator.select_LeadStatus_Dropdown(leadStatus);
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "selecting Lead Status").pass("selected Lead Status successfully");
		}		 
		catch(Exception e)
		{
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "selecting Lead Status").fail("Failed to select Lead Status").addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());
			Assert.fail("Failed to select Lead Status");
		}
	}

	@Given("^Enter the value for Salutation field$")
	public void enterTheValueForSalutationField() throws Throwable {
		try{
			JSONObject input = CommonUtil.readJsonObject("LeadsToOpportunity", "leadsToOpportunity");
			String salutation= input.get("salutation").toString();
			leadsToOpportunityPageValidator.select_Salutation_Dropdown(salutation);
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering Salutation").pass("Entered Salutation successfully");
		}		 
		catch(Exception e)
		{
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering Salutation").fail("Failed to Enter Salutation").addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());
			Assert.fail("Failed to Enter Salutation");
		}

	}

	@Given("^Enter the value for Fax field$")
	public void enterTheValueForFaxField() throws Throwable {
		try{
			JSONObject input = CommonUtil.readJsonObject("LeadsToOpportunity", "leadsToOpportunity");
			String fax= input.get("fax").toString();
			leadsToOpportunityPageValidator.enter_Data_fax(fax);
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering Fax ").pass("Entered Fax successfully");
		}		 
		catch(Exception e)
		{
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering Fax").fail("Failed to Enter Fax").addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());
			Assert.fail("Failed to Enter Fax");
		}
	}

	@Given("^Enter the value for Title field$")
	public void enterTheValueForTitleField() throws Throwable {
		try{
			JSONObject input = CommonUtil.readJsonObject("LeadsToOpportunity", "leadsToOpportunity");
			String title= input.get("title").toString();
			leadsToOpportunityPageValidator.enter_Data_Title(title);
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering Title").pass("Entered Title successfully");
		}		 
		catch(Exception e)
		{
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering Title").fail("Failed to Enter Title").addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());
			Assert.fail("Failed to Enter Title");
		}

	}

	@Given("^Enter the value for Website field$")
	public void enterTheValueForWebsiteField() throws Throwable {
		try{
			JSONObject input = CommonUtil.readJsonObject("LeadsToOpportunity", "leadsToOpportunity");
			String website= input.get("website").toString();
			leadsToOpportunityPageValidator.enter_Data_Website(website);
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering website").pass("Entered website successfully");
		}		 
		catch(Exception e)
		{
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering website").fail("Failed to Enter website").addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());
			Assert.fail("Failed to Enter website");
		}
	}
	@Given("Enter the value for email field")
	public void enter_the_value_for_Email_field()throws Throwable {
		try{
			JSONObject input = CommonUtil.readJsonObject("LeadsToOpportunity", "leadsToOpportunity");
			String email= input.get("email").toString();
			leadsToOpportunityPageValidator.enter_Data_email(email);		
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering Email").pass("Entered Email successfully");
		}		 
		catch(Exception e)
		{
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering Email").fail("Failed to Enter Email").addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());
			Assert.fail("Failed to Enter Email");
		}
	}

	@Given("^Enter the value for Ownership field$")
	public void enterTheValueForOwnershipField() throws Throwable {
		try{
			JSONObject input = CommonUtil.readJsonObject("LeadsToOpportunity", "leadsToOpportunity");
			String ownership= input.get("ownership").toString();
			leadsToOpportunityPageValidator.select_ownership_Dropdown(ownership);
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering ownership").pass("Entered ownership successfully");
		}		 
		catch(Exception e)
		{
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering ownership").fail("Failed to Enter ownership").addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());
			Assert.fail("Failed to Enter ownership");
		}
	}

	@Given("^Enter the value for Revenue Range field$")
	public void enterTheValueForRevenueRangeField() throws Throwable {
		try{
			JSONObject input = CommonUtil.readJsonObject("LeadsToOpportunity", "leadsToOpportunity");
			String revenueRange= input.get("revenueRange").toString();
			leadsToOpportunityPageValidator.select_revenueRange_Dropdown(revenueRange);
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering revenue range").pass("Entered revenue range successfully");
		}		 
		catch(Exception e)
		{
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering revenue range").fail("Failed to Enter revenue range").addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());
			Assert.fail("Failed to Enter revenue range");
		}
	}

	@Given("^Enter the value for Contact Locaton field$")
	public void enterTheValueForContactLocatonField() throws Throwable {
		try{
			JSONObject input = CommonUtil.readJsonObject("LeadsToOpportunity", "leadsToOpportunity");
			String contactlocation= input.get("contactlocation").toString();
			leadsToOpportunityPageValidator.enter_Data_contactLocation(contactlocation);
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering Contact Locaton").pass("Entered Contact Locaton successfully");
		}		 
		catch(Exception e)
		{
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering Contact Locaton").fail("Failed to Enter Contact Locaton").addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());
			Assert.fail("Failed to Enter Contact Locaton");
		}
	}

	@Given("^Enter the value for BDM field$")
	public void enterTheValueForBDMField() throws Throwable {
		try{
			JSONObject input = CommonUtil.readJsonObject("LeadsToOpportunity", "leadsToOpportunity");
			String bdm= input.get("bdm").toString();
			leadsToOpportunityPageValidator.select_BDM_Dropdown(bdm);
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering BDM").pass("Entered BDM successfully");
		}		 
		catch(Exception e)
		{
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering BDM").fail("Failed to Enter BDM").addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());
			Assert.fail("Failed to Enter BDM");
		}
	}

	@Given("^Enter the value for Business Unit field$")
	public void enterTheValueForBusinessUnitField() throws Throwable {
		try{
			JSONObject input = CommonUtil.readJsonObject("LeadsToOpportunity", "leadsToOpportunity");
			String businessUnit= input.get("businessUnit").toString();
			leadsToOpportunityPageValidator.select_BusinesUnit_Dropdown(businessUnit);
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering Business Unit").pass("Entered Business Unit successfully");
		}		 
		catch(Exception e)
		{
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering Business Unit").fail("Failed to Enter Business Unit").addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());
			Assert.fail("Failed to Enter Business Unit");
		}
	}

	@Given("^Change Lead Status field value to \"([^\"]*)\"$")
	public void changeLeadStatusFieldValueTo(String leadStatus) throws Throwable {
		try{
			leadsToOpportunityPageValidator.select_LeadStatus_Dropdown(leadStatus);	
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering lead Source").pass("Entered lead Source successfully");
		}		 
		catch(Exception e)
		{
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering lead Source").fail("Failed to Enter lead Source").addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());
			Assert.fail("Failed to Enter lead Source");
		}
	}

	@Given("^Select radio button for Account create New$")
	public void selectRadioButtonForAccountCreateNew() throws Throwable {
		try{
			leadsToOpportunityPageValidator.click_CreateNewRadioBtnInAccount_Btn();
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Select radio button").pass("Selected radio button for Account create New successfully");
		}		 
		catch(Exception e)
		{
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Select radio button").fail("Failed to Select radio button").addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());
			Assert.fail("Failed to Select radio button");
		}
	}

	@Given("^Select radio button for Contact choose existing$")
	public void selectRadioButtonForContactChooseExisting() throws Throwable {
		try{
			smallwaitTime();
			leadsToOpportunityPageValidator.click_chooseExistingRadioBtnInContact_Btn();
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Select radio button").pass("Selected radio button for Contact choose existing successfully");
		}		 
		catch(Exception e)
		{
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Select radio button").fail("Failed to Select radio button for Contact choose existing").addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());
			Assert.fail("Failed to Select radio button for Contact choose existing");
		}
	}

	@Given("^Search for matching contact  and select one contact name form list$")
	public void searchForMatchingContactAndSelectOneContactNameFormList() throws Throwable {
		try{
			leadsToOpportunityPageValidator.click_contactSearchInChooseExistingRadioBtnInContact();
			//Thread.sleep(3000);
			smallwaitTime();
			leadsToOpportunityPageValidator.click_FirstRecordIncontactSearchInChooseExistingRadioBtnInContact();
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "select one contact name").pass("Searched for matching contact  and selected one contact name form list successfully");
		}		 
		catch(Exception e)
		{
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "select one contact name").fail("Failed to select one contact name").addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());
			Assert.fail("Failed to select one contact name");
		}
	}
	@Given("Click on convert button")
	public void click_on_convert_button()throws Throwable {
		try{
			String str =Driver.browser.findElement(By.xpath("//button[contains(@title,'Mr')]")).getText();
			leadsToOpportunityPageValidator.click_Convert_Btn();
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Click on convert button").pass("Clicked on convert button successfully");
		}		 
		catch(Exception e)
		{
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Click on convert button").fail("Failed to Click on convert button").addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());
			Assert.fail("Failed to Click on convert button");
		}
	}

	@Given("^Click on hyperlink of Account name in account table on Your lead has been converted layout sceen$")
	public void clickOnHyperlinkOfAccountNameInAccountTableOnYourLeadHasBeenConvertedLayoutSceen() throws Throwable {
		try{
			leadsToOpportunityPageValidator.click_acctNameHyperLinkAccountTableOnYourLeadHasBeenConvertedLayoutSceen();
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Click on hyperlink of Account name").pass("Clicked on hyperlink of Account name successfully");
		}		 
		catch(Exception e)
		{
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Click on hyperlink of Account name").fail("Failed to Click on hyperlink of Account name").addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());
			Assert.fail("Failed to Click on hyperlink of Account name");
		}
	}

	@Given("^Click on Account History hyperlink$")
	public void clickOnAccountHistoryHyperlink() throws Throwable {
		try{
			//Selenide.scrollIntoView(By.xpath("((//span[text()='Account History'])[1]/.. |(//span[text()='Account History']/ancestor::a[@class='slds-card__header-link baseCard__header-title-container'])[2])[last()]"));
			//waitTime();
			smallwaitTime();
			JavascriptExecutor js = (JavascriptExecutor) Driver.browser;
			js.executeScript("window.scrollBy(0,500)");	
			smallwaitTime();
			js.executeScript("window.scrollBy(0,500)");
			smallwaitTime();
			js.executeScript("window.scrollBy(0,500)");
			smallwaitTime();
			leadsToOpportunityPageValidator.click_accontHistoryHyperLink();
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Click on Account History hyperlink").pass("Clicked on Account History hyperlink successfully");
		}		 
		catch(Exception e)
		{
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Click on Account History hyperlink").fail("Failed to Click on Account History hyperlink").addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());
			Assert.fail("Failed to Click on Account History hyperlink");
		}
	}

	@Given("^Check the lead convert record on the Account History screen$")
	public void checkTheLeadConvertRecordOnTheAccountHistoryScreen() throws Throwable {
		try{
			boolean isPresent=leadsToOpportunityPageValidator.isDisplayed_LeadConvertRecordOnTheAccountHistoryScreen();
			if(isPresent)
			{
				BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Check the lead convert record").pass("Check the lead convert record on the Account History screen successfully");
			}
			else
			{
				BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Check the lead convert record").fail("Failed to Check the lead convert record").addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());

			}
		}		 
		catch(Exception e)
		{
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Check the lead convert record").fail("Failed to Check the lead convert record").addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());
			Assert.fail("Failed to Check the lead convert record");
		}
	}

	@Given("^Select radio button for Account Choose existing$")
	public void selectRadioButtonForAccountChooseExisting() throws Throwable {
		try{
			leadsToOpportunityPageValidator.click_chooseExistingRadioBtnInAccount_Btn();
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "click radio button").pass("clicked radio button Choose existing for Account successfully");
		}		 
		catch(Exception e)
		{
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "click radio button").fail("Failed to click radio button").addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());
			Assert.fail("Failed to click radio button");
		}
	}

	@Given("^Search for matching Account and select one Account name form list$")
	public void searchForMatchingAccountAndSelectOneAccountNameFormList() throws Throwable {
		try{
			leadsToOpportunityPageValidator.click_accountSearchInChooseExistingRadioBtnInAccount();
			//Thread.sleep(3000);	
			smallwaitTime();
			leadsToOpportunityPageValidator.click_FirstRecordInAccountSearchInChooseExistingRadioBtnInAccount();
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "select one Account name").pass("Searched for matching contact  and selected one Account name form list successfully");
		}		 
		catch(Exception e)
		{
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "select one Account name").fail("Failed to select one Account name").addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());
			Assert.fail("Failed to select one Account name");
		}
	}

	@Given("^Select radio button for Contact create New$")
	public void selectRadioButtonForContactCreateNew() throws Throwable {
		try{
			leadsToOpportunityPageValidator.click_CreateNewRadioBtnInContact_Btn();
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Select radio button").pass("Selected radio button for Contact create New successfully");
		}		 
		catch(Exception e)
		{
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Select radio button").fail("Failed to Select radio button").addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());
			Assert.fail("Failed to Select radio button");
		}
	}

	@Given("^Select radio button for Opportunity choose existing$")
	public void selectRadioButtonForOpportunityChooseExisting() throws Throwable {
		try{
			leadsToOpportunityPageValidator.click_chooseExistingRadioBtnInOpportunity_Btn();
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "click radio button").pass("clicked radio button Choose existing for Opportunity successfully");
		}		 
		catch(Exception e)
		{
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "click radio button").fail("Failed to click radio button").addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());
			Assert.fail("Failed to click radio button");
		}
	}

	@Given("^Select one record from Opportunity grid$")
	public void selectOneRecordFromOpportunityGrid() throws Throwable {
		try{
			leadsToOpportunityPageValidator.click_selectFirstRecordInOpportunitySearchInChooseExistingRadioBtnInOpportunity();
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "click radio button").pass("clicked one radio button from Choose existing for Opportunity successfully");
		}		 
		catch(Exception e)
		{
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "click radio button").fail("Failed to click radio button").addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());
			Assert.fail("Failed to click radio button");
		}
	}

	@Given("^Select radio button for Opportunity create New$")
	public void selectRadioButtonForOpportunityCreateNew() throws Throwable {
		try{
			leadsToOpportunityPageValidator.click_CreateNewRadioBtnInOpportunity_Btn();
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Select radio button").pass("Selected radio button for Opportunity create New successfully");
		}		 
		catch(Exception e)
		{
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Select radio button").fail("Failed to Select radio button").addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());
			Assert.fail("Failed to Select radio button");
		}
	}
}
