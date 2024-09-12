package Campagin;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Generic_Utility.BaseClass;
import Generic_Utility.Excel_Utility;
import Generic_Utility.File_Utility;
import Generic_Utility.Java_Utility;
import Generic_Utility.WebDriver_Utility;
import pom.CreateCampaignPage;
import pom.CreateProductPage;
import pom.HomePage;
import pom.LoginPage;
import pom.WindowSwitingToProductPage;

public class CampaginProductTest extends BaseClass {

@Test(groups = "regressionTest")
	public void CampaginProductTest() throws Throwable {
	
		
		Java_Utility jlib = new Java_Utility();
		Excel_Utility elib = new Excel_Utility();
		WebDriver_Utility wlib=new WebDriver_Utility();
		File_Utility flib = new File_Utility();
//		wlib.maximizeWindow(driver);
//		wlib.waitPageToLoad(driver);
		
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

//		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\vtiger.properties");
//
//		// step2:create an object to properties class to load all the key
		//Properties pro = new Properties();
	
//
//		// step3:read the value using getProperty()
//		String URL = pro.getProperty("url");
//		String USERNAME = pro.getProperty("username");
//		String PASSWORD = pro.getProperty("password");

		// Reading it from generic_utility package

	
//		String URL = flib.getPropertiesData("url");
//		String USERNAME = flib.getPropertiesData("username");
//		String PASSWORD = flib.getPropertiesData("password");
//
//		LoginPage login = new LoginPage(driver);
//		driver.get(URL);
//		login.loginToApp(USERNAME, PASSWORD);
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

//		Random ran = new Random();
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
	

		String prdName = elib.getExcelData("Sheet4", 0, 0)+ranNum;
		System.out.println(prdName);
		
		Thread.sleep(2000);
		prdPage.enterPrdName(prdName);
		prdPage.clickSaveButton();
//		driver.findElement(By.name("productname")).sendKeys(prdName);
//		driver.findElement(By.xpath("//input[@title=\"Save [Alt+S]\"]")).click();

		
		home.clickMoreLink();
		home.clickCampaignLink();
		
		CreateCampaignPage campPage = new CreateCampaignPage(driver);
		campPage.clickCampHookUpButton();
		

//		driver.findElement(By.linkText("Campaigns")).click();
//
//		driver.findElement(By.xpath("//img[@alt='Create Campaign...']")).click();

		// TO avoid Duplicates
		jlib.getRandomNum();
		
//		Random rand = new Random();
//		int randNum = rand.nextInt(1000);

		// calling from generic_utility class
//				Java_Utility jlib1 = new Java_Utility();
//				int ranNum1 = jlib1.getRandomNum();

		// -----------------------------------------------------------------------------------------------------------
		// Navigating to campaigns module
		
//		FileInputStream fes1 = new FileInputStream(
//				"C:\\Users\\arpit\\eclipse-workspace\\AdvanceSelenium\\src\\test\\resources\\TestData.xlsx");
//		// step2:-keep excel file in read mode
//		Workbook book1 = WorkbookFactory.create(fes1);
//
//		// step3:-taking Control of the excel sheet
//		Sheet sheet1 = book1.getSheet("Campaign");
//
//		// step4:-taking Control of the rows
//		Row row1 = sheet1.getRow(0);
//
//		// step5:-taking Control of the cell
//		Cell cel1 = row1.getCell(0);
//
//		String campName = cel1.getStringCellValue() + ranNum;
//		System.out.println(campName);
		
		
		String campName = elib.getExcelData("Campaign", 0, 0)+ranNum;
		System.out.println(campName);
		campPage.sendCampName(campName);
		campPage.clickProductPlusSign();
		
		

//		driver.findElement(By.name("campaignname")).sendKeys(campName);
//		driver.findElement(By.xpath("//img[@alt=\"Select\"]")).click();

//		Set<String> allWin = driver.getWindowHandles(); // win1,win2
//
//		Iterator<String> it = allWin.iterator();
//		while (it.hasNext()) {
//			String win = it.next();
//			driver.switchTo().window(win);
//			String currentTitle = driver.getTitle();
//
//			if (currentTitle.contains("Products&action")) {
//				break;
//			}
//		}
		
		wlib.switchingWindows(driver, "Products&action");
		
		WindowSwitingToProductPage campPrdPage = new WindowSwitingToProductPage(driver);
		campPrdPage.enterProductName(prdName);
		campPrdPage.searchPrdName();
		campPrdPage.prdNamePresent(driver, prdName);
		wlib.switchingWindows(driver, "Campaigns&action");
		campPage.clickOnSaveButton();
		
//		driver.findElement(By.name("search_text")).sendKeys(prdName);
//		driver.findElement(By.xpath("//input[@type=\"button\"]")).click();

//		driver.findElement(By.xpath("//a[text()='" + prdName + "']")).click();
//
//		wlib.switchingWindows(driver, "Campaigns&action");
		
		
//		Set<String> allWin1 = driver.getWindowHandles(); // win1,win2
//
//		Iterator<String> it1 = allWin1.iterator();
//		while (it1.hasNext()) {
//			String win1 = it1.next();
//			driver.switchTo().window(win1);
//			String currentTitle = driver.getTitle();
//
//			if (currentTitle.contains("Campaigns&action")) {
//				break;
//			}
//		}
//		driver.findElement(By.xpath("//input[@title=\"Save [Alt+S]\"]")).click();
//
//		driver.findElement(By.xpath("//img[@src=\"themes/softed/images/user.PNG\"]")).click();
//		driver.findElement(By.linkText("Sign Out")).click();

		Thread.sleep(2000);

	}

}
