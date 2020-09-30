package Com.Mercury.Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import Com.Mercury.Credentials.LogintoApp;

public class HomePage extends LogintoApp{

	@FindBy (xpath = "//a[@contains(text(),' Customer Login ')]")
	public WebElement userName;
	
	@FindBy (xpath = "")
	public WebElement password;
	
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	public void verifyTitle() {
		String expectedTitle = "";
		String acctualTitle = driver.
		
	}
	@Test(priority =1 )
	public void iselementpresnt() {
		userName.clear();
		
		
		
	}

	
}
