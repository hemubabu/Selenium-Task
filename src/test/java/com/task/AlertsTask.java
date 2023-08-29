package com.task;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import com.commonactions.CommonMethods;

public class AlertsTask extends CommonMethods {
	public static void main(String[] args) throws Throwable {
		CommonMethods C = new CommonMethods();
		C.launch("https://demo.guru99.com/test/delete_customer.php ");
		//Prompt Alert
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		Alert A = driver.switchTo().alert();
		Thread.sleep(3000);
		A.accept();
		Thread.sleep(3000);
		A.accept();
		driver.quit();
		C.launch("https://demoqa.com/alerts");
		driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
		Alert A1 = driver.switchTo().alert();
		A1.dismiss();
		driver.findElement(By.xpath("//button[@id='promtButton']")).click();
		A1.sendKeys("Hemanth");
		A1.accept();
		
	}

}
