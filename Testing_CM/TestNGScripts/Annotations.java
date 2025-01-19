package TestNGScripts;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations 
{
   @BeforeSuite
   public void connetcDB()
   {
	   Reporter.log("Database connect successfully",true);
   }
   @BeforeTest
   public void launchBrowser()
   {
	   Reporter.log("Browser launch",true);
   }
   @BeforeMethod
   public void login()
   {
	   Assert.fail();
	   Reporter.log("Login successfully",true);
   }
   @Test
   public void create()
   {
	   Reporter.log("Ac Create successfully",true);
   }
   @Test
   public void delete()
   {
	   Reporter.log(" delete successfully",true);
   }
   @AfterMethod
   public void logout()
   {
	   Reporter.log("Logout successfully",true);
   }
   @AfterTest
   public void closeBrowser()
   {
	   Reporter.log("Browser close successfully",true);
   }
   @AfterSuite
   public void dbDisconnect()
   {
	   Reporter.log("DB disconnect successfully",true);
   }
}
