package com.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.commonactions.CommonMethods;
public class Practice extends CommonMethods {
	
	public static int i;
	public static int row1=1;
	public static void main(String[] args)  {
		CommonMethods C = new CommonMethods();
		C.launch("https://demo.guru99.com/test/web-table-element.php");
		
		try {
		
		for(i=1;i<=5;i++) {
		WebElement heading =driver.findElement(By.xpath("(//table[@class='dataTable']/thead/tr/th)["+i+"]"));
		
			String text = heading.getText();		
			System.out.print(text +" : ");
			
			WebElement findElement = driver.findElement(By.xpath("(//table[@class='dataTable']/tbody/tr/td["+i+"])["+row1+"]"));
			String text2 = findElement.getText();
			Thread.sleep(1000);
			System.out.println(text2);
			
		
		}
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}

}
