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

public class ExcelAllData {
	public static void main(String[] args) throws IOException {
		File file =new File("C:\\Users\\user\\Desktop\\java Files\\Java Programming\\mavenProject\\TestData\\Book1.xlsx");
		FileInputStream stream =new FileInputStream(file);
		Workbook book =new XSSFWorkbook(stream);
		Sheet sheet = book.getSheet("sheet1");
		for(int i=0;i<sheet.getPhysicalNumberOfRows();i++)
		{
			Row row = sheet.getRow(i);
			for(int j=0;j<row.getPhysicalNumberOfCells();j++)
			{
				Cell cell = row.getCell(j);
				switch(cell.getCellType())
				{
				case Cell.CELL_TYPE_STRING:
					System.out.print(row.getCell(j).getStringCellValue()+"|| ");
					break;
				case Cell.CELL_TYPE_NUMERIC:
					System.out.print((int)row.getCell(j).getNumericCellValue()+"|| ");
					break;
				}
			}
			System.out.println();
		}
	}
}
