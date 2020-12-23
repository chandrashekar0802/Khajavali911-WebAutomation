package com.cigniti.automation.utilities;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.swing.text.rtf.RTFEditorKit;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.apache.commons.io.FileUtils;
import org.apache.pdfbox.pdfparser.PDFParser;
import org.apache.pdfbox.util.PDFTextStripper;
import org.apache.poi.hwpf.HWPFDocument;
import org.apache.poi.hwpf.extractor.WordExtractor;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.xwpf.extractor.XWPFWordExtractor;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.w3c.dom.Document;

import com.cigniti.automation.reports.*;
//import com.cigniti.automation.accelerators.Base;
import com.google.common.collect.Lists;

public class HtmlReporters {

	public static long iStepExecutionTime = 0;
	public static long iTestStartTime = 0;
	public static long iTestEndTime = 0;
	public static long iTestExecutionTime = 0;
	public static long iStepEndTime = 0;
	public static long iStepStartTime = 0;
	public static long iStartTime = 0;
	public static long iEndTime = 0;
	public static long iExecutionTime = 0;
	public static long iSuiteStartTime = 0;
	public static long iSuiteEndTime = 0;
	public static double iSuiteExecutionTime = 0;
	public static ArrayList<Double> list = new ArrayList<Double>();
	public static ArrayList<Long> tcextimelist = new ArrayList<Long>();
	public static long startStepTime = 0;
	public static long endStepTime = 0;
	public static double stepExecutionTime = 0;
	public static Property configProps=new Property("config.properties");
	static String startedAt = "";
	public static String tc_name = "";
	public static String packageName = "";
	static Map<String, String> map = new LinkedHashMap<String, String>();
	//static Property config = new Property("config.properties");
	public static String currentSuit = "";
	public static int pCount = 0;
	public static int fCount = 0;
	public static String[] key;
	public static String value[];
	public static long timeStamp1 ;
	public static long tcStartTime = 0;// Code Change
	public static long tcEndTime = 0;// Code Change
	public static double tcExecutionTime = 0;
	public static List<Long> currentTimeList = Lists.newArrayList();
	static String workingDir = "";
	public static String xmlFi;
	public static String finalReport;
	public static Map<String, Long> executionTime = new LinkedHashMap<String, Long>();
	public static String strTestName = "";
	public static int intPassNum;
	public static int intFailNum;

	/**
	 * Calculate the testcase start time
	 */
	public static void startTime() {
		tcStartTime = System.currentTimeMillis(); // For Step End time
	}

	/**
	 * Create reports for launching the browser with two files side by side view (Comparison of any two files)
	 * @param sFilePath1
	 * @param sFilePath2
	 * @param comparison
	 * @throws Throwable
	 */
	@SuppressWarnings("resource")
	public static void createAllReports(String sFilePath1, String sFilePath2, String comparison) throws Throwable{

		try{
			String finalData1 = null;
			String finalData2 = null;
			DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
			//Compare the text files
			if(sFilePath1.endsWith(".txt") && sFilePath2.endsWith(".txt")){
				String data1 = FileUtils.readFileToString(new File(sFilePath1), "UTF-8");
				String data2 = FileUtils.readFileToString(new File(sFilePath2), "UTF-8");
				finalData1 = data1;
				finalData2 = data2;
			}else if(sFilePath1.endsWith(".xml") && sFilePath2.endsWith(".xml")){

				//read xml file1, parse xml files and store into a string
				Document doc = docBuilder.parse(new File(sFilePath1));
				DOMSource domSource = new DOMSource(doc);
				StringWriter writer1 = new StringWriter();
				StreamResult result = new StreamResult(writer1);
				TransformerFactory tf = TransformerFactory.newInstance();
				Transformer transformer = tf.newTransformer();
				transformer.transform(domSource, result);
				System.out.println("XML in String format is: \n" + writer1.toString());
				finalData1 = writer1.toString();

				//read xml file2, parse xml files and store into a string
				Document doc1 = docBuilder.parse(new File(sFilePath2));
				DOMSource domSource1 = new DOMSource(doc1);
				StringWriter writer2 = new StringWriter();
				StreamResult result1 = new StreamResult(writer2);
				TransformerFactory tf1 = TransformerFactory.newInstance();
				Transformer transformer1 = tf.newTransformer();
				transformer1.transform(domSource1, result1);
				System.out.println("XML in String format is: \n" + writer2.toString());
				finalData2 = writer2.toString();
			}else if(sFilePath1.endsWith(".pdf") && sFilePath2.endsWith(".pdf")){

				//FileWriter fileWriter = null;
				FileInputStream inputPath1 = new FileInputStream(sFilePath1);
				FileInputStream inputPath2 = new FileInputStream(sFilePath2);
				BufferedInputStream fileToParse1=new BufferedInputStream(inputPath1);  
				BufferedInputStream fileToParse2=new BufferedInputStream(inputPath2);  

				PDFParser parser1 = new PDFParser(fileToParse1);  
				parser1.parse();  

				PDFParser parser2 = new PDFParser(fileToParse2);  
				parser2.parse(); 

				String output1=new PDFTextStripper().getText(parser1.getPDDocument()); 
				String output2=new PDFTextStripper().getText(parser2.getPDDocument());  

				finalData1 = output1.replaceAll("[\\W]|_", " ");
				finalData2 = output2.replaceAll("[\\W]|_", " ");

				parser1.getPDDocument().close();   
				parser2.getPDDocument().close();   

			}else if(sFilePath1.endsWith(".docx") && sFilePath2.endsWith(".docx")){

				XWPFDocument docx = new XWPFDocument(OPCPackage.openOrCreate(new File(sFilePath1)));
				XWPFWordExtractor wx = new XWPFWordExtractor(docx);
				finalData1 = wx.getText();

				XWPFDocument docx1 = new XWPFDocument(OPCPackage.openOrCreate(new File(sFilePath2)));
				XWPFWordExtractor wx1 = new XWPFWordExtractor(docx1);
				finalData2 = wx1.getText();

			}else if(sFilePath1.endsWith(".doc") && sFilePath2.endsWith(".doc")){

				WordExtractor extractor1 = null;
				WordExtractor extractor2 = null;

				File file1 = new File(sFilePath1);
				FileInputStream fis1 = new FileInputStream(file1.getAbsolutePath());
				HWPFDocument document1 = new HWPFDocument(fis1);
				extractor1 = new WordExtractor(document1);

				File file2 = new File(sFilePath2);
				FileInputStream fis2 = new FileInputStream(file2.getAbsolutePath());
				HWPFDocument document2 = new HWPFDocument(fis2);
				extractor2 = new WordExtractor(document2);

				finalData1 = extractor1.getText();
				finalData2 = extractor2.getText();

			}else if(sFilePath1.endsWith(".rtf") && sFilePath2.endsWith(".rtf")){

				FileInputStream stream = new FileInputStream(sFilePath1);
				RTFEditorKit kit = new RTFEditorKit();
				javax.swing.text.Document doc;
				doc = kit.createDefaultDocument();
				kit.read(stream, doc, 0);

				finalData1 = doc.getText(0, doc.getLength());
				System.out.println("text is : \n" + finalData1);

				FileInputStream stream1 = new FileInputStream(sFilePath2);
				RTFEditorKit kit1 = new RTFEditorKit();
				javax.swing.text.Document doc1;
				doc1 = kit1.createDefaultDocument();
				kit1.read(stream1, doc1, 0);

				finalData2 = doc1.getText(0, doc1.getLength());
				System.out.println("text is : \n" + finalData2);
			}

			workingDir = System.getProperty("user.dir")
					.replace(File.separator, "/");
			File xmlFile = new File(BaseUtil.filePath() + "/" + "XMLReports_"
					+ BaseUtil.timeStampBeforeSutie + ".htm");
			xmlFi = xmlFile.getAbsolutePath();

			Writer writer = null;
			writer = new FileWriter(xmlFile, true);
			writer.write("<HTML>");
			writer.write("<HEAD>");
			writer.write("<TITLE>"+comparison+" File Comparison</TITLE>");
			writer.write("</HEAD>");

			writer.write("<BODY>");
			writer.write("<H1 align='center'>"+comparison+" Comparison</H1>");
			writer.write("<H2 align='center'>Demo on "+comparison+" Difference</H2>");

			writer.write("<SCRIPT TYPE='text/javascript' LANGUAGE='JavaScript'>var dmp = new diff_match_patch();	function launch() {"
					+"var text1 = document.getElementById('text1').value;"
					+"var text2 = document.getElementById('text2').value;"
					+"dmp.Diff_Timeout = parseFloat(document.getElementById('timeout').value);"
					+"dmp.Diff_EditCost = parseFloat(document.getElementById('editcost').value);"

			+"var ms_start = (new Date()).getTime();"
			+"var d = dmp.diff_main(text1, text2);"
			+"var ms_end = (new Date()).getTime();"

			+"if (document.getElementById('semantic').checked) {"
			+"dmp.diff_cleanupSemantic(d);}"
			+"if (document.getElementById('efficiency').checked) {"
			+"dmp.diff_cleanupEfficiency(d);}"
			+"var ds = dmp.diff_prettyHtml(d);"
			+"document.getElementById('outputdiv').innerHTML = ds + '<BR>Time: ' + (ms_end - ms_start) / 1000 + 's';}");
			writer.write("</SCRIPT>");
			writer.write("<FORM action='#' onsubmit='return false'>");
			writer.write("<TABLE WIDTH='100%'><TR>");
			writer.write("<TD WIDTH='50%' height = '50%'>");
			writer.write("<H3 align='left'>"+comparison+" File 1</H3>");
			writer.write("<TEXTAREA ID='text1' STYLE='width: 100%' ROWS=25>" );
			writer.write(finalData1);
			writer.write("</TEXTAREA>");
			writer.write("</TD>");
			writer.write("<TD WIDTH='50%'>");
			writer.write("<H3 align='left'>"+comparison+" File 2</H3>");
			writer.write("<TEXTAREA ID='text2' STYLE='width: 100%' ROWS=25>" );
			writer.write(finalData2);
			writer.write("</TEXTAREA>");
			writer.write("</TD>");
			writer.write("</TR></TABLE>");
			writer.write("</BODY>");
			writer.write("</HTML>");
			writer.flush();
			writer.close();
		}catch(Exception e){
			e.printStackTrace();
			Reporters.failureReport("Invalid Selection", "Invalid file selection");
			System.out.println("invalid File selection");
		}
	}

