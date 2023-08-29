package com.task;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;

import com.commonactions.CommonMethods;

public class CookiesTask extends CommonMethods{
	public static void main(String[] args) throws Throwable {
		CommonMethods C = new CommonMethods();
		options.addArguments("--headless");
		C.launch("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Hemanth");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Babu");
		driver.findElement(By.xpath("//input[@value='Male']")).click();
		driver.findElement(By.xpath("//input[@value='3']")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("13/10/1998");
		driver.findElement(By.xpath("//input[@value='Automation Tester']")).click();
		Set<Cookie> cookies = driver.manage().getCookies();
		for(Cookie X:cookies) {
			System.out.println(X);
		}
		driver.manage().deleteAllCookies();
		Set<Cookie> cookies2 = driver.manage().getCookies();
		boolean empty = cookies2.isEmpty();
		if(empty) {
			System.out.println("Cookies Deleted");
		}
		else {
			System.out.println("Cookies not Deleted");
		}
		Thread.sleep(3000);
		driver.quit();
	}

}
