package ui.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import cigniti.automation.utilities.Selenide;

public class CaseToKnowledge_Page extends BasePageElementMap {
	public CaseToKnowledge_Page(WebDriver driver) {
		super(driver);
	}

	public WebElement newBtn() throws Throwable {
		return Selenide.getElement(By.xpath("//div[@class='forceObjectHomeDesktop']//div[contains(text(),'New')]"), 15);
	}

	public WebElement assignChk() throws Throwable {
		return Selenide.getElement(
				By.xpath("//label[@class='slds-checkbox__label uiLabel']//span[@class='slds-checkbox--faux']"), 15);
	}
	public boolean newTaskWindow() throws Throwable {
		return Selenide.isElementDisplayed(By.xpath("//h2[contains(text(),'New Task')]"),"New Task screen");  	 
	}
	public WebElement relatedTab() throws Throwable {
		return Selenide.getElement(By.xpath("//a[text()='Related']/.."), 15);
	}

	public WebElement newTask() throws Throwable {
		return Selenide.getElement(By.xpath("//a[@title='New Task']"), 15);
	}

	public WebElement contactNameField() throws Throwable {
		return Selenide.getElement(By.xpath("(//span[text()='Contact Name'])[1]/../following-sibling::div[1]//input"),
				15);
	}

	public WebElement accountNameField() throws Throwable {
		return Selenide.getElement(By.xpath("(//span[text()='Account Name'])[2]/../following-sibling::div//input"), 15);
	}

	public WebElement liza() throws Throwable {
		return Selenide.getElement(
				By.xpath("((//span[text()='Account Name'])[2]/../following-sibling::div//ul)[1]/li[last()]/a"), 10);
	}

	public WebElement mohant() throws Throwable {
		return Selenide.getElement(By.xpath("//div[contains(@title,'John mohant')]"), 10);
	}

	public @FindBy(xpath = "//span[text()='Status']/../following-sibling::div[1]//a") WebElement statusDrpDwnBtn;

	public boolean selectstatusDrpDwnBtn(String str) throws Throwable {
		return Selenide.SelectItemFromNonSelectListDropDown1(str, statusDrpDwnBtn);
	}

	public @FindBy(xpath = "//span[text()='Status']/../following-sibling::div[1]//a") WebElement status1DrpDwnBtn;

	public boolean selectstatus1DrpDwnBtn(String str) throws Throwable {
		return Selenide.SelectItemFromNonSelectListDropDown1(str, status1DrpDwnBtn);
	}

	public WebElement selectsubject1DrpDwnBtn() throws Throwable {

		return Selenide.getElement(By.xpath("//label[text()='Subject']/following-sibling::div[1]//input"), 10);
	}

	public @FindBy(xpath = "//span[text()='Case Origin']/../following-sibling::div[1]//a") WebElement originDrpDwnBtn;

	public boolean selectoriginDrpDwnBtn(String str) throws Throwable {
		return Selenide.SelectItemFromNonSelectListDropDown1(str, originDrpDwnBtn);
	}

	public @FindBy(xpath = "//span[text()='Priority']/../following-sibling::div[1]//a") WebElement priorityDrpDwnBtn;

	public boolean selectPriorityDrpDwnBtn(String str) throws Throwable {
		return Selenide.SelectItemFromNonSelectListDropDown1(str, priorityDrpDwnBtn);
	}

	public @FindBy(xpath = "//span[text()='Priority']/../following-sibling::div[1]//a") WebElement priority1DrpDwnBtn;

	public boolean selectPriority1DrpDwnBtn(String str) throws Throwable {
		return Selenide.SelectItemFromNonSelectListDropDown1(str, priority1DrpDwnBtn);
	}

	public @FindBy(xpath = "//span[text()='Type']/../following-sibling::div[1]//a") WebElement typeDrpDwnBtn;

	public boolean selecttypeDrpDwnBtn(String str) throws Throwable {
		return Selenide.SelectItemFromNonSelectListDropDown1(str, typeDrpDwnBtn);
	}

	public @FindBy(xpath = "//span[text()='Case Reason']/../following-sibling::div[1]//a") WebElement reasonDrpDwnBtn;

	public boolean selectreasonDrpDwnBtn(String str) throws Throwable {
		return Selenide.SelectItemFromNonSelectListDropDown1(str, reasonDrpDwnBtn);
	}

	public WebElement subjectField() throws Throwable {
		return Selenide.getElement(By.xpath("//span[text()='Subject']/../following-sibling::input[1]"), 15);
	}

	public WebElement descriptionField() throws Throwable {
		return Selenide.getElement(By.xpath("//span[text()='Description']/../following-sibling::textarea[1]"), 15);
	}

	public WebElement commentsField() throws Throwable {
		return Selenide.getElement(By.xpath("//span[text()='Comments']/../following-sibling::div[1]//textarea"), 15);
	}

