package org.vishnu;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.seleniums.LibGlobal;

public class A extends LibGlobal {
	public static void main(String[] args) throws IOException, InterruptedException {
		LibGlobal global =new LibGlobal();
		global.getDriver();
		global.launchurl("https://www.facebook.com/");
		WebElement txtusr =driver.findElement(By.id("email"));
		global.enterText(txtusr, "vishnu");
//		global.takeScreenShot("username");
		WebElement btn=driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		global.btnclick(btn);
		Thread.sleep(3000);
		WebElement month = driver.findElement(By.id("month"));
//		global.dropDownIndex(month, 4);
//		global.dropDownText(month,"Mar");
		global.getAllOptions(month, 4);
	}
}
