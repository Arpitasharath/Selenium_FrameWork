package Contacts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Generic_Utility.Excel_Utility;
import Generic_Utility.File_Utility;
import Generic_Utility.Java_Utility;
import Generic_Utility.WebDriver_Utility;

public class CreateContacts {
	//pull it
	public static void main(String[] args) throws Throwable {

		WebDriver driver = new ChromeDriver();
		File_Utility flib = new File_Utility();
		Excel_Utility elib = new Excel_Utility();
		Java_Utility jlib = new Java_Utility();
		WebDriver_Utility wlib = new WebDriver_Utility();

		wlib.maximizeWindow(driver);
		wlib.waitPageToLoad(driver);

		String URL = flib.getPropertiesData("url");
		String USERNAME = flib.getPropertiesData("username");
		String PASSWORD = flib.getPropertiesData("password");

		driver.get(URL);
		driver.findElement(By.name("user_name")).sendKeys(USERNAME);
		driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
		driver.findElement(By.id("submitButton")).click();

		driver.findElement(By.linkText("Organizations")).click();

		// click on lookup image
		driver.findElement(By.cssSelector("[alt=\"Create Organization...\"]")).click();

		int ranNum = jlib.getRandomNum();

		String orgName = elib.getExcelData("Sheet3", 0, 0) + ranNum;
		System.out.println(orgName);
		String phoneNum = elib.getExcelDataUsingFormatter("Sheet3", 0, 1);
		System.out.println(phoneNum);
		String email = elib.getExcelData("Sheet3", 0, 2);
		System.out.println(email);

		// create organization data
		driver.findElement(By.name("accountname")).sendKeys(orgName);
		driver.findElement(By.id("phone")).sendKeys(phoneNum);
		driver.findElement(By.id("email1")).sendKeys(email);
		driver.findElement(By.xpath("//input[@title=\"Save [Alt+S]\"]")).click();

		// -----------------------------Contacts Data------------

		Thread.sleep(2000);
		driver.findElement(By.linkText("Contacts")).click();

		driver.findElement(By.xpath("//img[@alt=\"Create Contact...\"]")).click();

		String lastname = elib.getExcelData("Sheet5", 0, 0) + ranNum;
		System.out.println(lastname);

		driver.findElement(By.name("lastname")).sendKeys(lastname);

		driver.findElement(By.xpath("(//img[@alt=\"Select\"])[1]")).click();

		driver.findElement(By.name("account_name")).sendKeys(orgName);

		wlib.switchingWindows(driver, "Accounts&action");

		driver.findElement(By.name("search_text")).sendKeys(orgName);
		driver.findElement(By.xpath("//input[@type=\"button\"]")).click();

		driver.findElement(By.xpath("//a[text()='" + orgName + "']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("((//img[@alt=\"Select\"])[2]")).click();
		
		wlib.switchingWindows(driver, "Contacts&action");
		

	}
}