	/**
	 * Create reports after comparison of two files and launch it in browser with two files side by side view with compare files button
	 * @param sFilePath1
	 * @param sFilePath2
	 * @param comparison
	 * @throws Throwable
	 */
	@SuppressWarnings("resource")
	public static void createExecutionReports(String sFilePath1, String sFilePath2, String comparison) throws Throwable{
		try{
			String finalData1 = null;
			String finalData2 = null;

			DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();

			//Compare the text files
			if(sFilePath1.endsWith(".txt") && sFilePath2.endsWith(".txt")){

				String data1 = FileUtils.readFileToString(new File(sFilePath1), "UTF-8");
				String data2 = FileUtils.readFileToString(new File(sFilePath2), "UTF-8");

				finalData1 = data1;
				finalData2 = data2;

			}else if(sFilePath1.endsWith(".xml") && sFilePath2.endsWith(".xml")){

				//read xml file1, parse xml files and store into a string
				Document doc = docBuilder.parse(new File(sFilePath1));
				DOMSource domSource = new DOMSource(doc);
				StringWriter writer1 = new StringWriter();
				StreamResult result = new StreamResult(writer1);
				TransformerFactory tf = TransformerFactory.newInstance();
				Transformer transformer = tf.newTransformer();
				transformer.transform(domSource, result);
				System.out.println("XML in String format is: \n" + writer1.toString());
				finalData1 = writer1.toString();

				//read xml file2, parse xml files and store into a string
				Document doc1 = docBuilder.parse(new File(sFilePath2));
				DOMSource domSource1 = new DOMSource(doc1);
				StringWriter writer2 = new StringWriter();
				StreamResult result1 = new StreamResult(writer2);
				TransformerFactory tf1 = TransformerFactory.newInstance();
				Transformer transformer1 = tf.newTransformer();
				transformer1.transform(domSource1, result1);
				System.out.println("XML in String format is: \n" + writer2.toString());
				finalData2 = writer2.toString();

			}else if(sFilePath1.endsWith(".pdf") && sFilePath2.endsWith(".pdf")){

				//FileWriter fileWriter = null;
				FileInputStream inputPath1 = new FileInputStream(sFilePath1);
				FileInputStream inputPath2 = new FileInputStream(sFilePath2);
				BufferedInputStream fileToParse1=new BufferedInputStream(inputPath1);  
				BufferedInputStream fileToParse2=new BufferedInputStream(inputPath2);  

				PDFParser parser1 = new PDFParser(fileToParse1);  
				parser1.parse();  

				PDFParser parser2 = new PDFParser(fileToParse2);  
				parser2.parse(); 

				String output1=new PDFTextStripper().getText(parser1.getPDDocument()); 
				String output2=new PDFTextStripper().getText(parser2.getPDDocument());  

				finalData1 = output1.replaceAll("[\\W]|_", " ");
				finalData2 = output2.replaceAll("[\\W]|_", " ");

				parser1.getPDDocument().close();   
				parser2.getPDDocument().close();   

			}else if(sFilePath1.endsWith(".docx") && sFilePath2.endsWith(".docx")){

				XWPFDocument docx = new XWPFDocument(OPCPackage.openOrCreate(new File(sFilePath1)));
				XWPFWordExtractor wx = new XWPFWordExtractor(docx);
				finalData1 = wx.getText();

				XWPFDocument docx1 = new XWPFDocument(OPCPackage.openOrCreate(new File(sFilePath2)));
				XWPFWordExtractor wx1 = new XWPFWordExtractor(docx1);
				finalData2 = wx1.getText();

			}else if(sFilePath1.endsWith(".doc") && sFilePath2.endsWith(".doc")){

				WordExtractor extractor1 = null;
				WordExtractor extractor2 = null;

				File file1 = new File(sFilePath1);
				FileInputStream fis1 = new FileInputStream(file1.getAbsolutePath());
				HWPFDocument document1 = new HWPFDocument(fis1);
				extractor1 = new WordExtractor(document1);

				File file2 = new File(sFilePath2);
				FileInputStream fis2 = new FileInputStream(file2.getAbsolutePath());
				HWPFDocument document2 = new HWPFDocument(fis2);
				extractor2 = new WordExtractor(document2);

				finalData1 = extractor1.getText();
				finalData2 = extractor2.getText();

			}else if(sFilePath1.endsWith(".rtf") && sFilePath2.endsWith(".rtf")){

				FileInputStream stream = new FileInputStream(sFilePath1);
				RTFEditorKit kit = new RTFEditorKit();
				javax.swing.text.Document doc;
				doc = kit.createDefaultDocument();
				kit.read(stream, doc, 0);

				finalData1 = doc.getText(0, doc.getLength());
				System.out.println("text is : \n" + finalData1);

				FileInputStream stream1 = new FileInputStream(sFilePath2);
				RTFEditorKit kit1 = new RTFEditorKit();
				javax.swing.text.Document doc1;
				doc1 = kit1.createDefaultDocument();
				kit1.read(stream1, doc1, 0);

				finalData2 = doc1.getText(0, doc1.getLength());
				System.out.println("text is : \n" + finalData2);
			}

			workingDir = System.getProperty("user.dir")
					.replace(File.separator, "/");
			File xmlFile = new File(BaseUtil.filePath() + "/" + "FinalReports_"
					+ BaseUtil.timeStampBeforeSutie + ".htm");
			finalReport = xmlFile.getAbsolutePath();

			Writer writer = null;
			writer = new FileWriter(xmlFile, true);
			writer.write("<HTML>");
			writer.write("<HEAD>");
			writer.write("<TITLE>"+comparison+" File Comparison</TITLE>");
			writer.write("<SCRIPT TYPE='text/javascript' LANGUAGE='JavaScript' SRC='../diff_match_patch.js'></SCRIPT>");
			writer.write("</HEAD>");

			writer.write("<BODY>");
			writer.write("<H1 align='center'>"+comparison+" Comparison</H1>");
			writer.write("<H2 align='center'>Demo on "+comparison+" Difference</H2>");
			writer.write("<P>Diff takes two texts and finds the differences.  This implementation works on a character by character basis."
					+"</P>");

			writer.write("<SCRIPT TYPE='text/javascript' LANGUAGE='JavaScript'> var dmp = new diff_match_patch();	function launch() {"
					+"var text1 = document.getElementById('text1').value;"
					+"var text2 = document.getElementById('text2').value;"
					+"dmp.Diff_Timeout = parseFloat(document.getElementById('timeout').value);"
					+"dmp.Diff_EditCost = parseFloat(document.getElementById('editcost').value);"
					+"var ms_start = (new Date()).getTime();"
					+"var d = dmp.diff_main(text1, text2);"
					+"var ms_end = (new Date()).getTime();"
					+"if (document.getElementById('semantic').checked) {"
					+"dmp.diff_cleanupSemantic(d);}"
					+"if (document.getElementById('efficiency').checked) {"
					+"dmp.diff_cleanupEfficiency(d);}"
					+"var ds = dmp.diff_prettyHtml(d);"
					+"document.getElementById('outputdiv').innerHTML = ds + '<BR>Time: ' + (ms_end - ms_start) / 1000 + 's';}");
			writer.write("</SCRIPT>");
			writer.write("<FORM action='#' onsubmit='return false'>");
			writer.write("<TABLE WIDTH='100%'><TR>");
			writer.write("<TD WIDTH='50%' height = '50%'>");
			writer.write("<H3 align='left'>"+comparison+" File 1</H3>");
			writer.write("<TEXTAREA ID='text1' STYLE='width: 100%' ROWS=25>" );
			writer.write(finalData1);
			writer.write("</TEXTAREA>");
			writer.write("</TD>");
			writer.write("<TD WIDTH='50%'>");
			writer.write("<H3 align='left'>"+comparison+" File 2</H3>");
			writer.write("<TEXTAREA ID='text2' STYLE='width: 100%' ROWS=25>" );
			writer.write(finalData2);
			writer.write("</TEXTAREA>");
			writer.write("</TD>");
			writer.write("</TR></TABLE>");
			writer.write("<H3></H3>");
			writer.write("<P><INPUT TYPE='' SIZE=3 MAXLENGTH=5 VALUE='' ID='timeout' hidden> </P>");
			writer.write("<H3></H3>");
			writer.write("<DL>");
			writer.write("<DT><INPUT TYPE='radio' NAME='' ID='semantic' CHECKED hidden>");
			writer.write("<LABEL FOR='semantic'></LABEL></DT>");
			writer.write("<DD></DD>");
			writer.write("<DT><INPUT TYPE='radio' NAME='' ID='efficiency' hidden>");
			writer.write("<LABEL FOR='efficiency'></LABEL>");
			writer.write("<INPUT TYPE='text' SIZE=3 MAXLENGTH=5 VALUE='4' ID='editcost' hidden>");
			writer.write("<DD></DD>");
			writer.write("<DT><INPUT TYPE='radio' NAME='cleanup' ID='raw' hidden>");
			writer.write("<LABEL FOR='raw'></LABEL></DT>");
			writer.write("<DD></DD>");
			writer.write("</DL>");
			writer.write("<P><INPUT TYPE='button' onClick='launch()' VALUE='Compare Difference'></P>");
			writer.write("</FORM>");
			writer.write("<DIV ID='outputdiv'></DIV>");
			writer.write("</BODY>");
			writer.write("</HTML>");
			writer.flush();
			writer.close();

		}catch(Exception e){
			e.printStackTrace();
			Reporters.failureReport("Invalid Selection", "Invalid file selection");
			System.out.println("invalid File selection");
		}
	}

