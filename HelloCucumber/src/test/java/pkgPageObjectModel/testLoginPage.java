package pkgPageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class testLoginPage {

	protected WebDriver driver;

	private By txtUsername=By.id("name");
	private By txtPassword=By.id("password");
	private By txtLogin=By.id("login");

	public testLoginPage(WebDriver driver) {
		this.driver=driver;

		if (driver.getTitle().contains("TestProject Demo")) {
			System.out.println("On Correct Page");
		}
		else
		{
			throw new IllegalStateException();
		}
	}

	public void LoginValid(String username, String password) {
		driver.findElement(txtUsername).sendKeys(username);
		driver.findElement(txtPassword).sendKeys(password);

	}	

	public void ClickLogin() {
		driver.findElement(txtLogin).click();
	}
}


