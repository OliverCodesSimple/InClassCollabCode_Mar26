package com.TestNGcode_Mar_18_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegisterAccountTN_Mar18_2023 {
	public WebDriver driver;
	public ChromeOptions options;
	
	@BeforeMethod
	public void openBrowser() {
		options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		options.addArguments("--start-maximized");
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
		driver.findElement(By.id("input-firstname")).sendKeys("selenium100");
		Thread.sleep(1000);
		driver.findElement(By.id("input-lastname")).sendKeys("Panda100");
		Thread.sleep(1000);
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda100@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("input-telephone")).sendKeys("9874561230");
		Thread.sleep(1000);
		driver.findElement(By.id("input-password")).sendKeys("Panda123");
		Thread.sleep(1000);
		driver.findElement(By.id("input-confirm")).sendKeys("Panda123");
		Thread.sleep(1000);
		driver.findElement(By.name("agree")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	}
	@AfterMethod
public void tearDown() {
	driver.quit();
 }
}

