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

public class WriteData {
	public static void main(String[] args) throws IOException {
		File file=new File("C:\\Users\\user\\Desktop\\java Files\\Java Programming\\mavenProject\\TestData\\Book2.xlsx");
	    FileInputStream stream =new FileInputStream(file);
	    Workbook book =new XSSFWorkbook(stream);
	    Sheet sheet =book.createSheet("Alpha");
	    Row row =sheet.createRow(2);
	    Cell cell =row.createCell(2);
	    cell.setCellValue("vishnu");
	    FileOutputStream stream1 =new FileOutputStream(file);
	    book.write(stream1);
	    
	}
}
