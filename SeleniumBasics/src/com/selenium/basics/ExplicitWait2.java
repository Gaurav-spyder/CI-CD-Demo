package com.selenium.basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/selenium/web/dynamic.html");
		driver.findElement(By.id("reveal")).click();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(9));
		WebElement box=driver.findElement(By.id("revealed"));
		//wait.until(ExpectedConditions.visibilityOf(box));
		wait.until(ExpectedConditions.elementToBeClickable(box));
		//wait.until(ExpectedConditions.attributeContains(box, "id", "revealed"));
		box.sendKeys("Gaurav");
	
	}

}
