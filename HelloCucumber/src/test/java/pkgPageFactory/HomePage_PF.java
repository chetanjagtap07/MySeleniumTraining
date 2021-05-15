package pkgPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage_PF {

	WebDriver driver;
	
	@FindBy(id="logout")
	WebElement btnLogoff;
	
	public HomePage_PF(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void LogOff() {
		if (btnLogoff.isEnabled()) {
			btnLogoff.click();
			
		}
	}
}
