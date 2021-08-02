package org.maven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {
	public static void main(String[] args) throws IOException {
		File f =new File("C:\\Users\\user\\Desktop\\java Files\\Java Programming\\mavenProject\\TestData\\Book1.xlsx");
		FileInputStream stream =new FileInputStream(f);
		Workbook b=new XSSFWorkbook(stream);
        Sheet s=b.getSheet("sheet1"); 
        for(int i=0;i<s.getPhysicalNumberOfRows();i++)
        {
        	Row r=s.getRow(i);
        	for(int j=0;j<r.getPhysicalNumberOfCells();j++)
        	{
        		Cell c = r.getCell(j);
        		int cellType = c.getCellType();
        		if(cellType==1)
        		{
        			String ss = c.getStringCellValue();
        		    System.out.print(ss+"|| ");
        		}
//        		else if(DateUtil.isCellDateFormatted(c))
//        		{
//        			 Date d=c.getDateCellValue();
//        		     SimpleDateFormat date=new SimpleDateFormat("mmm-dd-yyyy");
//        		     System.out.println(date);
//        		}
        		    else
        		    {
        		    	double d=c.getNumericCellValue();
        		    	long l=(long)d;
        		    	System.out.print(l+"|| ");
        		    	
        		    }
        		}
        	System.out.println(" ");
        	}
        
        }
	}

