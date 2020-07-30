package ui.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import cigniti.automation.utilities.Selenide;

public class Contacts_Page extends BasePageElementMap{
	public Contacts_Page(WebDriver driver) {
		super(driver);
	}

	public WebElement newButton() throws Throwable {
		 return Selenide.getElement(By.xpath("//a[@title='New']/div"),15);  	 
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
	public WebElement mobileField() throws Throwable {
		 return Selenide.getElement(By.xpath("//span[text()='Mobile']/../following-sibling::input[1]"),15);  	 
	    }
	public WebElement accountNameField() throws Throwable {
		 return Selenide.getElement(By.xpath("//span[text()='Account Name']/../following-sibling::div[1]//input"),15);  	 
	    }
	public WebElement johnsonInvmntLtd() throws Throwable {
		 return Selenide.getElement(By.xpath("(//div[@title='Johnson Investments Ltd'])[1]"),15);  	 
	    }
	public WebElement emailField() throws Throwable {
		 return Selenide.getElement(By.xpath("//span[text()='Email']/../following-sibling::input[1]"),15);  	 
	    }
	public WebElement mailingStreetField() throws Throwable {
		 return Selenide.getElement(By.xpath("//span[text()='Mailing Street']/../following-sibling::textarea"),15);  	 
	    }
	public WebElement mailingCityField() throws Throwable {
		 return Selenide.getElement(By.xpath("//span[text()='Mailing City']/../following-sibling::input[1]"),15);  	 
	    }
	public WebElement mailingStateField() throws Throwable {
		 return Selenide.getElement(By.xpath("//span[text()='Mailing State/Province']/../following-sibling::input[1]"),15);  	 
	    }
	public WebElement mailingPostalCodeField() throws Throwable {
		 return Selenide.getElement(By.xpath("//span[text()='Mailing Zip/Postal Code']/../following-sibling::input[1]"),15);  	 
	    }
	public WebElement mailingCountryField() throws Throwable {
		 return Selenide.getElement(By.xpath("//span[text()='Mailing Country']/../following-sibling::input[1]"),15);  	 
	    }
	public WebElement saveButton() throws Throwable {
		 return Selenide.getElement(By.xpath("//button[@title='Save']"),15);  	 
	    }
	
	
	public @FindBy(xpath="//span[text()='Designation Level']/../following-sibling::div[1]//a") WebElement designationLevelDrpDwnBtn;	
	public boolean selectDesignationLevelDrpDwnBtn(String str) throws Throwable {
			return Selenide.SelectItemFromNonSelectListDropDown1(str, designationLevelDrpDwnBtn);  	 
		    }
}
