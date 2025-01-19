import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.WebDriver;
// import org.openqa.selenium.support.ui.Select;
public class Demo {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\OmkarPatil\\Documents\\ChromeDrivers\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		//EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/ ");
		//String Title = driver.getTitle();
		System.out.println(driver.getTitle());    //To Get the Title
		System.out.println(driver.getCurrentUrl());  //To get Current URL
		System.out.println(driver.getPageSource());  //to get the Page source to entire page(Inspect)
		Thread.sleep(5000);  //To Wait 
		driver.close();		//To Close the Browser
	}

}