	/**
	 * Used to create a detailed report for type 2 reports
	 * @throws Exception
	 */
	public static void createDetailedReport() throws Exception {
		String[] s = BaseUtil.timeStamp().split(":");
		for (int i = 0; i < s.length - 1; i++) {
			startedAt = startedAt + "-" + s[i];
		}

		startedAt = startedAt.substring(1, startedAt.length());
		startedAt = startedAt.replace(" ", "_");
		workingDir = System.getProperty("user.dir")
				.replace(File.separator, "/");
		File file = new File(BaseUtil.filePath() + "/" + "Results_"
				+ BaseUtil.timeStampBeforeSutie + ".html");

		Writer writer = new FileWriter(file, true);
		writer.write("<HTML>");
		writer.write("<BODY>");
		writer.write("<script> document.addEventListener('DOMContentLoaded', function() {"
				+ "var url = document.URL; var id = url.split('#'); document.getElementById(id[1]).style.display='inline';"
				+ "}, false); </script>");

		writer.write("<TABLE border=0 cellSpacing=1 cellPadding=1 width='100%'>");
		writer.write("<TR background='file:///" + workingDir + "/Logos/"
				+ configProps.getProperty("Client_background") + ".png' alt='"
				+ configProps.getProperty("Client_background")
				+ "' height='85' width='100'><TD align='center'> </TD>");

		writer.write("<TABLE border=0 cellSpacing=1 cellPadding=1 width='95%'>");
		writer.write("<tr><TD align='center'><H4 align='center'><font color='#000000' face='Monotype Corsiva' color='#000000' size=6.5><b>Detailed report</b></H4></TD>");
		writer.write("<TD align='right'> </TD></TR>");

		writer.write("</TABLE>");
		writer.write("</BODY>");
		writer.write("</HTML>");
		writer.flush();
		writer.close();
	}

	/**
	 * Creates summary report for type 2 report
	 * @throws Exception
	 */
	@SuppressWarnings("rawtypes")
	public static void createHtmlSummaryReport() throws Exception {

		Property configProps = new Property("config.properties");
		File file = new File(BaseUtil.filePath() + "/" + "SummaryResults_"+ BaseUtil.timeStamp + ".html");// "SummaryReport.html"
		Writer writer = null;

		workingDir = System.getProperty("user.dir").replace(File.separator, "/");

		BaseUtil.testresultPath = workingDir + "/"+ file.toString().replace(File.separator, "/");

		if (file.exists()) {
			file.delete();
		}
		// Create Summary report first table
		writer = new FileWriter(file, true);
		try {
			writer.write("<HTML>");
			writer.write("<HEAD>");

			writer.write("<BODY >");

			writer.write("<TABLE border=0 cellSpacing=1 cellPadding=1 width='100%'>");
			writer.write("<TR background='file:///" + workingDir + "/Logos/"
					+ configProps.getProperty("Client_background") + ".png' alt='"
					+ configProps.getProperty("Client_background")
					+ "' height='85' width='100'><TD align='center'> </TD>");
			//writer.write("<TD align='right'> </TD></TR>");

			writer.write("<TABLE border=0 cellSpacing=1 cellPadding=1 width='95%'>");
			writer.write("<tr><TD align='center'><H4 align='center'><font color='#000000' face='Monotype Corsiva' color='#000000' size=6.5><b>Execution Summary Report</b></H4></TD>");
			writer.write("<TD align='right'> </TD></TR>");

			writer.write("<TABLE border=1 align='center' cellSpacing=1 cellPadding=1 width='50%' font='arial'>");
			writer.write("<tr><td width=150 align='left' bgcolor='FFFFFF'><FONT COLOR='#000000' FACE='arial' SIZE=2><b>Build Version</b></td>");
			writer.write("<td width=150 align='left' color='#000000'><FONT FACE='arial' SIZE=2><b>"
					+ configProps.getProperty("BuildVersion") + "</b></td></tr>");
			writer.write("<tr><td width=150 align='left' bgcolor='FFFFFF'><FONT COLOR='#000000' FACE='arial' SIZE=2><b>Run ID</b></td>");
			writer.write("<td width=150 align='left' color='#000000'><FONT FACE='arial' SIZE=3><b>"
					+ configProps.getProperty("RunID") + "</b></td></tr>");
			writer.write("<tr><td width=150 align='left' bgcolor='FFFFFF'><FONT COLOR='#000000' FACE='arial' SIZE=2><b>Run Date&Time</b></td>");
			writer.write("<td width=150 align='left' color='#000000'><FONT FACE='arial' SIZE=2><b>"
					+BaseUtil.timeStamp() + "</b></td></tr>");
			writer.write("</table><hr/>");

			writer.write("<DIV style='padding:20px;margin:5px;'>"
					+ "<DIV style='float:left'>"
					+ "<DIV>"
					+ "<TABLE border=1 cellSpacing=1 cellPadding=1 width='100%' font='arial'>");
			writer.write("<tr><td colspan='2' align='center' bgcolor='FFCC99'><FONT COLOR='#000000' FACE='arial' SIZE=3><b>Environment</b></td></tr>");
			writer.write("<tr><td width=150 align='left' bgcolor='FFFFFF'><FONT COLOR='#000000' FACE='arial' SIZE=2><b>Host Name</b></td>");
			writer.write("<td width=150 align='left' color='#000000'><FONT FACE='arial' SIZE=2><b>"
					+ BaseUtil.getHostName() + "</b></td></tr>");
			writer.write("<tr><td width=150 align='left' bgcolor='FFFFFF'><FONT COLOR='#000000' FACE='arial' SIZE=2><b>OS Name</b></td>");
			writer.write("<td width=150 align='left' color='#000000'><FONT FACE='arial' SIZE=2><b>"
					+ System.getProperty("os.name") + "</b></td></tr>");
			writer.write("<tr><td width=150 align='left' bgcolor='FFFFFF'><FONT COLOR='#000000' FACE='arial' SIZE=2><b>OS Version</b></td>");
			writer.write("<td width=150 align='left' color='#000000'><FONT FACE='arial' SIZE=2><b>"
					+ System.getProperty("os.version") + "</b></td></tr>");
			writer.write("</TABLE>" + "</DIV></br>");

			// Create Summary report Second table
			writer.write("<DIV>");
			writer.write("<TABLE border=1 cellSpacing=1 cellPadding=1 width='100%' font='arial'>");
			writer.write("<TR><TD colspan='2' align='center' bgcolor='FFCC99'><FONT COLOR='#000000' FACE='arial' SIZE=3><b>Execution Status</b></TD></TR>");

			Iterator<Entry<String, String>> iterator = map.entrySet()
					.iterator();
			pCount = 0;
			fCount = 0;
			while (iterator.hasNext()) {
				Map.Entry mapEntry = (Map.Entry) iterator.next();
				String value = mapEntry.getValue().toString();
				BaseUtil.testresult = mapEntry.getValue().toString();
				if (value.equals("PASS")) {
					pCount += 1;
				} else {
					fCount += 1;
				}

				writer.write("</tr>");
			}

			writer.write("<tr>");
			writer.write("<tr><td width=150 align='left' bgcolor='FFFFFF'><FONT COLOR='#000000' FACE='arial' SIZE=2><b>Suite</b></td>");
			writer.write("<td width=150 align='left'><FONT FACE='arial' SIZE=2><b>"
					+ currentSuit + "</b></td></tr>");
			writer.write("<tr><td width=150 align='left'bgcolor='FFFFFF' ><FONT COLOR='#000000' FACE='arial' SIZE=2><b>No. of  Scripts Executed</b></td>");
			writer.write("<td width=150 align='left' color='#000000'><FONT FACE='arial' SIZE=2><b>"
					+ map.size() + "</b></td></tr>");
			writer.write("<tr>");
			writer.write("<tr><td width=150 align='left' bgcolor='FFFFFF'><FONT COLOR='#000000' FACE='arial' SIZE=2><b>No. of  Scripts Passed</b></td>");
			writer.write("<td width=150 align='left' color='#000000'><FONT FACE='arial' SIZE=2><b>"
					+ pCount + "</b></td></tr>");
			writer.write("<tr>");
			writer.write("<tr><td width=150 align='left'bgcolor='FFFFFF'><FONT COLOR='#000000' FACE='arial' SIZE=2><b>No. of  Scripts Failed</b></td>");
			writer.write("<td width=150 align='left'color='red' ><FONT FACE='arial' SIZE=2><b>"
					+ fCount + "</b></td></tr>");

			writer.write("<TR><td width=150 align='left'bgcolor='FFFFFF'><FONT COLOR='#000000' FACE='arial' SIZE=2><b>Suite Execution Time</b></td>");// Newly
			for (int j = 0; j < currentTimeList.size(); j++) {
				timeStamp1 	= (currentTimeList.get(currentTimeList.size()-1)-currentTimeList.get(0))/1000;			
			}
			// for
			// Report
			writer.write("<TD width=150 align='left'color='red' ><FONT FACE='arial' SIZE=2><b>"
					+ timeStamp1 + " secs" + "</b></TD></TR>");
			writer.write("</TR>" + "</TABLE>" + "</DIV></br>");

			// Create Summary report third table
			writer.write("<DIV>");
			writer.write("<TABLE border=1 cellSpacing=1 cellPadding=1 width='170%' font='arial'>");
			writer.write("<tr><td colspan='3' align='center' bgcolor='FFCC99'><FONT COLOR='#000000' FACE='arial' SIZE=3><b>Summary Report</b></td></tr>");
			writer.write("<td align='center'><FONT COLOR='#000000' FACE='arial' SIZE=2><b>Test Case</b></td>"
					+ "<td align='center'><FONT COLOR='#000000' FACE='arial' SIZE=2><b>Browser Selected</b></td>"
					+ "<td align='center'><FONT COLOR='#000000' FACE='arial' SIZE=2><b>Status</b></td>");

			Iterator<Entry<String, String>> iterator1 = map.entrySet()
					.iterator();

			while (iterator1.hasNext()) {

				Map.Entry mapEntry1 = (Map.Entry) iterator1.next();
				key = mapEntry1.getKey().toString().split(":");
				String b1 = (String)key[1];
				String sBrowser1 = b1.toString().split(",")[1];
				String sBrowser2 = b1.toString().split(",")[2];
				String timeStamp = b1.toString().split(",")[2];
				String value = (String) mapEntry1.getValue();
				writer.write("<tr>");

				writer.write("<td><FONT color=#000000 size=2 face=arial><B>"
						+ key[1].split(",")[0] + "</B></td>");

				writer.write("<td><FONT color=#000000 size=2 face=arial><B>"
						+ sBrowser1 + "</B></td>");

				if (value.equals("PASS")) {
					writer.write("<TD width='30%' bgcolor=green align=center><FONT color=white size=2 face=arial><B><a href='Results_"
							+ timeStamp
							+ ".html#"
							+ key[1]
									+ "'>"
									+ value
									+ "</a></B></td>");
				} else {
					writer.write("<TD width='30%' bgcolor=red align=center><FONT color=white size=2 face=arial><B><a href='Results_"
							+ timeStamp
							+ ".html#"
							+ key[1]
									+ "'>"
									+ value
									+ "</a></B></td>");
				}

				writer.write("</tr>");
			}
			writer.write("</table>");

			writer.write("</DIV>");
			writer.write("</DIV>");

			if (configProps.getProperty("PieChartEnable").equalsIgnoreCase(
					"True")) {
				writer.write("<script type='text/javascript' src='piecanvas.js'></script>");
				writer.write("<script type='text/javascript' src='https://www.google.com/jsapi'></script>");
				writer.write("<script type='text/javascript'>"
						+ "google.load('visualization', '1', {packages:['corechart']});"
						+ "google.setOnLoadCallback(drawChart);"
						+ "function drawChart() {"
						+ "var data = google.visualization.arrayToDataTable(["
						+ "['Status', 'Count'],"
						+ "['PASS',     "
						+ pCount
						+ "],"
						+ "['FAIL',      "
						+ fCount
						+ "]"
						+ "]);"
						+ "var options = {"
						+ "title: 'Test Cases Status Chart',"
						+ "is3D: true,"
						+ "chartArea : {left:0,top:0,width:'100%',height:'100%'},"
						+ "colors:['green','red','blue'],};"
						+ "var chart = new google.visualization.PieChart(document.getElementById('piechart'));"
						+ "chart.draw(data, options);" + "}</script>");

				// pie chart

				writer.write("<DIV style='float:right; padding-right:50px;'>");
				writer.write("<colspan='2' align='right'><FONT COLOR='#000000' FACE='arial' SIZE=2>");
				writer.write("<DIV id='piechart' style='padding:50px 10px 10px 80px;'></DIV>"
						+ "</DIV>");

				writer.write("<DIV style=clear:both;'></DIV>" + "</DIV>");

			}
			writer.write("</BODY></HTML>");
			writer.flush();
			writer.close();
			// map.clear();

		} catch (Exception e) {
			e.printStackTrace();
			writer.flush();
			writer.close();
		}

	}

