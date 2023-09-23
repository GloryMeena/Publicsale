package com.demo;

import java.io.File;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {

	
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.driver.chrome",
				"C:\\Users\\Apple\\eclipse-workspace\\demo_June\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File s = ts.getScreenshotAs(OutputType.FILE);
		File d = new File("C:\\Users\\Apple\\eclipse-workspace\\demo_June\\SS\\img.png");
		FileHandler.
				
		
	}
	
}
