package com.ds.automation.steps;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.json.simple.JSONObject;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.GherkinKeyword;
import com.cigniti.automation.reports.BaseUtil;
import com.cigniti.automation.reports.ExtentReportUtil;
import com.cigniti.automation.utilities.CommonUtil;
import com.cigniti.automation.utilities.Driver;
import com.cigniti.automation.utilities.PropertiesFileReader;
import com.cigniti.automation.utilities.Reporters;
import com.cigniti.automation.utilities.Selenide;
import com.ds.automation.bussinessfunctions.Accounts_Page;
import com.ds.automation.bussinessfunctions.Accounts_Page_Validator;
import com.ds.automation.bussinessfunctions.OpportunityToQuote_Page;
import com.ds.automation.bussinessfunctions.OpportunityToQuote_Page_Validator;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OpportunityToQuote_Steps extends Selenide {
	PropertiesFileReader obj = new PropertiesFileReader();
	private BaseUtil base;
	private static ExtentReportUtil extentreportUtil = new ExtentReportUtil();
	SoftAssert softAssert = new SoftAssert();
	public static String ClosingDate = "";
	OpportunityToQuote_Page opportunityToQuotePage = new OpportunityToQuote_Page(Driver.browser);
	OpportunityToQuote_Page_Validator opportunityToQuotePageValidator = new OpportunityToQuote_Page_Validator(
			opportunityToQuotePage);

	// old
	@When("Enter the value for Opportunity Name field")
	public void enter_the_value_for_Opportunity_Name_field() throws Throwable {
		try {
			JSONObject input = CommonUtil.readJsonObject("OpportunityToQuote", "createOpportunity");
			String opportunityName = input.get("opportunityName").toString();
			opportunityToQuotePageValidator.enter_Data_opportunityName(opportunityName);
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering opportunity name")
					.pass("Entered opportunity Name successfully");
//Reporters.successReport("Entering opportunity name","Entered opportunity Name successfully");
		} catch (Exception e) {
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering opportunity name")
					.fail("Failed to Enter opportunity name")
					.addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());
			//Reporters.failureReport("Entering opportunity name", "Failed to Enter opportunity name");
			Assert.fail("Failed to Enter opportunity name");
		}
	}

	@When("Enter the value for account Name field")
	public void enter_the_value_for_account_Name_field() throws Throwable {
		try {
			JSONObject input = CommonUtil.readJsonObject("OpportunityToQuote", "createOpportunity");
			String accountName = input.get("accountName").toString();
			opportunityToQuotePageValidator.enter_Data_acctName(accountName);
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering account name")
					.pass("Entered account Name successfully");

//Reporters.successReport("Entering account name","Entered account Name successfully");
		} catch (Exception e) {
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering account name")
					.fail("Failed to enter account name")
					.addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());
			//Reporters.failureReport("Entering account name", "Failed to enter account name");
			Assert.fail("Failed to enter account name");

		}
	}

	@When("Enter the value for Close Date field {int}")
	public void enter_the_value_for_Close_Date_field(Integer days) throws Throwable {
		try {
			Date date = new Date();
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(date);
			calendar.add(Calendar.DAY_OF_MONTH, days);
			Date dateAsObjAfterAMonth = calendar.getTime();
			SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
			String afterDate = formatter.format(dateAsObjAfterAMonth);
			ClosingDate = afterDate;
			opportunityToQuotePageValidator.enter_Data_closeDate(afterDate);
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering Close Date")
					.pass("Entered Close Date successfully");
//Reporters.successReport("Entering Close Date","Entered Close Date successfully");
		} catch (Exception e) {
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering Close Date")
					.fail("Failed to Enter Close Date")
					.addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());
			//Reporters.failureReport("Entering Close Date", "Failed to Enter Close Date");
			Assert.fail("Failed to Enter Close Date");

		}
	}

	@When("Enter the value for Stage field")
	public void enter_the_value_for_Stage_field() throws Throwable {
		try {
			JSONObject input = CommonUtil.readJsonObject("OpportunityToQuote", "createOpportunity");
			String stage = input.get("stage").toString();
			opportunityToQuotePageValidator.select_stage_Drop(stage);
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering stage")
					.pass("Entered stage successfully");
			//Reporters.successReport("Entering stage","Entered stage successfully");			
		} catch (Exception e) {
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering stage").fail("Failed to Enter stage")
					.addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());
			//Reporters.failureReport("Entering stage", "Failed to Enter stage");
			Assert.fail("Failed to Enter stage");

		}
	}

	@When("Enter the value for Type field")
	public void enter_the_value_for_Type_field() throws Throwable {
		try {
			JSONObject input = CommonUtil.readJsonObject("OpportunityToQuote", "createOpportunity");
			String type = input.get("type").toString();
			opportunityToQuotePageValidator.select_type_Drop(type);
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering type")
					.pass("Entered type successfully");
			//Reporters.successReport("Entering type","Entered type successfully");
		} catch (Exception e) {
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering type").fail("Failed to Enter type")
					.addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());
			//Reporters.failureReport("Entering type", "Failed to Enter type");
			Assert.fail("Failed to Enter type");

		}
	}

	@When("Enter the value for Probability field")
	public void enter_the_value_for_Probability_field() throws Throwable {
		try {
			JSONObject input = CommonUtil.readJsonObject("OpportunityToQuote", "createOpportunity");
			String probability = input.get("probability").toString();
			opportunityToQuotePageValidator.enter_Data_probability(probability);
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering probability")
					.pass("Entered probability successfully");
			//Reporters.successReport("Entering probability","Entered probability successfully");
		} catch (Exception e) {
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering probability")
					.fail("Failed to Enter probability")
					.addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());
			//Reporters.failureReport("Entering probability", "Failed to Enter probability");
			Assert.fail("Failed to Enter probability");

		}
	}

	@When("Enter the value for Amount field")
	public void enter_the_value_for_Amount_field() throws Throwable {
		try {
			JSONObject input = CommonUtil.readJsonObject("OpportunityToQuote", "createOpportunity");
			String Amount = input.get("Amount").toString();
			opportunityToQuotePageValidator.enter_Data_amount(Amount);
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering Amount")
					.pass("Entered Amount successfully");
			//Reporters.successReport("Entering Amount","Entered Amount successfully");
		} catch (Exception e) {
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering Amount")
					.fail("Failed to Enter Amount").addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());
			//Reporters.failureReport("Entering Amount", "Failed to Enter Amount");
			Assert.fail("Failed to Enter Amount");

		}
	}

	@When("Enter the value for Risks, Competition and Comments field")
	public void enter_the_value_for_Risks_Competition_and_Comments_field() throws Throwable {
		try {
			JSONObject input = CommonUtil.readJsonObject("OpportunityToQuote", "createOpportunity");
			String risksCompetitionComments = input.get("risksCompetitionComments").toString();
			opportunityToQuotePageValidator.enter_Data_riskCompetitionComments(risksCompetitionComments);
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering risks,Competition and Comments")
					.pass("Entered risks,Competition and Comments successfully");
			//Reporters.successReport("Entering risks,Competition and Comments","Entered risks,Competition and Comments successfully");
		} catch (Exception e) {
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering risks,Competition and Comments")
					.fail("Failed to Enter risks,Competition and Comments")
					.addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());
			//Reporters.failureReport("Entering risks,Competition and Comments", "Failed to Enter risks,Competition and Comments");
			Assert.fail("Failed to Enter risks,Competition and Comments");

		}
	}

	@When("Enter the {string}")
	public void enter_the(String amount) throws Throwable {
		try {
			opportunityToQuotePageValidator.enter_Data_amount(amount);
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering Amount")
					.pass("Entered Amount successfully");
			//Reporters.successReport("Entering Amount","Entered Amount successfully");
		} catch (Exception e) {
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering Amount")
					.fail("Failed to Enter Amount").addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());
			//Reporters.failureReport("Entering Amount", "Failed to Enter Amount");
			Assert.fail("Failed to Enter Amount");

		}
	}

	@When("Enter the value for Stage field {string}")
	public void enter_the_value_for_Stage_field(String stage) throws Throwable {
		try {
			opportunityToQuotePageValidator.select_stage_Drop(stage);
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering stage")
					.pass("Entered stage successfully");
			//Reporters.successReport("Entering stage","Entered stage successfully");
		} catch (Exception e) {
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering stage").fail("Failed to Enter stage")
					.addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());
			//Reporters.failureReport("Entering stage", "Failed to Enter stage");
			Assert.fail("Failed to Enter stage");

		}
	}

	@When("Check on Products tab which is displayed under Related at right pane")
	public void check_on_Products_tab_which_is_displayed_under_Related_at_right_pane() throws Throwable {
		try {
			waitTime();
			JavascriptExecutor js = (JavascriptExecutor) Driver.browser;
			js.executeScript("window.scrollBy(0,200)");
			opportunityToQuotePageValidator.click_productsDrpdownInRightPane_link();
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Clicking on Products tab")
					.pass("Clicked on Products tab successfully");
			//Reporters.successReport("Clicking on Products tab","Clicked on Products tab successfully");
		} catch (Exception e) {
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Clicking on Products tab")
					.fail("Failed to Click on Products tab")
					.addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());
			//Reporters.failureReport("Clicking on Products tab", "Failed to Click on Products tab");
			Assert.fail("Failed to Click on Products tab");

		}
	}

	@When("^Click on Choose Price Book from drop down$")
	public void clickOnChoosePriceBookFromDropDown() throws Throwable {
		try {
			opportunityToQuotePageValidator.click_choosePriceBookInProductDrpdwn();
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Clicking on Choose Price Book")
					.pass("Clicked on Choose Price Book successfully");
			//Reporters.successReport("Clicking on Choose Price Book","Clicked on Choose Price Book successfully");
		} catch (Exception e) {
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Clicking on Choose Price Book")
					.fail("Failed to Click on Choose Price Book")
					.addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());
			//Reporters.failureReport("Clicking on Choose Price Book", "Failed to Click on Choose Price Book");
			Assert.fail("Failed to Click on Choose Price Book");

		}
	}

	@When("Click on Add Products from drop down")
	public void click_on_Add_Products_from_drop_down() throws Throwable {
		try {
			Selenide.smallwaitTime();
			opportunityToQuotePageValidator.click_productsDrpdownInRightPane_link();
			Selenide.smallwaitTime();
			opportunityToQuotePageValidator.click_addProductInDrpdwn();
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Clicking on Add Products")
					.pass("Clicked on Add Products successfully");
			//Reporters.successReport("Clicking on Add Products","Clicked on Add Products successfully");
		} catch (Exception e) {
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Clicking on Add Products")
					.fail("Failed to Click on Add Products")
					.addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());
			//Reporters.failureReport("Clicking on Add Products", "Failed to Click on Add Products");
			Assert.fail("Failed to Click on Add Products");

		}
	}

	@When("Select valid Product Checkbox and Click on Next")
	public void select_valid_Product_Checkbox_and_Click_on_Next() throws Throwable {
		try {
			JSONObject input = CommonUtil.readJsonObject("OpportunityToQuote", "createOpportunity");
			String productCheckbox = input.get("productCheckbox").toString();
			opportunityToQuotePageValidator.click_CheckBoxForProductNameInAddProduct(productCheckbox);
			opportunityToQuotePageValidator.click_Next_Btn();
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Clicking on Checkbox")
					.pass("Clicked on checkbox and then clicked on next button successfully");
			//Reporters.successReport("Clicking on Checkbox","Clicked on checkbox and then clicked on next button successfully");
		} catch (Exception e) {
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Clicking on Checkbox")
					.fail("Failed to Click on Checkbox")
					.addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());
			//Reporters.failureReport("Clicking on Checkbox", "Failed to Click on Checkbox");
			Assert.fail("Failed to Click on Checkbox");

		}
	}

	@When("Enter the value for Quantity field")
	public void enter_the_value_for_Quantity_field() throws Throwable {
		try {
			JSONObject input = CommonUtil.readJsonObject("OpportunityToQuote", "createOpportunity");
			String Quantity = input.get("Quantity").toString();
			opportunityToQuotePageValidator.enter_Data_quantity(Quantity);
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "entering Quantity")
					.pass("entered Quantity successfully");
			//Reporters.successReport("entering Quantity","entered Quantity successfully");
		} catch (Exception e) {
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "entering Quantity")
					.fail("Failed to enter Quantity")
					.addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());
			//Reporters.failureReport("entering Quantity", "Failed to enter Quantity");
			Assert.fail("Failed to enter Quantity");

		}
	}

	@When("Enter the value for Date field")
	public void enter_the_value_for_Date_field() throws Throwable {
		try {
			Date date = new Date();
			SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
			String todayDate = formatter.format(date);
			opportunityToQuotePageValidator.enter_Data_date(todayDate);
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "entering  Date")
					.pass("entered  Date successfully");
			//Reporters.successReport("entering  Date","entered  Date successfully");
		} catch (Exception e) {
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "entering  Date").fail("Failed to enter  Date")
					.addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());
			//Reporters.failureReport("entering  Date", "Failed to enter  Date");
			Assert.fail("Failed to enter  Date");

		}
	}

	@When("^Scroll on Related List Views to Quotes$")
	public void scrollOnRelatedListViewsToQuotes() throws Throwable {
		try {
			waitTime();
			JavascriptExecutor js = (JavascriptExecutor) Driver.browser;
			js.executeScript("window.scrollBy(0,500)");
			Selenide.smallwaitTime();
			js.executeScript("window.scrollBy(0,500)");
			Selenide.smallwaitTime();
			js.executeScript("window.scrollBy(0,500)");

		} catch (Exception e) {
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "scrolling to Quotes")
					.fail("Failed to scroll to Quotes")
					.addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());
			//Reporters.failureReport("scrolling to Quotes", "Failed to scroll to Quotes");
			Assert.fail("Failed to scroll to Quotes");

		}
	}

	@When("^Select one valid Price Book Checkbox and Click on Save$")
	public void selectOneValidPriceBookCheckboxAndClickOnSave() throws Throwable {
		try {
			opportunityToQuotePageValidator.click_saveBtnInChoosePriceBook_Btn();
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "click on Save")
					.pass("clicked on Save button successfully");
			//Reporters.successReport("click on Save","clicked on Save button successfully");
			Selenide.smallwaitTime();

		} catch (Exception e) {
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "click on Save")
					.fail("Failed to click on Save")
					.addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());
			//Reporters.failureReport("click on Save", "Failed to click on Save");
			Assert.fail("Failed to click on Save");

		}
	}

	@When("^Click on the twistie icon and select New Quote$")
	public void clickOnTheTwistieIconAndSelectNewQuote() throws Throwable {
		try {
			waitTime();
			opportunityToQuotePageValidator.click_QuoteDrpdwnInRightsidePane_Link();
			opportunityToQuotePageValidator.click_NewQuoteInQuoteDrpdwn();
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Clicking on new quote")
					.pass("clicked on New quote successfully");
			//Reporters.successReport("Clicking on new quote","clicked on New quote successfully");
		} catch (Exception e) {
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Clicking on new quote")
					.fail("Failed to click on New quote")
					.addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());
			//Reporters.failureReport("Clicking on new quote", "Failed to click on New quote");
			Assert.fail("Failed to click on New quote");

		}
	}

	@When("^Enter the value for Quote Name field$")
	public void enterTheValueForQuoteNameField() throws Throwable {
		try {
			JSONObject input = CommonUtil.readJsonObject("OpportunityToQuote", "createOpportunity");
			String quoteName = input.get("quoteName").toString();
			opportunityToQuotePageValidator.enter_data__quoteName(quoteName);
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering Quote Name")
					.pass("Entered Quote Name successfully");
			//Reporters.successReport("Entering Quote Name","Entered Quote Name successfully");
		} catch (Exception e) {
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering Quote Name")
					.fail("Failed to Enter Quote Name")
					.addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());
			//Reporters.failureReport("Entering Quote Name", "Failed to Enter Quote Name");
			Assert.fail("Failed to Enter Quote Name");

		}
	}

	@When("^Enter the value for Expiration Date field (\\d+)$")
	public void enterTheValueForExpirationDateField(int days) throws Throwable {
		try {
			Date date = new Date();
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(date);
			calendar.add(Calendar.DAY_OF_MONTH, days);
			Date dateAsObjAfterAMonth = calendar.getTime();
			SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
			String afterDate = formatter.format(dateAsObjAfterAMonth);
			ClosingDate = afterDate;
			opportunityToQuotePageValidator.enter_Data_ExpirationDate(afterDate);
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering Expiration Date")
					.pass("Entered Expiration Date successfully");
			//Reporters.successReport("Entering Expiration Date","Entered Expiration Date successfully");

		} catch (Exception e) {
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering Expiration Date")
					.fail("Failed to enter Expiration Date")
					.addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());
			//Reporters.failureReport("Entering Expiration Date", "Failed to enter Expiration Date");
			Assert.fail("Failed to enter Expiration Date");

		}
	}

	@When("^the value for Status field$")
	public void theValueForStatusField() throws Throwable {
		try {
			JSONObject input = CommonUtil.readJsonObject("OpportunityToQuote", "createOpportunity");
			String status = input.get("status").toString();
			opportunityToQuotePageValidator.select_status_Drop(status);
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering Status")
					.pass("Entered Status successfully");
			//Reporters.successReport("Entering Status","Entered Status successfully");

		} catch (Exception e) {
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering Status")
					.fail("Failed to Enter Status").addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());
			//Reporters.failureReport("Entering Status", "Failed to Enter Status");
			Assert.fail("Failed to Enter Status");

		}
	}

	@When("^Enter the value for Bill To Street field$")
	public void enterTheValueForBillToStreetField() throws Throwable {
		try {
		} catch (Exception e) {
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "clicking on New button")
					.fail("Failed to click on New button")
					.addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());
			//Reporters.failureReport("clicking on New button", "Failed to click on New button");
			Assert.fail("Failed to click on New button");

		}
	}

	@When("^Add Products if Products are not available under Quote Line Items$")
	public void addProductsIfProductsAreNotAvailableUnderQuoteLineItems() throws Throwable {
		try {
			int x = opportunityToQuotePageValidator.count_QuoteLineItems();
			if (x == 0) {
				opportunityToQuotePageValidator.click_addProductInDrpdwn();
				JSONObject input = CommonUtil.readJsonObject("OpportunityToQuote", "createOpportunity");
				String productCheckbox = input.get("productCheckbox").toString();
				opportunityToQuotePageValidator.click_CheckBoxForProductNameInAddProduct(productCheckbox);
				opportunityToQuotePageValidator.click_Next_Btn();
				BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Clicking on Checkbox")
						.pass("Clicked on checkbox and then clicked on next button successfully");
				//Reporters.successReport("Clicking on Checkbox","Clicked on checkbox and then clicked on next button successfully");

				JSONObject input1 = CommonUtil.readJsonObject("OpportunityToQuote", "createOpportunity");
				String Quantity1 = input1.get("Quantity1").toString();
				opportunityToQuotePageValidator.enter_Data_quantity(Quantity1);
				BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "entering Quantity")
						.pass("entered Quantity successfully");
				//Reporters.successReport("entering Quantity","entered Quantity successfully");
				opportunityToQuotePageValidator.click_Save_Button();
				BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Click save")
						.pass("Click on save button successfully");
				//Reporters.successReport("Click save","Click on save button successfully");

			}
		} catch (Exception e) {
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Add Products").fail("Failed to Add Products")
					.addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());
			//Reporters.failureReport("Clicking on Checkbox", "Failed to Add Products");
			Assert.fail("Failed to Add Products");

		}
	}

	@When("^Open one Quote from existing Quotes$")
	public void openOneQuoteFromExistingQuotes() throws Throwable {
		try {
			JSONObject input = CommonUtil.readJsonObject("OpportunityToQuote", "createOpportunity");
			String quoteName = input.get("quoteName").toString();
			opportunityToQuotePageValidator.click_FirstQuote_Name(quoteName);
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Open one Quote from existing Quotes")
					.pass("Opened one Quote successfully");
			//Reporters.successReport("Open one Quote from existing Quotes","Opened one Quote successfully");

		}

		catch (Exception e) {
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Open one Quote from existing Quotes")
					.fail("Failed to Open one Quote from existing Quotes")
					.addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());
			//Reporters.failureReport("Open one Quote from existing Quotes", "Failed to Open one Quote from existing Quotes");
			Assert.fail("Failed to Open one Quote from existing Quotes");

		}
	}
	
	@Then("Quote Should be Created")
	public void Quote_Should_be_Created() throws Throwable {
		try{
			boolean flag = opportunityToQuotePageValidator.isDisplayed_QuoteCreated();		
			//BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "clicking on New button").pass("clicked on New button successfully");		
			if(flag)
				{
				//Reporters.successReport("Quote Should be Created","Quote Created successfully");
				
				}
			else
			{
				//Reporters.failureReport("Quote Should be Created", "Quote Created successfully");
			}
		}
		catch(Exception e)
		{
			//BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "clicking on New button").fail("Failed to click on New button").addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());
			//Reporters.failureReport("Quote Should be Created", "Failed to Create Quote");
		}

	}
	@When("^Click on Create PDF button at top right corner$")
	public void clickOnCreatePDFButtonAtTopRightCorner() throws Throwable {
		try {
			waitTime();
			opportunityToQuotePageValidator.click_createPDFbutton();
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Click on Create PDF button")
					.pass("Click on Create PDF button successfully");
			//Reporters.successReport("Click on Create PDF button","Click on Create PDF button successfully");

		} catch (Exception e) {
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Click on Create PDF button")
					.fail("Failed to Click on Create PDF button")
					.addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());
			//Reporters.failureReport("Click on Create PDF button", "Failed to Click on Create PDF button");
			Assert.fail("Failed to Click on Create PDF button");
		}
	}

	@When("^user  Preview the PDF and Click on Save to Quote$")
	public void userPreviewThePDFAndClickOnSaveToQuote() throws Throwable {
		try {
			waitTime();
			waitTime();
			waitTime();
			opportunityToQuotePageValidator.click_saveToQuoteButton();
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Click on Save to Quote")
					.pass("Clicked on Save to Quote successfully");
			//Reporters.successReport("Click on Save to Quote","Clicked on Save to Quote successfully");
		} catch (Exception e) {
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Click on Save to Quote")
					.fail("Failed to Click on Save to Quote")
					.addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());
			//Reporters.failureReport("Click on Save to Quote", "Failed to Click on Save to Quote");
			Assert.fail("Failed to Click on Save to Quote");
		}
	}

	@Then("^PDF should be  saved under Quote PDF's  with default PDF name as QuoteName$")
	public void pdfShouldBeSavedUnderQuotePDFSWithDefaultPDFNameAsQuoteName() throws Throwable {
		try {
			JavascriptExecutor js = (JavascriptExecutor) Driver.browser;
			js.executeScript("window.scrollBy(0,200)");
			JSONObject input = CommonUtil.readJsonObject("OpportunityToQuote", "createOpportunity");
			String quoteName = input.get("quoteName").toString();
			String pdfName = opportunityToQuotePageValidator.get_PdfName();
			if (pdfName.contains(quoteName)) {
				BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "PDF should be  saved under Quote PDF's")
						.pass("PDF saved under Quote PDF's successfully");
				//Reporters.successReport("PDF should be  saved under Quote PDF's","PDF saved under Quote PDF's successfully");

			} else {
				BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "PDF should be  saved under Quote PDF's")
						.fail("Failed to save PDF under Quote PDF's")
						.addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());
				//Reporters.failureReport("PDF should be  saved under Quote PDF's", "Failed to save PDF under Quote PDF's");

			}
		} catch (Exception e) {
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "PDF should be  saved under Quote PDF's")
					.fail("Failed to save PDF under Quote PDF's")
					.addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());
			//Reporters.failureReport("PDF should be  saved under Quote PDF's", "Failed to save PDF under Quote PDF's");
			Assert.fail("Failed to save PDF under Quote PDF's");
		}
	}
}
