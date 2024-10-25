package com.selenium.basics;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;
public class LoginRSAPage {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("Gaurav Gupta");
		driver.findElement(By.name("inputPassword")).sendKeys("hello@123");
		driver.findElement(By.className("submit")).click();
		String errormsg=driver.findElement(By.cssSelector("p.error")).getText();
		
		System.out.println(errormsg);
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("GAURAV");

		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("GAURAV@123");
		driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("1234567890");
		driver.findElement(By.className("reset-pwd-btn")).click();
		String text=driver.findElement(By.className("infoMsg")).getText();
		System.out.println(text);
				
	
	}

}
