package com.AutomationCode_Mar19_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class IntoductionToXpaths {

	public static WebDriver driver;
	public static ChromeOptions options;
	
	@BeforeMethod
	public void setup() {
		options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		options.addArguments("--start-maximize");
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.get("https://rediff.com");
	}
	
@Test
public void clickOnSignInLink() {
	driver.findElement(By.xpath("//a[@class = 'signin']")).click();
}
@Test
public void enterLoginCredentials() {
	driver.findElement(By.xpath("//a[@class = 'signin']")).click();
	driver.findElement(By.xpath("//input[@id = 'login' and @name = 'loging']")).sendKeys("seleniumpanda@redifmail.com");
	driver.findElement(By.xpath("//input[@id = 'password' or @name = 'passwd']")).sendKeys("Selenium@123");
	driver.findElement(By.xpath("//input[@id = 'proceed' or @name = 'singinbtn']")).click();
}
@AfterMethod
public void tearDoen() {
	driver.quit();
}

}
