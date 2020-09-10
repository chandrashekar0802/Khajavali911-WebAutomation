package ui.automation.stepdef;

import org.json.simple.JSONObject;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.GherkinKeyword;

import cigniti.automation.utilities.CommonUtil;
import cigniti.automation.utilities.Driver;
import cigniti.automation.utilities.PropertiesFileReader;
import cigniti.reports.BaseUtil;
import cigniti.reports.ExtentReportUtil;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import ui.automation.pages.Accounts_Page;
import ui.automation.pages.Accounts_Page_Validator;
import ui.automation.pages.SalesForce_Page;
import ui.automation.pages.SalesForce_Page_Validator;

public class Accounts_Steps {
	PropertiesFileReader obj= new PropertiesFileReader();  
	 private BaseUtil base;
	 private static ExtentReportUtil extentreportUtil= new ExtentReportUtil();
	 SoftAssert softAssert=new SoftAssert();
	 
	 Accounts_Page accountsPage = new Accounts_Page(Driver.browser);
	 Accounts_Page_Validator accountsPageValidator = new Accounts_Page_Validator(accountsPage);
	 

	 @Given("^Enter the value for Account Name field$")
	 public void Enter_the_value_for_Account_Name_field()throws Throwable
		{
		 try{
		 JSONObject input = CommonUtil.readJsonObject("Accounts", "accounts");
			String accountName= input.get("accountName").toString();
			accountsPageValidator.enter_Data_AcctName(accountName);
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering the value for Account Name field").pass("Entered the value for Account Name field successfully");
		 }
			catch(Exception e)
			{
				BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering Account Name").fail("Failed to Enter Account Name").addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());
		
			}
			
		}
	 @Given("Enter the value for Parent Account Name field")
	 public void Enter_the_value_for_Parent_Account_Name_field()throws Throwable
		{
		 try{
		 JSONObject input = CommonUtil.readJsonObject("Accounts", "accounts");
			String parentAccountName= input.get("parentAccountName").toString();
			accountsPageValidator.enter_Data_parentAcctName(parentAccountName);
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering the value for Parent Account Name field").pass("Entered the value for Parent Account Name field successfully");
		 }
			catch(Exception e)
			{
				BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering Parent Account Name").fail("Failed to Enter Parent Account Name").addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());
	
			}
			
		}
	 
	 @Given("Enter the value for Phone field")
	 public void Enter_the_value_for_Phone_field()throws Throwable
		{
		 try{
		 JSONObject input = CommonUtil.readJsonObject("Accounts", "accounts");
			String phone= input.get("phone").toString();
			accountsPageValidator.enter_Data_Phone(phone);
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering the value for phone field").pass("Entered the value for phone field successfully");
		 }
			catch(Exception e)
			{
				BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering phone number").fail("Failed to Enter phone number").addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());

			}
			
		}
	 
	 
	 @Given("Enter the value for Status field")
	 public void Enter_the_value_for_Status_field()throws Throwable
		{
		 try{
		 JSONObject input = CommonUtil.readJsonObject("Accounts", "accounts");
			String status= input.get("status").toString();
			accountsPageValidator.select_status_Drop(status);			
			//BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering the value for Status field").pass("Entered the value for Status field successfully");
		 }
			catch(Exception e)
			{
				BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering Status").fail("Failed to Enter Status").addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());

			}
			
			
		}
	 
	 @Given("Enter the value for Vertical Grouping field")
	 public void Enter_the_value_for_Vertical_Grouping_field()throws Throwable
		{
		 try{
		 JSONObject input = CommonUtil.readJsonObject("Accounts", "accounts");
			String verticalGrouping= input.get("verticalGrouping").toString();
			accountsPageValidator.select_vertical_groupingDrop(verticalGrouping);
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering the value for Vertical Grouping field").pass("Entered the value for Vertical Grouping field successfully");
		 }
			catch(Exception e)
			{
				BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering Vertical Grouping field").fail("Failed to Enter Vertical Grouping field").addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());

			}
			
		 }
	 
	 @Given("Enter the value for Sub Vertical one field")
	 public void Enter_the_value_for_Sub_Vertical_one_field()throws Throwable
		{
		 try{
		 JSONObject input = CommonUtil.readJsonObject("Accounts", "accounts");
			String SubVertical1= input.get("SubVertical1").toString();
			accountsPageValidator.select_sub_vertical_oneDrop(SubVertical1);
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering the value for Sub Vertical one field").pass("Entered the value for Sub Vertical one field successfully");
		 }
			catch(Exception e)
			{
				BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering Sub Vertical one").fail("Failed to Enter Sub Vertical one").addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());

			}
			
		}
	 
