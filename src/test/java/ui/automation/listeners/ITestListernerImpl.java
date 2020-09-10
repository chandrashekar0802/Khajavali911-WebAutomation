package ui.automation.listeners;


import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.gherkin.model.Feature;

import cigniti.reports.BaseUtil;
import cigniti.reports.ExtentReportUtil;



public class ITestListernerImpl implements ITestListener {
	ExtentReportUtil extentreportUtil =new ExtentReportUtil();
	private static boolean isReportRunning;
	
	public void onFinish(ITestContext iTestContext) {
		// TODO Auto-generated method stub
		extentreportUtil.FlushReport();
		System.out.print("On finish from listener");
	}

	public void onStart(ITestContext iTestContext) {
		// TODO Auto-generated method stub
		if(!isReportRunning) {			
			extentreportUtil.ExtentReport();
		    isReportRunning = true;				
		}
		//BaseUtil.features = BaseUtil.extent.createTest(Feature.class, "ericbank andriod sample");
		System.out.print("from on start");
	}


	public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {
		// TODO Auto-generated method stub
		System.out.print("from on nTestFailedButWithinSuccessPercentage");
	}
	
	public void onTestFailure(ITestResult iTestResult) {
		//TODO Auto-generated method stub
		System.out.print("from onTestFailure");
			
			try {
				//extentreportUtil.ExtentReportScreenShot();				
				BaseUtil.scenarioDef.fail("details").addScreenCaptureFromPath(extentreportUtil.ExtentReportScreenShot());				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
					
	} 


	public void onTestSkipped(ITestResult iTestResult) {
		// TODO Auto-generated method stub
		
	}


	public void onTestStart(ITestResult iTestResult) {
		// TODO Auto-generated method stub
		System.out.print("from onTestStart");
	}


	public void onTestSuccess(ITestResult iTestResult) {
		// TODO Auto-generated method stub
		System.out.print("from onTestSuccess");
	}



}
