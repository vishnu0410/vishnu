package org.maven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataUpdate {
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\user\\Desktop\\java Files\\Java Programming\\mavenProject\\TestData\\Book1.xlsx");
	    FileInputStream stream =new FileInputStream(file);
	    Workbook book = new XSSFWorkbook(stream);
//	    Sheet sheet =book.createSheet("Vishnu");
//	    Row row =sheet.createRow(2);
//	    Cell createCell = row.createCell(2);
//	    createCell.setCellValue("vardhan");
//	    FileOutputStream stream1 =new FileOutputStream(file);
//	    book.write(stream1);
	    Sheet sheet = book.getSheet("Vishnu");
	    Row row =sheet.getRow(2);
	    Cell cell = row.getCell(2);
	    String ss = cell.getStringCellValue();
	    System.out.println(ss);
	}
}
