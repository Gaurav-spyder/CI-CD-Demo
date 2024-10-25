package stepcampus;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://practice.expandtesting.com/drag-and-drop-circles");
		
		Actions a = new Actions(driver);
		
		WebElement src = driver.findElement(By.xpath("//div[@class='red']"));
		WebElement trg = driver.findElement(By.id("target"));
		Thread.sleep(2000);
		a.dragAndDrop(src, trg).build().perform();
		
		Thread.sleep(2000);

	}

}
