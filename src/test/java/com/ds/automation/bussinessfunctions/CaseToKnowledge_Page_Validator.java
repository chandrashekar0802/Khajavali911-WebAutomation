package com.ds.automation.bussinessfunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import com.cigniti.automation.reports.BaseUtil;
import com.cigniti.automation.utilities.Driver;
import com.cigniti.automation.utilities.Selenide;

public class CaseToKnowledge_Page_Validator extends BasePageValidator<CaseToKnowledge_Page> {
	public CaseToKnowledge_Page_Validator(CaseToKnowledge_Page Map1) {
		super(Map1);

	}

	public void click_New_Button() throws Throwable {
		this.getMap().newBtn().click();
	}
	public void click_New_Button_Wrong() throws Throwable {
		this.getMap().newBtnwithwrongPath().click();
	}
	public void click_Assign_Chk() throws Throwable {
		this.getMap().assignChk().click();
	}

	public void click_RelatedTab() throws Throwable {
		Selenide.waitTime();
		this.getMap().relatedTab().click();
	}

	public void click_NewTask() throws Throwable {
		try {
			Selenide.smallwaitTime();
			Selenide.jSClick(this.getMap().newTask());
			// this.getMap().newTask().click();
		} catch (Exception e) {
			Selenide.jSClick(Driver.browser.findElement(By.xpath("//a[@title='New Task']")));
		}
	}

	public void enter_Data_contactName(String contactName) throws Throwable {
		this.getMap().contactNameField().click();
		this.getMap().contactNameField().sendKeys(contactName);
		Selenide.smallwaitTime();
		this.getMap().mohant().click();
	}

	public void enter_Data_accountName(String accountName) throws Throwable {
		try {
			this.getMap().accountNameField().click();
			this.getMap().accountNameField().sendKeys(accountName);
			Selenide.smallwaitTime();
			this.getMap().liza().click();
		} catch (Exception e) {
			this.getMap().accountNameField().sendKeys(Keys.BACK_SPACE);
			this.getMap().accountNameField().sendKeys("a");
			Selenide.smallwaitTime();
			this.getMap().liza().click();
		}
	}

	public void select_status_Drop(String status) throws Throwable {
		this.getMap().selectstatusDrpDwnBtn(status);
	}

	public void select_status1_Drop(String status1) throws Throwable {
		this.getMap().selectstatus1DrpDwnBtn(status1);
	}

	public void select_subject1_Drop(String subject) throws Throwable {
		this.getMap().selectsubject1DrpDwnBtn().sendKeys(subject);
	}

	public void select_origin_Drop(String origin) throws Throwable {
		this.getMap().selectoriginDrpDwnBtn(origin);

	}

	public void select_priority_Drop(String priority) throws Throwable {
		this.getMap().selectPriorityDrpDwnBtn(priority);
	}

	public void select_priority1_Drop(String priority1) throws Throwable {
		this.getMap().selectPriority1DrpDwnBtn(priority1);
	}
	
	public boolean isDisplayed_newTaskCreated() throws Throwable {
		return this.getMap().newTaskCreatedMsg();
	}
	public boolean isDisplayed_CasesPage() throws Throwable {
		return this.getMap().CasesPage();
	}
	
	public void select_type_Drop(String type) throws Throwable {
		this.getMap().selecttypeDrpDwnBtn(type);
	}

	public void select_reason_Drop(String reason) throws Throwable {
		this.getMap().selecttypeDrpDwnBtn(reason);
	}

	public void Enter_Data_Subject(String subject) throws Throwable {
		this.getMap().subjectField().sendKeys(subject);
	}

	public void Enter_Data_Description(String description) throws Throwable {
		this.getMap().descriptionField().sendKeys(description);
	}

	public void Enter_Data_Comments(String comments) throws Throwable {
		this.getMap().commentsField().sendKeys(comments);
	}

	public void Enter_Data_Comments1(String comments1) throws Throwable {
		this.getMap().comments1Field().sendKeys(comments1);
	}

	public void Enter_Data_WebEmail(String webEmail) throws Throwable {
		this.getMap().webEmailField().sendKeys(webEmail);
	}

	public void Enter_Data_WebName(String webName) throws Throwable {
		this.getMap().webNameField().sendKeys(webName);
	}

	public void Enter_Data_WebCompany(String webCompany) throws Throwable {
		this.getMap().webCompanyField().sendKeys(webCompany);
	}

	public void Enter_Data_WebPhone(String webPhone) throws Throwable {
		this.getMap().webPhoneField().sendKeys(webPhone);
	}

	public void Enter_Data_Name(String name) throws Throwable {
		this.getMap().nameField().sendKeys(name);
	}

	public void enter_Data_due_date(String date) throws Throwable {
		// this.getMap().dueDate().click();
		this.getMap().dueDate().sendKeys(date);
	}

	public void click_UserProfile_Button() throws Throwable {
		this.getMap().userProfileBtn().click();
	}

	public void click_userProfileBtnInClassicView_Button() throws Throwable {
		this.getMap().userProfileBtnInClassicView().click();
	}

	public void click_SalesForceClassic_Button() throws Throwable {
		this.getMap().salesForceClassicBtn().click();
	}

	public void click_salesForceLighteningBtn() throws Throwable {
		this.getMap().salesForceLighteningBtn().click();
	}

	public void click_AllTabsArrow() throws Throwable {
		this.getMap().allTabsArrowBtn().click();
	}

	public void click_casesObject() throws Throwable {
		this.getMap().casesObject().click();
	}

	public void click_CaseNumber() throws Throwable {
		this.getMap().caseNumber().click();
	}

	public void enter_Value_Solution(String value) throws Throwable {
		this.getMap().solutionGridValue().sendKeys(value);
	}

	public boolean solution_Grid() throws Throwable {
		return this.getMap().solutionGrid();
	}

	public void click_FindSolutionBtn() throws Throwable {
		this.getMap().findSolutionBtn().click();
	}
	
	public boolean isDisplayed_newTaskWindow() throws Throwable {
		return this.getMap().newTaskWindow();
	}
	public void click_HyperLinkInSolutionGrid() throws Throwable {
		this.getMap().hyperLinkInSolutionGrid().click();
	}

	public void click_closeCaseUnderSysInfoGrid() throws Throwable {
		this.getMap().closeCase().click();
	}

	public void select_caseStatus_Drop(String caseStatus) throws Throwable {
		this.getMap().selectCaseStatusDrpDwn(caseStatus);
	}

	public void select_caseReason_Drop(String caseReason) throws Throwable {
		this.getMap().selectCaseReasonDrpDwn(caseReason);
	}

	public void click_SaveBtnInCloseCase() throws Throwable {
		this.getMap().saveCase().click();
	}

}
