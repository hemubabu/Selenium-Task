package com.task;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.commonactions.CommonMethods;

public class ExcelWriteConcept extends CommonMethods{
	public static void main(String[] args) throws Exception {
		CommonMethods C = new CommonMethods();
		C.launch("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		WebElement search = driver.findElement(By.xpath("//input[@type='text']"));
		search.sendKeys("Oneplus",Keys.ENTER);
		File f = new File("C:\\Users\\HEMU\\eclipse-workspace2\\SeleniumTask\\target\\Oneplus.xlsx");
		Workbook W = new XSSFWorkbook();
		Sheet sheet = W.createSheet("Oneplus");

		List<WebElement> mobiles = driver.findElements(By.xpath("//a[contains(text(),'OnePlus ')]"));
		List<WebElement> Prices = driver.findElements(By.xpath("//div[@class='_30jeq3']"));
		for(int i=0;i<mobiles.size();i++) {
			WebElement phones = mobiles.get(i);
			String Oneplus = phones.getText();
			WebElement Price = Prices.get(i);
			String MobilePrice = Price.getText();
			Row row = sheet.createRow(i);
			Cell cell = row.createCell(1);
			Cell cell1 = row.createCell(2);
			cell.setCellValue(Oneplus);
			cell1.setCellValue(MobilePrice);		
		}
		FileOutputStream Fout = new FileOutputStream(f);
		W.write(Fout);
		
	
	}
	
	

}
