package ui.automation.stepdef;

import java.net.MalformedURLException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.GherkinKeyword;

import cigniti.automation.utilities.BrowserTypes;
import cigniti.automation.utilities.Driver;
import cigniti.base.BaseUtil;
import cigniti.base.ExtentReportUtil;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import ui.automation.listeners.ITestListernerImpl;

//public class Hooks extends ITestListernerImpl{
public class Hooks{
//	private BaseUtil baseUtil= new BaseUtil();
//	 private static ExtentReports extent = ExtentReportUtil.CreateInstance();
//	public ThreadLocal<ExtentTest> extentreortTest =new ThreadLocal<ExtentTest>();
   // ExtentReportUtil extentReportUtil =new ExtentReportUtil();
   // public Hooks(BaseUtil base)
   // {
	//	this.setBase(base);
	//}
	@Before
	public void BeforeScenario(Scenario scenario) throws ClassNotFoundException, MalformedURLException
	{	
		System.out.println("Before scenario "+scenario.getName());	
		ExtentReportUtil.CreateInstance().setextentscenario(scenario.getName());
		//ExtentReportUtil.CreateInstance().setextentTest(scenario.getName(),BaseUtil.featureName);
//	ExtentReportUtil.CreateInstance().setextentfeature(scenario.getName());
	//	extentreortTest.get().createNode(new GherkinKeyword("Scenario"),scenario.getName());
	//System.out.println("Before setting"  extentreortTest.set(ExtentReportUtil.features));
	//ExtentReportUtil.scenarioDef = ExtentReportUtil.features.createNode(new GherkinKeyword("Scenario"),scenario.getName());
	//extentreortTest.set(ExtentReportUtil.scenarioDef);
//	System.out.println("After setting "+extentreortTest.get());
	//baseUtil.scenarioDef  = baseUtil.features.createNode(new GherkinKeyword("Scenario"),scenario.getName());
	}
	
	@After
	public void AfterScenario()
	{
		System.out.println("After scenario ");	
		//Driver.StopBrowser();
//	ExtentReportUtil.CreateInstance().FlushReport();
	}
	
	/*public BaseUtil getBase() {
		return baseUtil;
	}

	public void setBase(BaseUtil base) {
		this.baseUtil = base;
	}*/
}
