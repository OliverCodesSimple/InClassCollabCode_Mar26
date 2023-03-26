package com.TestNGcode_Mar_18_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MoreConceptsTutorialNinja {

	
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
	@Test(priority=1)
	public void clickOnMyAccount() {
		driver.findElement(By.linkText("My Account")).click();
	}
	
	@Test(priority=2)
	public void clickOnLogInLink(){
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("login")).click();
	}
	
	@Test(priority=3)
	public void enterLoginCredentials() {
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("login")).click();
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	}
	
	@Test(priority=4)
	public void clickOnLogOutLink() {
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("login")).click();
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		driver.findElement(By.linkText("Logout")).click();
	}
		@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
}
