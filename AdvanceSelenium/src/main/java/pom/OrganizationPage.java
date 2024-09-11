package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationPage 
{
	
public OrganizationPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
	
	@FindBy(xpath = "//img[@alt=\"Create Organization...\"]")
	private WebElement OrgPlusSign;

	public WebElement getOrgPlusSign() {
		return OrgPlusSign;
	}
	
	public void clickOrgPlusImg()
	{
		OrgPlusSign.click();
	}

}