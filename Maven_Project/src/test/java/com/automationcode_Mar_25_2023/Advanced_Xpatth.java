package com.automationcode_Mar_25_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Advanced_Xpatth {

	public WebDriver driver;

	@BeforeMethod
	public void openUrl() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
	}

	@Test
	public void clickOnMyAccoubtLink() {
		driver.findElement(By.xpath("//div[@id='top-links']/decendant::span[contains(test(),'My Account')]")).click();
		driver.findElement(By.xpath("//div[@id='top-links']/decendant::span[contains(test(),'My Account')]/folowing::ul[1]/child[a]")).click();
		driver.findElement(By.xpath("//input[@id = 'input-email']")).sendKeys("Seleniumpanda@gmail.com");
		driver.findElement(By.xpath("//input[@id = 'input-password']")).sendKeys("Seleniumpanda123");
		driver.findElement(By.cssSelector(null);
		
		
		
	}

}