	 @Given("Enter the value for Vertical field")
	 public void Enter_the_value_for_Vertical_field()throws Throwable
		{
		 try{
		 JSONObject input = CommonUtil.readJsonObject("Accounts", "accounts");
			String Vertical= input.get("Vertical").toString();
			accountsPageValidator.select_vertical_Drop(Vertical);
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering the value for Vertical field").pass("Entered the value for Vertical field successfully");
		 }
			catch(Exception e)
			{
				BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering Vertical").fail("Failed to Enter Vertical").addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());

			}
			
		}
	 
	 @Given("Enter the value for IST Representative field")
	 public void Enter_the_value_for_IST_Representative_field()throws Throwable
		{
		 try{
		 JSONObject input = CommonUtil.readJsonObject("Accounts", "accounts");
			String ISTrepresentative= input.get("ISTrepresentative").toString();
			accountsPageValidator.select_ISTRepresentative_Drop(ISTrepresentative);	
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering the value for IST Representative field").pass("Entered the value for IST Representative field successfully");
		 }
			catch(Exception e)
			{
				BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering ISTrepresentative").fail("Failed to Enter ISTrepresentative").addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());
	
			}
			
		}
	 
	 @Given("Enter the value for Revenue field")
	 public void Enter_the_value_for_Revenue_field()throws Throwable
		{
		 try{
		 JSONObject input = CommonUtil.readJsonObject("Accounts", "accounts");
			String Revenue= input.get("Revenue").toString();
			accountsPageValidator.enter_Data_Revenue(Revenue);			
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering the value for Revenue field").pass("Entered the value for Revenue field successfully");
		 }
			catch(Exception e)
			{
				BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering Revenue").fail("Failed to Enter Revenue").addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());

			}
			
		}
	 
	 @Given("Enter the value for Billing Street field")
	 public void Enter_the_value_for_Billing_Street_field()throws Throwable
		{
		 try{
		 JSONObject input = CommonUtil.readJsonObject("Accounts", "accounts");
			String BillingStreet= input.get("BillingStreet").toString();
			accountsPageValidator.enter_Data_BillingStreet(BillingStreet);
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering the value for Billing Street field").pass("Entered the value for Billing Street field successfully");
		 }
			catch(Exception e)
			{
				BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering Billing Street").fail("Failed to Enter Billing Street").addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());

			}
			
			
		}
	 @Given("Enter the value for Billing City field")
	 public void enter_the_value_for_Billing_City_field()throws Throwable {
		 try{
		 JSONObject input = CommonUtil.readJsonObject("Accounts", "accounts");
			String BillingCity= input.get("BillingCity").toString();
			accountsPageValidator.enter_Data_BillingCity(BillingCity);
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering the value for Billing City field").pass("Entered the value for Billing City field successfully");
		 }
			catch(Exception e)
			{
				BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering Billing City").fail("Failed to Enter Billing City").addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());
	
			}
			
	 }

	 @Given("Enter the value for Billing State\\/Province field")
	 public void enter_the_value_for_Billing_State_Province_field()throws Throwable {
		 try{
		 JSONObject input = CommonUtil.readJsonObject("Accounts", "accounts");
			String BillingStateProvince= input.get("BillingStateProvince").toString();
			accountsPageValidator.enter_Data_BillingState(BillingStateProvince);
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering the value for Billing state field").pass("Entered the value for Billing state field successfully");
		 }
			catch(Exception e)
			{
				BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering Billing State").fail("Failed to Enter Billing State").addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());
	
			}
			
	 }

	 @Given("Enter the value for Billing Zip\\/Postal Code field")
	 public void enter_the_value_for_Billing_Zip_Postal_Code_field() throws Throwable{
		 try{
		 JSONObject input = CommonUtil.readJsonObject("Accounts", "accounts");
			String BillingZipPostalCode= input.get("BillingZipPostalCode").toString();
			accountsPageValidator.enter_Data_BillingPostal(BillingZipPostalCode);
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering the value for Billing Postal Code field").pass("Entered the value for Billing Postal Code field successfully");
		 }
			catch(Exception e)
			{
				BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering Billing ZipPostal Code").fail("Failed to Enter Billing ZipPostal Code").addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());

			}
			
	 }

	 @Given("Enter the value for Billing Country field")
	 public void enter_the_value_for_Billing_Country_field()  throws Throwable{
		 try{
		 JSONObject input = CommonUtil.readJsonObject("Accounts", "accounts");
			String BillingCountry= input.get("BillingCountry").toString();
			accountsPageValidator.enter_Data_BillingCountry(BillingCountry);
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering the value for Billing country field").pass("Entered the value for Billing country field successfully");
		 }
			catch(Exception e)
			{
				BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering Billing Country").fail("Failed to Enter Billing Country").addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());

			}
			
	 }


	 @Then("Record should  be saved")
	 public void record_should_be_saved() throws Throwable {
		 try{
		 //accountsPageValidator.validate_accountCreated_Message();
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Record saved").pass("Record saved successfully");
		 }
			catch(Exception e)
			{
				BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Record save").fail("Failed to save Record ").addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());

			}
			
	 }
}
