package Pop_up;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Authentication_Popup {

	public static void main(String[] args) throws InterruptedException 
	{
      WebDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
      //Changes are made in url--->Example>>"https://username:Password@>URL>basic-auth-git-main-shashis-projects-4fa03ca5.vercel.app/"
      driver.get("https://admin:admin@basic-auth-git-main-shashis-projects-4fa03ca5.vercel.app/");
      Thread.sleep(3000);
      driver.close();
	}

}