	/**
	 * This method is used to create a report file in the project path
	 * @throws Exception
	 */
	public static void htmlCreateReport() throws Exception {
		long startStepTime = System.currentTimeMillis(); // For Step start time
		// map.clear();
		File file = new File(BaseUtil.filePath() + "Results_" + BaseUtil.timeStampBeforeSutie
				+ ".html");// "Results.html"
		if (file.exists()) {
			file.delete();
		}
	}

	/**
	 * This method is used to generate the success report for type 2 reports
	 * @param strStepName
	 * @param strStepDes
	 * @throws IOException 
	 */
	public static void onSuccess(String strStepName,String strStepDes) throws IOException{
		Property configProps=new Property("config.properties");
		File file = new File(BaseUtil.filePath() + "/" + "Results_"	+ BaseUtil.timeStampBeforeSutie + ".html");// "SummaryReport.html"
		Writer writer = null;
		try{
			writer = new FileWriter(file,true); 
			if(configProps.getProperty("OnSuccessScreenshot").equalsIgnoreCase("True"))
			{
				if(configProps.getProperty("sucessScreenShots").equals("no")){
					writer.write("<tr><TD width='300px'><FONT color=#000000 size=2 face=arial>" + strStepName
							+ " </td><TD width='600px'><FONT color=#000000 size=2 face=arial>" + strStepDes + "</td>"//replaced strStepName instead of strStepDes 
							+ " </td><TD width='100px' bgcolor=green align=center><FONT color=white size=2 face=arial><B>" + "Passed" + "</td></tr>");
				}
				else{
					writer.write("<tr><TD width='300px'><FONT color=#000000 size=2 face=arial>" + strStepName+"</td><TD width='600px'><FONT color=#000000 size=2 face=arial>" + strStepDes + "</td>"//replaced strStepName instead of strStepDes 
							+ " </td><TD width='100px' bgcolor=green align=center><FONT color=white size=2 face=arial><B><a href="+strStepName.replace(" ", "_").replace(":", "_")+"_"+BaseUtil.timeStamp+".jpeg>" + "Passed" + "</a></td></tr>");
				}		
			}
			else{
				if(configProps.getProperty("sucessScreenShots").equalsIgnoreCase("no")){
					if("".equalsIgnoreCase(strStepDes))
						writer.write("<tr><td colspan=3 bgcolor=#FFD391><B><CENTER>" + strStepName + "</CENTER></B></td></tr>");
					else
						writer.write("<tr><TD width='300px'><FONT color=#000000 size=2 face=arial>" + strStepName
								+ " </td><TD width='600px'><FONT color=#000000 size=2 face=arial>" + strStepDes + "</td>"
								+ " </td><TD width='100px' bgcolor=green align=center><FONT color=white size=2 face=arial><B>"+  "Passed" + "</td></tr>");
				}
				else{
					if("".equalsIgnoreCase(strStepDes))
						writer.write("<tr><td colspan=3 bgcolor=#FFD391><B><CENTER>" + strStepName + "</CENTER></B></td></tr>");
					else
						writer.write("<tr><TD width='300px'><FONT color=#000000 size=2 face=arial>" + strStepName
								+ " </td><TD width='600px'><FONT color=#000000 size=2 face=arial>" + strStepDes + "</td>"
								+ " </td><TD width='100px' bgcolor=green align=center><FONT color=white size=2 face=arial><B><a href="+strStepName.replace(" ", "_").replace(":", "_")+"_"+BaseUtil.timeStamp+".jpeg>" + "Passed" + "</a></td></tr>");
				}
			}
			writer.flush();
			writer.close();

			if(!map.get(packageName+":"+tc_name).equals("FAIL"))
			{
				map.put(packageName+":"+tc_name, "PASS");
			}
			tcEndTime = System.currentTimeMillis();
			endStepTime = System.currentTimeMillis(); //For Step End time			
			stepExecutionTime = (endStepTime - startStepTime)/1000.000;	//For Step wise execution time	
			writer.write("<TD align=center><FONT color=#000000 size=2 face=arial><B>" + stepExecutionTime +" secs" +"</B></FONT></TD>"+"</TR>");
		}
		catch(Exception e){

		}
	}

