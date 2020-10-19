package cigniti.reports;

import java.io.File;
import cigniti.automation.utilities.Property;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Properties;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import cigniti.automation.utilities.HtmlReporters;

import cigniti.automation.utilities.PropertiesFileReader;

public class BaseUtil {
	
	public static int iStepNo = 0;
	public static Property configProps=new Property("config.properties");
	//public WebDriver browser;
	public static ExtentReports extent;
	public static ExtentTest scenarioDef;
	public static  ExtentTest features;
	public static String reportLocation="test-output\\";
	public static String timeStamp=timeStamp().replace(" ","_").replace(":","_").replace(".", "_");
	public static String timeStampBeforeSutie = timeStamp().replace(" ","_").replace(":","_").replace(".", "_");
	static PropertiesFileReader obj = new PropertiesFileReader();
	public static String testresultPath;
	public static String testresult;
	public static int intReporterType=Integer.parseInt(configProps.getProperty("reportsType"));
	
	
	

	/********************************************************************************************************************************/
	/**
	 * Write results to Browser specific path
	 * @Date  13/05/2015
	 * @Revision History
	 */
	/**
	 * @throws IOException ******************************************************************************************************************************/
	//@Parameters({"browserType"})
	public static String filePath() throws IOException
	{
		
		String strDirectoy="ResultFile";
		new File(System.getProperty("user.dir")+"\\test_output\\"+strDirectoy+"_"+timeStamp).mkdirs();
		return System.getProperty("user.dir")+"\\test_output\\"+strDirectoy+"_"+timeStamp+"\\";
	}
	//return time and date
	public static String timeStamp(){
			java.util.Date today = new java.util.Date();
			return new java.sql.Timestamp(today.getTime()).toString();
	}
	public static void screenShot(String string) {
		// TODO Auto-generated method stub
		
	}
	public static void calculateStepExecutionTime() {
		// TODO Auto-generated method stub
		HtmlReporters.iStepEndTime = System.currentTimeMillis(); //Newly added
		HtmlReporters.iStepExecutionTime = (HtmlReporters.iStepEndTime-HtmlReporters.iStepStartTime)/1000;//Newly added
		if(HtmlReporters.iStepExecutionTime==0)
			HtmlReporters.iStepExecutionTime =1;
	}
	public static void calculateStepStartTime() {
		// TODO Auto-generated method stub
		HtmlReporters.iStepStartTime = System.currentTimeMillis(); //Newly added
	}
	public static String getHostName() throws UnknownHostException{
		InetAddress addr = InetAddress.getLocalHost();
		String hostname = addr.getHostName();

		return hostname;
	}
	public static void calculateSuiteExecutionTime() {
		// TODO Auto-generated method stub

		HtmlReporters.iSuiteEndTime = System.currentTimeMillis(); //Newly added
		HtmlReporters.iSuiteExecutionTime = (HtmlReporters.iSuiteEndTime-HtmlReporters.iSuiteStartTime)/1000.000;//Newly added
		
	}
	public static void calculateTestCaseStartTime() {
		// TODO Auto-generated method stub
		HtmlReporters.iStartTime = System.currentTimeMillis();
	}
	public static void calculateTestCaseExecutionTime() {
		// TODO Auto-generated method stub
		HtmlReporters.iEndTime = System.currentTimeMillis();
		HtmlReporters.iExecutionTime=(HtmlReporters.iEndTime-HtmlReporters.iStartTime);
		HtmlReporters.list.add((HtmlReporters.iExecutionTime)/1000.0);
		
	}
	/***
	 * 		This method is supposed to be used in the @BeforeSuite in-order trigger the Suite Start Time
	 * which inturn used to calculate the Total Suite execution time to show in Reports.
	 */
	public static void calculateSuiteStartTime(){
		
		HtmlReporters.iSuiteStartTime = System.currentTimeMillis(); //Newly added
	}
}