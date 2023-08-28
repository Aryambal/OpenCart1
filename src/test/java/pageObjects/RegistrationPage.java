package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends BasePage
{
	
	public RegistrationPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//input[@id='input-firstname']")
	WebElement txtFirstname;
	
	@FindBy(xpath="//input[@id='input-lastname']")
	WebElement txtLastname;
	
	@FindBy(xpath="//input[@id='input-email']")
	WebElement txtEmail;
	
	@FindBy(xpath="//input[@id='input-telephone']")
	WebElement txtTelephone;
	
	@FindBy(xpath="//input[@id='input-password']")
	WebElement txtPassword;
	
	@FindBy(xpath="//input[@id='input-confirm']")
	WebElement txtPasswordConfirm;
	
	@FindBy(xpath="//label[normalize-space()='Yes']")
	WebElement radiobtnYes;
	
	@FindBy(xpath="//label[normalize-space()='No']")
	WebElement radiobtnNo;
	
	@FindBy(xpath="//input[@name='agree']")
	WebElement chkPolicy;
	
	@FindBy(xpath="//input[@name='agree']")
	WebElement btnContinue;
	
	@FindBy(xpath = "//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement msgConfirmation;
	
	//a[normalize-space()='Continue']
	
	
	public void setFirstName(String fname)
	{
		txtFirstname.sendKeys(fname);
	}
	
	public void setLastName(String lname)
	{
		txtLastname.sendKeys(lname);
	}
	
	public void setEmail(String email)
	{
		txtEmail.sendKeys(email);
	}
	
	public void setTelephone(String Telephone)
	{
		txtTelephone.sendKeys(Telephone);
	}
	
	public void setPassword(String pwd)
	{
		txtPassword.sendKeys(pwd);
	}
	
	public void setPasswordConfirm(String pwd)
	{
		txtPasswordConfirm.sendKeys(pwd);
	}
	
	public void clickradiobtnYes()
	{
		radiobtnYes.click();
	}
	
	public void clickradiobtnNo()
	{
		radiobtnNo.click();
	}
	
	public void clickchkPolicy()
	{
		chkPolicy.click();
	}
	
	public void clickbtnContinue()
	{
		btnContinue.click();
	}
	
	public String getmsgConfirmation()
	{
		try
		{
		return (msgConfirmation.getText());
		}
		catch(Exception e)
		{
			return (e.getMessage());
		}
		}
	
	
}
