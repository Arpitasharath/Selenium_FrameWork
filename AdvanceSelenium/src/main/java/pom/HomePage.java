package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Declartion
	
	@FindBy(linkText = "Organizations")
	private WebElement OrgLink;
	
	@FindBy(xpath = "//img[@src=\"themes/softed/images/user.PNG\"]")
	private WebElement AdminLink;
	
	@FindBy(xpath = "//a[text()='Sign Out']")
	private WebElement signOut;
	
	@FindBy(linkText="Products")
	private WebElement prodLink;
	
	@FindBy(linkText="More")
	private WebElement clickMore;
	
	@FindBy(linkText = "Campaigns")
	private WebElement campaignsLink;
	
	
	public WebElement getOrgLink() {
		return OrgLink;
	}

	public WebElement getAdminLink() {
		return AdminLink;
	}

	public WebElement getClickOnSignOut() {
		return signOut;
	}
	
	/**
	 * this method is used to sign out from application
	 * using mouse action/Hover
	 * @param driver
	 */
	public void signOutApp(WebDriver driver)
	{
		Actions act = new Actions(driver);
		act.moveToElement(AdminLink).perform();
		signOut.click();
		
	}
	
	 /**
     *  this method is used to click more link
     */
    public void clickMoreLink()
    {
    	clickMore.click();
    }
    
    /**
     *  this method is used to click campaign link
     */
    public void clickCampaignLink()
    {
    	campaignsLink.click();
    }
    

	
	 public void logOutFromApp()
	    {
		 AdminLink.click();
	     signOut.click();
	    }
	 
	 public void clickProdLink()
	 {
		 prodLink.click();
	 }
	 
}
