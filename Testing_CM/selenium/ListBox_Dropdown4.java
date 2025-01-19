package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListBox_Dropdown4 {

	public static void main(String[] args)
	{
      WebDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://demoapps.qspiders.com/ui?scenario=1");
	}

}
