package com.ict.tms.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver webDriver;
	
	@FindBy(id="floatingInput")
	private WebElement emailAddress;
	
	@FindBy(id="floatingPassword")
	private WebElement password;
	
	@FindBy(css = "button[type = \"submit\"]")
	private WebElement loginButton;
	
	public LoginPage(WebDriver webDriver) {
		this.webDriver = webDriver;
		
		PageFactory.initElements(webDriver, this);
	}
	
	public void sendEmailAddress(String emailId) {
		emailAddress.sendKeys(emailId);
	}
	
	public void sendPassword(String pwd) {
		password.sendKeys(pwd);
	}
	
	public void clickLogin() {
		loginButton.click();
	}

}
