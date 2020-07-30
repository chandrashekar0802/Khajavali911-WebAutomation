package ui.automation.stepdef;

import java.io.IOException;
import java.util.Properties;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.GherkinKeyword;
import com.aventstack.extentreports.Status;

import ui.automation.pages.Elsevier_Home_Page;
import ui.automation.pages.Elsevier_Home_Page_Validator;
import cigniti.automation.utilities.CommonUtil;
import cigniti.automation.utilities.Driver;
import cigniti.automation.utilities.PropertiesFileReader;
import cigniti.base.BaseUtil;
import cigniti.base.ExtentReportUtil;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class Elsevier {
	 PropertiesFileReader obj= new PropertiesFileReader();  
	 private BaseUtil base;
	 private static ExtentReportUtil extentreportUtil= new ExtentReportUtil();
	 SoftAssert softAssert=new SoftAssert();
	 Elsevier_Home_Page elsevierPage = new Elsevier_Home_Page(Driver.browser);
	 Elsevier_Home_Page_Validator elsevierValidator = new Elsevier_Home_Page_Validator(elsevierPage);
	 
	 @Given("Open chrome browser and enter url")
	 public void open_chrome_browser_and_enter_url() throws Throwable {
		 
		 
		    Properties properties=obj.getProperty(); 
			String url=properties.getProperty("browser.baseURL");
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Launched elsevier page").pass("Launched elsevier page");
	        Driver.browser.get(properties.getProperty("browser.baseURL"));
	 }
	 @And("^Enter the User credentials$")
		public void enter_credentials() throws Throwable{
			JSONObject input = CommonUtil.readJsonObject("login", "users");
			String email= input.get("email").toString();
			String password=  input.get("password").toString();
			elsevierValidator.enter_credentials(email,password);
			//elsevierValidator.enter_credentials("prabhakar.ontela99@gmail.com", "8125959364");
			elsevierValidator.click_login();
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("And"), "Enter the User credentials").pass("Successfully Entered the User credentials");
		}
	 
	

}
