package com.task;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.commonactions.CommonMethods;

public class Interview extends CommonMethods{
	static int k=2;
	public static void main(String[] args) {
		CommonMethods C = new CommonMethods();
		C.launch("https://www.countries-ofthe-world.com/capitals-of-the-world.html");
		while(k>0) {
			Scanner S = new Scanner(System.in);
			String next = S.next();
		List<WebElement> datas = driver.findElements(By.xpath("//table[@class='two-column td-red']/tbody/tr/td"));
		for(int i=1;i<datas.size();i++) {
			WebElement element = datas.get(i);
			String Actualtext = element.getText();
			if(Actualtext.equals(next)) {
				int j=i+1;
				WebElement Output = driver.findElement(By.xpath("(//table[@class='two-column td-red']/tbody/tr/td)["+j+"]"));
				String text = Output.getText();
				System.out.println(text);
				
			}
			
		}
		k--;

	 }
		
		
	}
	
	
	

}
