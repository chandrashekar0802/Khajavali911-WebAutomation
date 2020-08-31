package ui.automation.stepdef;

import java.util.Properties;

import org.json.simple.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.GherkinKeyword;

import cigniti.automation.utilities.CommonUtil;
import cigniti.automation.utilities.Driver;
import cigniti.automation.utilities.PropertiesFileReader;
import cigniti.automation.utilities.Selenide;
import cigniti.base.BaseUtil;
import cigniti.base.ExtentReportUtil;
import cucumber.api.java.en.Given;
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
			salesForceValidator.enter_credentials(username,password);
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Username and Password entering").pass("Username and Password entering entered successfully");
			salesForceValidator.click_login();
			//salesForceValidator.click_remindLater();
			//waitTime();
			smallwaitTime();
			salesForceValidator.waitForLoad_Login();
		}
		catch(Exception e)
		{
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "login to application").fail("Failed to login").addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());

		}

	}

	@Given("Click on New button")
	public void click_on_New_button() throws Throwable {
		try{
			salesForceValidator.click_New_Button();		
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "clicking on New button").pass("clicked on New button successfully");		
		}
		catch(Exception e)
		{
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "clicking on New button").fail("Failed to click on New button").addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());

		}

	}
	@When("user clicks on Save button")

	public void user_clicks_on_Save_button() throws Throwable{
		try{
			salesForceValidator.click_Save_Button();

			BaseUtil.scenarioDef.createNode(new GherkinKeyword("When"), "Clicking on Save button").pass("Clicked on Save button successfully");
		}
		catch(Exception e)
		{
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "clicking on Save button").fail("Failed to click on Save button").addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());

		}

	}
	@Given("Click on Edit button")
	public void click_on_Edit_button() throws Throwable {		
		try{
			salesForceValidator.click_Edit_Button();		
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "clicking on Edit button").pass("clicked on Edit button successfully");		
		}
		catch(Exception e)
		{
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "clicking on Edit button").fail("Failed to click on Edit button").addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());

		}

	}

	@Given("^Click on Accounts tab$")
	public void click_on_Accounts_tab() throws Throwable {
		try{

			salesForceValidator.click_accountsTab();

			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "clicking on Accounts tab").pass("clicked on Accounts tab successfully");
		}
		catch(Exception e)
		{
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "clicking on Accounts tab").fail("Failed to click on Accounts tab").addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());

		}


	}
	@Given("Click on Contacts tab")
	public void click_on_Contact_tab() throws Throwable {	
		try{
			salesForceValidator.click_contactTab();
			waitTime();		
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "clicking on Accounts tab").pass("clicked on Accounts tab successfully");
		}
		catch(Exception e)
		{
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "clicking on Contacts tab").fail("Failed to click on Contacts tab").addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());

		}

	}
	@Given("Click on Opportunities tab")
	public void click_on_Opportunities_tab() throws Throwable{
		try{
			salesForceValidator.click_opportunitiesTab();
			// waitTime();	
			Selenide.smallwaitTime();
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "clicking on Opportunities tab").pass("clicked on Opportunities tab successfully");
		}
		catch(Exception e)
		{
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "clicking on Opportunities tab").fail("Failed to click on Opportunities tab").addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());

		}

	}
	@Given("Click on Leads tab")
	public void click_on_Leads_tab() throws Throwable{
		try{
			salesForceValidator.click_LeadsTab();
			waitTime();
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "clicking on Leads tab").pass("clicked on Leads tab successfully");
		}
		catch(Exception e)
		{
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "clicking on Leads tab").fail("Failed to click on Leads tab").addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());

		}

	}
	@Given("^Click on Quote Object$")
	public void clickOnQuoteObject() throws Throwable {
		try{
			waitTime();
			salesForceValidator.click_navigation_Button();
			salesForceValidator.click_viewAllLink_Button();
			salesForceValidator.enter_SearchDetails("Quotes");
			salesForceValidator.click_quotesObject();
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "clicking on Quote Object").pass("clicked on Quote Object successfully");

		}
		catch(Exception e)
		{
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "clicking on Quotes").fail("Failed to click on Quotes").addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());



		}
	}


	 
	 @Given("Click on Case Object")
	 public void click_on_Case_Object() throws Throwable {
		 try{
			 waitTime();
			 salesForceValidator.click_navigation_Button();
			 salesForceValidator.click_viewAllLink_Button();
			 salesForceValidator.enter_SearchDetails("Cases");
			 salesForceValidator.click_casesObject();
			 BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "clicking on Cases Object").pass("clicked on Cases Object successfully");

		 	}
		 catch(Exception e)
		 {
			 BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "clicking on Cases").fail("Failed to click on Cases").addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());

		 }
	 }

}
