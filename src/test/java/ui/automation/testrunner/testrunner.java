package ui.automation.testrunner;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import cigniti.automation.utilities.BrowserTypes;
import cigniti.automation.utilities.Driver;
import cigniti.reports.BaseUtil;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.PickleEventWrapper;
import cucumber.api.testng.TestNGCucumberRunner;
@Listeners(ui.automation.listeners.ITestListernerImpl.class)
@CucumberOptions (
        features = "./features/"
        ,glue = {"ui.automation.stepdef"}
         //tags= {"@ericbank"})
      ,tags = {"@tag"})
		/*,plugin= { "pretty",
                "html:target/site/cucumber-pretty",
        "json:target/cucumber.json" },
        monochrome = true) */
public class testrunner {
	    private TestNGCucumberRunner testNGCucumberRunner;
	    //private static ExtentReportUtil extentreportUtil=new ExtentReportUtil();
	   // private static ExtentReportUtil extentreportUtil;
		//private static boolean isReportRunning;
	   @BeforeClass(alwaysRun = true)
	    public void setUpClass() throws Exception {      	
	       testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
	        Driver.StartBrowser(BrowserTypes.Chrome, 30);
	       //scenaraioDef = BaseUtil.features.createNode( )
	    }
	    
	  
	    @Test(dataProvider = "features")    
	    public void feature(PickleEventWrapper eventwrapper,CucumberFeatureWrapper cucumberFeature) throws Throwable {
	    	//testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
	    	System.out.print(cucumberFeature.toString());
	    	BaseUtil.features = BaseUtil.extent.createTest(cucumberFeature.toString());
	    	testNGCucumberRunner.runScenario(eventwrapper.getPickleEvent());
	    }
	    
	    @DataProvider(parallel=false)
	    public Object[][] features() {
	       // return testNGCucumberRunner.provideFeatures();    	
	    	 return testNGCucumberRunner.provideScenarios();
	    }
	    
	    @AfterClass(alwaysRun = true)
	    public void tearDownClass(ITestContext text) throws IOException{            
	       testNGCucumberRunner.finish();        
	        Driver.StopBrowser();
	       
	    }
	 
}
