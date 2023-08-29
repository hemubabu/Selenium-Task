package com.task;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import com.commonactions.CommonMethods;

public class PageLoadedTask extends CommonMethods {
	public static void main(String[] args) {
		CommonMethods C = new CommonMethods();
		C.launch("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Object state = js.executeScript("return document.readyState");
		boolean equals = state.equals("complete");
		System.out.println(equals);
		if(equals) {
			System.out.println("Page Loaded Properly");
		}
		else {
			System.out.println("Page not loaded properly");
		}
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Hemanth");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Babu");
		driver.findElement(By.xpath("//input[@value='Male']")).click();
		driver.findElement(By.xpath("//input[@value='3']")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("13/10/1998");
		driver.findElement(By.xpath("//input[@value='Automation Tester']")).click();
		
	}

}
