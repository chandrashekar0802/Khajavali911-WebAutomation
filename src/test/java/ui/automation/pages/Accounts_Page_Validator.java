

package ui.automation.pages;


public class Accounts_Page_Validator  extends BasePageValidator<Accounts_Page> {
	public Accounts_Page_Validator(Accounts_Page Map1) {
		super(Map1);
		// TODO Auto-generated constructor stub
	}
	
	public void enter_Data_AcctName(String acctName) throws Throwable{
		this.getMap().accountNameField().sendKeys(acctName);
	}
	
	public void enter_Data_parentAcctName(String parentAcctName) throws Throwable{
		this.getMap().parentaccountNameField().sendKeys(parentAcctName);
		//this.getMap().jAndjGlobalInParentacct().click();
	}
	
	public void enter_Data_Phone(String phone) throws Throwable{
		this.getMap().phoneNumField().sendKeys(phone);
	}
	
	public void enter_Data_Revenue(String revenue) throws Throwable{
		this.getMap().revenueField().sendKeys(revenue);
	}
	
	public void enter_Data_BillingStreet(String BillingStreet) throws Throwable{
		this.getMap().billingStreetField().sendKeys(BillingStreet);
	}
	public void enter_Data_BillingCity(String BillingCity) throws Throwable{
		this.getMap().billingCityField().sendKeys(BillingCity);
	}
	
	public void enter_Data_BillingState(String BillingState) throws Throwable{
		this.getMap().billingStateField().sendKeys(BillingState);
	}
	public void enter_Data_BillingPostal(String BillingPostal) throws Throwable{
		this.getMap().billingPostalField().sendKeys(BillingPostal);
	}
	public void enter_Data_BillingCountry(String BillingCountry) throws Throwable{
		this.getMap().billingCountryField().sendKeys(BillingCountry);		
	}
	public void select_status_Drop(String status) throws Throwable{
		this.getMap().selectstatusDrpDwnBtn(status);		
	}
	public void select_vertical_groupingDrop(String str) throws Throwable{
		this.getMap().selectVerticalGroupingDrpDwnBtn(str);		
	}
	public void select_sub_vertical_oneDrop(String str) throws Throwable{
		this.getMap().selectSubVerticalOneDrpDwnBtn(str);		
	}
	public void select_vertical_Drop(String str) throws Throwable{
		this.getMap().selectVerticalDrpDwnBtn(str);		
	}
	public void select_ISTRepresentative_Drop(String str) throws Throwable{
		this.getMap().selectISTrepresentativeDrpDwnBtn(str);		
	}
	public void validate_accountCreated_Message() throws Throwable{
		this.getMap().accountCreatedMsg();
	}
	
}
