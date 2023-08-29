package com.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.commonactions.CommonMethods;

public class FramesTask extends CommonMethods{

	public static void main(String[] args) {
		CommonMethods C = new CommonMethods();
		C.launch("https://chercher.tech/practice/frames");
		int size = driver.findElements(By.tagName("iframe")).size();
		System.out.println(size);
		
		for(int i=0;i<size;i++) {
			try {
			driver.switchTo().frame(i);
			WebElement element = driver.findElement(By.xpath("//select[@id='animals']"));
			if (element.isDisplayed()) {
				Select S = new Select(element);
				S.selectByVisibleText("Baby Cat");
			}		
			}
			catch(Exception e) {
				System.out.println(e.toString());
			}
			
			
		}
		
	}

}
