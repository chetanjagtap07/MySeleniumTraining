package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class StepDefinitionHooks {
	WebDriver driver;
	//String strWorkDir;

	@Before
	public void Setup()
	{
		String strProjectPath =System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", strProjectPath+"/src/test/resources/drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@After
	public void Teardown()
	{
		driver.close();
		driver.quit();
	}


	@Given("^User is on Login Page$")
	public void User_is_on_Login_Page() {
		System.out.println("Inside Given");
		driver.get("https://example.testproject.io/web/");
	}

	@And("^User enters (.*) and (.*)$")
	public void User_enters_username_and_password(String username, String password) {
		System.out.println("Inside and");
		driver.findElement(By.id("name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
	}

	@When("^user clicks on Login button$")
	public void user_clicks_on_login_button() {
		System.out.println("Inside When");
		driver.findElement(By.id("login")).click();
	}

	@Then("^user is navigated to homepage$")
	public void user_is_navigated_to_homepage() {
		System.out.println("Inside Then");
		driver.getPageSource().contains("Logout");
	}



}
