package com.ict.tms.script.login;


import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.ict.tms.config.AbstractBaseTest;
import com.ict.tms.pages.LoginPage;
import com.ict.tms.util.ExcelUtil;

public class LoginScripts extends AbstractBaseTest {
	
	private LoginPage login() {
		return App().Page().login();
	}
	
	@Test
	public void verifyValidLogin() {
		
		String emailId = ExcelUtil.getCellData(0, 0);
		String password = ExcelUtil.getCellData(0, 1);
		
		login().sendEmailAddress(emailId);
		
		login().sendPassword(password);
		
		login().clickLogin();		
		
		WebDriverWait wait = App().Flow().ofWebDriverWait(10L);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("app-admindash")));
		
		String currentUrl = App().Flow().getCurrentUrl();
	}

}
