package pkgPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_PF {

	WebDriver driver;

	@FindBy(id="name")
	WebElement txtUsername;

	@FindBy(id="password")
	WebElement txtpassword;

	@FindBy(id="login")
	WebElement btnLogin;

	public Login_PF(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	public void EnterUserDetails(String argUsername, String argPassword)
	{
		txtUsername.sendKeys(argUsername);
		txtpassword.sendKeys(argPassword);
	}
	
	public void clickLogin()
	{
		btnLogin.click();
	}
}
