package ui.automation.pages;

import cigniti.automation.utilities.Selenide;

public class LeadsToOpportunity_Page_Validator extends BasePageValidator<LeadsToOpportunity_Pages> {
	public LeadsToOpportunity_Page_Validator(LeadsToOpportunity_Pages Map1) {
		super(Map1);
	}
	
	public void enter_Data_firstName(String firstName) throws Throwable{
		this.getMap().firstNameField().sendKeys(firstName);
	}
	public void enter_Data_lastName(String lastName) throws Throwable{
		this.getMap().lastNameField().sendKeys(lastName);
	}
	public void enter_Data_phone(String phone) throws Throwable{
		this.getMap().phoneField().sendKeys(phone);
	}
	public void enter_Data_company(String company) throws Throwable{
		this.getMap().companyField().sendKeys(company);
	}
	public void select_LeasSource_Drop(String status) throws Throwable{
		this.getMap().selectleadSourceDrpDwnBtn(status);		
	}
	public void select_ISTRepresentative_Drop(String str) throws Throwable{
		this.getMap().selectISTrepresentativeDrpDwnBtn(str);		
	}
	public void select_Campaign_Drop(String str) throws Throwable{
		this.getMap().selectCampaignDrpDwnBtn(str);		
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
	public void select_Rating_Drop(String str) throws Throwable{
		this.getMap().selectRatingDrpDwnBtn(str);		
	}
	public void select_Region_Drop(String str) throws Throwable{
		this.getMap().selectRegionDrpDwnBtn(str);		
	}
	
	public void enter_Data_Revenue(String revenue) throws Throwable{
		this.getMap().revenueField().sendKeys(revenue);
	}
	
	public void enter_Data_Street(String Street) throws Throwable{
		this.getMap().streetField().sendKeys(Street);
	}
	public void enter_Data_City(String City) throws Throwable{
		this.getMap().cityField().sendKeys(City);
	}
	
	public void enter_Data_State(String State) throws Throwable{
		this.getMap().stateField().sendKeys(State);
	}
	public void enter_Data_Postal(String Postal) throws Throwable{
		this.getMap().postalField().sendKeys(Postal);
	}
	public void enter_Data_Country(String Country) throws Throwable{
		this.getMap().countryField().sendKeys(Country);		
	}
	
	public void click_firstLeadInLeadsHomeScreen_link() throws Throwable{
		this.getMap().firstLeadInLeadsHomeScreen().click();		
	}
/*	public String convertTab_Leftside_Edit_Btn() throws Throwable{
		return this.getMap().convertTab().getText();		
	}*/
	public void click_Convert_Tab() throws Throwable{
		 this.getMap().convertTab().click();		
	}
	
	//new
	public void click_Convert_Btn() throws Throwable{
		 this.getMap().convertBtn().click();		
	}
	
	public void select_LeadStatus_Dropdown(String str) throws Throwable{
		this.getMap().selectLeadStatusDrpDwnBtn(str);		
	}
	public void select_Salutation_Dropdown(String str) throws Throwable{
		this.getMap().selectSalutationDrpDwnBtn(str);		
	}
	
	public void enter_Data_fax(String fax) throws Throwable{
		this.getMap().faxField().sendKeys(fax);
	}
	public void enter_Data_Title(String title) throws Throwable{
		this.getMap().titleField().sendKeys(title);
	}
	public void enter_Data_Website(String webSite) throws Throwable{
		this.getMap().webSiteField().sendKeys(webSite);
	}
	public void enter_Data_email(String email) throws Throwable{
		this.getMap().emailField().sendKeys(email);
	}
	public void select_ownership_Dropdown(String ownership) throws Throwable{
		this.getMap().selectownershipDrpDwnBtn(ownership);		
	}
	public void select_revenueRange_Dropdown(String revenueRange) throws Throwable{
		this.getMap().selectrevenueRangeDrpDwnBtn(revenueRange);		
	}
	public void enter_Data_contactLocation(String contactLocation) throws Throwable{
		this.getMap().contactLocationField().sendKeys(contactLocation);
	}
	public void select_BDM_Dropdown(String bdm) throws Throwable{
		this.getMap().selectBDMDrpDwnBtn(bdm);		
	}
	public void select_BusinesUnit_Dropdown(String BusinesUnit) throws Throwable{
		this.getMap().selectBusinesUnitDrpDwnBtn(BusinesUnit);		
	}
	public void click_CreateNewRadioBtnInAccount_Btn() throws Throwable{
		this.getMap().CreateNewRadioBtnInAccount().click();		
	}
	public void click_chooseExistingRadioBtnInAccount_Btn() throws Throwable{
		 this.getMap().chooseExistingRadioBtnInContact().click();		
	}
	public void click_contactSearchInChooseExistingRadioBtnInContact() throws Throwable{
		this.getMap().contactSearchInChooseExistingRadioBtnInContact().click();
	}
	public void click_FirstRecordIncontactSearchInChooseExistingRadioBtnInContact() throws Throwable{
		this.getMap().selectFirstRecordIncontactSearchInChooseExistingRadioBtnInContact().click();
	}
	public void click_acctNameHyperLinkAccountTableOnYourLeadHasBeenConvertedLayoutSceen() throws Throwable{
		this.getMap().acctNameHyperLinkAccountTableOnYourLeadHasBeenConvertedLayoutSceen().click();
	}
	public void click_accontHistoryHyperLink() throws Throwable{
		this.getMap().accontHistoryHyperLink().click();
	}
	public boolean isDisplayed_LeadConvertRecordOnTheAccountHistoryScreen() throws Throwable{
		return this.getMap().LeadConvertRecordOnTheAccountHistoryScreen();
	}
}
