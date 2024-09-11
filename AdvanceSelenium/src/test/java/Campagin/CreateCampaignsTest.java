package Campagin;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
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
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Generic_Utility.BaseClass;
import Generic_Utility.Excel_Utility;
import Generic_Utility.File_Utility;
import Generic_Utility.Java_Utility;
import Generic_Utility.WebDriver_Utility;
import pom.CreateCampaignPage;
import pom.HomePage;
import pom.LoginPage;

public class CreateCampaignsTest extends BaseClass{

@Test(groups = "smokeTest")

	public void CreateCampaignsTest() throws Throwable {

		
		File_Utility flib = new File_Utility();
		Java_Utility jlib = new Java_Utility();
		Excel_Utility elib = new Excel_Utility();
		WebDriver_Utility wlib = new WebDriver_Utility();
//		wlib.maximizeWindow(driver); 
//		wlib.waitPageToLoad(driver);
//		
		
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// lOGIN TO VTIGER APP
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
//
//		
//		driver.get(URL);
//		LoginPage login = new LoginPage(driver);
//		login.loginToApp(USERNAME, PASSWORD);
		
//		driver.findElement(By.name("user_name")).sendKeys(USERNAME);
//		driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
		//driver.findElement(By.id("submitButton")).click();

		//WebElement link = driver.findElement(By.linkText("More"));
		
		HomePage link = new HomePage(driver);
		link.clickMoreLink();
		link.clickCampaignLink();
		
		
//		wlib.moveToElementAction(driver,Link);
//		
//		Actions act = new Actions(driver);
//		act.moveToElement(moreLink).click().perform();

		CreateCampaignPage campPage = new CreateCampaignPage(driver);
		campPage.clickCampHookUpButton();
		
		
//		driver.findElement(By.linkText("Campaigns")).click();
//
//		driver.findElement(By.xpath("//img[@alt='Create Campaign...']")).click();

		// TO avoid Duplicates
//					Random ran = new Random();
//					int ranNum = ran.nextInt(1000);

		
		int ranNum = jlib.getRandomNum();

//		FileInputStream fes = new FileInputStream(
//				"C:\\Users\\arpit\\eclipse-workspace\\AdvanceSelenium\\src\\test\\resources\\TestData.xlsx");
//		// step2:-keep excel file in read mode
//		Workbook book = WorkbookFactory.create(fes);
//
//		// step3:-taking Control of the excel sheet
//		Sheet sheet = book.getSheet("Campaign");
//
//		// step4:-taking Control of the rows
//		Row row = sheet.getRow(0);
//
//		// step5:-taking Control of the cell
//		Cell cel = row.getCell(0);
//
//		String campName = cel.getStringCellValue() + ranNum;
//		System.out.println(campName);
		
	
		String campName = elib.getExcelData("Campaign", 0, 0) + ranNum;
		System.out.println(campName);
		
		campPage.sendCampName(campName);
		campPage.clickOnSaveButton();
//		driver.findElement(By.name("campaignname")).sendKeys(campName);
//
//		// to click on save button
//		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();

		// To logout from Application
		Thread.sleep(2000);
//		driver.findElement(By.xpath("//img[@src=\"themes/softed/images/user.PNG\"]")).click();
//		driver.findElement(By.linkText("Sign Out")).click();
//		HomePage home = new HomePage(driver);
//		home.signOutApp(driver);
	}

}