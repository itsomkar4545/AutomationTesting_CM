package TestNGScripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo2 
{
	//Execute the based on priority
	 @Test(priority = 1,groups = "Functionality")
	  public void create()
	  {
		  Reporter.log("hii",true);
	  }
	  @Test(priority = 3,groups = "Regression")
	  public void delete()
	  {
		  Reporter.log("Customer deleted",true);
	  }
	  @Test(priority = 2,groups = {"Smoke","Regression"})
	  public void add()
	  {
		  Reporter.log("Customer added successfully",true);
	  }
	  @Test(priority = 0,invocationCount = 5,groups = {"Functionality","Smoke"})//For multiple execution only test script
	  public void remove()
	  {
		  Reporter.log("Customer remove successfully",true);
	  }
}
