package com.cigniti.automation.utilities;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jxl.Sheet;

import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

import com.beust.jcommander.internal.Maps;


@SuppressWarnings("unchecked")
public class TestNGExecution {

	public static String FilePath=null;
	//public static Property configProps=new Property("config.properties");
	public static String sScriptPath;
	public static Sheet sheet;
	
	public static Map<Integer, String> dataMap = Maps.newHashMap();
	
	public static void main(String[] args) throws Throwable 
	{
		TestNGExecution TestNGExecution= new TestNGExecution();
		
		//TestNGExecution.parallelSample();
		FilePath = System.getProperty("user.dir")+"/Macros/" + new Property("config.properties").getProperty("MacroFile");				
		sheet =new ExcelLib().getSheetObject(FilePath,"Automation_Input_Parameters");	
		int iRowsCnt=sheet.getRows();
		sScriptPath = "com.wm.automation.executionengine.";
		String sRemoteMachine=new ExcelLib().getSheetCellData(sheet, "ExecutionType",1);
		//TestNGExecution.createXmlDoc(sRemoteMachine);
		switch (sRemoteMachine) 
		{
		case "Parallel":
			TestNGExecution.parallelExecution(iRowsCnt);
			break;
		case "Grid":
			TestNGExecution.gridExecution(iRowsCnt);
			break;
		default:
			TestNGExecution.standardExecution(iRowsCnt);
			break;
		}
//		new Base().status();
	//	new Base().generateXMLReport();
	//	new Base().tearDown();
		System.exit(1);
		//TestNGExecution.closeDriver();
	}
	/**
	 * 
	 * @param iRowsCnt
	 * @throws Throwable
	 */
	public void gridExecution(int iRowsCnt) throws Throwable
	{
		//Base.timeStampBeforeSutie = Accessories.timeStamp().replace(" ","_").replace(":","_").replace(".", "_");
		XmlSuite suite = new XmlSuite();
		suite.setName("GridSuite");
		//suite.setParallel("tests");

		List<String> urlSet=new ArrayList<String>();

		List<XmlSuite> suites = null;
		for (int iRow=1;iRow<iRowsCnt;iRow++){	

			String sBrowserType=new ExcelLib().getSheetCellData(sheet, "BrowserType",iRow);
			String sUrl=new ExcelLib().getSheetCellData(sheet, "Machine_URL",iRow);						
			urlSet.add(sBrowserType+"_"+sUrl); // Add all the different URL's into Set			
		}
		suite.setThreadCount(urlSet.size());

		int count=0;

		for(String sUrl : urlSet)
		{											
			Map<String, String> xz = new HashMap();
			xz.put("url", "http://"+sUrl.split("_")[1]+"/wd/hub");
			xz.put("browserVersion","");
			xz.put("browserName", sUrl.split("_")[0]);
			
			String testCaseName=new ExcelLib().getSheetCellData(sheet, "TestScriptName",count+1);
			suites = new ArrayList<XmlSuite>();
			List<XmlSuite> mySuites=null;
			XmlTest myTest = new XmlTest(suite);
			myTest.setName(sUrl+"_"+testCaseName);

			myTest.setParameters(xz);
			List<XmlTest> myTests = new ArrayList<XmlTest>();

			//String sTcUrl=new ExcelLib().getSheetCellData(sheet, "Machine_URL",count+1);	

			List<XmlClass> classes = new ArrayList<XmlClass>();

			final EnableReports classAnnotation = (EnableReports) Class.forName(sScriptPath+testCaseName).getAnnotations()[0];
			changeAnnotationValue(classAnnotation, "getTestCaseName",sUrl+"_"+testCaseName);
					   
			
			XmlClass x1= new XmlClass(sScriptPath+testCaseName);
			//x1.setName(sScriptPath+testCaseName);
			classes.add(x1);
			myTest.setXmlClasses(classes);
			myTests.add(myTest);

			mySuites = new ArrayList<XmlSuite>();
			mySuites.add(suite);

			suites.add(suite);
			count++;
		}		
		//System.out.println("dataMap===>>>>"+dataMap);
		File file = new File("TestNG.xml");
		System.out.println("file"+file);
		FileWriter writer = new FileWriter(file);
		writer.write(suite.toXml());
		writer.close(); 

		TestNG tng = new TestNG();
		suite.setThreadCount(urlSet.size());
		tng.setXmlSuites(suites);
		tng.run();	
		 
	}

