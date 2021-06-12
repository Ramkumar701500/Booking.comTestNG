package PageObjectModels;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPageObjectModel 
{
	WebDriver driver;
	
	@FindBy(id="username")
	WebElement username;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div[1]/div/div/div/div/div/div/form/div[3]/button/span")
	WebElement continueButton;
	
	@FindBy(id="new_password")
	WebElement password;
	
	@FindBy(id="confirmed_password")
	WebElement confirmPassword;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div[1]/div/div/div/div/div/div/form/button/span")
	WebElement createAccountButton;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div[2]/div/div[1]/a[1]")
	WebElement termsAndConditions;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div[2]/div/div[1]/a[2]")
	WebElement privacyStatement;
	
	//WebDriver
	public RegisterPageObjectModel(WebDriver Driver) 
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
	
	//Confirm password
	public void setConfirmPassword(String ConfirmPassword)
	{
		confirmPassword.sendKeys(ConfirmPassword);
	}
	
	//Create account button
	public void clickCreateAccountButton()
	{
		createAccountButton.click();
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
