package com.ds.automation.steps;

import org.testng.ITestContext;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.GherkinKeyword;
import com.cigniti.automation.reports.BaseUtil;
import com.cigniti.automation.reports.ExtentReportUtil;
import com.cigniti.automation.utilities.BrowserTypes;
import com.cigniti.automation.utilities.HtmlReporters;
import com.cigniti.automation.utilities.Reporters;

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
		// custom report
	/*	BaseUtil.iStepNo = 0;
		BaseUtil.calculateTestCaseStartTime();
		
		HtmlReporters.tc_name=scenario.getName().toString()+","+BrowserTypes.Chrome+","+BaseUtil.timeStampBeforeSutie;
		String[] ts_Name=this.getClass().getName().toString().split("\\.");
	//	HtmlReporters.packageName=ts_Name[0]+"."+ts_Name[1]+"."+ts_Name[2];
		HtmlReporters.packageName = ts_Name[0];
		if(BaseUtil.intReporterType == 1)
			HtmlReporters.testHeader1("Script Name : "+scenario.getName().toString());
		else
			HtmlReporters.testHeader("Script Name : "+scenario.getName().toString());
		BaseUtil.calculateStepStartTime();
		
		*/
	}
	
	@After
	public void AfterScenario()
	{
		//BaseUtil.calculateTestCaseExecutionTime();
		extentReportUtil.FlushReport();
	}
	
	public BaseUtil getBase() {
		return base;
	}

	public void setBase(BaseUtil base) {
		this.base = base;
	}
}
