package ui.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import cigniti.automation.utilities.Selenide;

public class SalesForce_Page  extends BasePageElementMap{
	public SalesForce_Page(WebDriver driver) {
		super(driver);
	}

	public @FindBy(xpath="//input[@id='username']") WebElement username;
	public @FindBy(xpath="//input[@id='password']") WebElement Password;
	public @FindBy(id="Login") WebElement  signin_btn;
	public @FindBy(xpath="//a[text()='Remind Me Later']") WebElement  remindLater;
	public @FindBy(xpath="//a[@title='Accounts']") WebElement  accountsTab;


	public WebElement reminderLater() throws Throwable {
		return Selenide.getElement(By.xpath("//a[text()='Remind Me Later']"),15);    	
	}

	public boolean LoadingImage_Icon() throws Throwable {
		return Selenide.waitForInVisibilityOfElement(By.xpath("//div[@class='center oneCenterStage lafSinglePaneWindowManager']"));  		 
	}

	public boolean Loading_Icon() throws Throwable {
		return Selenide.waitForInVisibilityOfElement(By.xpath("//div[@class='slds-spinner slds-spinner--medium slds-spinner--brand' and @role='status']/span"));  		 
	}
	public WebElement accountsTab() throws Throwable {
		return Selenide.getElement(By.xpath("//a[@title='Accounts']/.."),15);  	 
	}
	public WebElement contactTab() throws Throwable {
		return Selenide.getElement(By.xpath("//a[@title='Contacts']/.."),15);  	 
	}
	public WebElement opportunitiesTab() throws Throwable {
		return Selenide.getElement(By.xpath("//a[@title='Opportunities']/.."),15);  	 
	}
	public WebElement leadsTab() throws Throwable {
		return Selenide.getElement(By.xpath("//a[@title='Leads']/.."),15);  	 
	}
	public WebElement newButton() throws Throwable {
		return Selenide.getElement(By.xpath("//a[@title='New']/div"),15);  	 
	}
	public WebElement saveButton() throws Throwable {
		return Selenide.getElement(By.xpath("//button[@title='Save']"),15);  	 
	}
	public WebElement editButton() throws Throwable {
		return Selenide.getElement(By.xpath("//button[text()='Edit']"),15); 		
	}
	public WebElement navigationBtn() throws Throwable {
		return Selenide.getElement(By.xpath("(//div[@role='navigation']//div[1])[1]"),10); 		
	}
	public WebElement viewAllLink() throws Throwable {
		return Selenide.getElement(By.xpath("//button[text()='View All']"),10); 		
	}
	public WebElement searchBoxInAppLauncher() throws Throwable {
		return Selenide.getElement(By.xpath("//h2[text()='App Launcher']/following-sibling::div//input"),10); 		
	}
	public WebElement quotesObject() throws Throwable {

		return Selenide.getElement(By.xpath("//mark[text()='Quotes']"),10); 		
	}
	public WebElement casesObject() throws Throwable {
		 return Selenide.getElement(By.xpath("//mark[text()='Cases']"),10); 		
	    }
	public WebElement cancleButton() throws Throwable {
		 return Selenide.getElement(By.xpath("(//span[text()='Cancel']/..)[last()]"),10); 		
	    }
	
}

