package com.ict.tms.script.login;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.ict.tms.constants.AppConstants;
import com.ict.tms.pages.LoginPage;
import com.ict.tms.script.TestBase;
import com.ict.tms.util.ExcelUtil;

public class LoginScripts extends TestBase {
	
	private LoginPage loginPage;
	
	@Test
	public void verifyValidLogin() {
		
		loginPage = new LoginPage(driver);
		
		String emailId = ExcelUtil.getCellData(0, 0);
		String password = ExcelUtil.getCellData(0, 1);
		
		loginPage.sendEmailAddress(emailId);
		
		loginPage.sendPassword(password);
		
		loginPage.clickLogin();
		
		String title = driver.getTitle();
		Assert.assertEquals(title, AppConstants.LOGIN_PAGE_TITLE);
		
				
		
	}

}
