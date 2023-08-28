package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage
{
	public MyAccountPage(WebDriver driver)
	{
		super(driver);
	}
  
	
	@FindBy(xpath="//h2[normalize-space()='My Account']")
	WebElement HeadingMyAccount;
	
	@FindBy(xpath="//a[@class='list-group-item'][normalize-space()='Logout']")
	WebElement lnkLogout;
	
	
	public Boolean HeadingMyAccountIsExists()
	{
		try
		{
			return (HeadingMyAccount.isDisplayed());
		}
		catch(Exception e)
		{
			return (false);
		}
	}
	
	public void clicklnkLogout()
	{
		lnkLogout.click();
	}
	
	
	
	
	
	
	
	
	
	
}
