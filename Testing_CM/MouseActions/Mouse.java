package MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.vtiger.com/");
		WebElement element = driver.findElement(By.partialLinkText("Company"));
		Actions a=new Actions(driver);
		a.moveToElement(element).perform();//hover the element 
		
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("ontact Us")).click();
		String phoneno = driver.findElement(By.xpath("//p[contains(text(),'23501152')]")).getText();
		System.out.println(phoneno);
		Thread.sleep(3000);
		driver.close();
		
		
	}

}
