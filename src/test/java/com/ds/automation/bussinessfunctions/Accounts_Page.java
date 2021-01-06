package com.ds.automation.bussinessfunctions;

import org.json.simple.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.cigniti.automation.utilities.CommonUtil;
import com.cigniti.automation.utilities.Selenide;

public class Accounts_Page extends BasePageElementMap{
	public Accounts_Page(WebDriver driver) {
		super(driver);
	}
	public WebElement accountNameField() throws Throwable {
		 return Selenide.getElement(By.xpath("//span[text()='Account Name']/../following-sibling::input[1]"),10);  	 
	    }
	public WebElement parentaccountNameField() throws Throwable {
		 return Selenide.getElement(By.xpath("//span[text()='Parent Account']/../following-sibling::div//input"),2);  	 
	    }
	public WebElement jAndjGlobalInParentacct() throws Throwable {
		 return Selenide.getElement(By.xpath("//div[@title='J&J Global']"),15);  	 
	    }
	
	public WebElement phoneNumField() throws Throwable {
		 return Selenide.getElement(By.xpath("//span[text()='Phone']/../following-sibling::input[1]"),2);  	 
	    }
	public WebElement revenueField() throws Throwable {
		 return Selenide.getElement(By.xpath("//span[text()='Revenue']/../following-sibling::input[1]"),2);  	 
	    }
	
	public WebElement billingStreetField() throws Throwable {
		 return Selenide.getElement(By.xpath("//span[text()='Billing Street']/../following-sibling::textarea"),2);  	 
	    }
	
	public WebElement billingCityField() throws Throwable {
		 return Selenide.getElement(By.xpath("//span[text()='Billing City']/../following-sibling::input[1]"),2);  	 
	    }
		
	public WebElement billingStateField() throws Throwable {
		 return Selenide.getElement(By.xpath("//span[text()='Billing State/Province']/../following-sibling::input[1]"),2);  	 
	    }
	public WebElement billingPostalField() throws Throwable {
		 return Selenide.getElement(By.xpath("//span[text()='Billing Zip/Postal Code']/../following-sibling::input[1]"),2);  	 
	    }
	public WebElement billingCountryField() throws Throwable {
		 return Selenide.getElement(By.xpath("//span[text()='Billing Country']/../following-sibling::input[1]"),2);  	 
	    }
	public boolean accountCreatedMsg() throws Throwable {
		 return Selenide.waitForInVisibilityOfElement(By.xpath("//span[contains(text(),'was created')]"));  	 
	    }
	
	public @FindBy(xpath="//span[text()='Status']/../following-sibling::div[1]//a") WebElement statusDrpDwnBtn;	
	public boolean selectstatusDrpDwnBtn(String str) throws Throwable {
			return Selenide.SelectItemFromNonSelectListDropDown1(str, statusDrpDwnBtn);  	 
		    }
	
	public @FindBy(xpath="//span[text()='Vertical Grouping']/../following-sibling::div[1]//a") WebElement verticalGroupingDrpdwnBtn;
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
	
	public @FindBy(xpath="//span[text()='IST Representative']/../following-sibling::div[1]//a") WebElement istRepresentativeDrpdwnBtn;
	public boolean selectISTrepresentativeDrpDwnBtn(String str) throws Throwable {
		return Selenide.SelectItemFromNonSelectListDropDown1(str, istRepresentativeDrpdwnBtn);  	 
	    }
}
