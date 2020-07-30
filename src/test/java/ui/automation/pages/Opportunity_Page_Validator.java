package ui.automation.pages;

public class Opportunity_Page_Validator extends BasePageValidator<Opportunity_Page> {
	public Opportunity_Page_Validator(Opportunity_Page Map1) {
		super(Map1);
		// TODO Auto-generated constructor stub
	}
	public void click_New_Button() throws Throwable{
		this.getMap().newButton().click();
	}
	public void enter_Data_opportunityName(String firstName) throws Throwable{
		this.getMap().opportunityNameField().sendKeys(firstName);
	}
	public void enter_Data_acctName(String AcctName) throws Throwable{
		this.getMap().accountNameField().sendKeys(AcctName);
		this.getMap().johnsonInvmntLtd().click();
	}
	public void enter_Data_closeDate(String closeDate) throws Throwable{
		this.getMap().closeDateField().sendKeys(closeDate);;
	}
	public void enter_Data_probability(String probability) throws Throwable{
		this.getMap().probabilityField().clear();
		this.getMap().probabilityField().sendKeys(probability);;
	}
	public void enter_Data_amount(String amount) throws Throwable{
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
	}
	public void click_Save_Button() throws Throwable{
		this.getMap().saveButton().click();		
	}
}
