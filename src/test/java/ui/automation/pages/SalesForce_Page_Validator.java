package ui.automation.pages;

import org.openqa.selenium.By;

import cigniti.automation.utilities.Driver;
import cigniti.automation.utilities.Selenide;

public class SalesForce_Page_Validator extends BasePageValidator<SalesForce_Page> {
	
	public SalesForce_Page_Validator(SalesForce_Page Map1) {
		super(Map1);
		// TODO Auto-generated constructor stub
	}

	public void enter_credentials(String username, String password) throws Throwable {
		this.getMap().username.sendKeys(username);
		this.getMap().Password.sendKeys(password);
	}

	public void click_login() throws Throwable{
		this.getMap().signin_btn.click();
	}

	public void click_remindLater() throws Throwable{
		this.getMap().reminderLater().click();
	}


	public void waitForLoad_Login() throws Throwable{
		this.getMap().LoadingImage_Icon();
		Selenide.smallwaitTime();
		this.getMap().Loading_Icon();
	}
	public void click_New_Button() throws Throwable{
		this.getMap().newButton().click();
	}
	public boolean isDisplayed_newLeadWindow() throws Throwable {
		return this.getMap().newLeadWindow();
	}
	
	public boolean isDisplayed_newCaseWindow() throws Throwable {
		return this.getMap().newCaseWindow();
	}
	public boolean isDisplayed_newopportunityWindow() throws Throwable {
		return this.getMap().newOpportunityWindow();
	}
	
	public boolean isDisplayed_newLeadCreated() throws Throwable {
		return this.getMap().newLeadCreatedsucessMsg();
	}
	public boolean isDisplayed_RecordUpdated() throws Throwable {
		return this.getMap().RecordUpdatedMsg();
	}
	
	public boolean isDisplayed_newOpportunityCreated() throws Throwable {
		return this.getMap().newOpportunityCreatedsucessMsg();
	}
	public boolean isDisplayed_newcaseCreated() throws Throwable {
		return this.getMap().newcaseCreatedMsg();
	}
	
	public void click_Save_Button() throws Throwable{
		this.getMap().saveButton().click();		
	}
	public void click_accountsTab() throws Throwable{
		this.getMap().accountsTab().click();
	}
	public void click_contactTab() throws Throwable{
		this.getMap().contactTab().click();
	}
	public void click_opportunitiesTab() throws Throwable{
		this.getMap().opportunitiesTab().click();
	}
	public void click_LeadsTab() throws Throwable{
		this.getMap().leadsTab().click();
	}
	public void click_Edit_Button() throws Throwable{
		try{
		this.getMap().editButton().click();
		}
		catch(Exception e){	
			e.getMessage();
			Thread.sleep(3000);
			//this.getMap().convertTab().click();	
			Selenide.jSClick(Driver.browser.findElement(By.xpath("//button[text()='Edit']")));
		}
	}
	public void click_navigation_Button() throws Throwable{
		this.getMap().navigationBtn().click();
	}
	public void click_viewAllLink_Button() throws Throwable{
		this.getMap().viewAllLink().click();
	}	
	public void enter_SearchDetails(String searchValue) throws Throwable {
		this.getMap().searchBoxInAppLauncher().sendKeys(searchValue);	
	}
	public void click_quotesObject() throws Throwable{
		this.getMap().quotesObject().click();
	}

	public void click_casesObject() throws Throwable{
		this.getMap().casesObject().click();
	}
	public void click_cancle_Button() throws Throwable{
		this.getMap().cancleButton().click();
	}
	
}

