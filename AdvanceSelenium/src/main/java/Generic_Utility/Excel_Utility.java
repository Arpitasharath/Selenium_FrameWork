package Generic_Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Random;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_Utility {
	
	/**
	 * This method is used to read data from excel file
	 * @param sheet
	 * @param rowNum
	 * @param celNum
	 * @return
	 * @throws Throwable
	 * @author arpita
	 */
	
		public  String getExcelData(String sheetName,int rowNum,int cellNum) throws Throwable
		{
			 FileInputStream fis2 = new FileInputStream("C:\\Users\\arpit\\eclipse-workspace\\AdvanceSelenium\\src\\test\\resources\\TestData.xlsx");
	  	   
	         //step2:-open workbook in read mode
	  	Workbook book= WorkbookFactory.create(fis2);
	  	
	  	  //step3:-get the control of the Sheet
	  	Sheet sheet = book.getSheet(sheetName);
	  	
	  	//step4:- get control of the row
	  	Row row = sheet.getRow(rowNum);
	  	
	  	//step5:- get control of the cell
	  	Cell cell = row.getCell(cellNum);
	  	
	  	String ExcelData = cell.getStringCellValue();
		return ExcelData;
		}
		
		public String getExcelDataUsingFormatter(String sheetName,int rowNum, int cellNum) throws Throwable, IOException
	
{
			FileInputStream phn = new FileInputStream("C:\\Users\\arpit\\eclipse-workspace\\AdvanceSelenium\\src\\test\\resources\\TestData.xlsx");
			
			   //step2:-keeping the excel file in read mode
			Workbook book = WorkbookFactory.create(phn);
			
			    //step3:- get the control the Sheet-1
			Sheet sheet = book.getSheet(sheetName);
			
		    	//step4:- get the control the Row
			Row row = sheet.getRow(rowNum);
			
			    //step5:- get the control the cell
			Cell cell = row.getCell(cellNum);
			
			DataFormatter format=new DataFormatter();
			String phoneNum=format.formatCellValue(cell);
			System.out.println(phoneNum);
	        return sheetName;
			

}
		public Object[][] getDataProviderData (String sheetName) throws Throwable
		{
			FileInputStream fis= new FileInputStream("C:\\Users\\arpit\\eclipse-workspace\\AdvanceSelenium\\src\\test\\resources\\TestData.xlsx");
			Workbook book = WorkbookFactory.create(fis);
			Sheet sheet = book.getSheet(sheetName);
			int lastRow= sheet.getLastRowNum();
			int lastCell = sheet.getRow(0).getLastCellNum();
			
			Object[][] objArr = new Object[lastRow][lastCell];
			
			for (int i = 0; i <lastRow ; i++)
			{
			for (int j = 0; j <lastCell ; j++)
			{
				objArr[i][j]=sheet.getRow(i).getCell(j).toString();
			}	
			}
			
			return objArr;
			
			
		}
}