	/**
	 * This method is used to generate the step report for all type of reports
	 * @param strStepName
	 * @param strStepDes
	 * @throws IOException 
	 */
	public static void onSuccessStepReport(String strStepName, String strStepDes) throws IOException {

		File file = new File(BaseUtil.filePath() + "/" + "Results_"	+ BaseUtil.timeStampBeforeSutie + ".html");// "SummaryReport.html"
		Writer writer = null;
		try {
			writer = new FileWriter(file, true);
			writer.write("<tr class='content2'>");
			writer.write("<td colspan=5 class='Pass' ><b>" + strStepName + "<b/></td>");
			BaseUtil.calculateStepExecutionTime();
			writer.write("</tr> ");
			writer.flush();
			writer.close();
			BaseUtil.calculateStepStartTime();
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * This method is used to generate the Failure report for type 2 reports
	 * @param strStepName
	 * @param strStepDes
	 * @throws IOException 
	 */
	public static void onFailure(String strStepName, String strStepDes) throws IOException {
		File file = new File(BaseUtil.filePath() + "/" + "Results_"
				+ BaseUtil.timeStampBeforeSutie + ".html");// "SummaryReport.html"
		Writer writer = null;

		try {
			writer = new FileWriter(file, true);
			writer.write("<tr><TD width='300px'><FONT color=#000000 size=2 face=arial><B>"
					+ strStepName
					+ " </b></td><TD width='600px'><FONT color=#000000 size=2 face=arial><B>"
					+ strStepDes
					+ "</B></td>"
					+ " </td><TD width='100px' bgcolor=red align=center><FONT color=white size=2 face=arial><B><a href="
					+ strStepName.replace(" ", "_").replace(":", "_")
					.replace("</br>", "_")
					+ "_"
					+ BaseUtil.timeStamp
					+ ".jpeg>" + "Failed" + "</a></td></tr>");

			writer.flush();
			writer.close();

			map.put(packageName + ":" + tc_name, "FAIL");
			tcEndTime = System.currentTimeMillis();
			endStepTime = System.currentTimeMillis(); // For Step End time
			stepExecutionTime = (endStepTime - startStepTime) / 1000.000; // For
			// Step wise execution time
			writer.write("<TD align=center><FONT color=#000000 size=2 face=arial><B>"
					+ stepExecutionTime
					+ " secs"
					+ "</B></FONT></TD>"
					+ "</TR>");
		} catch (Exception e) {

		}
	}

	/**
	 * This method is used to Create a heading in the html reports file
	 * @param strTestName
	 */
	public static void testHeader(String strTestName) {
		Writer writer = null;
		try {

			File file = new File(BaseUtil.filePath() + "Results_" + BaseUtil.timeStampBeforeSutie
					+ ".html");// "Results.html"
			writer = new FileWriter(file, true);
			writer.write("<div name='"
					+ tc_name
					+ "'><TABLE style='margin-left:157px' id = '"
					+ tc_name
					+ "' border=1 cellSpacing=1 cellPadding=1 width='80%' font='arial'>");
			writer.write("<tr ><td colspan=3><H4 align=center><FONT color=black size=4 face=arial><B>"
					+ strTestName + "</B></H4></td></tr>");
			writer.write("<tr><TD bgColor='FFFFFF' width='100px' align=middle><FONT color='#000000' size=2 face='arial'><B>Step</b></td>"
					+ "<TD bgColor='FFFFFF' width='200px' align=middle><FONT color=#000000 size=2 face=arial><B>"
					+ "Description</b></td>"
					+ "<TD bgColor='FFFFFF'  align=middle><FONT color=#000000 size=2 face=arial><B>Status</b></td></tr></div>");
			map.put(packageName + ":" + tc_name, "status");
		} catch (Exception e) {

		} finally {
			try {
				writer.flush();
				writer.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

/*################################################# Methods related to Type 1 reports################################*************/

	/**
	 * Creates html summary report for type 1 reports
	 * @throws Exception
	 */
	public static void createHtmlSummaryReport1() throws Exception {
		workingDir = System.getProperty("user.dir")
				.replace(File.separator, "/");
		File file = new File(BaseUtil.filePath() + "/" + "SummaryResults_"
				+ BaseUtil.timeStamp + ".html");// "SummaryReport.html"
		Writer writer = null;

		if (file.exists()) {
			file.delete();
		}
		writer = new FileWriter(file, true);
		try {
			writer.write("<!DOCTYPE html>");
			writer.write("<html> ");
			writer.write("<head> ");
			writer.write("<meta charset='UTF-8'> ");
			writer.write("<title>Elsevier SIMChart - Automation Execution Results Summary</title>");

			writer.write("<style type='text/css'>");
			writer.write("body {");
			writer.write("background-color: #FFFFFF; ");
			writer.write("font-family: Verdana, Geneva, sans-serif; ");
			writer.write("text-align: center; ");
			writer.write("} ");

			writer.write("small { ");
			writer.write("font-size: 0.7em; ");
			writer.write("} ");

			writer.write("table { ");
			writer.write("box-shadow: 9px 9px 10px 4px #BDBDBD;");
			writer.write("border: 0px solid #4D7C7B;");
			writer.write("border-collapse: collapse; ");
			writer.write("border-spacing: 0px; ");
			writer.write("width: 1000px; ");
			writer.write("margin-left: auto; ");
			writer.write("margin-right: auto; ");
			writer.write("} ");

			writer.write("tr.heading { ");
			writer.write("background-color: #041944;");
			writer.write("color: #FFFFFF; ");
			writer.write("font-size: 0.7em; ");
			writer.write("font-weight: bold; ");
			writer.write("background:-o-linear-gradient(bottom, #999999 5%, #000000 100%);	background:-webkit-gradient( linear, left top, left bottom, color-stop(0.05, #999999), color-stop(1, #000000) );");
			writer.write("background:-moz-linear-gradient( center top, #999999 5%, #000000 100% );");
			writer.write("filter:progid:DXImageTransform.Microsoft.gradient(startColorstr=#999999, endColorstr=#000000);	background: -o-linear-gradient(top,#999999,000000);");
			writer.write("} ");

			writer.write("tr.subheading { ");
			writer.write("background-color: #6A90B6;");
			writer.write("color: #000000; ");
			writer.write("font-weight: bold; ");
			writer.write("font-size: 0.7em; ");
			writer.write("text-align: justify; ");
			writer.write("} ");

			writer.write("tr.section { ");
			writer.write("background-color: #A4A4A4; ");
			writer.write("color: #333300; ");
			writer.write("cursor: pointer; ");
			writer.write("font-weight: bold;");
			writer.write("font-size: 0.8em; ");
			writer.write("text-align: justify;");
			writer.write("background:-o-linear-gradient(bottom, #56aaff 5%, #e5e5e5 100%);	background:-webkit-gradient( linear, left top, left bottom, color-stop(0.05, #56aaff), color-stop(1, #e5e5e5) );");
			writer.write("background:-moz-linear-gradient( center top, #56aaff 5%, #e5e5e5 100% );");
			writer.write("filter:progid:DXImageTransform.Microsoft.gradient(startColorstr=#56aaff, endColorstr=#e5e5e5);	background: -o-linear-gradient(top,#56aaff,e5e5e5);");

			writer.write("} ");

			writer.write("tr.subsection { ");
			writer.write("cursor: pointer; ");
			writer.write("} ");

			writer.write("tr.content { ");
			writer.write("background-color: #FFFFFF; ");
			writer.write("color: #000000; ");
			writer.write("font-size: 0.7em; ");
			writer.write("display: table-row; ");
			writer.write("} ");

			writer.write("tr.content2 { ");
			writer.write("background-color:#;E1E1E1");
			writer.write("border: 1px solid #4D7C7B;");
			writer.write("color: #000000; ");
			writer.write("font-size: 0.7em; ");
			writer.write("display: table-row; ");
			writer.write("} ");

			writer.write("td, th { ");
			writer.write("padding: 5px; ");
			writer.write("border: 1px solid #4D7C7B; ");
			writer.write("text-align: inherit\0/; ");
			writer.write("} ");

			writer.write("th.Logos { ");
			writer.write("padding: 5px; ");
			writer.write("border: 0px solid #4D7C7B; ");
			writer.write("text-align: inherit /;");
			writer.write("} ");

			writer.write("td.justified { ");
			writer.write("text-align: justify; ");
			writer.write("} ");

			writer.write("td.pass {");
			writer.write("font-weight: bold; ");
			writer.write("color: green; ");
			writer.write("} ");

			writer.write("td.fail { ");
			writer.write("font-weight: bold; ");
			writer.write("color: red; ");
			writer.write("} ");

			writer.write("td.done, td.screenshot { ");
			writer.write("font-weight: bold; ");
			writer.write("color: black; ");
			writer.write("} ");

			writer.write("td.debug { ");
			writer.write("font-weight: bold; ");
			writer.write("color: blue; ");
			writer.write("} ");

			writer.write("td.warning { ");
			writer.write("font-weight: bold; ");
			writer.write("color: orange; ");
			writer.write("} ");
			writer.write("</style> ");


			writer.write("<script> ");
			writer.write("function toggleMenu(objID) { ");
			writer.write(" if (!document.getElementById) return;");
			writer.write(" var ob = document.getElementById(objID).style; ");
			writer.write("if(ob.display === 'none') { ");
			writer.write(" try { ");
			writer.write(" ob.display='table-row-group';");
			writer.write("} catch(ex) { ");
			writer.write("	 ob.display='block'; ");
			writer.write("} ");
			writer.write("} ");
			writer.write("else { ");
			writer.write(" ob.display='none'; ");
			writer.write("} ");
			writer.write("} ");
			writer.write("function toggleSubMenu(objId) { ");
			writer.write("for(i=1; i<10000; i++) { ");
			writer.write("var ob = document.getElementById(objId.concat(i)); ");
			writer.write("if(ob === null) { ");
			writer.write("break; ");
			writer.write("} ");
			writer.write("if(ob.style.display === 'none') { ");
			writer.write("try { ");
			writer.write(" ob.style.display='table-row'; ");
			writer.write("} catch(ex) { ");
			writer.write("ob.style.display='block'; ");
			writer.write("} ");
			writer.write(" } ");
			writer.write("else { ");
			writer.write("ob.style.display='none'; ");
			writer.write("} ");
			writer.write(" } ");
			writer.write("} ");
			writer.write("</script> ");
			writer.write("</head> ");

			writer.write("<body> ");
			writer.write("</br>");

			writer.write("<table id='Logos'>");
			writer.write("<colgroup>");
			writer.write("<col style='width: 25%' />");
			writer.write("<col style='width: 25%' />");
			writer.write("<col style='width: 25%' />");
			writer.write("<col style='width: 25%' />");
			writer.write("</colgroup> ");
			writer.write("<thead> ");

			writer.write("<tr class='content'>");
			writer.write("<th class ='Logos' colspan='2' align='left'>");
			writer.write("<img src='file:///" + workingDir + "/Logos/"+ configProps.getProperty("Client_logo") + ".png' height='70%'>");
			writer.write("</th>");
			writer.write("<th class = 'Logos' colspan='2' align='right'> ");
			writer.write("<img src='file:///" + workingDir + "/Logos/cigniti.png' height='70%' >");
			writer.write("</th> ");
			writer.write("</tr> ");

			writer.write("</thead> ");
			writer.write("</table> ");

			writer.write("<table id='header'> ");
			writer.write("<colgroup> ");
			writer.write("<col style='width: 40%' /> ");
			writer.write("<col style='width: 60%' /> ");
			writer.write("</colgroup> ");

			writer.write("<thead> ");

			writer.write("<tr class='heading'> ");
			writer.write("<th colspan='2' style='font-family:Copperplate Gothic Bold; font-size:1.4em;'> ");
			writer.write("Automation Execution Result Summary");
			writer.write("</th> ");
			writer.write("</tr> ");
			writer.write("<tr class='subheading'> ");
			writer.write("<th>&nbsp;Build Version&nbsp;&nbsp;</th> ");
			writer.write("<th> &nbsp;"+configProps.getProperty("BuildVersion")+"&nbsp;</th> ");
			writer.write("</tr> ");
			writer.write("<tr class='subheading'> ");
			writer.write("<th>&nbsp;Date&nbsp;&&nbsp;Time&nbsp;&nbsp;</th> ");
			writer.write("<th> &nbsp;"+BaseUtil.timeStamp()+"&nbsp;</th> ");
			writer.write("</tr> ");
			writer.write("<tr class='subheading'> ");
			writer.write("<th>&nbsp;OS Name&nbsp;&nbsp;</th> ");
			writer.write("<th> &nbsp;"+System.getProperty("os.name")+"&nbsp;</th> ");
			writer.write("</tr> ");
			writer.write("<tr class='subheading'> ");
			writer.write("<th>&nbsp;Suite Executed&nbsp;&nbsp;</th> ");
			writer.write("<th> &nbsp;Regression &nbsp;</th> ");
			writer.write("</tr> ");
			writer.write("<tr class='subheading'> ");
			writer.write("<th>&nbsp;Suite Name&nbsp;</th> ");
			writer.write("<th> &nbsp;"+currentSuit+"&nbsp;</th> ");
			writer.write("</tr> ");
			writer.write("<tr class='subheading'> ");
			writer.write("<th colspan='2' align='left'> ");
			writer.write("&nbsp;Environment  -  " + configProps.getProperty("URL") + "");
			writer.write("</th> ");
			writer.write("</tr> ");
			writer.write("</thead> ");
			writer.write("</table> ");
			writer.write("<table id='main'> ");
			writer.write("<colgroup> ");
			writer.write("<col style='width: 5%' /> ");
			writer.write("<col style='width: 47%' /> ");
			writer.write("<col style='width: 30%' /> ");
			writer.write("<col style='width: 10%' /> ");
			writer.write("<col style='width: 8%' /> ");
			writer.write("</colgroup> ");
			writer.write("<thead> ");
			writer.write("<tr class='heading'> ");
			writer.write("<th>S.NO</th> ");
			writer.write("<th>Test Case</th> ");
			writer.write("<th>Browser</th> ");
			writer.write("<th>Time</th> ");
			writer.write("<th>Status</th> ");
			writer.write("</tr> ");
			writer.write("</thead> ");
			Iterator<Entry<String, String>> iterator1 = map.entrySet()
					.iterator();
			
			int serialNo = 1;
			int count=HtmlReporters.list.size();
			while (iterator1.hasNext()) {
				@SuppressWarnings("rawtypes")
				Map.Entry mapEntry1 = (Map.Entry) iterator1.next();
				key = mapEntry1.getKey().toString().split(":");
				String b1 = (String)key[1];
				System.out.println(b1);
				String sBrowser = b1.toString().split(",")[1];// modified from 1 to 2
				String timeStamp = b1.toString().split(",")[2];// modified from 2 to 3
				String value = (String) mapEntry1.getValue();
				String methodname=b1.toString().split(",")[0].replace(" ", "_");
				
				writer.write("<tbody style='font-size:18px'> ");
				writer.write("<tr class='content2' > ");
				writer.write("<td class='justified' align='center'>" + serialNo + "</td>");
				if (value.equalsIgnoreCase("pass")) {
					writer.write("<td class='justified'><a href='Results_"
							+ HtmlReporters.tcextimelist.get(serialNo-1)
							+ ".html#"
							+ b1.toString().split(",")[0]
									+ "'>"
									+ b1.toString().split(",")[0]
											+ "</a>"
											+ "</td>");
				} else if (value.equalsIgnoreCase("fail")) {
					writer.write("<td class='justified'><a href='Results_"
							+ HtmlReporters.tcextimelist.get(serialNo-1)
							+ ".html#"
							+ b1.toString().split(",")[0]
									+ "'>"
									+ b1.toString().split(",")[0]
											+ "</a>"
											+ "</td>");
				}
				else{
					writer.write("<td class='justified'>"+b1.toString().split(",")[0]+"</td>");
				}
			//System.out.print(HtmlReporters.list.get(serialNo-1));
				double execution=(HtmlReporters.list.get(serialNo-1));
				String tcName = b1.toString().split(",")[0];
				writer.write("<td class='justified'>" + sBrowser+ "</td>");
				writer.write("<td>" + execution + " Seconds</td>");
				//writer.write("<td>" + executionTime.get(b1)+ " Seconds</td>");
				if(value.equals("PASS"))
				{
					writer.write("<td class='pass'>"+value+"</td> ");
					pCount++;
				}
				else if(value.equals("FAIL"))
				{
					writer.write("<td class='fail'>"+value+"</td> ");
					fCount++;
				}
				else 
				{
					writer.write("<td class='fail'>Not Executed</td> ");
					fCount++;
				}
				writer.write("</tr>");

				writer.write("</tbody> ");
				serialNo = serialNo + 1;	
			}
			/*if (config.getProperty("PieChartEnable").equalsIgnoreCase(
					"True")) {
				writer.write("<script type='text/javascript' src='piecanvas.js'></script>");
				writer.write("<script type='text/javascript' src='https://www.google.com/jsapi'></script>");
				writer.write("<script type='text/javascript'>"
						+ "google.load('visualization', '1', {packages:['corechart']});"
						+ "google.setOnLoadCallback(drawChart);"
						+ "function drawChart() {"
						+ "var data = google.visualization.arrayToDataTable(["
						+ "['Status', 'Count'],"
						+ "['PASS',     "
						+ pCount
						+ "],"
						+ "['FAIL',      "
						+ fCount
						+ "]"
						+ "]);"
						+ "var options = {"
						+ "title: 'Test Cases Status Chart',"
						+ "is3D: true,"
						+ "chartArea : {left:0,top:0,width:'100%',height:'100%'},"
						+ "colors:['green','red','blue'],};"
						+ "var chart = new google.visualization.PieChart(document.getElementById('piechart'));"
						+ "chart.draw(data, options);" + "}</script>");

				// pie chart

				writer.write("<DIV style='float:right; padding-right:50px;'>");
				writer.write("<colspan='2' align='center'><FONT COLOR='#000000' FACE='arial' SIZE=2>");
				writer.write("<DIV id='piechart' style='padding:50px 10px 10px 80px;color:#99ccff' ></DIV>"
						+ "</DIV>");

				writer.write("<DIV style=clear:both;'></DIV>" + "</DIV>");
			}*/
			writer.flush();
			writer.close();
			
			closeSummaryReport1(serialNo);
		} catch (Exception e) {
			
		}

	}


	/**
	 * Creates html report header summary report for type 1 reports
	 * @param testName
	 */
	public static void testHeader1(String testName) {
		Writer writer = null;
		try {
			workingDir = System.getProperty("user.dir")
					.replace(File.separator, "/");
			strTestName = testName.split(":")[1].trim().replace(" ", "_");
			//File file = new File(BaseUtil.filePath() + "Results_" + BaseUtil.timeStampBeforeSutie+ ".html");// "Results.html"
			//File file = new File(BaseUtil.filePath() + strTestName + BaseUtil.timeStampBeforeSutie+ ".html");
			File file = new File(BaseUtil.filePath() + "Results_" + HtmlReporters.iStartTime+ ".html");
			writer = new FileWriter(file, true);

			writer.write("<!DOCTYPE html> ");
			writer.write("<html>");
			writer.write("<head> ");
			writer.write("<meta charset='UTF-8'> ");
			writer.write("<title>" + testName
					+ " Execution Results</title> ");

			writer.write("<style type='text/css'> ");
			writer.write("body { ");
			writer.write("background-color: #FFFFFF; ");
			writer.write("font-family: Verdana, Geneva, sans-serif; ");
			writer.write("text-align: center; ");
			writer.write("} ");

			writer.write("small { ");
			writer.write("font-size: 0.7em; ");
			writer.write("} ");

			writer.write("table { ");
			writer.write("box-shadow: 9px 9px 10px 4px #BDBDBD;");
			writer.write("border: 0px solid #4D7C7B; ");
			writer.write("border-collapse: collapse; ");
			writer.write("border-spacing: 0px; ");
			writer.write("width: 1000px; ");
			writer.write("margin-left: auto; ");
			writer.write("margin-right: auto; ");
			writer.write("} ");

			writer.write("tr.heading { ");
			writer.write("background-color: #041944; ");
			writer.write("color: #FFFFFF; ");
			writer.write("font-size: 0.7em; ");
			writer.write("font-weight: bold; ");
			writer.write("background:-o-linear-gradient(bottom, #999999 5%, #000000 100%);	background:-webkit-gradient( linear, left top, left bottom, color-stop(0.05, #999999), color-stop(1, #000000) );");
			writer.write("background:-moz-linear-gradient( center top, #999999 5%, #000000 100% );");
			writer.write("filter:progid:DXImageTransform.Microsoft.gradient(startColorstr=#999999, endColorstr=#000000);	background: -o-linear-gradient(top,#999999,000000);");
			writer.write("} ");

			writer.write("tr.subheading { ");
			writer.write("background-color: #FFFFFF; ");
			writer.write("color: #000000; ");
			writer.write("font-weight: bold; ");
			writer.write("font-size: 0.7em; ");
			writer.write("text-align: justify; ");
			writer.write("} ");

			writer.write("tr.section { ");
			writer.write("background-color: #A4A4A4; ");
			writer.write("color: #333300; ");
			writer.write("cursor: pointer; ");
			writer.write("font-weight: bold; ");
			writer.write("font-size: 0.7em; ");
			writer.write("text-align: justify; ");
			writer.write("background:-o-linear-gradient(bottom, #56aaff 5%, #e5e5e5 100%);	background:-webkit-gradient( linear, left top, left bottom, color-stop(0.05, #56aaff), color-stop(1, #e5e5e5) );");
			writer.write("background:-moz-linear-gradient( center top, #56aaff 5%, #e5e5e5 100% );");
			writer.write("filter:progid:DXImageTransform.Microsoft.gradient(startColorstr=#56aaff, endColorstr=#e5e5e5);	background: -o-linear-gradient(top,#56aaff,e5e5e5);");
			writer.write("} ");

			writer.write("tr.subsection { ");
			writer.write("cursor: pointer; ");
			writer.write("} ");

			writer.write("tr.content { ");
			writer.write("background-color: #FFFFFF; ");
			writer.write("color: #000000; ");
			writer.write("font-size: 0.7em; ");
			writer.write("display: table-row; ");
			writer.write("} ");

			writer.write("tr.content2 { ");
			writer.write("background-color: #E1E1E1; ");
			writer.write("border: 1px solid #4D7C7B;");
			writer.write("color: #000000; ");
			writer.write("font-size: 0.75em; ");
			writer.write("display: table-row; ");
			writer.write("} ");

			writer.write("tr.content3 { ");
			writer.write("background-color: #E1E1E1; ");
			writer.write("border: 1px solid #4D7C7B;");
			writer.write("color: #000000; ");
			writer.write("font-size: 0.75em; ");
			writer.write("display: table-row; ");
			writer.write("} ");
			
			writer.write("td, th { ");
			writer.write("padding: 5px; ");
			writer.write("border: 1px solid #4D7C7B; ");
			writer.write("text-align: inherit\0/; ");
			writer.write("} ");

			writer.write("th.Logos { ");
			writer.write("padding: 5px; ");
			writer.write("border: 0px solid #4D7C7B; ");
			writer.write("text-align: inherit /;");
			writer.write("} ");

			writer.write("td.justified { ");
			writer.write("text-align: justify; ");
			writer.write("} ");

			writer.write("td.pass { ");
			writer.write("font-weight: bold; ");
			writer.write("color: green; ");
			writer.write("} ");

			writer.write("td.fail { ");
			writer.write("font-weight: bold; ");
			writer.write("color: red; ");
			writer.write("} ");

			writer.write("td.done, td.screenshot { ");
			writer.write("font-weight: bold; ");
			writer.write("color: black; ");
			writer.write("} ");

			writer.write("td.debug { ");
			writer.write("font-weight: bold;");
			writer.write("color: blue; ");
			writer.write("} ");

			writer.write("td.warning { ");
			writer.write("font-weight: bold; ");
			writer.write("color: orange; ");
			writer.write("} ");
			writer.write("</style> ");

			writer.write("<script> ");
			writer.write("function toggleMenu(objID) { ");
			writer.write("if (!document.getElementById) return; ");
			writer.write("var ob = document.getElementById(objID).style; ");
			writer.write("if(ob.display === 'none') { ");
			writer.write("try { ");
			writer.write("ob.display='table-row-group'; ");
			writer.write("} catch(ex) { ");
			writer.write("ob.display='block'; ");
			writer.write("} ");
			writer.write("} ");
			writer.write("else { ");
			writer.write("ob.display='none'; ");
			writer.write("} ");
			writer.write("} ");
			writer.write("function toggleSubMenu(objId) { ");
			writer.write("for(i=1; i<10000; i++) { ");
			writer.write("var ob = document.getElementById(objId.concat(i)); ");
			writer.write("if(ob === null) { ");
			writer.write("break; ");
			writer.write("} ");
			writer.write("if(ob.style.display === 'none') { ");
			writer.write("try { ");
			writer.write("ob.style.display='table-row'; ");
			writer.write("} catch(ex) { ");
			writer.write("ob.style.display='block'; ");
			writer.write("} ");
			writer.write("} ");
			writer.write("else { ");
			writer.write("ob.style.display='none'; ");
			writer.write("} ");
			writer.write("} ");
			writer.write("} ");
			writer.write("</script> ");
			writer.write("</head> ");

			writer.write(" <body> ");
			writer.write("</br>");

			writer.write("<table id='Logos'>");
			writer.write("<colgroup>");
			writer.write("<col style='width: 25%' />");
			writer.write("<col style='width: 25%' />");
			writer.write("<col style='width: 25%' />");
			writer.write("<col style='width: 25%' />");
			writer.write("</colgroup> ");
			writer.write("<thead> ");


			writer.write("<tr class='content'>");
			writer.write("<th class ='Logos' colspan='2' align='left'>");
			writer.write("<img src='file:///" + workingDir + "/Logos/"+ configProps.getProperty("Client_logo") + ".png' height='70%'>");
			writer.write("</th>");
			writer.write("<th class = 'Logos' colspan='2' align='right'> ");
			writer.write("<img src='file:///" + workingDir + "/Logos/cigniti.png' height='70%' >");
			writer.write("</th> ");
			writer.write("</tr> ");
			writer.write("</thead> ");
			writer.write("</table> ");

			writer.write("<table id='header'> ");
			writer.write("<colgroup> ");
			writer.write("<col style='width: 25%' /> ");
			writer.write("<col style='width: 25%' /> ");
			writer.write("<col style='width: 25%' /> ");
			writer.write("<col style='width: 25%' /> ");
			writer.write("</colgroup> ");

			writer.write(" <thead> ");

			writer.write("<tr class='heading'> ");
			writer.write("<th colspan='4' style='font-family:Copperplate Gothic Bold; font-size:1.4em;'> ");
			writer.write("**" + strTestName + "**");
			writer.write("</th> ");
			writer.write("</tr> ");
			writer.write("<tr class='subheading'> ");
			writer.write("<th>&nbsp;Date&nbsp;&&nbsp;Time&nbsp;&nbsp;</th> ");

			writer.write("<th>" + BaseUtil.timeStamp()
					+ "</th> ");
			writer.write("<th>&nbsp;Browser&nbsp;&nbsp;</th> ");
			writer.write("<th>"
					+(tc_name.split(",")[1])+ "</th> ");
			writer.write("</tr> ");
			writer.write("</thead> ");
			writer.write("</table> ");

			writer.write("<table id='main'> ");
			writer.write("<colgroup> ");
			writer.write("<col style='width: 5%' /> ");
			writer.write("<col style='width: 26%' /> ");
			writer.write("<col style='width: 51%' /> ");
			writer.write("<col style='width: 8%' /> ");
			writer.write("<col style='width: 10%' /> ");
			writer.write("</colgroup> ");
			writer.write("<thead> ");
			writer.write("<tr class='heading'> ");
			writer.write("<th>S.NO</th> ");
			writer.write("<th>Steps</th> ");
			writer.write("<th>Description</th> ");
			writer.write("<th>Status</th> ");
			writer.write("<th>Time in sec</th> ");
			writer.write("</tr> ");
			writer.write("</thead> ");
			map.put(packageName + ":" + tc_name, "status");
			
		} catch (Exception e) {

		} finally {
			try {
				//writer.flush();
				writer.close();
			} catch (Exception e) {

			}
		}
	}

	/**
	 * Creates success reports for type 1 reports
	 * @param strStepName
	 * @param strStepDes
	 * @throws IOException 
	 */
	public static void onSuccess1(String strStepName, String strStepDes) throws IOException {
		File file = new File(BaseUtil.filePath() + "/" + "Results_"	+ HtmlReporters.iStartTime + ".html");
		//File file = new File(BaseUtil.filePath() + "/" + "Results_"	+ HtmlReporters.startTime(); + ".html");// "SummaryReport.html"
		//File file = new File(BaseUtil.filePath() + "/" + "Results_"	+ BaseUtil.timeStampBeforeSutie + ".html");// "SummaryReport.html"
		Writer writer = null;
		BaseUtil.iStepNo = BaseUtil.iStepNo + 1;

		try {
			if (!map.get(packageName + ":" + tc_name).equals("FAIL")) {
				map.put(packageName + ":" + tc_name, "PASS");
			}
			writer = new FileWriter(file, true);
			writer.write("<tr class='content2' >");
			writer.write("<td>" + BaseUtil.iStepNo + "</td> ");
			writer.write("<td class='justified'>" + strStepName + "</td>");
			writer.write("<td class='justified'>" + strStepDes + "</td> ");
			if(configProps.getProperty("sucessScreenShots").equalsIgnoreCase("true")){
				writer.write("<td class='Pass' align='center'><a  href="
						+ strStepName.replace(" ", "_").replace(":", "_").replace("</br>", "_")+"_"+BaseUtil.timeStamp+".jpeg>"
						+"<img  src='file:///" + workingDir + "/Logos/passed.ico' width='18' height='18'/></a></td> ");
			}else{
				writer.write("<td class='Pass' align='center'><img  src='file:///" + workingDir + "/Logos/passed.ico' width='18' height='18'/></td> ");
			}
			intPassNum  =intPassNum + 1;
			BaseUtil.calculateStepExecutionTime();
			writer.write("<td>" + iStepExecutionTime + "</td> ");
			writer.write("</tr> ");
			//writer.flush();
			writer.close();
			BaseUtil.calculateStepStartTime();
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * Creates failure reports for type 1 reports
	 * @param strStepName
	 * @param strStepDes
	 */
	public static void onFailure1(String strStepName, String strStepDes) {
		Writer writer = null;
		try {
			File file = new File(BaseUtil.filePath() + "/" + "Results_"	+ HtmlReporters.iStartTime + ".html");// "SummaryReport.html"
			writer = new FileWriter(file, true);
			BaseUtil.iStepNo = BaseUtil.iStepNo + 1;

			writer.write("<tr class='content2' >");
			writer.write("<td>" +BaseUtil.iStepNo+ "</td> ");
			writer.write("<td class='justified'>" + strStepName + "</td>");
			writer.write("<td class='justified'>" + strStepDes + "</td> ");
			intFailNum = intFailNum + 1;
			
			writer.write("<td class='Fail' align='center'><a  href="
					+ strStepName.replace(" ", "_").replace(":", "_").replace("</br>", "_")+"_"+BaseUtil.timeStamp+".jpeg>"
					+ "<img  src='file:///" + workingDir + "/Logos/failed.ico' width='18' height='18'/></a></td>");

			BaseUtil.calculateStepExecutionTime();
			writer.write("<td>" + iStepExecutionTime + "</td> ");
			writer.write("</tr> ");
			//writer.flush();
			writer.close();
			BaseUtil.calculateStepExecutionTime();
			map.put(packageName + ":" + tc_name, "FAIL");
			
		} catch (Exception e) {

		}

	}

	/**
	 * used to close the instance of the z report
	 * @throws IOException 
	 */
	public static void closeDetailedReport1() throws IOException {

		File file = new File(BaseUtil.filePath() + "/" + "Results_"
				+ BaseUtil.timeStampBeforeSutie + ".html");
		Writer writer = null;

		try {
			writer = new FileWriter(file, true);
			writer.write("</table>");
			writer.write("<table id='footer'>");
			writer.write("<colgroup>");
			writer.write("<col style='width: 20%' />");
			writer.write("<col style='width: 14%' />");
			writer.write("<col style='width: 20%' />");
			writer.write("<col style='width: 13%' />");
			writer.write("<col style='width: 20%' />");
			writer.write("<col style='width: 13%' />");
			writer.write("</colgroup>");
			writer.write("<tfoot>");
			writer.write("<tr class='heading'> ");
			writer.write("<th colspan='6'>Execution Time In Seconds (Includes Report Creation Time) : "
					+ executionTime.get(tc_name)+ "&nbsp;</th> ");
			writer.write("</tr> ");
			writer.write("<tr class='content' style='font-size:12px'>");
			writer.write("<td class='pass'>&nbsp;Steps Executed&nbsp;</td>");
			writer.write("<td class='pass'> " + BaseUtil.iStepNo
					+ "</td>");
			writer.write("<td class='pass'>&nbsp;Steps Passed&nbsp;</td>");
			writer.write("<td class='pass'> " + intPassNum
					+ "</td>");
			writer.write("<td class='fail'>&nbsp;Steps Failed&nbsp;</td>");
			writer.write("<td class='fail'>" + intFailNum
					+ "</td>");
			writer.write("</tr>");
			//writer.flush();
			writer.close();
			intPassNum=0;
			intFailNum=0;
		} catch (Exception e) {

		}
	}

	/**
	 * used to close the instance of the summary report
	 * @throws IOException 
	 */
	public static void closeSummaryReport1(int iSerialNo) throws IOException {
		File file = new File(BaseUtil.filePath() + "/" + "SummaryResults_"
				+ BaseUtil.timeStamp + ".html");
		Writer writer = null;
		try {
			writer = new FileWriter(file, true);
			
			writer.write("<table id='footer'>");
			writer.write("<colgroup>");
			writer.write("<col style='width: 20%' />");
			writer.write("<col style='width: 14%' />");
			writer.write("<col style='width: 20%' />");
			writer.write("<col style='width: 13%' />");
			writer.write("<col style='width: 20%' /> ");
			writer.write("<col style='width: 13%' /> ");
			writer.write("</colgroup> ");
			writer.write("<tfoot>");
			writer.write("<tr class='heading'>");
			for (int j = 0; j < currentTimeList.size(); j++) {
				timeStamp1 	= (currentTimeList.get(currentTimeList.size()-1)-currentTimeList.get(0))/1000;			
			}
			writer.write("<th colspan='6'>Total Duration  In Seconds (Including Report Creation) : "
					+ timeStamp1 + "</th>");
			writer.write("</tr>");
			writer.write("<tr class='content' style='font-size:12px'>");
			writer.write("<td class='pass'>&nbsp;Total TestCases&nbsp;</td>");
			writer.write("<td class='pass'> " + (iSerialNo-1)
					+ "</td> ");
			writer.write("<td class='pass'>&nbsp;Tests Passed&nbsp;</td>");
			writer.write("<td class='pass'> " + pCount
					+ "</td> ");
			writer.write("<td class='fail'>&nbsp;Tests Failed&nbsp;</td>");
			writer.write("<td class='fail'> " + fCount
					+ "</td> ");
			writer.write("</tr>");
			writer.write("</tfoot>");
			writer.write("</table> ");
			//writer.flush();
			writer.close(); 
		}catch (Exception e) {

		}
	}


}

