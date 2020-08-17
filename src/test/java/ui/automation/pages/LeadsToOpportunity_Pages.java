package ui.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import cigniti.automation.utilities.Selenide;

public class LeadsToOpportunity_Pages extends BasePageElementMap{
	public LeadsToOpportunity_Pages(WebDriver driver) {
		super(driver);
	} 
	public WebElement firstNameField() throws Throwable {
		 return Selenide.getElement(By.xpath("//span[text()='First Name']/../following-sibling::input[1]"),15);  	 
	    }
	public WebElement lastNameField() throws Throwable {
		 return Selenide.getElement(By.xpath("//span[text()='Last Name']/../following-sibling::input[1]"),15);  	 
	    }
	public WebElement phoneField() throws Throwable {
		 return Selenide.getElement(By.xpath("//span[text()='Phone']/../following-sibling::input[1]"),15);  	 
	    }
	public WebElement companyField() throws Throwable {
		 return Selenide.getElement(By.xpath("//span[text()='Company']/../following-sibling::input[1]"),15);  	 
	    }
	
	public @FindBy(xpath="//span[text()='Lead Source']/../following-sibling::div[1]//a") WebElement leadSourceDrpDwnBtn;	
	public boolean selectleadSourceDrpDwnBtn(String str) throws Throwable {
			return Selenide.SelectItemFromNonSelectListDropDown1(str, leadSourceDrpDwnBtn);  	 
		    }
	public @FindBy(xpath="//span[text()='IST Representative']/../following-sibling::div[1]//a") WebElement istRepresentativeDrpdwnBtn;
	public boolean selectISTrepresentativeDrpDwnBtn(String str) throws Throwable {
		return Selenide.SelectItemFromNonSelectListDropDown1(str, istRepresentativeDrpdwnBtn);  	 
	    }
	public @FindBy(xpath="//span[text()='Campaign']/../following-sibling::div[1]//a") WebElement campaignDrpdwnBtn;
	public boolean selectCampaignDrpDwnBtn(String str) throws Throwable {
		return Selenide.SelectItemFromNonSelectListDropDown1(str, campaignDrpdwnBtn);  	 
	    }
	public @FindBy(xpath="//span[text()='VerticalGrouping']/../following-sibling::div[1]//a") WebElement verticalGroupingDrpdwnBtn;
	public boolean selectVerticalGroupingDrpDwnBtn(String str) throws Throwable {
		return Selenide.SelectItemFromNonSelectListDropDown1(str, verticalGroupingDrpdwnBtn);  	 
	    }
	
	public @FindBy(xpath="//span[text()='Sub Vertical 1']/../following-sibling::div[1]//a") WebElement subverticaloneDrpdwnBtn;
	public boolean selectSubVerticalOneDrpDwnBtn(String str) throws Throwable {
		return Selenide.SelectItemFromNonSelectListDropDown2(str, subverticaloneDrpdwnBtn);  	 
	    }
	public @FindBy(xpath="//span[text()='Vertical']/../following-sibling::div[1]//a") WebElement verticalDrpdwnBtn;
	public boolean selectVerticalDrpDwnBtn(String str) throws Throwable {
		return Selenide.SelectItemFromNonSelectListDropDown1(str, verticalDrpdwnBtn);  	 
	    }	
	public @FindBy(xpath="//span[text()='Rating']/../following-sibling::div[1]//a") WebElement ratingDrpdwnBtn;
	public boolean selectRatingDrpDwnBtn(String str) throws Throwable {
		return Selenide.SelectItemFromNonSelectListDropDown1(str, ratingDrpdwnBtn);  	 
	    }
	
	public @FindBy(xpath="//span[text()='Region']/../following-sibling::div[1]//a") WebElement regionDrpdwnBtn;
	public boolean selectRegionDrpDwnBtn(String str) throws Throwable {
		return Selenide.SelectItemFromNonSelectListDropDown1(str, regionDrpdwnBtn);  	 
	    }
	public WebElement revenueField() throws Throwable {
		 return Selenide.getElement(By.xpath("//span[text()='Revenue']/../following-sibling::input[1]"),15);  	 
	    }
	public WebElement streetField() throws Throwable {
		 return Selenide.getElement(By.xpath("//span[text()='Street']/../following-sibling::textarea"),15);  	 
	    }
	public WebElement cityField() throws Throwable {
		 return Selenide.getElement(By.xpath("//span[text()='City']/../following-sibling::input[1]"),15);  	 
	    }
		
