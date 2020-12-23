package com.cigniti.automation.reports;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.cigniti.automation.utilities.Driver;
import com.google.common.io.Files;



public class ExtentReportUtil extends BaseUtil{

	//private String filename = reportLocation + "\\extentreport.html";
	
	public void ExtentReport() {
		String filename = reportLocation + "extentreport.html";
		extent = new ExtentReports();
       // extent.
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(filename);
		htmlReporter.loadXMLConfig("resources\\extent-config.xml");		
		extent.attachReporter(htmlReporter);
	}
	
	public String ExtentReportScreenShot() throws IOException {		
		//LocalDateTime myDateObj = LocalDateTime.now();
		// DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("ddMMyyyyHHmmss");
		// String formattedDate = myDateObj.format(myFormatObj);
		// reportLocation + "screenshot_"+formattedDate+".png";
		File scr= ((TakesScreenshot)Driver.browser).getScreenshotAs(OutputType.FILE);
		Files.copy(scr,new File(reportLocation + "screenshot.png"));
		return reportLocation + "screenshot.png";
	
	}
	
	public void FlushReport() {
		extent.flush();
	}
	
}