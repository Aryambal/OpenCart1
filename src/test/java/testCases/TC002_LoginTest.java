package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC002_LoginTest extends BaseClass
{

	@Test(groups= {"Sanity","Master"})
	public void loginTest()
	{
		try
		{
			logger.info("------Starting Login Test-----");
			
			HomePage hp=new HomePage(driver);
			hp.clickMyAccount();
			hp.clickLogin();
			
			LoginPage lp=new LoginPage(driver);
			
			logger.info("Entering the email");
			lp.setEmail(rb.getString("email"));
			
			logger.info("Entering the password");
			lp.setPwd(rb.getString("pwd"));
			
			logger.info("clicking the login button");
			lp.clickLogin();
			
			MyAccountPage myap=new MyAccountPage(driver);
			
			if(myap.HeadingMyAccountIsExists().equals(true))
			{
				logger.info("Test Passed");
				Assert.assertTrue(true);
			}
			else
			{
				logger.error("Test Failed");
				logger.warn("Login not Successful");
				Assert.assertTrue(false);
			}
		}
		catch(Exception e)
		{
			Assert.fail();
		}
		
		logger.info("----Finished Login Test----");
	}
	
	
}