	public WebElement stateField() throws Throwable {
		 return Selenide.getElement(By.xpath("//span[text()='State/Province']/../following-sibling::input[1]"),15);  	 
	    }
	public WebElement postalField() throws Throwable {
		 return Selenide.getElement(By.xpath("//span[text()='Zip/Postal Code']/../following-sibling::input[1]"),15);  	 
	    }
	public WebElement countryField() throws Throwable {
		 return Selenide.getElement(By.xpath("//span[text()='Country']/../following-sibling::input[1]"),15);  	 
	    }
	public WebElement firstLeadInLeadsHomeScreen() throws Throwable {
		 return Selenide.getElement(By.xpath("//table[@data-aura-class='uiVirtualDataTable']/tbody/tr[1]/th//a"),10); 		
	    }
	public WebElement convertTab() throws Throwable {
		 return Selenide.getElement(By.xpath("//div[text()='Edit']/ancestor::li/preceding-sibling::li[1]//div"),10); 		
	    }
	//new
	public WebElement convertBtn() throws Throwable {
		 return Selenide.getElement(By.xpath("//span[text()='Convert']"),10); 		
	    }
	
	public @FindBy(xpath="//span[text()='Lead Status']/../following-sibling::div[1]//a") WebElement leadStatus;
	public boolean selectLeadStatusDrpDwnBtn(String str) throws Throwable {
		return Selenide.SelectItemFromNonSelectListDropDown1(str, leadStatus);  	 
	    }
	public @FindBy(xpath="//span[text()='Salutation']/../following-sibling::div[1]//a") WebElement salutation;
	public boolean selectSalutationDrpDwnBtn(String str) throws Throwable {
		return Selenide.SelectItemFromNonSelectListDropDown1(str, salutation);  	 
	    }
	
	public WebElement faxField() throws Throwable {
		 return Selenide.getElement(By.xpath("//span[text()='Fax']/../following-sibling::input[1]"),15);  	 
	    }
	public WebElement titleField() throws Throwable {
		 return Selenide.getElement(By.xpath("//span[text()='Title']/../following-sibling::input[1]"),15);  	 
	    }
	public WebElement webSiteField() throws Throwable {
		 return Selenide.getElement(By.xpath("//span[text()='Website']/../following-sibling::input[1]"),15);  	 
	    }
	public WebElement emailField() throws Throwable {
		 return Selenide.getElement(By.xpath("//span[text()='Email']/../following-sibling::input[1]"),15);  	 
	    }
	public @FindBy(xpath="//span[text()='Ownership']/../following-sibling::div[1]//a") WebElement ownership;
	public boolean selectownershipDrpDwnBtn(String str) throws Throwable {
		return Selenide.SelectItemFromNonSelectListDropDown1(str, ownership);  	 
	    }
	public @FindBy(xpath="//span[text()='Revenue Range']/../following-sibling::div[1]//a") WebElement revenueRange;
	public boolean selectrevenueRangeDrpDwnBtn(String str) throws Throwable {
		return Selenide.SelectItemFromNonSelectListDropDown1(str, revenueRange);  	 
	    }
	public WebElement contactLocationField() throws Throwable {
		 return Selenide.getElement(By.xpath("//span[text()='Contact Location']/../following-sibling::textarea"),15);  	 
	    }
	public @FindBy(xpath="//span[text()='BDM']/../following-sibling::div[1]//a") WebElement bdm;
	public boolean selectBDMDrpDwnBtn(String str) throws Throwable {
		return Selenide.SelectItemFromNonSelectListDropDown1(str, bdm);  	 
	    }
	public @FindBy(xpath="//span[text()='Business Unit']/../following-sibling::div[1]//a") WebElement businessUnit;
	public boolean selectBusinesUnitDrpDwnBtn(String bu) throws Throwable {
		return Selenide.SelectItemFromNonSelectListDropDown1(bu, businessUnit);  	 
	    }
	public WebElement CreateNewRadioBtnInAccount() throws Throwable {
		 return Selenide.getElement(By.xpath("(//legend[text()='Account']/following-sibling::div//span[@class='slds-radio_faux'])[1]"),15);  	 
	    }
	public WebElement chooseExistingRadioBtnInContact() throws Throwable {
		 return Selenide.getElement(By.xpath("(//legend[text()='Contact']/following-sibling::div//span[@class='slds-radio_faux'])[2]"),15);  	 
	    }
	public WebElement contactSearchInChooseExistingRadioBtnInContact() throws Throwable {
		 return Selenide.getElement(By.xpath("//span[text()='Contact Search']/../following-sibling::div//input"),15);  	 
	    }
	public WebElement selectFirstRecordIncontactSearchInChooseExistingRadioBtnInContact() throws Throwable {
		 return Selenide.getElement(By.xpath("(//span[text()='Contact Search']/../following-sibling::div//ul/li)[1]/a"),15);  	 
	    }
	public WebElement acctNameHyperLinkAccountTableOnYourLeadHasBeenConvertedLayoutSceen() throws Throwable {
		 return Selenide.getElement(By.xpath("(//div[text()='Account']/following-sibling::div//a)[1]"),10);  	 
	    }
	public WebElement accontHistoryHyperLink() throws Throwable {
		 return Selenide.getElement(By.xpath("(//span[text()='Account History'])[1]"),10);  	 
	    }
	public boolean LeadConvertRecordOnTheAccountHistoryScreen() throws Throwable {
		 return Selenide.isElementDisplayed(By.xpath("(//span[text()='Created by lead convert'])[2]"),"Lead Convert Record");  	 
	    }
	
}
