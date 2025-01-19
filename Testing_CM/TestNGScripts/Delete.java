package TestNGScripts;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;


public class Delete 
{
	@Test(priority = 1,groups = "Functionality")
	  public void create()
	  {
		  Reporter.log("hii",true);//Print both console & report
	  }
	  @Test(priority = 3,groups = "Smoke")
	  public void delete()
	  {
		  Reporter.log("Customer deleted",true);
	  }
	  @Test(priority = 2,groups = "Regression")
	  public void add()
	  {   
		  Assert.fail();
		  Reporter.log("Customer added successfully",true);
	  }
	  
}
