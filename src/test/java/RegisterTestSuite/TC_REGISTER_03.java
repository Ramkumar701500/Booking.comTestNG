package RegisterTestSuite;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import PageObjectModels.RegisterPageObjectModel;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_REGISTER_03 
{	
	WebDriver driver;
	
	RegisterPageObjectModel register;
	
	@Test(priority = 0)
	public void browserSetup()
	{
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		register = new RegisterPageObjectModel(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}
	
	@Test(priority = 1)
	public void openRegisterUrl()
	{
		driver.get("https://account.booking.com/register");
		driver.manage().window().maximize();
	}

	@Test(priority = 2)
	public void enterValidEmailAddress()
	{
		register.setUsername("dfhxdfhj0@gmail.com");
	}
	
	@Test(priority = 3)
	public void clickContinueButton()
	{
		register.clickContinueButton();	
	}
	
	@Test(priority = 4)
	public void enterInvalidPassword()
	{
		register.setPassword("Abcde11");	
	}
	
	@Test(priority = 5)
	public void confirmSamePassword()
	{
		register.setConfirmPassword("Abcde11");	
	}
	
	@Test(priority = 6)
	public void clickCreateAccountButton()
	{
		register.clickCreateAccountButton();
	}
}
