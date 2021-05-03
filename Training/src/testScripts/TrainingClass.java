package testScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import config.LoadConfigs;

public class TrainingClass {
	public static WebDriver driver;
	public static String strWorkingDir;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		strWorkingDir=System.getProperty("user.dir");
		LoadConfigs.getConfigs();
		if (LoadConfigs.strBrowser.contains("Chrome")){
			System.setProperty("webdriver.chrome.driver",strWorkingDir+"\\Lib\\chromedriver.exe");
			driver=new ChromeDriver();
		}else if(LoadConfigs.strBrowser.contains("FF")){
			System.setProperty("webdriver.gecko.driver",strWorkingDir+"\\Lib\\geckodriver.exe");
			System.setProperty("driver.firfox.bin","C:\\Program Files\\Mozilla Firefox\\firefox.exe");
			driver=new FirefoxDriver();
		}
		
		driver.get(LoadConfigs.strURL);
		driver.quit();
		
		//commit test
	}
	

}
