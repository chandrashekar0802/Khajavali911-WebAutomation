package com.cigniti.automation.utilities;

import com.cigniti.automation.reports.BaseUtil;

public class Reporters {

	public static Property configProps=new Property("config.properties");
	static String  timeStamp= BaseUtil.timeStamp().replace(":", "_").replace(".", "_");
	public static boolean flag =false;

	public static void reportCreater() throws Throwable{
		int intReporterType=Integer.parseInt(configProps.getProperty("reportsType"));

		switch (intReporterType) {
		case 1:
			HtmlReporters.htmlCreateReport();
			
			break;
		case 2:
			
			HtmlReporters.htmlCreateReport();
			HtmlReporters.createDetailedReport();

			break;
		default:
			//ExcelReporter.excelTestReportCreator();
			HtmlReporters.htmlCreateReport();
			break;
		}
	}

	public static void reportCreater_AllFiles(String xmlFile1, String xmlFile2, String comparison) throws Throwable{
		int intReporterTypeXML=Integer.parseInt(configProps.getProperty("intReporterTypeXML"));

		switch (intReporterTypeXML) {
		case 1:
			HtmlReporters.createAllReports(xmlFile1, xmlFile2, comparison);
			break;
		case 2:
			break;
		default:
			break;
		}
	}
	
	public static void reportCreaterAfterExecution(String xmlFile1, String xmlFile2, String comparison) throws Throwable{
		int intReporterTypeXML=Integer.parseInt(configProps.getProperty("ReportAfterExecution"));

		switch (intReporterTypeXML) {
		case 1:
			HtmlReporters.createExecutionReports(xmlFile1, xmlFile2, comparison);
			break;
		case 2:
			break;
		default:
			break;
		}
	}
	public static void successReport(String strStepName, String strStepDes) throws Throwable{
		int intReporterType=Integer.parseInt(configProps.getProperty("reportsType"));
		if(configProps.getProperty("OnSuccessScreenshot").equalsIgnoreCase("True"))
		{
		//Actiondriver.screenShot(Base.filePath()+strStepName.replace(" ", "_").replace(":", "_").replace("</br>", "_").replace("-","_")+"_"+Base.timeStamp+".jpeg");
		}
		switch (intReporterType) {
		case 1:	HtmlReporters.onSuccess1(strStepName, strStepDes);
			break;
		case 2:	HtmlReporters.onSuccess(strStepName, strStepDes);
			break;
		default:HtmlReporters.onSuccess(strStepName, strStepDes);
			break;
		}
	}	

	public static void failureReport(String strStepName, String strStepDes) throws Throwable{
		int intReporterType=Integer.parseInt(configProps.getProperty("reportsType"));
		BaseUtil.screenShot(BaseUtil.filePath()+strStepName.replace(" ", "_").replace(":", "_").replace("</br>", "_")+"_"+BaseUtil.timeStamp+".jpeg");
		switch (intReporterType) {
		case 1:
			HtmlReporters.onFailure1(strStepName, strStepDes);
			flag= true;
			
			break;
		case 2:
			flag= true;
			HtmlReporters.onFailure(strStepName, strStepDes);
			break;
		default:
			flag =true;
			HtmlReporters.onFailure(strStepName, strStepDes);
			break;
		}
		//JiraConnector.invokePostMethod(new String(Base64.encode("vnallani:Ctl@1234")), "http://localhost:8888/rest/api/2/issue", "{\"fields\":{\"project\":{\"key\":\"TEST\"},\"summary\":\""+strStepName+"\",\"issuetype\":{\"name\":\"Bug\"}}}");
	}
}

