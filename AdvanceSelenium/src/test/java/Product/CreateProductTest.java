package Product;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;
import java.util.Random;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Generic_Utility.BaseClass;
import Generic_Utility.Excel_Utility;
import Generic_Utility.File_Utility;
import Generic_Utility.Java_Utility;
import Generic_Utility.WebDriver_Utility;
import pom.CreateProductPage;
import pom.HomePage;
import pom.LoginPage;

public class CreateProductTest extends BaseClass {
	
@Test(groups = "smokeTest")
	public void CreateProductTest() throws Throwable {
//		WebDriver driver = new ChromeDriver();
//		File_Utility flib = new File_Utility();
		Java_Utility jlib = new Java_Utility();
		Excel_Utility elib = new Excel_Utility();
//		WebDriver_Utility wlib = new WebDriver_Utility();
		
//		wlib.maximizeWindow(driver);
//		wlib.waitPageToLoad(driver);
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//		 FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\vtiger.properties");
//		    
//		    //step2:create an object to properties class to load all the key
//		    Properties pro = new Properties();
//		    pro.load(fis);
//		    
//		    //step3:read the value using getProperty()
//		    String URL = pro.getProperty("url");
//		    String USERNAME = pro.getProperty("username");
//		    String PASSWORD = pro.getProperty("password");

		// Reading it from generic_utility package

		
//		String URL = flib.getPropertiesData("url");
//		String USERNAME = flib.getPropertiesData("username");
//		String PASSWORD = flib.getPropertiesData("password");

		
//		driver.get(URL);
//		LoginPage loginPage = new LoginPage(driver);
//		loginPage.loginToApp(USERNAME, PASSWORD);
//		driver.findElement(By.name("user_name")).sendKeys(USERNAME);
//		driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
//		driver.findElement(By.id("submitButton")).click();

		// Click on Product link
		HomePage home = new HomePage(driver);
		home.clickProdLink();
		
		CreateProductPage prdPage = new CreateProductPage(driver);
		prdPage.clickPrdHookUp();
//		driver.findElement(By.linkText("Products")).click();
//		driver.findElement(By.cssSelector("[alt=\"Create Product...\"]")).click();

//		Random ran=new Random();
//		int ranNum = ran.nextInt(1000);

		// calling from generic_utility class
		
		int ranNum = jlib.getRandomNum();

//		FileInputStream excl = new FileInputStream(
//				"C:\\Users\\arpit\\eclipse-workspace\\AdvanceSelenium\\src\\test\\resources\\TestData.xlsx");
//
//		// step2:-keeping the excel file in read mode
//		Workbook book = WorkbookFactory.create(excl);
//
//		// step3:- get the control the Sheet-1
//		Sheet sheet = book.getSheet("Sheet4");
//
//		// step4:- get the control the Row
//		Row row = sheet.getRow(0);
//
//		// step5:- get the control the cell
//		Cell cel = row.getCell(0);
//
//		// step6:- Reading cell value
//		String prdName = cel.getStringCellValue() + ranNum;
//		System.out.println(prdName);
		
	
		String prdName = elib.getExcelData("Sheet4", 0, 0) + ranNum;
		System.out.println(prdName);
      //  Assert.assertEquals(false, true);
		Thread.sleep(2000);
		prdPage.enterPrdName(prdName);
		prdPage.clickSaveButton();
		
//		driver.findElement(By.name("productname")).sendKeys(prdName);
//		driver.findElement(By.xpath("//input[@title=\"Save [Alt+S]\"]")).click();

		// logout from app

		Thread.sleep(2000);
//		home.signOutApp(driver);
//		driver.findElement(By.xpath("//img[@src=\"themes/softed/images/user.PNG\"]")).click();
//		driver.findElement(By.linkText("Sign Out")).click();
	}

}
