package ui.automation.stepdef;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.json.simple.JSONObject;
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
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
//import ui.automation.pages.Accounts_Page;
//import ui.automation.pages.Accounts_Page_Validator;
import ui.automation.pages.CaseToKnowledge_Page;
import ui.automation.pages.CaseToKnowledge_Page_Validator;

public class CaseToKnowledge_Steps extends Selenide {
	PropertiesFileReader obj = new PropertiesFileReader();
	private BaseUtil base;
	private static ExtentReportUtil extentreportUtil = new ExtentReportUtil();
	SoftAssert softAssert = new SoftAssert();
	public static String ClosingDate = "";

	CaseToKnowledge_Page caseToKnowledgePage = new CaseToKnowledge_Page(Driver.browser);
	CaseToKnowledge_Page_Validator caseToKnowledgePageValidator = new CaseToKnowledge_Page_Validator(
			caseToKnowledgePage);

	@Given("^Click on Cases New button$")
	public void clickOnCasesNewButton() throws Throwable {
		try {
			caseToKnowledgePageValidator.click_New_Button();
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "clicking on New button")
					.pass("clicked on New button successfully");
		} catch (Exception e) {
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "clicking on New button")
					.fail("Failed to click on New button " + e.getMessage())
					.addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());
			Assert.fail("Failed to click on New button");
		}
	}

	@Given("Enter the value for Cases owner field")
	public void enter_the_value_for_Cases_owner_field() {
		// Write code here that turns the phrase above into concrete actions
		throw new cucumber.api.PendingException();
	}

	@Given("Enter the value for contact name field")
	public void enter_the_value_for_contact_name_field() throws Throwable {
		try {
			JSONObject input = CommonUtil.readJsonObject("CasesToKnowledge", "caseToKnowledge");
			String contactName = input.get("contactName").toString();
			caseToKnowledgePageValidator.enter_Data_contactName(contactName);
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering contact name")
					.pass("Entered contact Name successfully");
		} catch (Exception e) {
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering contact name")
					.fail("Failed to Enter contact name")
					.addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());
			Assert.fail("Failed to Enter contact name");
		}
	}

	@Given("^Enter the value for account name field$")
	public void enterTheValueForAccountNameField() throws Throwable {
		try {
			JSONObject input = CommonUtil.readJsonObject("CasesToKnowledge", "caseToKnowledge");
			String acctName = input.get("accountName").toString();
			caseToKnowledgePageValidator.enter_Data_accountName(acctName);
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering account name")
					.pass("Entered account Name successfully");
		} catch (Exception e) {
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering account name")
					.fail("Failed to Enter account name")
					.addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());
			Assert.fail("Failed to Entering account name");
		}
	}

	@Given("Enter the value for status field")
	public void enter_the_value_for_status_field() throws Throwable {
		try {
			JSONObject input = CommonUtil.readJsonObject("CasesToKnowledge", "caseToKnowledge");
			String status = input.get("status").toString();
			caseToKnowledgePageValidator.select_status_Drop(status);
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering status name")
					.pass("Entered status successfully");
		} catch (Exception e) {
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering status name")
					.fail("Failed to Enter status ")
					.addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());
			Assert.fail("Failed to Entering status name");
		}
	}

	@Given("Enter the value for Case Origin field")
	public void enter_the_value_for_Case_Origin_field() throws Throwable {
		try {
			JSONObject input = CommonUtil.readJsonObject("CasesToKnowledge", "caseToKnowledge");
			String origin = input.get("origin").toString();
			caseToKnowledgePageValidator.select_origin_Drop(origin);
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering case origin")
					.pass("Entered case origin successfully");
		} catch (Exception e) {
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering case origin")
					.fail("Failed to Enter case origin")
					.addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());
			Assert.fail("Failed to Enter case origin");
		}
	}

	@Given("Enter the value for Priority  field")
	public void enter_the_value_for_Priority_field() throws Throwable {
		try {
			JSONObject input = CommonUtil.readJsonObject("CasesToKnowledge", "caseToKnowledge");
			String priority = input.get("priority").toString();
			caseToKnowledgePageValidator.select_priority_Drop(priority);
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering priority")
					.pass("Entered priority successfully");
		} catch (Exception e) {
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering priority")
					.fail("Failed to Enter priority")
					.addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());
			Assert.fail("Failed to Enter priority");
		}
	}

	@Given("^Enter the value for type field$")
	public void enterTheValueForTypeField() throws Throwable {
		try {
			JSONObject input = CommonUtil.readJsonObject("CasesToKnowledge", "caseToKnowledge");
			String type = input.get("type").toString();
			caseToKnowledgePageValidator.select_type_Drop(type);
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering type")
					.pass("Entered type successfully");
		} catch (Exception e) {
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering type").fail("Failed to Enter type")
					.addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());
			Assert.fail("Failed to Enter type");
		}
	}

	@Given("Enter the value for Case Reason field")
	public void enter_the_value_for_Case_Reason_field() throws Throwable {
		try {
			JSONObject input = CommonUtil.readJsonObject("CasesToKnowledge", "caseToKnowledge");
			String reason = input.get("caseReason").toString();
			caseToKnowledgePageValidator.select_reason_Drop(reason);
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering Case Reason")
					.pass("Entered Case Reason successfully");
		} catch (Exception e) {
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering Case Reason")
					.fail("Failed to Enter Case Reason")
					.addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());
			Assert.fail("Failed to Entering Case Reason");
		}
	}

	@Given("Enter the value for Subject field")
	public void enter_the_value_for_Subject_field() throws Throwable {
		try {
			JSONObject input = CommonUtil.readJsonObject("CasesToKnowledge", "caseToKnowledge");
			String subject = input.get("subject").toString();
			caseToKnowledgePageValidator.Enter_Data_Subject(subject);
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering subject")
					.pass("Entered subject successfully");
		} catch (Exception e) {
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering subject")
					.fail("Failed to Enter subject")
					.addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());
			Assert.fail("Failed to Enter subject");
		}
	}

	@Given("Enter the value for Description field")
	public void enter_the_value_for_Description_field() throws Throwable {
		try {
			JSONObject input = CommonUtil.readJsonObject("CasesToKnowledge", "caseToKnowledge");
			String description = input.get("description").toString();
			caseToKnowledgePageValidator.Enter_Data_Description(description);
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering description")
					.pass("Entered description successfully");
		} catch (Exception e) {
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering description")
					.fail("Failed to Enter description")
					.addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());
			Assert.fail("Failed to Enter description");
		}
	}

	@Given("Enter the value for Internal Comments field")
	public void enter_the_value_for_Internal_Comments_field() throws Throwable {
		try {
			JSONObject input = CommonUtil.readJsonObject("CasesToKnowledge", "caseToKnowledge");
			String comments = input.get("comments").toString();
			caseToKnowledgePageValidator.Enter_Data_Comments1(comments);
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering comments")
					.pass("Entered comments successfully");
		} catch (Exception e) {
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering comments")
					.fail("Failed to Enter comments")
					.addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());
			Assert.fail("Failed to Enter comments");
		}
	}

	@Given("Enter the value for Web Email field")
	public void enter_the_value_for_Web_Email_field() throws Throwable {
		try {
			JSONObject input = CommonUtil.readJsonObject("CasesToKnowledge", "caseToKnowledge");
			String webEmail = input.get("webEmail").toString();
			caseToKnowledgePageValidator.Enter_Data_WebEmail(webEmail);
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering Web Email")
					.pass("Entered Web Email successfully");
		} catch (Exception e) {
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering Web Email")
					.fail("Failed to Enter Web Email")
					.addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());
			Assert.fail("Failed to Enter Web Email");
		}
	}

	@Given("Enter the value for Web Name field")
	public void enter_the_value_for_Web_Name_field() throws Throwable {
		try {
			JSONObject input = CommonUtil.readJsonObject("CasesToKnowledge", "caseToKnowledge");
			String webName = input.get("webName").toString();
			caseToKnowledgePageValidator.Enter_Data_WebName(webName);
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering Web Name")
					.pass("Entered Web Name successfully");
		} catch (Exception e) {
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering Web Name")
					.fail("Failed to Enter Web Name")
					.addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());
			Assert.fail("Failed to Enter Web Name");
		}
	}

	@Given("Enter the value for Web Company field")
	public void enter_the_value_for_Web_Company_field() throws Throwable {
		try {
			JSONObject input = CommonUtil.readJsonObject("CasesToKnowledge", "caseToKnowledge");
			String webCompany = input.get("webCompany").toString();
			caseToKnowledgePageValidator.Enter_Data_WebCompany(webCompany);
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering Web Company")
					.pass("Entered Web Company successfully");
		} catch (Exception e) {
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering Web Company")
					.fail("Failed to Enter Web Company")
					.addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());
			Assert.fail("Failed to Enter Web Company");
		}
	}

	@Given("Enter the value for Web Phone field")
	public void enter_the_value_for_Web_Phone_field() throws Throwable {
		try {
			JSONObject input = CommonUtil.readJsonObject("CasesToKnowledge", "caseToKnowledge");
			String webPhone = input.get("webPhone").toString();
			caseToKnowledgePageValidator.Enter_Data_WebPhone(webPhone);
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering Web Phone")
					.pass("Entered Web Phone successfully");
		} catch (Exception e) {
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering Web Phone")
					.fail("Failed to Enter Web Phone")
					.addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());
			Assert.fail("Failed to Enter Web Phone");
		}
	}

	@Given("^Check Assign Using Active Assignment rule Check box$")
	public void checkAssignUsingActiveAssignmentRuleCheckBox() throws Throwable {
		try {
			caseToKnowledgePageValidator.click_Assign_Chk();
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "clicking on Assign CheckBox")
					.pass("clicked on Assign CheckBox successfully");
		} catch (Exception e) {
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "clicking on Assign CheckBox")
					.fail("Failed to click on Assign CheckBox " + e.getMessage())
					.addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());
			Assert.fail("Failed to click on Assign CheckBox");
		}
	}

	@Given("^Click on Related Tab$")
	public void clickOnRelatedTab() throws Throwable {
		try {
			caseToKnowledgePageValidator.click_RelatedTab();
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "clicking on Related Tab")
					.pass("clicked on Related Tab successfully");
		} catch (Exception e) {
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "clicking on Related Tab")
					.fail("Failed to click on Related Tab " + e.getMessage())
					.addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());
			Assert.fail("Failed to click on Related Tab ");
		}
	}

	@Given("^Click on New Task$")
	public void clickOnNewTask() throws Throwable {
		try {
			// Driver.browser.navigate().refresh();
			caseToKnowledgePageValidator.click_NewTask();
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "clicking on New Task Button")
					.pass("clicked on New Task button successfully");
		} catch (Exception e) {
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "clicking on New Task button")
					.fail("Failed to click on New Task button " + e.getMessage())
					.addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());
			Assert.fail("Failed to click on New Task button ");
		}
	}

	@Given("^Enter Value for Name Field$")
	public void enterValueForNameField() throws Throwable {
		try {
			JSONObject input = CommonUtil.readJsonObject("CasesToKnowledge", "caseToKnowledge");
			String name = input.get("name").toString();
			caseToKnowledgePageValidator.Enter_Data_Name(name);
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering Name")
					.pass("Entered Name successfully");
		} catch (Exception e) {
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering Name").fail("Failed to Enter Name")
					.addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());
			Assert.fail("Failed to Enter Name");
		}
	}

	@Given("^Enter the value for Subject  field$")
	public void enterTheValueForSubjectField() throws Throwable {
		try {
			JSONObject input = CommonUtil.readJsonObject("CasesToKnowledge", "caseToKnowledge");
			String subject1 = input.get("subject1").toString();

			caseToKnowledgePageValidator.select_subject1_Drop(subject1);
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering subject1 name")
					.pass("Entered subject1 successfully");
		} catch (Exception e) {
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering subject1 name")
					.fail("Failed to Enter subject1 ")
					.addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());
			Assert.fail("Failed to Enter subject1 ");
		}
	}

	@Given("^Enter the data for Comments field$")
	public void enterTheDataForCommentsField() throws Throwable {
		try {
			JSONObject input = CommonUtil.readJsonObject("CasesToKnowledge", "caseToKnowledge");
			String comments = input.get("comments").toString();
			caseToKnowledgePageValidator.Enter_Data_Comments(comments);
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering comments")
					.pass("Entered comments successfully");
		} catch (Exception e) {
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering comments")
					.fail("Failed to Enter comments")
					.addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());
			Assert.fail("Failed to Enter comments");
		}
	}

	@Given("^Enter the data for status field$")
	public void enterTheDataForStatusField() throws Throwable {
		try {
			JSONObject input = CommonUtil.readJsonObject("CasesToKnowledge", "caseToKnowledge");
			String status1 = input.get("status1").toString();
			caseToKnowledgePageValidator.select_status1_Drop(status1);
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering status1 name")
					.pass("Entered status1 successfully");
		} catch (Exception e) {
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering status1 name")
					.fail("Failed to Enter status1 ")
					.addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());
			Assert.fail("Failed to Enter status1 ");
		}
	}

	@Given("^Enter the value for Priority field$")
	public void enterTheValueForPriorityField() throws Throwable {
		try {
			JSONObject input = CommonUtil.readJsonObject("CasesToKnowledge", "caseToKnowledge");
			String priority1 = input.get("priority1").toString();
			caseToKnowledgePageValidator.select_priority1_Drop(priority1);
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering priority")
					.pass("Entered priority successfully");
		} catch (Exception e) {
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering priority")
					.fail("Failed to Enter priority")
					.addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());
			Assert.fail("Failed to Enter priority");
		}
	}

	@Given("^Enter the date for due date field$")
	public void enterTheDateForDueDateField() throws Throwable {
		try {
			Date date = new Date();
			SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
			String todayDate = formatter.format(date);
			caseToKnowledgePageValidator.enter_Data_due_date(todayDate);
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "entering  Due Date")
					.pass("entered Due Date successfully");
		} catch (Exception e) {
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "entering Due Date")
					.fail("Failed to enter Due Date")
					.addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());
			Assert.fail("Failed to enter Due Date");
		}
	}

	@Given("^Mouse over on user name and click on switch to sales force classic$")
	public void mouseOverOnUserNameAndClickOnSwitchToSalesForceClassic() throws Throwable {
		try {
			smallwaitTime();
			caseToKnowledgePageValidator.click_UserProfile_Button();
			caseToKnowledgePageValidator.click_SalesForceClassic_Button();
			BaseUtil.scenarioDef
					.createNode(new GherkinKeyword("Given"), "clicking on Switch to Salesforce Classic Button")
					.pass("clicked on Switch to Salesforce Classic Button successfully");
		} catch (Exception e) {
			BaseUtil.scenarioDef
					.createNode(new GherkinKeyword("Given"), "clicking on Switch to Salesforce Classic Button")
					.fail("Failed to click on Switch to Salesforce Classic Button " + e.getMessage())
					.addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());
			Assert.fail("Failed to click on Switch to Salesforce Classic Button");
		}
	}

	@Given("^Click on Case Link$")
	public void clickOnCaseLink() throws Throwable {
		try {
			caseToKnowledgePageValidator.click_AllTabsArrow();

			caseToKnowledgePageValidator.click_casesObject();
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "clicking on All Tabs Arrow")
					.pass("clicked on All Tabs Arrow successfully");
		} catch (Exception e) {
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "clicking on All Tabs Arrow")
					.fail("Failed to click on All Tabs Arrow" + e.getMessage())
					.addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());
			Assert.fail("Failed to click on All Tabs Arrow");
		}
	}

	@Given("^Click on hyperlink of one case number on the cases Home screen$")
	public void clickOnHyperlinkOfOneCaseNumberOnTheCasesHomeScreen() throws Throwable {
		try {
			caseToKnowledgePageValidator.click_CaseNumber();

			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "clicking on Case Number Link")
					.pass("clicked on Case Number successfully");
		} catch (Exception e) {
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "clicking on Case Number Link")
					.fail("Failed to click on Case Number" + e.getMessage())
					.addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());
			Assert.fail("Failed to click on Case Number");
		}
	}

	@Given("^Enter the value in finding solution field$")
	public void enterTheValueInFindingSolutionField() throws Throwable {
		try {
			caseToKnowledgePageValidator.enter_Value_Solution("Support Timings");

			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Enter the value in finding solution field")
					.pass("Entered the value in finding solution field successfully");
		} catch (Exception e) {
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Enter the value in finding solution field")
					.fail("Failed to Enter the value in finding solution field" + e.getMessage())
					.addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());
			Assert.fail("Failed to Enter the value in finding solution field");
		}
	}

	@Given("^check the solution grid$")
	public void checkTheSolutionGrid() throws Throwable {
		try {
			boolean grid = caseToKnowledgePageValidator.solution_Grid();
			if (grid) {
				BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Verify Solution Grid")
						.pass("Solution Grid displayed successfully");
			} else {
				BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Verify Solution Grid")
						.fail("Failed to display Solution Grid")
						.addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());
			}
		} catch (Exception e) {
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "PDF should be  saved under Quote PDF's")
					.fail("Failed to save PDF under Quote PDF's")
					.addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());
			Assert.fail("Failed to save PDF under Quote PDF's");
		}
	}

	@Given("^Click on Find solution button$")
	public void clickOnFindSolutionButton() throws Throwable {
		try {
			caseToKnowledgePageValidator.click_FindSolutionBtn();

			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "clicking on Find Solution Button")
					.pass("clicked on Find Solution Button successfully");
		} catch (Exception e) {
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "clicking on Find Solution Button")
					.fail("Failed to click on Find Solution Button" + e.getMessage())
					.addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());
			Assert.fail("Failed to click on Find Solution Button");
		}
	}

	@Given("^Click on select hyperlink from one solution's record$")
	public void clickOnSelectHyperlinkFromOneSolutionSRecord() throws Throwable {
		try {
			caseToKnowledgePageValidator.click_HyperLinkInSolutionGrid();
			BaseUtil.scenarioDef
					.createNode(new GherkinKeyword("Given"), "clicking on Select Hyper Link in Solution Grid")
					.pass("clicked on Select Hyper Link in Solution Grid successfully");
		} catch (Exception e) {
			BaseUtil.scenarioDef
					.createNode(new GherkinKeyword("Given"), "clicking on Select Hyper Link in Solution Grid")
					.fail("Failed to click on Select Hyper Link in Solution Grid" + e.getMessage())
					.addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());
			Assert.fail("Failed to click on Select Hyper Link in Solution Grid");
		}
	}

	@Given("^Click on close case button under system information grid$")
	public void clickOnCloseCaseButtonUnderSystemInformationGrid() throws Throwable {
		try {
			caseToKnowledgePageValidator.click_closeCaseUnderSysInfoGrid();
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "clicking on Close Case Link")
					.pass("clicked on Close Case successfully");
		} catch (Exception e) {
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "clicking on Close Case Link")
					.fail("Failed to click on Close Case" + e.getMessage())
					.addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());
			Assert.fail("Failed to click on Close Case");
		}
	}

	@Given("^select  value from the status field$")
	public void selectValueFromTheStatusField() throws Throwable {
		try {
			JSONObject input = CommonUtil.readJsonObject("CasesToKnowledge", "caseToKnowledge");
			String caseStatus = input.get("caseStatus").toString();
			caseToKnowledgePageValidator.select_caseStatus_Drop(caseStatus);
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering Case Status")
					.pass("Entered Case Status successfully");
		} catch (Exception e) {
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering Case Status")
					.fail("Failed to Enter Case Status")
					.addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());
			Assert.fail("Failed to Enter Case Status");
		}
	}

	@When("^select  value from the Case Reason field$")
	public void selectValueFromTheCaseReasonField() throws Throwable {
		try {
			JSONObject input = CommonUtil.readJsonObject("CasesToKnowledge", "caseToKnowledge");
			String caseReason = input.get("caseReason").toString();
			caseToKnowledgePageValidator.select_caseReason_Drop(caseReason);
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering Case Reason")
					.pass("Entered Case Reason successfully");
		} catch (Exception e) {
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "Entering Case Reason")
					.fail("Failed to Enter Case Reason")
					.addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());
			Assert.fail("Failed to Enter Case Reason");
		}
	}

	@Then("^Click on save button$")
	public void clickOnSaveButton() throws Throwable {
		try {
			caseToKnowledgePageValidator.click_SaveBtnInCloseCase();
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "clicking on Save Case Button")
					.pass("clicked on Save Case Button successfully");
		} catch (Exception e) {
			BaseUtil.scenarioDef.createNode(new GherkinKeyword("Given"), "clicking on Save Case Button")
					.fail("Failed to click on Save Case Button" + e.getMessage())
					.addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());
			Assert.fail("Failed to click on Save Case Button");
		}
	}

	@Then("^Change to lightening view$")
	public void changeToLighteningView() throws Throwable {
		try {
			smallwaitTime();
			caseToKnowledgePageValidator.click_userProfileBtnInClassicView_Button();
			caseToKnowledgePageValidator.click_salesForceLighteningBtn();
			BaseUtil.scenarioDef
					.createNode(new GherkinKeyword("Given"), "clicking on Switch to Salesforce Lightening Button")
					.pass("clicked on Switch to Salesforce Lightening Button successfully");
		}

		catch (Exception e) {
			BaseUtil.scenarioDef
					.createNode(new GherkinKeyword("Given"), "clicking on Switch to Salesforce Lightening Button")
					.fail("Failed to click on Switch to Salesforce Lightening Button " + e.getMessage())
					.addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());
			Assert.fail("Failed to click on Switch to Salesforce Lightening Button");
		}

	}

}
