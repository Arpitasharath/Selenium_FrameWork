package DDT;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class taskAmazonlinks {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//Step1:- give Connection between the physical file and test script
		FileInputStream fis = new FileInputStream("C:\\Users\\arpit\\eclipse-workspace\\AdvanceSelenium\\src\\test\\resources\\TestData.xlsx");

		//step2:-keep excel file in read mode
		Workbook book = WorkbookFactory.create(fis);
	
	   //step3:-taking Control of the excel sheet
		Sheet sheet = book.getSheet("Sheet2");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
		List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
	
        for (int i = 0; i < allLinks.size(); i++)
		{
        	String link = allLinks.get(i).getAttribute("href");

            // Print the link in the console
            System.out.println(link);

            // Write the link to the Excel file
            Row row = sheet.createRow(i);
            Cell cell = row.createCell(0);
            cell.setCellValue(link);
		}
		
		FileOutputStream fos = new FileOutputStream("C:\\Users\\arpit\\eclipse-workspace\\AdvanceSelenium\\src\\test\\resources\\TestData.xlsx");
		book.write(fos);
		book.close();
		
		driver.quit();
	}

}
