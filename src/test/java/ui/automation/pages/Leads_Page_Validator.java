package ui.automation.pages;

public class Leads_Page_Validator extends BasePageValidator<Leads_Page> {
	public Leads_Page_Validator(Leads_Page Map1) {
		super(Map1);
		// TODO Auto-generated constructor stub
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
	public String convertTab_Leftside_Edit_Btn() throws Throwable{
		return this.getMap().convertTab().getText();		
	}
	public void click_Convert_Tab() throws Throwable{
		 this.getMap().convertTab().click();		
	}
}
