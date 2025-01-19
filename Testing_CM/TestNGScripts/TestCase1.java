package TestNGScripts;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestCase1 extends BaseClass
{
  @Test
  public void clickOnTasks()
  {
	  driver.findElement(By.linkText("Tasks")).click();
	  Reporter.log("clicked on task",true);
  }
}
