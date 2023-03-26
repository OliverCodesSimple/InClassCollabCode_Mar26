package com.AutomationCode_Mar19_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class FaceBookXpathLCreeateAccount {
	
	public static WebDriver driver;
	public static ChromeOptions options;
	
	
	@BeforeMethod
	public void setup() {
		options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		options.addArguments("--start-maximize");
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.get("//https.Facebook.com");
	}
	
	@Test
	public void createFaceBookAccount() {
		driver.findElement(By.xpath("a[@data-testid = 'open-egistration-form-button']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name = 'firstname']")).sendKeys("selenium999");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name = 'lastname']")).sendKeys("Panda999");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name = 'reg_email__']")).sendKeys("seleniumpanda145@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name = 'reg_email_confirmation__']")).sendKeys("seleniumpanda145@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name = 'reg_password__']")).sendKeys("seleniumpanda145");
	}
	
	
	@AfterMethod
	public void tearDoen() {
		driver.quit();
	}
	
}




