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
		JSONObject input = CommonUtil.readJsonObject("login", "users");
		String username= input.get("username").toString();
		String password=  input.get("password").toString();
		Properties properties=obj.getProperty(); 
		String url=properties.getProperty("browser.baseURL");
		//String str ="https://" + username + ":" + password + "@"+"www.test.salesforce.com/";
		Driver.browser.get(url);
		BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Url enter").pass("Url entered successfully");
		//Thread.sleep(10000);
		salesForceValidator.enter_credentials(username,password);
		BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Username and Password entering").pass("Username and Password entering entered successfully");
		salesForceValidator.click_login();
		//salesForceValidator.click_remindLater();
		waitTime();
		waitTime();
		salesForceValidator.waitForLoad_Login();
		
	}
	
	@Given("^Click on Accounts tab$")
	public void click_on_Accounts_tab() throws Throwable {
		//Thread.sleep(10000);
		//WebDriverWait wait = new WebDriverWait(Driver.browser, 50);
	
		salesForceValidator.click_accountsTab();
		
		BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "clicking on Accounts tab").pass("clicked on Accounts tab successfully");

		
	}
	@Given("Click on Contacts tab")
	public void click_on_Contact_tab() throws Throwable {
		//Thread.sleep(10000);
		//WebDriverWait wait = new WebDriverWait(Driver.browser, 50);
		//if(wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@role='navigation']//button")))==null)
		//{		
	
		salesForceValidator.click_contactTab();
		Thread.sleep(10000);
		//}
		BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "clicking on Accounts tab").pass("clicked on Accounts tab successfully");
		
	}
	 @Given("Click on Opportunities tab")
	 public void click_on_Opportunities_tab() throws Throwable{
		 salesForceValidator.click_opportunitiesTab();
			Thread.sleep(10000);
			//}
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "clicking on Opportunities tab").pass("clicked on Opportunities tab successfully");
			
	 }
}
