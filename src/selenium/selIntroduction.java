package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class selIntroduction {

	public static void main(String[] args) {
		
		//Invoking Browser
		//chrome -chromeDriver exten ->methods close get etc
		//WebDriver close get
		//WebDriver methods _ class methods
		
		//chromedriver.exe -> Chrome browser
		//step to invoke chrome driver or
		//selenium manager will by default invoke chrome driver
		System.setProperty("webdriver.chrome.driver", "/Users/arpit/OneDrive/Documents/chromedriver-win64/chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    
	    //Firefox
//	    System.setProperty("webdriver.gecko.driver", "/Users/arpit/OneDrive/Documents/chromedriver-win64/geckodriver.exe");
//	    WebDriver driver = new FirefoxDriver();
	    
	    //EdgeDriver
//	    System.setProperty("webdriver.edge.driver", "/Users/arpit/OneDrive/Documents/chromedriver-win64/msedgedriver.exe");
//	    WebDriver driver = new EdgeDriver();
	    
	    
	    driver.get("https://rahulshettyacademy.com");
	    System.out.println (driver.getTitle());
	    System.out.println(driver.getCurrentUrl());
	    driver.close();	 
//	    driver.quit();
	}

}
