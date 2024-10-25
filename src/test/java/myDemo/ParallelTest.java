package myDemo;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ParallelTest {
	

	WebDriver driver;
	@Test
	public void testChrome() {
		 driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.manage().window().maximize();
			driver.get("https://www.saucedemo.com/v1/");
			System.out.println(Thread.currentThread().getId());
	}
	@Test
public void testFirefox() {
	 driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/v1/");
		System.out.println(Thread.currentThread().getId());
	}
	@Test
public void testIE() {
	 driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		System.out.println(Thread.currentThread().getId());
	}
}
