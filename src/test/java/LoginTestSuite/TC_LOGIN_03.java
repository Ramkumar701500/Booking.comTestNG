package LoginTestSuite;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import PageObjectModels.LoginPageObjectModel;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_LOGIN_03 
{
	WebDriver driver;
	
	LoginPageObjectModel login;
	
	@Test(priority = 1)
	public void browserSetup()
	{
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		login = new LoginPageObjectModel(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}
	
	@Test(priority = 2)
	public void openLoginUrl()
	{
		driver.get("https://account.booking.com/sign-in");
		driver.manage().window().maximize();
	}

	@Test(priority = 3)
	public void enterValidEmailAddress()
	{
		login.setUsername("Ramkumar71000@gmail.com");
	}
	
	@Test(priority = 4)
	public void clickContinueButton()
	{
		login.clickContinueButton();	
	}
	
	@Test(priority = 5)
	public void enterInvalidPassword()
	{
		login.setPassword("nmscs1221");	
	}
	
	@Test(priority = 6)
	public void clickSignInButton()
	{
		login.clickSignInButton();
	}
}
