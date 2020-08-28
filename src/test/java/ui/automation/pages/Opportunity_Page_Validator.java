package ui.automation.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

import cigniti.automation.utilities.Driver;

public class Opportunity_Page_Validator extends BasePageValidator<Opportunity_Page> {
	public Opportunity_Page_Validator(Opportunity_Page Map1) {
		super(Map1);
		// TODO Auto-generated constructor stub
	}
	
	/*public void enter_Data_opportunityName(String firstName) throws Throwable{
		this.getMap().opportunityNameField().sendKeys(firstName);
	}
	public void enter_Data_acctName(String AcctName) throws Throwable{
		this.getMap().accountNameField().sendKeys(AcctName);
		this.getMap().johnsonInvmntLtd().click();
	}
	public void enter_Data_closeDate(String closeDate) throws Throwable{
		this.getMap().closeDateField().sendKeys(Keys.CONTROL,"a");
		this.getMap().closeDateField().sendKeys(Keys.BACK_SPACE);
		this.getMap().closeDateField().clear();
		this.getMap().closeDateField().sendKeys(closeDate);;
	}
	public void enter_Data_probability(String probability) throws Throwable{
		this.getMap().probabilityField().clear();
		this.getMap().probabilityField().sendKeys(probability);;
	}
	public void enter_Data_amount(String amount) throws Throwable{
		this.getMap().amountField().click();
		this.getMap().amountField().sendKeys(Keys.CONTROL,"a");
		this.getMap().amountField().sendKeys(Keys.BACK_SPACE);
		//this.getMap().amountField().click();
		this.getMap().amountField().clear();		
		this.getMap().amountField().clear();
		this.getMap().amountField().sendKeys(amount);;
	}
	public void enter_Data_riskCompetitionComments(String riskCompetitionComments) throws Throwable{
		this.getMap().riskCompetitionCommentsField().sendKeys(riskCompetitionComments);;
	}
	public void select_stage_Drop(String stage) throws Throwable{
		this.getMap().selectstageDrpDwnBtn(stage);		
	}
	public void select_type_Drop(String type) throws Throwable{
		this.getMap().selectTypeDrpDwnBtn(type);		
	}*/
	
	public void click_firstOpportunityInOpportunityHomeScreen_link() throws Throwable{
		this.getMap().firstOpportunityInOpportunityHomeScreen().click();		
	}
	/*public void click_productsDrpdownInRightPane_link() throws Throwable{
		
		
		this.getMap().productsDrpdownInRightPane().click();		
	}*/
	/*public void click_addProductInDrpdwn() throws Throwable{
		this.getMap().addProductInDrpdwn().click();		
	}*/
	/*public void click_CheckBoxForProductNameInAddProduct(String chkbox) throws Throwable{
		this.getMap().checkBoxToSelectInAddProduct(chkbox).click();		
	}
	public void click_Next_Btn() throws Throwable{
		this.getMap().nextBtnInAddProduct().click();		
	}*/
	/*public void enter_Data_quantity(String quantity) throws Throwable{
		this.getMap().quantityInEditSelectedProductsthrows().click();
		this.getMap().quantityAfterClickInEditSelectedProducts().sendKeys(quantity);
	}
	public void enter_Data_date(String date) throws Throwable{
		this.getMap().dateInEditSelectedProducts().click();
		this.getMap().dateInAfterClickEditSelectedProducts().sendKeys(date);
	}*/
	public void Validate_ProductRecord_Update() throws Throwable{
		this.getMap().opportunityProductRecordUpdatedMsg().isDisplayed();
		
	}
	public boolean Validate_OpportunityCreate_Msg() throws Throwable{
		return this.getMap().OpportunityCreatedMsg();		
	}
	public void CloseDate_present_InDetailsPage() throws Throwable{
		this.getMap().closeDateInDetailsPage().isDisplayed();		
	}
	public String CloseDate_Value_InDetailsPage() throws Throwable{
		return this.getMap().closeDateInDetailsPage().getText();		
	}
	public void click_NextBtn_Opportinities() throws Throwable{
		this.getMap().nextButtonOpportunities().click();		
	}
	
}
