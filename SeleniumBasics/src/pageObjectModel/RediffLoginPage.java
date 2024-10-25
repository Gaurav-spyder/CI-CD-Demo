package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffLoginPage {

	WebDriver driver;
	
	public RediffLoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="login1")
	WebElement login;
	@FindBy(id="password")
	WebElement password;
	@FindBy(linkText="rediff.com")
	WebElement link;
	
	public void EnterData(String id, String pwd) {
		login.sendKeys(id);
		password.sendKeys(pwd);	
	}
	
	public void clickLink() {
		link.click();
	}


}
