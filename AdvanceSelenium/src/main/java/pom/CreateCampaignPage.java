package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateCampaignPage {
	
	public CreateCampaignPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindAll({@FindBy(xpath="//img[@alt='Create Campaign...']"),@FindBy(css="//img[@alt='Create Campaign...']")})
	private WebElement campHookUpImg;
	
	@FindBy(name="campaignname")
	private WebElement campaignName;
	
	public WebElement getCampaignName() {
		return campaignName;
	}

	@FindBy(xpath="//img[@alt=\"Select\"]")
	private WebElement prdPlusSign;
	
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement saveButton;
	

	public WebElement getCampHookUpImg() {
		return campHookUpImg;
	}

	public WebElement getClickSaveButton() {
		return saveButton;
	}

	
	public void clickCampHookUpButton()
	{
		campHookUpImg.click();
	}
	
	public void sendCampName(String Name)
	{
		campaignName.sendKeys(Name);
	}
	
	public void clickOnSaveButton()
	{
		saveButton.click();
	}
	
	public void clickProductPlusSign()
	{
		prdPlusSign.click();
	}

}
