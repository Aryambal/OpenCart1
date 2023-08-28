package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage
{

	public LoginPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(name="email")
	WebElement txtEmail;
	
	@FindBy(name="password")
	WebElement txtPwd;
	
	@FindBy(xpath="//input[@value='Login']")
	WebElement btnLogin;
	
	
	public void setEmail(String email)
	{
		txtEmail.sendKeys(email);
	}
	
	public void setPwd(String pwd)
	{
		txtPwd.sendKeys(pwd);
	}
	
	public void clickLogin()
	{
		btnLogin.click();
	}
	
	
}