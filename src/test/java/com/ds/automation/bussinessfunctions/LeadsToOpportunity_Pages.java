package com.ds.automation.bussinessfunctions;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.cigniti.automation.utilities.Selenide;


public class LeadsToOpportunity_Pages extends BasePageElementMap
{
	public LeadsToOpportunity_Pages(WebDriver driver) {
		super(driver);
	} 
	public WebElement firstNameField() throws Throwable {
		return Selenide.getElement(By.xpath("//input[@name='firstName']"),15);  	 
	}
	public WebElement lastNameField() throws Throwable {
		return Selenide.getElement(By.xpath("//input[@name='lastName']"),15);  	 
	}
	public WebElement phoneField() throws Throwable {
		return Selenide.getElement(By.xpath("//input[@name='Phone']"),15);  	 
	}
	public WebElement companyField() throws Throwable {
		return Selenide.getElement(By.xpath("//input[@name='Company']"),15);  	 
	}

	public boolean ConvertLeadWindow() throws Throwable {
		return Selenide.isElementDisplayed(By.xpath("//h2[contains(text(),'Convert Lead')]"),"Convert Lead window");  	 
	}
	public boolean LeadConvertedMsg() throws Throwable {
		return Selenide.isElementDisplayed(By.xpath("//span[text()='Your lead has been converted']"),"Lead Converted message");  	 
	}

