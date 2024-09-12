package DDT;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadingDataFromWxcelUsingDataFormatter {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//step1 : give connection between the physical file and test scr
		FileInputStream fis = new FileInputStream("C:\\Users\\arpit\\eclipse-workspace\\AdvanceSelenium\\src\\test\\resources\\TestData.xlsx");
		
		//step2: Keep excel file in read mode
		Workbook book = WorkbookFactory.create(fis);
		
		//step3:taking control of the excel sheet
		Sheet sheet = book.getSheet("Sheet1");
		
		
		//step4: taking control of the row
		Row row = sheet.getRow(0);
		
		//step5:taking control of the cel
		Cell cel = row.getCell(3);
		
		DataFormatter format = new DataFormatter();
		String ExcelData = format.formatCellValue(cel);
		System.out.println(ExcelData);

	}

}
