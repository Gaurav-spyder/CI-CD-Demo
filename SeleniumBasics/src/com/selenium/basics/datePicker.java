package com.selenium.basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class datePicker {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();
		driver.findElement(By.xpath("//span[text()='Trains']")).click();
		driver.findElement(By.xpath("//label[@for='travelDate']")).click();
		WebElement textDate=driver.findElement(By.xpath("//div[@aria-label='Fri Oct 11 2024']"));
		String attributeDate=textDate.getAttribute("aria-label");
		System.out.println(attributeDate);
		textDate.click();

		

	}

}