	public @FindBy(xpath="//label[text()='Lead Source']/following-sibling::div[1]//input") WebElement leadSourceDrpDwnBtn;//span[text()='Lead Source']/../following-sibling::div[1]//a	
	public boolean selectleadSourceDrpDwnBtn(String str) throws Throwable {
		return Selenide.SelectItemFromNonSelectListDropDown1(str, leadSourceDrpDwnBtn);  	 
	}
	public @FindBy(xpath="//label[text()='IST Representative']/following-sibling::div[1]//input") WebElement istRepresentativeDrpdwnBtn;//span[text()='IST Representative']/../following-sibling::div[1]//a
	public boolean selectISTrepresentativeDrpDwnBtn(String str) throws Throwable {
		return Selenide.SelectItemFromNonSelectListDropDown1(str, istRepresentativeDrpdwnBtn);  	 
	}
	public @FindBy(xpath="//label[text()='Campaign']/following-sibling::div[1]//input") WebElement campaignDrpdwnBtn;
	public boolean selectCampaignDrpDwnBtn(String str) throws Throwable {
		return Selenide.SelectItemFromNonSelectListDropDown1(str, campaignDrpdwnBtn);  	 
	}
	public @FindBy(xpath="//label[text()='VerticalGrouping']/following-sibling::div[1]//input") WebElement verticalGroupingDrpdwnBtn;
	public boolean selectVerticalGroupingDrpDwnBtn(String str) throws Throwable {
		Selenide.scrollIntoView(By.xpath("//label[text()='Sub Vertical 1']/following-sibling::div[1]//input"));
		return Selenide.SelectItemFromNonSelectListDropDown1(str, verticalGroupingDrpdwnBtn);  	 
	}
	public @FindBy(xpath="//label[text()='Sub Vertical 1']/following-sibling::div[1]//input") WebElement subverticaloneDrpdwnBtn;
	public boolean selectSubVerticalOneDrpDwnBtn(String str) throws Throwable {
		//Selenide.scrollIntoView(By.xpath("//label[text()='Sub Vertical 1']/following-sibling::div[1]//input"));
		return Selenide.SelectItemFromNonSelectListDropDown1(str, subverticaloneDrpdwnBtn);  	 
	}
	public @FindBy(xpath="//label[text()='Vertical']/following-sibling::div[1]//input") WebElement verticalDrpdwnBtn;
	public boolean selectVerticalDrpDwnBtn(String str) throws Throwable {
		return Selenide.SelectItemFromNonSelectListDropDown1(str, verticalDrpdwnBtn);  	 
	}	
	public @FindBy(xpath="//label[text()='Rating']/following-sibling::div[1]//input") WebElement ratingDrpdwnBtn;
	public boolean selectRatingDrpDwnBtn(String str) throws Throwable {
		return Selenide.SelectItemFromNonSelectListDropDown1(str, ratingDrpdwnBtn);  	 
	}
	public @FindBy(xpath="//label[text()='Region']/following-sibling::div[1]//input") WebElement regionDrpdwnBtn;
	public boolean selectRegionDrpDwnBtn(String str) throws Throwable {
		return Selenide.SelectItemFromNonSelectListDropDown1(str, regionDrpdwnBtn);  	 
	}
	public WebElement revenueField() throws Throwable {
		return Selenide.getElement(By.xpath("//input[@name='Revenue__c']"),15);  	 
	}
	public WebElement streetField() throws Throwable {
		return Selenide.getElement(By.xpath("//textarea[@name='street']"),15);  	 
	}
	public WebElement cityField() throws Throwable {
		return Selenide.getElement(By.xpath("//input[@name='city']"),15);  	 
	}
	public WebElement stateField() throws Throwable {
		return Selenide.getElement(By.xpath("//input[@name='province']"),15);  	 
	}
	public WebElement postalField() throws Throwable {
		return Selenide.getElement(By.xpath("//input[@name='postalCode']"),15);  	 
	}
	public WebElement countryField() throws Throwable {
		return Selenide.getElement(By.xpath("//input[@name='country']"),15);  	 
	}
	public WebElement firstLeadInLeadsHomeScreen() throws Throwable {
		return Selenide.getElement(By.xpath("//table[@data-aura-class='uiVirtualDataTable']/tbody/tr[1]/th//a"),10); 		
	}
	public WebElement convertTab() throws Throwable {
		return Selenide.getElement(By.xpath("//button[@name='Convert']"),10); 		
	}
	public WebElement convertBtn() throws Throwable {
		return Selenide.getElement(By.xpath("//span[text()='Convert']"),10); 		
	}
	public @FindBy(xpath="//label[text()='Lead Status']/following-sibling::div[1]//input") WebElement leadStatus;//span[text()='Lead Status']/../following-sibling::div[1]//a
	public boolean selectLeadStatusDrpDwnBtn(String str) throws Throwable {
		return Selenide.SelectItemFromNonSelectListDropDown1(str, leadStatus);  	 
	}
	public @FindBy(xpath="//label[text()='Salutation']/following-sibling::div[1]//input") WebElement salutation;//span[text()='Salutation']/../following-sibling::div[1]//a
	public boolean selectSalutationDrpDwnBtn(String str) throws Throwable {
		return Selenide.SelectItemFromNonSelectListDropDown1(str, salutation);  	 
	}
	public WebElement faxField() throws Throwable {
		return Selenide.getElement(By.xpath("//input[@name='Fax']"),15);  	 
	}
	public WebElement titleField() throws Throwable {
		return Selenide.getElement(By.xpath("//input[@name='Title']"),15);  	 
	}
	public WebElement webSiteField() throws Throwable {
		return Selenide.getElement(By.xpath("//input[@name='Website']"),15);  	 
	}
	public WebElement emailField() throws Throwable {
		return Selenide.getElement(By.xpath("//input[@name='Email']"),15);  	 
	}
	public @FindBy(xpath="//span[text()='Ownership']/../following-sibling::div[1]//a") WebElement ownership;
	public boolean selectownershipDrpDwnBtn(String str) throws Throwable {
		return Selenide.SelectItemFromNonSelectListDropDown1(str, ownership);  	 
	}//span[text()='Revenue Range']/../following-sibling::div[1]//a
	public @FindBy(xpath="//label[text()='Revenue Range']/following-sibling::div[1]//input") WebElement revenueRange;
	public boolean selectrevenueRangeDrpDwnBtn(String str) throws Throwable {
		return Selenide.SelectItemFromNonSelectListDropDown1(str, revenueRange);  	 
	}
	public WebElement contactLocationField() throws Throwable {
		return Selenide.getElement(By.xpath("//label[text()='Contact Location']/following-sibling::div/textarea"),15);  	 
	}
	public @FindBy(xpath="//label[text()='BDM']/following-sibling::div[1]//input") WebElement bdm;
	public boolean selectBDMDrpDwnBtn(String str) throws Throwable {
		return Selenide.SelectItemFromNonSelectListDropDown1(str, bdm);  	 
	}
	public @FindBy(xpath="//label[text()='Business Unit']/following-sibling::div[1]//input") WebElement businessUnit;
	public boolean selectBusinesUnitDrpDwnBtn(String bu) throws Throwable {
		return Selenide.SelectItemFromNonSelectListDropDown1(bu, businessUnit);  	 
	}
	public WebElement CreateNewRadioBtnInAccount() throws Throwable {
		return Selenide.getElement(By.xpath("(//legend[text()='Account']/following-sibling::div//span[@class='slds-radio_faux'])[1]"),15);  	 
	}
	public WebElement CreateNewRadioBtnInOpportunity() throws Throwable {
		return Selenide.getElement(By.xpath("(//legend[text()='Opportunity']/following-sibling::div//span[@class='slds-radio_faux'])[1]"),15);  	 
	}
	public WebElement CreateNewRadioBtnInContact() throws Throwable {
		return Selenide.getElement(By.xpath("(//legend[text()='Contact']/following-sibling::div//span[@class='slds-radio_faux'])[1]"),15);  	 
	}
	public WebElement chooseExistingRadioBtnInAccount() throws Throwable {
		return Selenide.getElement(By.xpath("(//legend[text()='Account']/following-sibling::div//span[@class='slds-radio_faux'])[2]"),15);  	 
	}
	public WebElement chooseExistingRadioBtnInOpportunity() throws Throwable {
		return Selenide.getElement(By.xpath("(//legend[text()='Opportunity']/following-sibling::div//span[@class='slds-radio_faux'])[2]"),15);  	 
	}
	public WebElement chooseExistingRadioBtnInContact() throws Throwable {
		return Selenide.getElement(By.xpath("(//legend[text()='Contact']/following-sibling::div//span[@class='slds-radio_faux'])[2]"),15);  	 
	}
	public WebElement contactSearchInChooseExistingRadioBtnInContact() throws Throwable {
		return Selenide.getElement(By.xpath("//span[text()='Contact Search']/../following-sibling::div//input"),15);  	 
	}
	public WebElement accountSearchInChooseExistingRadioBtnInAccount() throws Throwable {
		return Selenide.getElement(By.xpath("//span[text()='Account Search']/../following-sibling::div//input"),15);  	 
	}
	public WebElement selectFirstRecordIncontactSearchInChooseExistingRadioBtnInContact() throws Throwable {
		return Selenide.getElement(By.xpath("(//span[text()='Contact Search']/../following-sibling::div//ul/li)[1]/a"),15);  	 
	}
	public WebElement selectFirstRecordInAccountSearchInChooseExistingRadioBtnInAccount() throws Throwable {
		return Selenide.getElement(By.xpath("(//span[text()='Account Search']/../following-sibling::div//ul/li)[1]/a"),15);  	 
	}
	public String selectedAccountNameAccountSearch() throws Throwable {
		return Selenide.getText(By.xpath("(//span[@class='pillText'])[1]"), "Account Name");  	 
	}
	public WebElement searchSymbolInContactSearch() throws Throwable {
		return Selenide.getElement(By.xpath("//span[contains(@title,'in Contact')]"),15);  	 
	}

