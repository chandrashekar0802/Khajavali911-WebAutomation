package com.cigniti.automation.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;


import jxl.Sheet;
import jxl.Workbook;


import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;




public class ExcelLib 
{
	public static Sheet wrkSheetObj;
	public static Workbook wrkBookObj =null;
	public static Sheet objInputSheet =null;
	/**
	 * 
	 * @param inputDataFilePath
	 * @param SheetName
	 * @return
	 * @throws Exception
	 */
	public static  Sheet getSheetObject(String inputDataFilePath, String SheetName) throws Exception{
		FileInputStream file = new FileInputStream(new File(inputDataFilePath));
		Workbook wrkBookObj =  Workbook.getWorkbook(file); 
		Sheet wrkSheetObj= wrkBookObj.getSheet(SheetName);		
		return wrkSheetObj;
	}

	/**
	 * 
	 * @param sSheet
	 * @param sColumnName
	 * @param iRowCount
	 * @return
	 * @throws Exception
	 */
	public static String getSheetCellData(String sColumnName, int iRowCount) throws Exception{
		String cellData=null;
		int SheetColCount=objInputSheet.getColumns();
		for(int Colcnt=0;Colcnt<SheetColCount;Colcnt++)
		{
			if(( objInputSheet.getCell(Colcnt,0).getContents()).equals(sColumnName))
			{
				cellData=objInputSheet.getCell(Colcnt, iRowCount).getContents();
				return cellData;
			}			
		}				
		return null;
	}

	/**
	 * 
	 * @param inputSheetObj
	 * @param ColumnName
	 * @param row
	 * @return
	 * @throws Exception
	 */
	public String getSheetCellData(Sheet inputSheetObj, String ColumnName,int row) throws Exception
	{		
		String cellData=null;
		String cellDataFlag="False";
		int SheetColCount=inputSheetObj.getColumns();
		for(int Colcnt=0;Colcnt<SheetColCount;Colcnt++)
		{
			if((inputSheetObj.getCell(Colcnt,0).getContents()).equals(ColumnName))
			{
				cellData=inputSheetObj.getCell(Colcnt, row).getContents();
				cellDataFlag="True";
				//System.out.println("Column Match and data is  ="+inputSheetObj.getCell(Colcnt, row).getContents());
			}			
		}
		if(cellDataFlag.equals("False"))				
			System.out.println("Column Name: "+ColumnName+" doesn't exist in the sheet");
		return cellData;

	}

	/** Updates the Value present in the excel cell by using the sheetName.
	 * 
	 * @param rowNumber
	 * @param columnNumber
	 * @param path
	 * @param sheetIndex
	 * @param cellValueToUpdate
	 */
	@SuppressWarnings("resource")
	public void updateCellInSheet(int rowNumber,int columnNumber,String path, String sheetName, String cellValueToUpdate){
		try {
			File f = new File(path);
			FileInputStream ios = new FileInputStream(f);
			HSSFWorkbook workbook = new HSSFWorkbook(ios);
			HSSFSheet sheet = workbook.getSheet(sheetName);

			HSSFRow myRow = sheet.getRow(rowNumber);

			if (myRow == null)
				myRow = sheet.createRow(rowNumber);

			HSSFCell myCell = myRow.createCell(columnNumber);
			myCell.setCellValue(cellValueToUpdate);

			FileOutputStream fileOut = new FileOutputStream(path);
			workbook.write(fileOut);
			fileOut.flush();
			fileOut.close();

		}catch (Exception e) {
			System.out.println("Unable to update the cell. "+e);
			System.out.println();
			e.printStackTrace();
		}
	}
	
	public String getPermissions(Sheet inputSheetObj, String ColumnName,int row){
		String cellData=null;
		try{
			
			String cellDataFlag="False";
			int SheetColCount=inputSheetObj.getColumns();
			for(int Colcnt=0;Colcnt<SheetColCount;Colcnt++)
			{
				if((inputSheetObj.getCell(Colcnt,0).getContents()).equals(ColumnName))
				{
					cellData=inputSheetObj.getCell(Colcnt, row).getContents();
					cellDataFlag="True";
					//System.out.println("Column Match and data is  ="+inputSheetObj.getCell(Colcnt, row).getContents());
				}			
			}
			if(cellDataFlag.equals("False"))				
				System.out.println("Column Name: "+ColumnName+" doesn't exist in the sheet");
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return cellData;
	
	}
	
	
	
}
