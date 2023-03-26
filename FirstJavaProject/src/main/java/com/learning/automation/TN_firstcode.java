package com.learning.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TN_firstcode {

	public static WebDriver driver;
	public static ChromeOptions options;
	
	public static void main(String[] args) {
		options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		options.addArguments("--start-maximized");
		options.addArguments("--inconnito");
		driver = new ChromeDriver(options);
		driver.get("http//tutorialsninja.com/");
		driver.findElement(By.linkText("MyAccount")).click();
		driver.findElement(By.linkText("Login")).click();
	}
	
	
	
	
}
