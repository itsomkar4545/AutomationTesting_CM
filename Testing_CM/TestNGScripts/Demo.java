package TestNGScripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo
{
  @Test(groups = "Functionality")
  public void create()
  {
	  Reporter.log("hii",true);//Print both console & report
	  System.out.println("Good afternoon");//only on console
	  Reporter.log("Bye",false);//print only on report
	  Reporter.log("Good night");//print only on report
  }
  @Test(groups = "Regression")
  public void delete()
  {
	  Reporter.log("Customer deleted",true);
  }
  @Test(groups = {"Smoke","Regression"})
  public void add()
  {
	  Reporter.log("Customer added successfully",true);
  }
  
}
   