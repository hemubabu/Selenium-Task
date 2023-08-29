package com.task;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.commonactions.CommonMethods;

public class DropDownTask extends CommonMethods{
	public static void main(String[] args) throws Throwable {
		CommonMethods C = new CommonMethods();
		C.launch("https://www.softwaretestingmaterial.com/sample-webpage-to-automate/");
		Thread.sleep(10000);
		WebElement Dropdown = driver.findElement(By.xpath("//select[@name='dropdown']"));
		Select S = new Select (Dropdown);
		S.selectByValue("ddselenium");
		Thread.sleep(3000);
		S.selectByVisibleText("Manual Testing");
		
		List<WebElement> Allselect = S.getOptions();
		for(WebElement Y:Allselect) {
			String SELALL = Y.getText();
			System.out.println(SELALL);
		}
		//Multiple dropdown
		WebElement Dropdown2 = driver.findElement(By.xpath("(//select[@class='spTextField'])[1]"));
		Select SS = new Select(Dropdown2);
		boolean equals = SS.isMultiple();
		System.out.println(equals);
		SS.selectByIndex(0);
		SS.selectByValue("msagile");
		SS.selectByVisibleText("Manual Testing");
		List<WebElement> Selopt = SS.getAllSelectedOptions();
		for(WebElement Z:Selopt) {
			String Selectopt = Z.getText();
			System.out.println(Selectopt);
		}
		Thread.sleep(3000);
		SS.deselectAll();
		driver.quit();
		
	}

}
