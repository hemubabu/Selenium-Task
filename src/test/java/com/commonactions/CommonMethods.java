package com.commonactions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonMethods {
	public static WebDriver driver;
	public static ChromeOptions options = new ChromeOptions();
	
	public void launch(String url) {
		options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		options.addArguments("--start-maximized");
		driver= new ChromeDriver(options);
		driver.get(url);
	}
		
	
	

}
