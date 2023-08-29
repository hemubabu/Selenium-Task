package com.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.commonactions.CommonMethods;

public class WebTableTask extends CommonMethods {
	static int rowvalue;
	static int colvalue;
	static int row=1;

	public static void main(String[] args) throws Exception {
		CommonMethods C = new CommonMethods();
		C.launch("https://demo.guru99.com/test/web-table-element.php");
		Thread.sleep(5000);
		//Using header
		int headersize = driver.findElements(By.xpath("//table[@class='dataTable']/thead//tr/th")).size();
		// to get specific row value using header
		for(int i=1;i<=headersize;i++) {
			WebElement HeaderElement = driver.findElement(By.xpath("//table[@class='dataTable']/thead/tr/th["+ i +"]"));
			String HeaderElements = HeaderElement.getText();
			System.out.print(HeaderElements+":");
			WebElement Element = driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr["+ row +"]/td["+ i +"]"));
			String Elements = Element.getText();
			System.out.println(Elements);
		}
		
		int rowsize = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr")).size();
		int colsize = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr[1]/td")).size();
		for(int i=1;i<=rowsize;i++) {
			for(int j=1;j<=colsize;j++) {
				WebElement element = driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr["+ i +"]/td["+ j +"]"));
				String text = element.getText();
				//System.out.println(text); // To get all text
				if(text.equals("Asian Paints Ltd.") && j<=colsize) {
//					for(j=1;j<=colsize;j++) {
//						WebElement element1 = driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr["+ i +"]/td["+ j +"]"));
//						String text1 = element1.getText();
//						System.out.println(text1); // To get particular text record value
//						
//					}
					System.out.println(text);
					System.out.println("row:"+i);
					System.out.println("col:"+j);
					rowvalue=i;
					colvalue=j;
					
				}
				
			}
			
		}
		// to get only column values
		for(int k=1;k<=rowsize;k++) {
			WebElement colelement = driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr["+ k +"]/td["+ colvalue +"]"));
			String colelements = colelement.getText();
			System.out.println(colelements);
		}
		// to get only row values
		for(int l=1;l<=colsize;l++) {
			WebElement rowelement = driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr["+ rowvalue +"]/td["+ l +"]"));
			String rowelements = rowelement.getText();
			System.out.println(rowelements);

		}
		
		
		
	
		
		
		
	}

}
