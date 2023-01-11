package org.getText;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetText {
	
	WebDriver driver;	
	
	@BeforeMethod
	public void browserlaunch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
	@Test (priority = 0)
	public void getText() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		
		WebElement gmail = driver.findElement(By.xpath("//a[@class='gb_m' and text()='Gmail']"));
		
		String value = gmail.getText();
		System.out.println("The getText value is : "  +value);
	}
	
	@Test (priority = 1)
	public void listGetText() {
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/");
		
		WebElement demos = driver.findElement(By.xpath("//*[@id='menu-top']"));
		String getTexting = demos.getText();
		System.out.println("The jquery task bar list is \n "  +getTexting);
		
	
	}

}
