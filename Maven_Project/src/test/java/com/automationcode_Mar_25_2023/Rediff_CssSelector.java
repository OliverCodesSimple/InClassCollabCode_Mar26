package com.automationcode_Mar_25_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Rediff_CssSelector {
	
	public WebDriver driver;
	
	@BeforeMethod
	public void OpenBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
	}
	@Test(priority = 1)
	public void clickOnSignIn() {
		driver.findElement(By.cssSelector("a.signin")).click();
	}
	
	@Test
	public void loginCredentials() {
		driver.findElement(By.cssSelector("input#login1")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.cssSelector("input#password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input.signinbtn")).click();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
