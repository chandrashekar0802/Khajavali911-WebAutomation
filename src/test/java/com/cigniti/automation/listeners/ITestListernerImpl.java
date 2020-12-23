package com.cigniti.automation.listeners;


import java.awt.Desktop;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.cigniti.automation.reports.BaseUtil;
import com.cigniti.automation.reports.ExtentReportUtil;
import com.cigniti.automation.utilities.HtmlReporters;
import com.cigniti.automation.utilities.Property;
import com.cigniti.automation.utilities.Reporters;



public class ITestListernerImpl implements ITestListener {
	ExtentReportUtil extentreportUtil =new ExtentReportUtil();
	private static boolean isReportRunning;
	public static Property configProps=new Property("config.properties");
	static int intReporterType=Integer.parseInt(configProps.getProperty("reportsType"));
	
	public void onFinish(ITestContext iTestContext) {
		// TODO Auto-generated method stub
		extentreportUtil.FlushReport();
		System.out.print("On finish from listener");
		/*HtmlReporters.currentTimeList.add(System.currentTimeMillis());
		BaseUtil.calculateSuiteExecutionTime();
		if(intReporterType == 1)
			try {
				HtmlReporters.createHtmlSummaryReport1();
				System.out.print("On finish Html report created 1");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		else
			try {
				HtmlReporters.createHtmlSummaryReport();
				System.out.print("On finish Html report created");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		//open the result file
		String dir =  configProps.getProperty("openResult"); // path to your new file
		File fl = new File(dir);
		File[] folders = fl.listFiles(new FileFilter() {			
			public boolean accept(File file) {
				return file.isDirectory();
			}
		});
		long lastMod = Long.MIN_VALUE;
		File choise = null;
		for (File folder : folders) {
			if (folder.lastModified() > lastMod) {
				choise = folder;
				lastMod = folder.lastModified();
			}
		}
		dir = ""+choise;
		fl = new File(dir);
		File[] files = fl.listFiles(new FileFilter() {			
			public boolean accept(File file) {
				return file.isFile();
			}
		});
		lastMod = Long.MIN_VALUE;
		choise = null;
		for (File file : files) {
			if (file.lastModified() > lastMod) {
				choise = file;
				lastMod = file.lastModified();
			}
		}
		dir = ""+choise;
		File htmlFile = new File(dir);
		try {
			Desktop.getDesktop().browse(htmlFile.toURI());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
	}

	public void onStart(ITestContext iTestContext) {
		// TODO Auto-generated method stub
		if(!isReportRunning) {			
			extentreportUtil.ExtentReport();
			
			HtmlReporters.currentTimeList.add(System.currentTimeMillis());
			try {
			//	Reporters.reportCreater();
			} catch (Throwable e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			HtmlReporters.currentSuit = iTestContext.getCurrentXmlTest().getSuite().getName();
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
