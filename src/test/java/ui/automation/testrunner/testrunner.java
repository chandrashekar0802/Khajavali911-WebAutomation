package ui.automation.testrunner;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.GherkinKeyword;

//import cigniti.automation.utilities.BrowserTypes;
//import cigniti.automation.utilities.Driver;
import cigniti.base.BaseUtil;
import cigniti.base.ExtentReportUtil;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.PickleEventWrapper;
import cucumber.api.testng.TestNGCucumberRunner;
//import uiautomation.automation.utility.BrowserTypes;
//import uiautomation.automation.utility.Driver;
@Listeners(ui.automation.listeners.ITestListernerImpl.class)

@CucumberOptions (
        features = "./features/"
        ,glue = {"ui.automation.stepdef"}
         //tags= {"@ericbank"})
      ,tags = {"@Elsevier"}	)
		/*,plugin= { "pretty",
                "html:target/site/cucumber-pretty",
        "json:target/cucumber.json" },
        monochrome = true) */
public class testrunner extends AbstractTestNGCucumberTests{
	 private TestNGCucumberRunner testNGCucumberRunner;
	    //private static ExtentReportUtil extentreportUtil=new ExtentReportUtil();
	    
	  // public static ThreadLocal<ExtentTest> extentTestThread =new ThreadLocal<>();
		//private static boolean isReportRunning;
	 // private static  ExtentReports extent = ExtentReportUtil.CreateInstance();
	    
	 private static ThreadLocal<ExtentTest> extentTestThread =new ThreadLocal<ExtentTest>();
	   @BeforeClass(alwaysRun = true)
	    public void setUpClass() throws Exception {      	
	       testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
	      
	       //scenaraioDef = BaseUtil.features.createNode( )
	    }
	    
	  
	    @Test(dataProvider = "features")    
	    public void feature(PickleEventWrapper eventwrapper,CucumberFeatureWrapper cucumberFeature) throws Throwable {
	    	//testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
	    //	System.out.print("TestRunner feature "+cucumberFeature.toString());	 
	    //	ExtentReportUtil.CreateInstance().setextentTest(cucumberFeature.toString());
	    	BaseUtil.featureName =cucumberFeature.toString();
	    	
			//ExtentReportUtil.setextentTest(cucumberFeature.toString());
	    	ExtentReportUtil.CreateInstance().setextentfeature(cucumberFeature.toString());
	    	//baseUtil.features = baseUtil.extent.createTest(cucumberFeature.toString());
	    //	extentreport.setextentTest
	    	//ExtentTest extentTest = extent.createTest(cucumberFeature.toString());
	    	//extentTestThread.set(extentTest);
	    //	ExtentReportUtil.features = exp.createTest(cucumberFeature.toString());
	    	testNGCucumberRunner.runScenario(eventwrapper.getPickleEvent());
	    }
	   
	  @DataProvider(parallel=true)
	    public Object[][] features() {
	       //return testNGCucumberRunner.provideFeatures();   
		  Object[][] sce=  testNGCucumberRunner.provideScenarios();
		  scenarios().getClass().getName();
	    	 return testNGCucumberRunner.provideScenarios();
	    } 
	    
	    
	    @AfterClass(alwaysRun = true)
	    public void tearDownClass(ITestContext text) throws IOException{            
	       testNGCucumberRunner.finish();        
	      //  Driver.StopBrowser();
	       
	    }
	    
	 
}
