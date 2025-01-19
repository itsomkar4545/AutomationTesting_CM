package TestNGScripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Create 
{
	@Test(priority = 1,groups = "Smoke")
	  public void create()
	  {
		  Reporter.log("hii",true);//Print both console & report
	  }
	  @Test(priority = 3,groups = "Regression")
	  public void delete()
	  {
		  Reporter.log("Customer deleted",true);
	  }
	  @Test(priority = 2,groups = "Functionality")
	  public void add()
	  {
		  Reporter.log("Customer added successfully",true);
	  }
}
