package org.maven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class MavenExcelData {
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\user\\Desktop\\java Files\\Java Programming\\mavenProject\\TestData\\Book1.xlsx");
		FileInputStream stream =new FileInputStream(file);
		Workbook book =new XSSFWorkbook(stream);
		Sheet sheet = book.getSheet("sheet1");
		Row row = sheet.getRow(6);
	    Cell cell = row.getCell(1);
	    String ss = cell.getStringCellValue();
	    System.out.println(ss);
	}
}
