package ui.automation.stepdef;

import com.aventstack.extentreports.GherkinKeyword;

import cigniti.base.BaseUtil;
import cigniti.base.ExtentReportUtil;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	
	private BaseUtil base;
    ExtentReportUtil extentReportUtil =new ExtentReportUtil();
	public Hooks(BaseUtil base)
	{
		this.setBase(base);
	}
	@Before
	public void BeforeScenario(Scenario scenario) throws ClassNotFoundException
	{	
		BaseUtil.scenarioDef  = BaseUtil.features.createNode(new GherkinKeyword("Scenario"),scenario.getName());
	}
	
	@After
	public void AfterScenario()
	{
		extentReportUtil.FlushReport();
	}
	
	public BaseUtil getBase() {
		return base;
	}

	public void setBase(BaseUtil base) {
		this.base = base;
	}
}
