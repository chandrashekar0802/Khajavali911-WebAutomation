package ui.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import cigniti.automation.utilities.Selenide;

public class Leads_Page extends BasePageElementMap{
	public Leads_Page(WebDriver driver) {
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
		return Selenide.SelectItemFromNonSelectListDropDown1(str, subverticaloneDrpdwnBtn);  	 
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
	
}
