package com.selenium.basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handleWebTables {

	public static void main(String[] args) {
		WebDriver  driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.tutorialspoint.com/selenium/practice/webtables.php");
		
		int totalSize=driver.findElements(By.xpath("//table/tbody/tr")).size();
		System.out.println(totalSize);
		
		for (int i=1;i<totalSize+1;i++) {
			
			String name = driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();
			System.out.println(name);
			if (name.equalsIgnoreCase("kierra")) {
				driver.findElement(By.xpath("//table/tbody/tr[3]/td/a")).click();
				System.out.println("clicked");
			}
		}

	}

}
