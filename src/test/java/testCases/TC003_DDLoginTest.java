package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;
import utilities.DataProviders;

public class TC003_DDLoginTest extends BaseClass
{
	
	@Test(dataProvider="Logindata",dataProviderClass=DataProviders.class)
	public void ddLoginTest(String email,String pwd,String exp)
	{
		try
		{
		
		logger.info("----Starting DataDriven Login Test----");
		
		HomePage hp=new HomePage(driver);
		hp.clickMyAccount();
		hp.clickLogin();
		
		LoginPage lp=new LoginPage(driver);
		
		logger.info("Entering the email");
		lp.setEmail(email);
		
		logger.info("Entering the password");
		lp.setPwd(pwd);
		
		logger.info("clicking the login button");
		lp.clickLogin();
		
		MyAccountPage myap=new MyAccountPage(driver);
				
		if(myap.HeadingMyAccountIsExists().equals(true))
		{
			logger.info("Successfully logged in");
			String actualResult="Valid";
			if(actualResult.equalsIgnoreCase(exp))
			{
				Assert.assertTrue(true);
				logger.info("Test Passed");
			}
			else
			{
				Assert.assertTrue(false);
				logger.info("Test Failed");
				logger.error("Some Problem in logging");
			}
			
			myap.clicklnkLogout();
						
		}
		else
		{
			logger.info("Trying with Invalid Credentials");
			String actualResult="Invalid";
			if(actualResult.equalsIgnoreCase(exp))
			{
				Assert.assertTrue(true);
				logger.info("Test Passed");
			}
			else
			{
				Assert.assertTrue(false);
				logger.info("Test Failed");
				logger.error("Logged in with invalid credentials");
			}
		}
		
		}
		catch(Exception e)
		{
			Assert.fail();
		}
		logger.info("-----Finished DataDriven Login Test----");
	}
	
	
}
