package org.maven;

import org.openqa.selenium.WebElement;
import org.seleniums.LibGlobal;

public class SampleJunit extends LibGlobal {
	public static void main(String[] args) {
		LibGlobal global = new LibGlobal();
		global.getDriver();
		global.launchurl("https://adactinhotelapp.com/");
		
		LoginPage page = new LoginPage();
		WebElement txtuserName = page.getTxtuserName();
		global.enterText(txtuserName, "vishnu");
		
		WebElement txtPassword = page.getTxtPassword();
		global.enterText(txtPassword, "123455678");
		
		WebElement btnlogin = page.getBtnlogin();
		global.btnclick(btnlogin);
		
	}
}
