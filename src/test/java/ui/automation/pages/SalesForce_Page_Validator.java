package ui.automation.pages;

public class SalesForce_Page_Validator extends BasePageValidator<SalesForce_Page> {
	public SalesForce_Page_Validator(SalesForce_Page Map1) {
		super(Map1);
		// TODO Auto-generated constructor stub
	}

	public void enter_credentials(String username, String password) throws Throwable {
		this.getMap().username.sendKeys(username);
		this.getMap().Password.sendKeys(password);
	}
	
	public void click_login() throws Throwable{
		this.getMap().signin_btn.click();
	}
	
	public void click_remindLater() throws Throwable{
		this.getMap().reminderLater().click();
	}
	
	
	public void waitForLoad_Login() throws Throwable{
		this.getMap().LoadingImage_Icon();
		this.getMap().Loading_Icon();
	}
	
	public void click_accountsTab() throws Throwable{
		this.getMap().accountsTab().click();
	}
	public void click_contactTab() throws Throwable{
		this.getMap().contactTab().click();
	}
	public void click_opportunitiesTab() throws Throwable{
		this.getMap().opportunitiesTab().click();
	}
}
