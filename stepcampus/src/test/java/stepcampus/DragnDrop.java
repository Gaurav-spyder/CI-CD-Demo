package stepcampus;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragnDrop {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://practice.expandtesting.com/drag-and-drop-circles");
		
		WebElement src = driver.findElement(By.xpath("//div[@class='red']"));
		WebElement trg = driver.findElement(By.id("target"));
		
		Actions a = new Actions(driver);
		
		a.dragAndDrop(src, trg).build().perform();
		
		
		
		
		
	}

}
