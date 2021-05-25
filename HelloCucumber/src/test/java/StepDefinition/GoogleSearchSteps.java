//package StepDefinition;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.cucumber.java.en.*;
//
//public class GoogleSearchSteps {
//
//	WebDriver driver=null;
//
//	@Given("browser is open")
//	public void browser_is_open() {
//		String strProjectPath =System.getProperty("user.dir");
//		System.setProperty("webdriver.chrome.driver", strProjectPath+"/src/test/resources/drivers/chromedriver.exe");
//		driver=new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
//		driver.manage().window().maximize();
//	}
//
//	@Given("user is on google page")
//	public void user_is_on_google_page() {
//
//		driver.get("http://google.com");
//	}
//
//	@When("user enters search string")
//	public void user_enters_search_string() {
//		driver.findElement(By.name("q")).sendKeys("Automation step by step");
//	}
//
//	@When("hits enter")
//	public void hits_enter() {
//		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
//	}
//
//	@Then("user should be navigated to Search results")
//	public void user_should_be_navigated_to_search_results() {
//		driver.getPageSource().contains("Online Courses");
//		driver.close();
//		driver.quit();
//	}
//
//}
