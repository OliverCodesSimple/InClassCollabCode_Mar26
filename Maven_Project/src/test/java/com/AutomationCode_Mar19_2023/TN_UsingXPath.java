package com.AutomationCode_Mar19_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TN_UsingXPath {

	public static WebDriver driver;
	public static ChromeOptions options;
	
	@BeforeMethod
	public void setup() {
		options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		options.addArguments("--start-maximize");
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.get("https://tutorialsninja.com/demo");
	}
	@Test
	public void registerNewAccount() throws InterruptedException {
		driver.findElement(By.linkText("My Account")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Register")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id = 'input-firstname' or @class = 'form-control")).sendKeys("selenium999");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id = 'input-lastname' or @class = 'form-control")).sendKeys("Panda999");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name = 'email' or @id = 'input-email")).sendKeys("seleniumpanda100@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name = 'telephone']")).sendKeys("9874561230");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id = 'input-password']")).sendKeys("Panda999");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id = 'input-confirm']")).sendKeys("Panda999");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name = 'agreed']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class = 'btn btn-primary']")).click();
	}
	
	
	
	@Test(priority=2 )
	public void enterLoginCredentials() {
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("login")).click();
		driver.findElement(By.xpath("//input[@id = 'input-email']")).sendKeys("seleniumpanda100@gmail.com");
		driver.findElement(By.xpath("//input[@id = 'input-password']")).sendKeys("Panda999");
		driver.findElement(By.xpath("//input[@class = 'btn.btn-primary']")).click();
	}
	
	
	
	@AfterMethod
	public void tearDoen() {
		driver.quit();
	}
}
