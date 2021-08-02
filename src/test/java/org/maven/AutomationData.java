package org.maven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AutomationData {
	

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\javaFiles\\Java Programming\\BrowseLaunch\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		WebElement countries=driver.findElement(By.xpath("//select[@placeholder='Month']"));
		Select s=new Select(countries);
		List<WebElement> li = s.getOptions();
		File file = new File("C:\\Users\\user\\Desktop\\java Files\\Java Programming\\mavenProject\\TestData\\Book2.xlsx");
		FileInputStream stream =new FileInputStream(file);
		Workbook book =new XSSFWorkbook(stream);
		Sheet sheet = book.getSheet("Yuvraj");
		for(int i=0;i<li.size();i++)
		{
			WebElement texts = li.get(i);
			String ss=texts.getText();
		System.out.println(ss);
		
		Row row = sheet.createRow(i);
		
		Cell cell = row.createCell(0);
		cell.setCellValue(ss);
		}
		FileOutputStream stream2 =new FileOutputStream(file);
		book.write(stream2);
		
		
	}
}
