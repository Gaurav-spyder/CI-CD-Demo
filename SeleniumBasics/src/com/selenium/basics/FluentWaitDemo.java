package com.selenium.basics;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;



public class FluentWaitDemo {

	public static void main(String[] args) {
		//properties of Fluent Wait:- 
		//polling interval
		//specify which exception should be handled automatically
		//customize the timeout msg
		//change the total timeout length
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/selenium/web/dynamic.html");
		driver.findElement(By.id("reveal")).click();
		Wait <WebDriver>wait = new FluentWait<WebDriver>(driver)
		.withTimeout(Duration.ofSeconds(10))
		.pollingEvery(Duration.ofSeconds(10))
		.ignoring(NoSuchElementException.class);
		WebElement box=driver.findElement(By.id("revealed"));
		wait.until(ExpectedConditions.elementToBeClickable(box));
		box.sendKeys("Gaurav");
		Assert.assertEquals("Gaurav",box.getDomProperty("value"));
		
	}

}
