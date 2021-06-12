package LoginTestSuite;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import PageObjectModels.LoginPageObjectModel;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_LOGIN_01 
{
	WebDriver driver;
	
	LoginPageObjectModel login;
	
	@Test(priority = 0)
	public void browserSetup()
	{
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		login = new LoginPageObjectModel(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}
	
	@Test(priority = 1)
	public void openLoginUrl()
	{
		driver.get("https://account.booking.com/sign-in");
		driver.manage().window().maximize();
	}

	@Test(priority = 2)
	public void enterValidEmailAddress()
	{
		login.setUsername("Ramkumar71000@gmail.com");
	}
	
	@Test(priority = 3)
	public void clickContinueButton()
	{
		login.clickContinueButton();	
	}
	
	@Test(priority = 4)
	public void enterValidPassword()
	{
		login.setPassword("Abcde@11111");	
	}
	
	@Test(priority = 5)
	public void clickSignInButton()
	{
		login.clickSignInButton();
	}
}
