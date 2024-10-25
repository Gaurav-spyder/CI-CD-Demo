package com.selenium.basics;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutoITDemo {

	public static void main(String[] args) throws IOException  {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/upload");
		Actions a = new Actions(driver);
		WebElement chooseFile= driver.findElement(By.id("file-upload"));
		a.moveToElement(chooseFile).click().build().perform();
		//Runtime.getRuntime().exec("C:\\Users\\NISHI\\Documents\\Notes\\myscript.exe");
		Runtime.getRuntime().exec("C:\\Users\\NISHI\\Documents\\Notes\\myscript.exe");
		System.out.println("file uploaded");
		
	}

}
