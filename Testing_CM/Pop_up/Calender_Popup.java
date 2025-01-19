package Pop_up;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Calender_Popup {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	    driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
	    driver.findElement(By.id("policynumber")).sendKeys("12345");
	    driver.findElement(By.id("dob")).click();
	    WebElement month = driver.findElement(By.xpath("//select[@aria-label='Select month']"));
	    Select s= new Select(month);
	    s.selectByValue("3");
	    
	    WebElement year = driver.findElement(By.xpath("//select[@aria-label='Select year']"));
	    Select s1= new Select(year);
	    s1.selectByVisibleText("2002");
	    
	    driver.findElement(By.linkText("12")).click();
	    
	    driver.findElement(By.id("")).sendKeys("1234567890");
	    Thread.sleep(3000);
	    driver.close();
	}

}
