package Com.Mercury.Credentials;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogintoApp {
	Properties property ;
	WebDriver driver;

	
	public void readProperties() throws IOException {
		FileInputStream fis = new FileInputStream("/Users/srikanthpilla/eclipse-workspace/MercuryTravels/test.properties");
		property.load(fis);
		System.out.println("properties are configured.......");

	}
	
	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver", property.getProperty("webDriver"));
		WebDriver driver = new ChromeDriver();
		driver.get(property.getProperty("URL"));
	}
	
	
	
	@AfterClass
	public void afterClass() {
		driver.quit();
		
	}
}
