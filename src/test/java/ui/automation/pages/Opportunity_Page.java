package ui.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import cigniti.automation.utilities.Selenide;

public class Opportunity_Page extends BasePageElementMap{
	public Opportunity_Page(WebDriver driver) {
		super(driver);
	}

	public WebElement opportunityNameField() throws Throwable {
		 return Selenide.getElement(By.xpath("//span[text()='Opportunity Name']/../following-sibling::input[1]"),15);  	 
	    }
	public WebElement accountNameField() throws Throwable {
		 return Selenide.getElement(By.xpath("//span[text()='Account Name']/../following-sibling::div[1]//input"),15);  	 
	    }
	public WebElement johnsonInvmntLtd() throws Throwable {
		 return Selenide.getElement(By.xpath("(//div[@title='Johnson Investments Ltd'])[1]"),15);  	 
	    }
	public WebElement closeDateField() throws Throwable {
		 return Selenide.getElement(By.xpath("//span[text()='Close Date']/../following-sibling::div[1]/input"),15);  	 
	    }
	public WebElement probabilityField() throws Throwable {
		 return Selenide.getElement(By.xpath("//span[text()='Probability (%)']/../following-sibling::input[1]"),15);  	 
	    }
	public WebElement amountField() throws Throwable {
		 return Selenide.getElement(By.xpath("//span[text()='Amount']/../following-sibling::input[1]"),15);  	 
	    }
	public WebElement riskCompetitionCommentsField() throws Throwable {
		 return Selenide.getElement(By.xpath("//span[text()='Risks, Competition and Comments']/../following-sibling::input[1]"),15);  	 
	    }
	
	public @FindBy(xpath="//span[text()='Stage']/../following-sibling::div[1]//a") WebElement stageDrpDwnBtn;	
	public boolean selectstageDrpDwnBtn(String str) throws Throwable {
			return Selenide.SelectItemFromNonSelectListDropDown1(str, stageDrpDwnBtn);  	 
		    }
	public @FindBy(xpath="//span[text()='Type']/../following-sibling::div[1]//a") WebElement typeDrpDwnBtn;	
	public boolean selectTypeDrpDwnBtn(String str) throws Throwable {
			return Selenide.SelectItemFromNonSelectListDropDown1(str, typeDrpDwnBtn);  	 
		    }
	
	public WebElement firstOpportunityInOpportunityHomeScreen() throws Throwable {
		 return Selenide.getElement(By.xpath("//table[@data-aura-class='uiVirtualDataTable']/tbody/tr[1]/th//a"),10); 		
	    }
	public WebElement productsDrpdownInRightPane() throws Throwable {
		 return Selenide.getElement(By.xpath("//span[text()='Products']/ancestor::header/following-sibling::div//a/lightning-icon/lightning-primitive-icon"),10); 
		 //(//span[text()='Products']/preceding::header[1])[2]/following-sibling::div//a/lightning-icon/lightning-primitive-icon
	    }
	public WebElement addProductInDrpdwn() throws Throwable {
		 return Selenide.getElement(By.xpath("//a[@title='Add Products']"),10); 		
	    }
	public WebElement checkBoxToSelectInAddProduct(String chkbox) throws Throwable {
		 return Selenide.getElement(By.xpath("//a[@title='"+chkbox+"']/../../preceding-sibling::td[1]//input/following-sibling::span[1]"),10); 		
	    }
	public WebElement nextBtnInAddProduct() throws Throwable {
		 return Selenide.getElement(By.xpath("(//span[text()='Next'])[2]"),10); 		
	    }
	public WebElement quantityInEditSelectedProductsthrows() throws Throwable {
		 return Selenide.getElement(By.xpath("//span[contains(text(),'Edit Quantity')]/.."),15); 		
	    }
	
	public WebElement quantityAfterClickInEditSelectedProducts() throws Throwable {
		 return Selenide.getElement(By.xpath("//input[@data-aura-class='uiInputSmartNumber']"),15); 		
	    }
	
	public WebElement dateInEditSelectedProducts() throws Throwable {
		 return Selenide.getElement(By.xpath("//span[contains(text(),'Edit Date')]/.."),15); 		
	    }
	public WebElement dateInAfterClickEditSelectedProducts() throws Throwable {
		 return Selenide.getElement(By.xpath("//div[contains(@class,'uiInputDate')]/div/input"),15); 		
	    }
	public WebElement opportunityProductRecordUpdatedMsg() throws Throwable {
		 return Selenide.getElement(By.xpath("//span[contains(text(),'record was updated')]"),15); 		
	    }
	public boolean OpportunityCreatedMsg() throws Throwable {
		 return Selenide.waitForVisibilityOfElement(By.xpath("//div[@id='auraLoadingBox']"), "Created success Message")	; 
		//span[contains(text(),'was created.')]  
	}
	public WebElement closeDateInDetailsPage() throws Throwable {
		 return Selenide.getElement(By.xpath("//p[text()='Close Date']/..//lightning-formatted-text"),15); 		
	    }
	public boolean Loading_Icon() throws Throwable {
		 return Selenide.waitForInVisibilityOfElement(By.xpath("//div[@class='slds-spinner slds-spinner--medium slds-spinner--brand' and @role='status']/span"));  		 
	    }
	public WebElement nextButtonOpportunities() throws Throwable {
		 return Selenide.getElement(By.xpath("//div[text()='Edit']"),15); 		
	    }
	
}
