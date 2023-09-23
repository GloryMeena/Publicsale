package com.fb.runner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Before;




public class Runner_Class {
	
	public static WebDriver driver;
	
	
	@Before
	public static void setUp() {

		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Apple\\eclipse-workspace\\12PM_DemoProject\\driver\\chromedriver.exe");
		
		
		 driver = new ChromeDriver();
		
	}
	
	
}
