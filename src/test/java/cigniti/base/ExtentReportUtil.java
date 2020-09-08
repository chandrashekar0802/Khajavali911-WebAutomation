package cigniti.base;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import com.aventstack.extentreports.gherkin.model.Feature;
import com.aventstack.extentreports.gherkin.model.Scenario;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.GherkinKeyword;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.google.common.io.Files;

import cigniti.automation.utilities.Driver;



public class ExtentReportUtil{
	RemoteWebDriver driver; 
	private static ExtentReportUtil extentreport;
	private static ExtentReports extent;
	public static ExtentTest test;
	//public static ExtentTest features;
	public static ExtentTest scenarioDef;
	private static final ThreadLocal<ExtentTest> extenttestThread =new ThreadLocal<ExtentTest>();
	private static final ThreadLocal<ExtentTest> extentScenario=new ThreadLocal<ExtentTest>();
	private static final ThreadLocal<ExtentTest> extentThreadFeatures=new ThreadLocal<ExtentTest>();
	//private static final ThreadLocal<ExtentTest> extentScenariodef=new ThreadLocal<ExtentTest>();
	//private String filename = reportLocation + "\\extentreport.html";
	public ExtentReportUtil(RemoteWebDriver driver)
	{
		this.driver = driver;
	}
	public ExtentReportUtil()
	{
		
	}
	
	public static ExtentReportUtil CreateInstance()
	{
		if(extentreport == null) {
			extentreport=new ExtentReportUtil();
		}
		return extentreport;
	}
	public  ExtentReports ExtentReport() {
		String filename = System.getProperty("user.dir")+ "\\test-output\\extentreport.html";
		extent = new ExtentReports();       // extent.
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(filename);
		htmlReporter.loadXMLConfig("resources\\extent-config.xml");		
		extent.attachReporter(htmlReporter);
		//extentReportThread.set(extent);
		//return extentReportThread.get();
		return extent;
	}
	
	public  void setextentTest(String testname, String featureName) throws ClassNotFoundException
	{
	    ExtentTest features = extent.createTest(Feature.class,featureName);
		scenarioDef= features.createNode(Scenario.class,testname);
		
		
		//ExtentTest test	=extent.createTest(testname);
		//extenttestThread.set(test);
		extenttestThread.set(features);
	}
	
	public void setextentfeature(String featureName) throws ClassNotFoundException
	{
	    ExtentTest features = extent.createTest(Feature.class,featureName);
	//	scenarioDef= features.createNode(Scenario.class,testname);
		
		
		//ExtentTest test	=extent.createTest(testname);
		//extenttestThread.set(test);
		extenttestThread.set(features);
	}
	public void setextentscenario(String featureName) throws ClassNotFoundException
	{	   
	    scenarioDef= extenttestThread.get().createNode(Scenario.class,featureName);	
	    extentScenario.set(scenarioDef);
	}
	public  void setextentfeature1(String scenario) throws ClassNotFoundException
	{
		// features = extent.createTest(Feature.class,featureName);
		//extentThreadFeatures.set(value);
		//System.out.print("scenario name is "+extenttestThread.get().toString());
	//	ExtentTest scenarioDef= extenttestThread.get().createNode(new GherkinKeyword("Scenario"),scenario);
	//	extentThreadFeatures.set(scenarioDef);
	}
	
	public  void setnodetext(String testnodetext) throws ClassNotFoundException {
		//System.out.print("node text is "+extenttestThread.get().toString());
		//extenttestThread.get().createNode(testnodetext);
		//extenttestThread.get().createNode(testnodetext);
		extenttestThread.get().createNode(new GherkinKeyword("Then"),testnodetext).pass("step is passed");
	}
	
	public  void setnodestep(String testnodetext) throws ClassNotFoundException {		
		extentScenario.get().createNode(new GherkinKeyword("Then"),testnodetext).pass("step is passed");
	}
	
	public static String ExtentReportScreenShot() throws IOException {	
		
	//	File scr= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	//	Files.copy(scr,new File( System.getProperty("user.dir") + "screenshot.png"));
		return  System.getProperty("user.dir") + "\\test-output\\screenshot.png";
	
	}
	
	public void FlushReport() {
		
	 extent.flush();
	}
	
	
}