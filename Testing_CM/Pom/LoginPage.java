package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
  //Decleration
	@FindBy(id="email")
	private WebElement untbx;
	
	@FindBy(id="pass")
	private WebElement pwtbx;
	
	@FindBy(name="login")
	private WebElement lbut;
	
  //Initilization
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver , this);
	}

	public WebElement getUntbx() {
		return untbx;
	}

	public WebElement getPwtbx() {
		return pwtbx;
	}

	public WebElement getLbut() {
		return lbut;
	}
	
}
