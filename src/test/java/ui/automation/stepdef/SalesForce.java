package ui.automation.stepdef;

import java.util.Properties;

import org.json.simple.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.GherkinKeyword;
import cigniti.automation.utilities.*;
import cigniti.automation.utilities.CommonUtil;
import cigniti.automation.utilities.Driver;
import cigniti.automation.utilities.PropertiesFileReader;
import cigniti.automation.utilities.Selenide;
import cigniti.reports.BaseUtil;
import cigniti.reports.ExtentReportUtil;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import ui.automation.pages.Elsevier_Home_Page;
import ui.automation.pages.Elsevier_Home_Page_Validator;
import ui.automation.pages.SalesForce_Page;
import ui.automation.pages.SalesForce_Page_Validator;

public class SalesForce extends Selenide{
	PropertiesFileReader obj= new PropertiesFileReader();  
	private BaseUtil base;
	private static ExtentReportUtil extentreportUtil= new ExtentReportUtil();
	SoftAssert softAssert=new SoftAssert();

	SalesForce_Page salesForcePage = new SalesForce_Page(Driver.browser);
	SalesForce_Page_Validator salesForceValidator = new SalesForce_Page_Validator(salesForcePage);

	@Given("Give user login to Salesforce with the correct credentials")
	public void Give_user_login_to_Salesforce_with_the_correct_credentials()throws Throwable
	{
		try{
			JSONObject input = CommonUtil.readJsonObject("login", "users");
			String username= input.get("username").toString();
			String password=  input.get("password").toString();
			Properties properties=obj.getProperty(); 
			String url=properties.getProperty("browser.baseURL");
			Driver.browser.get(url);
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Url enter").pass("Url entered successfully");
			//Reporters.successReport("Url entering","Url entered successfully");
			salesForceValidator.enter_credentials(username,password);
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Username and Password entering").pass("Username and Password entering entered successfully");
			//Reporters.successReport("Username and Password entering","Username and Password entered successfully");

			salesForceValidator.click_login();
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Click on Login button").pass("Clicked on Login button successfully");
			//Reporters.successReport("Click on Login button","Clicked on Login button successfully");
			//salesForceValidator.click_remindLater();
			//waitTime();
			smallwaitTime();
			salesForceValidator.waitForLoad_Login();
		}
		catch(Exception e)
		{
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "login to application").fail("Failed to login").addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());
			//Reporters.failureReport("login to application", "Failed to login");
		}

	}

	@When("Click on New button")
	public void click_on_New_button() throws Throwable {
		try{
			salesForceValidator.click_New_Button();		
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "clicking on New button").pass("clicked on New button successfully");		
			//Reporters.successReport("clicking on New button","clicked on New button successfully");

		}
		catch(Exception e)
		{
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "clicking on New button").fail("Failed to click on New button").addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());
			//Reporters.failureReport("clicking on New button", "Failed to click on New button");
		}

	}
	
	@Then("New opportunity creation window should be Open")
	public void New_opportunity_Creation_window_should_open() throws Throwable {
		try{
			boolean flag = salesForceValidator.isDisplayed_newopportunityWindow();		
			//BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "clicking on New button").pass("clicked on New button successfully");		
			if(flag)
				{
				BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "New opportunity Creation window open").pass("New opportunity Creation window opened successfully");		
				//Reporters.successReport("New opportunity Creation window open","New opportunity Creation window opened successfully");
				
				}
			else
			{
				BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "New opportunity Creation window open").fail("Failed to open New opportunity Creation window").addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());

				//Reporters.failureReport("New opportunity Creation window open", "Failed to open New opportunity Creation window");
			}
		}
		catch(Exception e)
		{
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "New opportunity Creation window open").fail("Failed to open New opportunity Creation window").addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());
			//Reporters.failureReport("New opportunity Creation window open", "Failed to open New opportunity Creation window");
		}

	}
	
	@Then("New case creation window should open")
	public void New_case_Creation_window_should_open() throws Throwable {
		try{
			boolean flag = salesForceValidator.isDisplayed_newCaseWindow();		
			//BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "clicking on New button").pass("clicked on New button successfully");		
			if(flag)
				{
				BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "New case Creation window open").pass("New case Creation window opened successfully");		
				//Reporters.successReport("New case Creation window open","New case Creation window opened successfully");
				
				}
			else
			{
				BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "New case Creation window open").fail("Failed to open New case Creation window").addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());

				//Reporters.failureReport("New case Creation window open", "Failed to open New case Creation window");
			}
		}
		catch(Exception e)
		{
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "New case Creation window open").fail("Failed to open New case Creation window").addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());
			//Reporters.failureReport("New case Creation window open", "Failed to open New case Creation window");
		}

	}
	@Then("New Lead Creation window should open")
	public void New_Lead_Creation_window_should_open() throws Throwable {
		try{
			boolean flag = salesForceValidator.isDisplayed_newLeadWindow();		
			//BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "clicking on New button").pass("clicked on New button successfully");		
			if(flag)
				{
				BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "New Lead Creation window open").pass("New Lead Creation window opened successfully");		
				//Reporters.successReport("New Lead Creation window open","New Lead Creation window opened successfully");
				
				}
			else
			{
				BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "New Lead Creation window open").fail("Failed to open New Lead Creation window").addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());
				//Reporters.failureReport("New Lead Creation window open", "Failed to open New Lead Creation window");
			}
		}
		catch(Exception e)
		{
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "New Lead Creation window open").fail("Failed to open New Lead Creation window").addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());
			//Reporters.failureReport("New Lead Creation window open", "Failed to open New Lead Creation window");
		}

	}
	
	@When("user clicks on Save button")

	public void user_clicks_on_Save_button() throws Throwable{
		try{
			salesForceValidator.click_Save_Button();

			BaseUtil.scenarioDef.createNode(new GherkinKeyword("When"), "Clicking on Save button").pass("Clicked on Save button successfully");
			//Reporters.successReport("Clicking on Save button","Clicked on Save button successfully");

		}
		catch(Exception e)
		{
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "clicking on Save button").fail("Failed to click on Save button").addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());
			//Reporters.failureReport("clicking on Save button", "Failed to click on Save button");
		}

	}
	
	@Then("Record Should be Updated")
	public void Record_Should_be_Updated() throws Throwable {
		try{
			boolean flag = salesForceValidator.isDisplayed_RecordUpdated();		
			//BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "clicking on New button").pass("clicked on New button successfully");		
			if(flag)
				{
				BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "New Lead Creation").pass("New Lead Created successfully");		
				//Reporters.successReport("New Lead Creation","New Lead Created successfully");
				
				}
			else
			{
				BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "New Lead Creation").fail("Failed to create new lead").addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());
				//Reporters.failureReport("New Lead Creation", "Failed to create new lead");
			}
		}
		catch(Exception e)
		{
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "New Lead Creation").fail("Failed to create new lead").addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());
			//Reporters.failureReport("New Lead Creation", "Failed to create new lead");
		}

	}
	@Then("New Lead created successfully")
	public void New_Lead_created_successfully() throws Throwable {
		try{
			boolean flag = salesForceValidator.isDisplayed_newLeadCreated();		
			//BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "clicking on New button").pass("clicked on New button successfully");		
			if(flag)
				{
				BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "New Lead Creation").pass("New Lead Created successfully");		
				//Reporters.successReport("New Lead Creation","New Lead Created successfully");
				
				}
			else
			{
				BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "New Lead Creation").fail("Failed to create new lead").addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());
				//Reporters.failureReport("New Lead Creation", "Failed to create new lead");
			}
		}
		catch(Exception e)
		{
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "New Lead Creation").fail("Failed to create new lead").addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());
			//Reporters.failureReport("New Lead Creation", "Failed to create new lead");
		}

	}
	
	@Then("New Opportunity created successfully")
	public void New_Opportunity_created_successfully() throws Throwable {
		try{
			boolean flag = salesForceValidator.isDisplayed_newOpportunityCreated();		
			//BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "clicking on New button").pass("clicked on New button successfully");		
			if(flag)
				{
				BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "New Opportunity Creation").pass("New Opportunity Created successfully");		
				//Reporters.successReport("New Opportunity Creation","New Opportunity Created successfully");
				
				}
			else
			{
				BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "New Opportunity Creation").fail("Failed to create new Opportunity").addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());
		        //Reporters.failureReport("New Opportunity Creation", "Failed to create new Opportunity");
			}
		}
		catch(Exception e)
		{
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "New Opportunity Creation").fail("Failed to create new Opportunity").addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());
			//Reporters.failureReport("New Opportunity Creation", "Failed to create new Opportunity");
		}

	}
	
	@Then("New case created successfully")
	public void New_case_created_successfully() throws Throwable {
		try{
			boolean flag = salesForceValidator.isDisplayed_newcaseCreated();		
			//BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "clicking on New button").pass("clicked on New button successfully");		
			if(flag)
				{
				BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "New case Creation").pass("New case Created successfully");		
				//Reporters.successReport("New case Creation","New case Created successfully");
				
				}
			else
			{
				BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "New case Creation").fail("Failed to create new case").addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());
				//Reporters.failureReport("New case Creation", "Failed to create new case");
			}
		}
		catch(Exception e)
		{
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "New case Creation").fail("Failed to create new case").addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());
			//Reporters.failureReport("New case Creation", "Failed to create new case");
		}

	}
	@When("Click on Edit button")
	public void click_on_Edit_button() throws Throwable {		
		try{
			salesForceValidator.click_Edit_Button();		
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "clicking on Edit button").pass("clicked on Edit button successfully");		
			//Reporters.successReport("clicking on Edit button","clicked on Edit button successfully");

		}
		catch(Exception e)
		{
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "clicking on Edit button").fail("Failed to click on Edit button").addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());
			//Reporters.failureReport("clicking on Edit button", "Failed to click on Edit button");

		}

	}

	@When("^Click on Accounts tab$")
	public void click_on_Accounts_tab() throws Throwable {
		try{

			salesForceValidator.click_accountsTab();
			//Reporters.successReport("clicking on Accounts tab","clicked on Accounts tab successfully");

			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "clicking on Accounts tab").pass("clicked on Accounts tab successfully");
		}
		catch(Exception e)
		{
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "clicking on Accounts tab").fail("Failed to click on Accounts tab").addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());
			//Reporters.failureReport("clicking on Accounts tab", "Failed to click on Accounts tab");

		}


	}
	@When("Click on Contacts tab")
	public void click_on_Contact_tab() throws Throwable {	
		try{
			salesForceValidator.click_contactTab();
			waitTime();		
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "clicking on Contacts tab").pass("clicked on Contacts tab successfully");
			//Reporters.successReport("clicking on Contacts tab","clicked on contacts tab successfully");

		}
		catch(Exception e)
		{
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "clicking on Contacts tab").fail("Failed to click on Contacts tab").addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());
			//Reporters.failureReport("clicking on contacts tab", "Failed to click on contacts tab");

		}

	}
	@When("Click on Opportunities tab")
	public void click_on_Opportunities_tab() throws Throwable{
		try{
			salesForceValidator.click_opportunitiesTab();
			// waitTime();	
			Selenide.smallwaitTime();
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "clicking on Opportunities tab").pass("clicked on Opportunities tab successfully");
			//Reporters.successReport("clicking on Opportunities tab","clicked on Opportunities tab successfully");

		}
		catch(Exception e)
		{
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "clicking on Opportunities tab").fail("Failed to click on Opportunities tab").addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());
			//Reporters.failureReport("clicking on Opportunities tab", "Failed to click on Opportunities tab");

		}

	}
	@When("Click on Leads tab")
	public void click_on_Leads_tab() throws Throwable{
		try{
			salesForceValidator.click_LeadsTab();
			waitTime();
			//Reporters.successReport("clicking on Leads tab","clicked on Leads tab successfully");
	
		BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "clicking on Leads tab").pass("clicked on Leads tab successfully");
		}
		catch(Exception e)
		{
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "clicking on Leads tab").fail("Failed to click on Leads tab").addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());
			//Reporters.failureReport("clicking on Leads tab", "Failed to click on Leads tab");

		}

	}
	@When("^Click on Quote Object$")
	public void clickOnQuoteObject() throws Throwable {
		try{
			waitTime();
			salesForceValidator.click_navigation_Button();
			salesForceValidator.click_viewAllLink_Button();
			salesForceValidator.enter_SearchDetails("Quotes");
			salesForceValidator.click_quotesObject();
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "clicking on Quote Object").pass("clicked on Quote Object successfully");
			//Reporters.successReport("clicking on Quote Object","clicked on Quote Object successfully");

		}
		catch(Exception e)
		{
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "clicking on Quotes").fail("Failed to click on Quotes").addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());
			//Reporters.failureReport("clicking on Quote Object", "Failed to click on Quotes");
		}
	}

	
	 
	 @When("Click on Case Object")
	 public void click_on_Case_Object() throws Throwable {
		 try{
			 smallwaitTime();
			 salesForceValidator.click_navigation_Button();
			 salesForceValidator.click_viewAllLink_Button();
			 salesForceValidator.enter_SearchDetails("Cases");
			 salesForceValidator.click_casesObject();
			 BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "clicking on Cases Object").pass("clicked on Cases Object successfully");
			//Reporters.successReport("clicking on Cases Object","clicked on Cases Object successfully");

		 	}
		 catch(Exception e)
		 {
			 BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "clicking on Cases").fail("Failed to click on Cases").addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());
				//Reporters.failureReport("clicking on Cases Object", "Failed to click on Cases");

		 }
	 }

	 @When("^Click on cancel Button$")
	public void clickOnCancelButton() throws Throwable {
		 salesForceValidator.click_cancle_Button();
		 
	}

}