	public WebElement comments1Field() throws Throwable {
		return Selenide.getElement(By.xpath("//span[text()='Internal Comments']/../following-sibling::textarea"), 15);
	}

	public WebElement webEmailField() throws Throwable {
		return Selenide.getElement(By.xpath("//span[text()='Web Email']/../following-sibling::input[1]"), 15);
	}

	public WebElement webNameField() throws Throwable {
		return Selenide.getElement(By.xpath("//span[text()='Web Name']/../following-sibling::input[1]"), 15);
	}

	public WebElement webCompanyField() throws Throwable {
		return Selenide.getElement(By.xpath("//span[text()='Web Company']/../following-sibling::input[1]"), 15);
	}

	public WebElement webPhoneField() throws Throwable {
		return Selenide.getElement(By.xpath("//span[text()='Web Phone']/../following-sibling::input[1]"), 15);
	}

	public WebElement nameField() throws Throwable {
		return Selenide.getElement(By.xpath("//span[text()='']/../following-sibling::input[1]"), 15);
	}

	public WebElement dueDate() throws Throwable {
		return Selenide.getElement(By.xpath("//span[contains(text(),'Due Date')]/../following-sibling::div[1]//input"),
				15);
	}

	public WebElement dueDate1() throws Throwable {
		return Selenide.getElement(By.xpath("//div[contains(@class,'uiInputDate')]/div/input"), 15);
	}

	public WebElement userProfileBtn() throws Throwable {
		return Selenide.getElement(
				By.xpath(
						"//div[contains(@class,'profileTrigger branding-user-profile bgimg slds-avatar slds-avatar_profile-image-small circular forceEntityIcon')]"),
				15);
	}

	public WebElement userProfileBtnInClassicView() throws Throwable {
		return Selenide.getElement(By.xpath("//div[@id='userNav-arrow']"), 15);
	}

	public WebElement salesForceClassicBtn() throws Throwable {
		return Selenide.getElement(By.xpath("//a[@class='profile-link-label switch-to-aloha uiOutputURL']"), 15);
	}

	public WebElement salesForceLighteningBtn() throws Throwable {
		return Selenide.getElement(By.xpath("//a[@title='Switch to Lightning Experience']"), 15);
	}

	public WebElement allTabsArrowBtn() throws Throwable {
		return Selenide.getElement(By.xpath("//img[@class='allTabsArrow']"), 10);
	}

	public WebElement casesObject() throws Throwable {
		return Selenide.getElement(By.xpath("//a[contains(@class,'listRelatedObject caseBlock title')]"), 10);
	}

	public WebElement caseNumber() throws Throwable {
		return Selenide.getElement(By.xpath("(//tr[contains(@class,'dataRow even first')]//a)[1]"), 10);
	}

	public WebElement solutionGridValue() throws Throwable {
		return Selenide.getElement(By.xpath("//input[@id='srch_Input']"), 10);
	}

	public boolean solutionGrid() throws Throwable {
		Selenide.scrollIntoView(By.xpath("//h3[text()='Solutions']"));
		return Selenide.isElementDisplayed(By.xpath("//h3[text()='Solutions']"), "Solution Grid");
	}

	public WebElement findSolutionBtn() throws Throwable {
		return Selenide.getElement(By.xpath("//input[@name='srchbtn']"), 10);
	}

	public WebElement hyperLinkInSolutionGrid() throws Throwable {
		return Selenide.getElement(
				By.xpath(
						"//tr[contains(@class,'dataRow even first')]//a[contains(@class,'actionLink')][contains(text(),'Select')]"),
				10);
	}

	public WebElement closeCase() throws Throwable {
		return Selenide.getElement(By.xpath("(//input[contains(@value,'Close Case')])[2]"), 10);
	}

	public boolean selectCaseStatusDrpDwn(String caseStatus) throws Throwable {
		return Selenide.selectDropdownByVisibleText(By.xpath("//select[@id='cas7']"), caseStatus, "Case Status");
	}

	public boolean selectCaseReasonDrpDwn(String caseReason) throws Throwable {
		return Selenide.selectDropdownByVisibleText(By.xpath("//select[@id='cas6']"), caseReason, "Case Reason");
	}

	public WebElement saveCase() throws Throwable {
		return Selenide.getElement(By.xpath("//td[@id='topButtonRow']//input[@name='save']"), 10);
	}
	public boolean newTaskCreatedMsg() throws Throwable {
		return Selenide.isElementDisplayed(By.xpath("//div[@class='forceVisualMessageQueue']"),"New task Creation Sucess Msg");  	 
	}
	
	public boolean CasesPage() throws Throwable {
		return Selenide.isElementDisplayed(By.xpath("//h1[text()='Cases']"),"Cases Page");  	 
	}
}
