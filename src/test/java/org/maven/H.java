package org.maven;

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


public class H extends LibGlobal {
	
	@BeforeClass
	public static  void beforeClass() {
		LibGlobal lib = new LibGlobal();
		lib.getDriver();
		lib.launchurl("https://www.facebook.com/");
	}
	
	@Before
	public void beforeMethod() {
	Date date = new Date();
	System.out.println(date);
	}
	@Test
	public void test() {
		WebElement txtuser = driver.findElement(By.id("email"));
		txtuser.sendKeys("Welcome");
		String attribute = txtuser.getAttribute("value");

		Assert.assertEquals("Welcome", attribute);
		
		WebElement txtpass =driver.findElement(By.id("pass"));
		txtpass.sendKeys("hi java");
		String attribute1=txtpass.getAttribute("value");
		System.out.println(attribute1);
		
		WebElement btnlogin=driver.findElement(By.name("login"));
		btnlogin.click();
	}
	@After
	public void after() {
		Date date = new Date();
		System.out.println(date);
	}
	@AfterClass
	public static void afterClass()
	{
		driver.close();
	}
}
