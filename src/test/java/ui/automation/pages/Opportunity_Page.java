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

	public WebElement newButton() throws Throwable {
		 return Selenide.getElement(By.xpath("//a[@title='New']/div"),15);  	 
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
	public WebElement saveButton() throws Throwable {
		 return Selenide.getElement(By.xpath("//button[@title='Save']"),15);  	 
	    }
	
	public @FindBy(xpath="//span[text()='Stage']/../following-sibling::div[1]//a") WebElement stageDrpDwnBtn;	
	public boolean selectstageDrpDwnBtn(String str) throws Throwable {
			return Selenide.SelectItemFromNonSelectListDropDown1(str, stageDrpDwnBtn);  	 
		    }
	public @FindBy(xpath="//span[text()='Type']/../following-sibling::div[1]//a") WebElement typeDrpDwnBtn;	
	public boolean selectTypeDrpDwnBtn(String str) throws Throwable {
			return Selenide.SelectItemFromNonSelectListDropDown1(str, typeDrpDwnBtn);  	 
		    }
}
