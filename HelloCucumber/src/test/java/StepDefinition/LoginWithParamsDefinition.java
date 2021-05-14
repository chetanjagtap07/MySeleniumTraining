package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class LoginWithParamsDefinition {

	WebDriver driver = null;

	@Given("user is on browser")
	public void user_is_on_browser(){
		String strProjectPath =System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", strProjectPath+"/src/test/resources/drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();

	}

	@And("user navigates to login")
	public void user_navigates_to_login() {
		driver.navigate().to("https://example.testproject.io/web/");
	}

	@When("^enters (.*) and (.*)$")
	public void enters_user_and_password (String username, String password) {
		driver.findElement(By.id("name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
	}

	@And("user clicks on login")
	public void user_clicks_on_login() {
		driver.findElement(By.id("login")).click();
	}

	@Then("user is navigated to home page")
	public void user_is_navigated_to_home_page() {
		driver.getPageSource().contains("Logout");
	}

	@And("user logs offs")
	public void user_logs_offs() {
		driver.findElement(By.id("logout")).click();
		driver.close();
		driver.quit();
	}


}
