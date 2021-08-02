package org.maven;

import java.io.IOException;
import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.seleniums.LibGlobal;

public class Adactin2 extends LibGlobal {
	static LibGlobal global;
	@BeforeClass
	public static void beforeClass() {
		// TODO Auto-generated method stub
		global = new LibGlobal();
		global.getDriver();
		global.launchurl("https://adactinhotelapp.com/");
	}
	@Before
	public void beforeMethod() {
		// TODO Auto-generated method stub
		Date date = new Date();
		System.out.println(date);
	}
	@Test
	public void adctn() throws IOException
	{
		WebElement txtuser = driver.findElement(By.id("username"));
		global.enterText(txtuser, global.getDataFromExcel("C:\\Users\\user\\Desktop\\java Files\\Java Programming\\mavenProject\\TestData\\Book1.xlsx", "Sheet1", 2, 0));
		String attribute = txtuser.getAttribute("value");
		System.out.println(attribute);
		Assert.assertEquals(global.getDataFromExcel("C:\\Users\\user\\Desktop\\java Files\\Java Programming\\mavenProject\\TestData\\Book1.xlsx", "Sheet1", 2, 0), attribute);
		
		WebElement txtpass =driver.findElement(By.id("password"));
		global.enterText(txtpass,global.getDataFromExcel("C:\\Users\\user\\Desktop\\java Files\\Java Programming\\mavenProject\\TestData\\Book1.xlsx", "Sheet1", 2, 1));
		String attribute2=txtpass.getAttribute("value");
		System.out.println(attribute2);
		Assert.assertEquals(global.getDataFromExcel("C:\\Users\\user\\Desktop\\java Files\\Java Programming\\mavenProject\\TestData\\Book1.xlsx", "Sheet1", 2, 1), attribute2);
		WebElement btnlogin =driver.findElement(By.id("login"));
		btnlogin.click();
	}
	@After
	public void afterMethod() {
		// TODO Auto-generated method stub
		Date date = new Date();
		System.out.println(date);
	}
	@AfterClass
	public static void after() {
		// TODO Auto-generated method stub
		driver.close();
	}
}
