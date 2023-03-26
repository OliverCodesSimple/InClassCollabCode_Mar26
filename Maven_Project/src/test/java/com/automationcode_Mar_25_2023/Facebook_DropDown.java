package com.automationcode_Mar_25_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Facebook_DropDown {

	public WebDriver driver;
	public Select select;
	
	@BeforeMethod
	public void openUrl() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.Facebook.com/");
		
	}
	@Test
	public void createFaceBookAccount() throws InterruptedException {
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
		
		//dropdown automation
		
		select = new Select(driver.findElement(By.id("month")));
		select.selectByVisibleText("jul");
		
		select = new Select(driver.findElement(By.id("day")));
		select.selectByVisibleText("10");		
				
		select = new Select(driver.findElement(By.id("year")));
		select.selectByVisibleText("1965");		
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
}
}