	public void parallelExecution(int iRowsCnt) throws Throwable
	{
		//Base.timeStampBeforeSutie = Accessories.timeStamp().replace(" ","_").replace(":","_").replace(".", "_");
		XmlSuite suite = new XmlSuite();
		suite.setName("GridSuite");
		suite.setParallel("tests");
		List<String> urlSet=new ArrayList<String>();
    	List<XmlSuite> suites = null;
		for (int iRow=1;iRow<iRowsCnt;iRow++){	
            
			String sBrowserType=new ExcelLib().getSheetCellData(sheet, "BrowserType",iRow);
			//String sUrl=new ExcelLib().getSheetCellData(sheet, "Machine_URL",iRow);						
			urlSet.add(sBrowserType); // Add all the different URL's into Set			
		}		suite.setThreadCount(urlSet.size());

		int count=0;

		for(String sUrl : urlSet)
		{											
			Map<String, String> xz = new HashMap();
			//xz.put("url", "http://"+sUrl.split("_")[0]+"/wd/hub");
			xz.put("browserVersion","");
			xz.put("browserName", sUrl);
			xz.put("url", "http://127.0.0.1:4444");
			
			String testCaseName=new ExcelLib().getSheetCellData(sheet, "TestScriptName",count+1);
			suites = new ArrayList<XmlSuite>();
			List<XmlSuite> mySuites=null;
			XmlTest myTest = new XmlTest(suite);
		
			int randomInt = (int)(100.0 * Math.random());
			myTest.setName(sUrl+"_"+testCaseName+randomInt);
			
			myTest.setParameters(xz);
			List<XmlTest> myTests = new ArrayList<XmlTest>();

			//String sTcUrl=new ExcelLib().getSheetCellData(sheet, "Machine_URL",count+1);	

			List<XmlClass> classes = new ArrayList<XmlClass>();

			XmlClass x1= new XmlClass(sScriptPath+testCaseName);
			final EnableReports classAnnotation = (EnableReports) Class.forName(sScriptPath+testCaseName).getAnnotations()[0];
			changeAnnotationValue(classAnnotation, "getTestCaseName",sUrl+"_"+testCaseName);
				
			//x1.setName(sScriptPath+testCaseName);
			classes.add(x1);
			myTest.setXmlClasses(classes);
			myTests.add(myTest);

			mySuites = new ArrayList<XmlSuite>();
			mySuites.add(suite);

			suites.add(suite);
			count++;
		}		
		//System.out.println("dataMap===>>>>"+dataMap);
		File file = new File("TestNG.xml");
		System.out.println("file"+file);
		FileWriter writer = new FileWriter(file);
		writer.write(suite.toXml());
		writer.close(); 

		TestNG tng = new TestNG();
		suite.setThreadCount(urlSet.size());
		tng.setXmlSuites(suites);
		tng.run();	
	}
	

	/**
	 * @param iRowsCnt
	 * @throws Throwable
	 * @throws IOException
	 * 
	 */
	public void standardExecution(int iRowsCnt) throws Throwable, IOException
	{
		
		System.out.println("Execution started");
		//Base.timeStampBeforeSutie = Accessories.timeStamp().replace(" ","_").replace(":","_").replace(".", "_");
		XmlSuite suite = new XmlSuite();
		suite.setName("GridSuite");
		//suite.setParallel("tests");

		List<String> urlSet=new ArrayList<String>();

		List<XmlSuite> suites = null;
		for (int iRow=1;iRow<iRowsCnt;iRow++){	

			String sBrowserType=new ExcelLib().getSheetCellData(sheet, "BrowserType",iRow);
			//String sUrl=new ExcelLib().getSheetCellData(sheet, "Machine_URL",iRow);
			if(!sBrowserType.isEmpty()){
				urlSet.add(sBrowserType);
			}
			
			 // Add all the different URL's into Set			
		}
		suite.setThreadCount(urlSet.size());

		int count=0;

		for(String sUrl : urlSet)
		{											
			Map<String, String> xz = new HashMap();
			//xz.put("url", "http://"+sUrl.split("_")[0]+"/wd/hub");
			xz.put("browserVersion","");
			xz.put("browserName", sUrl);
			xz.put("url", "http://127.0.0.1:4444");
			
			String testCaseName=new ExcelLib().getSheetCellData(sheet, "TestScriptName",count+1);
			suites = new ArrayList<XmlSuite>();
			List<XmlSuite> mySuites=null;
			XmlTest myTest = new XmlTest(suite);
			int randomInt = (int)(100.0 * Math.random());
			myTest.setName(sUrl+"_"+testCaseName+randomInt);
			
			myTest.setParameters(xz);
			List<XmlTest> myTests = new ArrayList<XmlTest>();

			//String sTcUrl=new ExcelLib().getSheetCellData(sheet, "Machine_URL",count+1);	

			List<XmlClass> classes = new ArrayList<XmlClass>();

			XmlClass x1= new XmlClass(sScriptPath+testCaseName);
			final EnableReports classAnnotation = (EnableReports) Class.forName(sScriptPath+testCaseName).getAnnotations()[0];
			changeAnnotationValue(classAnnotation, "getTestCaseName",sUrl+"_"+testCaseName+randomInt);
			String classname=classAnnotation.getTestCaseName();
			
			
			//x1.setName(sScriptPath+testCaseName);
			classes.add(x1);
			myTest.setXmlClasses(classes);
			myTests.add(myTest);

			mySuites = new ArrayList<XmlSuite>();
			mySuites.add(suite);

			suites.add(suite);
			count++;
			//System.out.println(count);
		}		
		//System.out.println("dataMap===>>>>"+dataMap);
		System.out.println("testng xml created");
		File file = new File("TestNG.xml");
		System.out.println("file"+file);
		FileWriter writer = new FileWriter(file);
		writer.write(suite.toXml());
		writer.close(); 

		TestNG tng = new TestNG();
		suite.setThreadCount(urlSet.size());
		tng.setXmlSuites(suites);
		
		System.out.println("run started");
		tng.run();	
	}
	


	@SuppressWarnings("unchecked")
	public static Object changeAnnotationValue(Annotation annotation, String key, Object newValue){
		Object handler = Proxy.getInvocationHandler(annotation);
		Field f;
		try {
			f = handler.getClass().getDeclaredField("memberValues");
		} catch (NoSuchFieldException | SecurityException e) {
			throw new IllegalStateException(e);
		}
		f.setAccessible(true);
		Map<String, Object> memberValues;
		try {
			memberValues = (Map<String, Object>) f.get(handler);
		} catch (IllegalArgumentException | IllegalAccessException e) {
			throw new IllegalStateException(e);
		}
		Object oldValue = memberValues.get(key);
		if (oldValue == null || oldValue.getClass() != newValue.getClass()) {
			throw new IllegalArgumentException();
		}
		memberValues.put(key,newValue);
		return oldValue;
	}
}
