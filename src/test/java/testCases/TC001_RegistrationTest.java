package testCases;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.RegistrationPage;
import testBase.BaseClass;

public class TC001_RegistrationTest extends BaseClass
{

	@Test(groups={"Regression","Master"})
	public void test_account_Registration()
	{
		try
		{
		
		logger.info("-------Starting Registration Test---------");
			
		HomePage hp=new HomePage(driver);
		hp.clickMyAccount();
		hp.clickRegister();
		
		RegistrationPage rp=new RegistrationPage(driver);
		
		logger.info("Entering Account Details");
		
		rp.setFirstName(randomString());
		rp.setLastName(randomString());
		rp.setEmail(randomAlphaNumeric()+"@gmail.com");
		rp.setTelephone(randomNumber());
		rp.setPassword("Test@123");
		rp.setPasswordConfirm("Test@123");
		rp.clickchkPolicy();
		
		logger.info("Clicking on the continue button");
		rp.clickbtnContinue();
		
		
				
		String confmsg=rp.getmsgConfirmation();
				
		if(confmsg.contains("Your Account Has Been Created!"))
		{
			logger.info("Test Passed");
			Assert.assertTrue(true);
		}
		else
		{
			System.out.println(confmsg);
			logger.error("Test Failed");
			logger.warn("Customer registration is not successful");
			Assert.assertTrue(false);
		}			
		}
		
		catch(Exception e)
		{
			logger.error("Test Failed");
			Assert.fail();
		}
		
		logger.info("-----Finished Registration Test------");
	}
	
}
