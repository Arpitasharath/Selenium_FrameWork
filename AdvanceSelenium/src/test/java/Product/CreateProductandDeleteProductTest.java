package Product;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.List;
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
import org.testng.annotations.Test;

import Generic_Utility.BaseClass;
import Generic_Utility.Excel_Utility;
import Generic_Utility.File_Utility;
import Generic_Utility.Java_Utility;
import Generic_Utility.WebDriver_Utility;
import pom.CreateProductPage;
import pom.DeletePrdName;
import pom.HomePage;
import pom.LoginPage;

public class CreateProductandDeleteProductTest extends BaseClass {

@Test(groups = "smokeTest")
	public void CreateProductandDeleteProductTest()  throws Throwable {


		File_Utility flib = new File_Utility();
		Java_Utility jlib = new Java_Utility();
		Excel_Utility elib = new Excel_Utility();
		WebDriver_Utility wlib = new WebDriver_Utility();
		
//		wlib.maximizeWindow(driver);
//		wlib.waitPageToLoad(driver);
		
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\vtiger.properties");
//
//		// step2:create an object to properties class to load all the key
//		Properties pro = new Properties();
//		pro.load(fis);
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
//		driver.get(URL);
//		//using business login
//		LoginPage login = new LoginPage(driver);
//		login.loginToApp(USERNAME, PASSWORD);
//		driver.findElement(By.name("user_name")).sendKeys(USERNAME);
//		driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
//		driver.findElement(By.id("submitButton")).click();
		// Click on Product link
		
		HomePage home = new HomePage(driver);
		home.clickProdLink();

		CreateProductPage prdPage = new CreateProductPage(driver);
		prdPage.clickPrdHookUp();

		// calling from generic_utility class
		
		int ranNum = jlib.getRandomNum();

		
		String prdData = elib.getExcelData("Sheet4", 0, 0) + ranNum;
		System.out.println(prdData);
		
		prdPage.enterPrdName(prdData);
		prdPage.clickSaveButton();

		// Navigating to product table
		home.clickProdLink();

		// Dynamic xpath
		DeletePrdName deletePrd = new DeletePrdName(driver);
		deletePrd.selectPrdData(driver, prdData);
		
		//click on delete button
		deletePrd.clickonDeleteButton();
		
		//handling Alert popup(Accept)
		driver.switchTo().alert().accept();
		
		Thread.sleep(4000);
		deletePrd.validatePrdDeleted(driver, prdData);
//		home.logOutFromApp();

	}

}
