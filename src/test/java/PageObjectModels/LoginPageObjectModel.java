package PageObjectModels;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObjectModel 
{
	WebDriver driver;
	
	@FindBy(id="username")
	WebElement username;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div[1]/div/div/div/div/div/div/form/div[3]/button/span")
	WebElement continueButton;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div[1]/div/div/div/div/div/div/form/button/span")
	WebElement signInButton;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div[2]/div/div[1]/a[1]")
	WebElement termsAndConditions;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div[2]/div/div[1]/a[2]")
	WebElement privacyStatement;
	
	//WebDriver
	public LoginPageObjectModel(WebDriver Driver) 
	{
		driver = Driver;
		PageFactory.initElements(Driver, this);
	}
	
	//User name
	public void setUsername(String Username)
	{
		username.sendKeys(Username);
	}
	
	//Continue button
	public void clickContinueButton()
	{
		continueButton.click();
	}
	
	//Password
	public void setPassword(String Password)
	{
		password.sendKeys(Password);
	}
	
	//Sign in button 2
	public void clickSignInButton()
	{
		signInButton.click();
	}
	
	//Terms and conditions
	public void clickTermsAndConditions()
	{
		termsAndConditions.click();
	}
	
	//Privacy statement
	public void clickPrivacyStatement()
	{
		privacyStatement.click();
	}
	
}
