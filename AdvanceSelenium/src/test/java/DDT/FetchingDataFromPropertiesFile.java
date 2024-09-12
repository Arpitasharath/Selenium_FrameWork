package DDT;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchingDataFromPropertiesFile {

	public static void main(String[] args) throws Throwable {
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    
  //Reading data from External Resource---->Properties File
    
    //step1:get the java representation object of the physical file
    FileInputStream fis = new FileInputStream("./src/test/resources/commonData.properties");
    
    //step2:create an object to properties class to load all the key
    Properties pro = new Properties();
    pro.load(fis);
    
    //step3:read the value using getProperty()
    String URL = pro.getProperty("url");
    String USERNAME = pro.getProperty("username");
    String PASSWORD = pro.getProperty("password");
    
    driver.get(URL);
	driver.findElement(By.name("user-name")).sendKeys(USERNAME);
	driver.findElement(By.id("password")).sendKeys(PASSWORD);
	driver.findElement(By.id("login-button")).click();
    
	}

}
