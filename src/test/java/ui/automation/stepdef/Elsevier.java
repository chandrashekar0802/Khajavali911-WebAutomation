package ui.automation.stepdef;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.GherkinKeyword;
import com.aventstack.extentreports.Status;

import ui.automation.pages.Elsevier_Home_Page;
import ui.automation.pages.Elsevier_Home_Page_Validator;
import cigniti.automation.utilities.BrowserTypes;
import cigniti.automation.utilities.CommonUtil;
import cigniti.automation.utilities.Driver;
import cigniti.automation.utilities.PropertiesFileReader;
import cigniti.base.BaseUtil;
import cigniti.base.ExtentReportUtil;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import junit.framework.Assert;

public class Elsevier {
	 PropertiesFileReader obj= new PropertiesFileReader();  
	// private BaseUtil base=new BaseUtil();
//	 private static ExtentReportUtil extentreportUtil= new ExtentReportUtil();
	 SoftAssert softAssert=new SoftAssert();
	 private Driver driver;
	 private Elsevier_Home_Page elsevierPage;
	 private Elsevier_Home_Page_Validator elsevierValidator;
	 
	 public Elsevier() throws MalformedURLException {
		 driver =new Driver();
		 driver.StartBrowser(BrowserTypes.Chrome,10);
		 elsevierPage=new Elsevier_Home_Page(driver.browser);
		 elsevierValidator= new Elsevier_Home_Page_Validator(elsevierPage);
	 }
	// Elsevier_Home_Page elsevierPage = new Elsevier_Home_Page(driver.setWebDriver(browser););
	// Elsevier_Home_Page_Validator elsevierValidator = new Elsevier_Home_Page_Validator(elsevierPage);
	 
	 @Given("Open chrome browser and enter url")
	 public void open_chrome_browser_and_enter_url() throws Throwable {
		 System.setProperty("webdriver.chrome.driver", "C:\\Walmart\\chromedriver_win32\\chromedriver.exe");
		   // driver =new Driver();
		  //  driver.StartBrowser(BrowserTypes.Chrome,10);
		    System.out.println("Thread ID"+Thread.currentThread().getId());
		   // elsevierPage=new Elsevier_Home_Page(driver.browser);
		   // elsevierValidator= new Elsevier_Home_Page_Validator(elsevierPage);
		    //Driver.StartBrowser(BrowserTypes.Chrome, 30);
		    Properties properties=obj.getProperty(); 
			String url=properties.getProperty("browser.baseURL");
			//base.scenarioDef.createNode(new GherkinKeyword("Given"), "Launched elsevier page").pass("Launched elsevier page");
		//	ExtentReportUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Launched elsevier page").pass("Launched elsevier page");
			driver.browser.get(properties.getProperty("browser.baseURL"));
			ExtentReportUtil.CreateInstance().setnodestep("browser launched successfully");
			//ExtentReportUtil.CreateInstance().setnodetext("browser launched successfully");
	      //  JSONObject input = CommonUtil.readJsonObject("login", "users");
		//	String email= input.get("email").toString();
		//	String password=  input.get("password").toString();
			//driver.browser.findElement(By.xpath("//*[@id='signin-email']")).sendKeys("Khajavalis@gmail.com");;
	    //    elsevierValidator.click_signIn_icon();
		//	elsevierValidator.enter_credentials(email,password);
		//	elsevierValidator.enter_credentials("prabhakar.ontela99@gmail.com", "8125959364");
		//	elsevierValidator.click_login();
	       // WebElement ele=browser.findElement(By.xpath("//*[@title='View account']"));
		//	driver.browser.close();
	    //    Thread.sleep(2000);
	      
	 }
	 @And("Enter the User credentials")
		public void enter_credentials() throws Throwable{
			/*JSONObject input = CommonUtil.readJsonObject("login", "users");
			String email= input.get("email").toString();
			String password=  input.get("password").toString();
			elsevierValidator.click_signIn_icon();
			elsevierValidator.enter_credentials(email,password);
			//elsevierValidator.enter_credentials("prabhakar.ontela99@gmail.com", "8125959364");
			elsevierValidator.click_login();
		//	base.scenarioDef.createNode(new GherkinKeyword("And"), "Enter the User credentials").pass("Successfully Entered the User credentials");
			elsevierValidator.signout();			
		    driver.browser.close();
		   // Assert.assertTrue(false);
			//Driver.browserStartBrowser(BrowserTypes.Chrome, 30);
			 System.out.println(Thread.currentThread().getId());
			 */
		  driver.browser.close();
		}

}
