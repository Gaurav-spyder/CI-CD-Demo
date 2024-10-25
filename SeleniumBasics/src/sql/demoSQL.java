package sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoSQL {

	public static void main(String[] args) throws SQLException {
		String URL = "jdbc:mysql://localhost:3306/guvi";
		String uname = "root";
		String psw="Sija@123";

		//creating connection to database
		
		Connection con= DriverManager.getConnection(URL, uname, psw);
		
		//create statement object to create statement
		Statement s= con.createStatement();
		
		
		//Execute the query
		ResultSet rs = s.executeQuery("Select * from Credentials");
		
		rs.next();
		rs.next();
		String username= rs.getString("username");
		String password=rs.getString("password");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.get("https://www.saucedemo.com/");
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("user-name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		
		driver.findElement(By.id("login-button")).click();
		

		/*//go to next record as it points to the record before first record
		while(rs.next()) {
		String username= rs.getString("username");
		System.out.println(username);
		String password=rs.getString("password");
		System.out.println(password);
		count+=1;
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.get("https://www.saucedemo.com/");
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("user-name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		
		driver.findElement(By.id("login-button")).click();
		
		
		
	}
System.out.println(count);
}*/
}
}