package org.maven;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.seleniums.LibGlobal;

public class LoginPage extends LibGlobal {
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(id="username")
	private WebElement txtuserName;
	
	@FindBy(id="password")
	private WebElement txtPassword;
	
	@FindBy(id ="login")
	private WebElement btnlogin;

	public WebElement getTxtuserName() {
		return txtuserName;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getBtnlogin() {
		return btnlogin;
	} 
	
	
}
