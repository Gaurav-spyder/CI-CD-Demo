package com.selenium.basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class InvokeBrowser {

	public static void main(String[] args) {
		//Invoking Browsers
		//Chrome -ChromeDriver
		//Firefox-FirefoxDriver
		//Edge-EdgeDriver
		
		WebDriver  driver = new ChromeDriver();//Firefox driver
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		String URL=driver.getCurrentUrl();
		System.out.println(URL);
		String title=driver.getTitle();//Title of the page
		System.out.println(title);
//		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
//		driver.findElement(By.className("submit")).click();
//		//driver.close();//closing the browser automatically
//		//driver.quit();//close/quit all the opened browsers
//		String text1 =driver.findElement(By.tagName("h2")).getText();
//		System.out.println(text1);
//		String text3 =driver.findElement(By.tagName("p")).getText();
//		System.out.println(text3);
//		String text2 =driver.findElement(By.tagName("h1")).getText();
//		System.out.println(text2);
		driver.findElement(By.xpath("//button[text()='Home']")).click();
	
	}

}
