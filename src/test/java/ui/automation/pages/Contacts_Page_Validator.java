package ui.automation.pages;

public class Contacts_Page_Validator  extends BasePageValidator<Contacts_Page> {
	public Contacts_Page_Validator(Contacts_Page Map1) {
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
	public void enter_Data_mobile(String mobile) throws Throwable{
		this.getMap().mobileField().sendKeys(mobile);
	}
	public void enter_Data_acctName(String AcctName) throws Throwable{
		this.getMap().accountNameField().sendKeys(AcctName);
		this.getMap().johnsonInvmntLtd().click();
	}
	public void enter_Data_email(String email) throws Throwable{
		this.getMap().emailField().sendKeys(email);
	}
	public void enter_Data_mailingStreet(String mailingStreet) throws Throwable{
		this.getMap().mailingStreetField().sendKeys(mailingStreet);
	}
	public void enter_Data_mailingCity(String mailingCity) throws Throwable{
		this.getMap().mailingCityField().sendKeys(mailingCity);
	}
	public void enter_Data_mailingState(String mailingState) throws Throwable{
		this.getMap().mailingStateField().sendKeys(mailingState);
	}
	public void enter_Data_mailingPostalCode(String mailingPostalCode) throws Throwable{
		this.getMap().mailingPostalCodeField().sendKeys(mailingPostalCode);
	}
	public void enter_Data_mailingCountry(String mailingCountry) throws Throwable{
		this.getMap().mailingCountryField().sendKeys(mailingCountry);
	}
	public void select_DesignationLevel_Drop(String str) throws Throwable{
		this.getMap().selectDesignationLevelDrpDwnBtn(str);		
	}
}
