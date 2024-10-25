package pageObjectModel;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RediffLoginTest {

	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.manage().window().maximize();
	driver.navigate().to("https://mail.rediff.com/cgi-bin/login.cgi");
	Assert.assertEquals("Rediffmail", driver.getTitle());
	RediffLoginPage lgnpg= new RediffLoginPage(driver);
	lgnpg.EnterData("Gaurav", "Gaurav123");
	lgnpg.clickLink();
	RediffHomePage hmpg= new RediffHomePage(driver);
	hmpg.clickOnSearch("ifa");
	}

}