	public WebElement selectFirstRecordInOpportunitySearchInChooseExistingRadioBtnInOpportunity() throws Throwable {
		return Selenide.getElement(By.xpath("(//legend[text()='Opportunity']/following-sibling::div//ul//span[@class='slds-radio'])[1]"),15);  	 
	}
	public WebElement acctNameHyperLinkAccountTableOnYourLeadHasBeenConvertedLayoutSceen() throws Throwable {
		return Selenide.getElement(By.xpath("(//div[text()='Account']/following-sibling::div//a)[1]"),10);  	 
	}
	public WebElement accontHistoryHyperLink() throws Throwable {
		return Selenide.getElement(By.xpath("((//span[text()='Account History'])[1]/.. |(//span[text()='Account History']/ancestor::a[@class='slds-card__header-link baseCard__header-title-container'])[2])[last()]"),10);  	 
	}
	public boolean LeadConvertRecordOnTheAccountHistoryScreen() throws Throwable {
		return Selenide.isElementDisplayed(By.xpath("(//span[contains(text(),'ead convert')])[last()]"),"Lead Convert Record");  	 
	}
	public boolean LeadConvertRecordOnTheAccountHistoryScreen1() throws Throwable {
		return Selenide.isElementDisplayed(By.xpath("(//span[contains(text(),'ead convert')])[1]"),"Lead Convert Record");  	 
	}
	public String SelectContactInContactSearch = "//a[@title='"+"Test"+"']/../preceding-sibling::td[1]/a";
	
}