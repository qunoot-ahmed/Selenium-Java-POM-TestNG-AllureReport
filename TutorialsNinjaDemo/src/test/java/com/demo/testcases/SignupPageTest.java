package com.demo.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.demo.pages.LandingPage;
import com.demo.pages.SignupPage;
import com.demo.testbase.TestBase;
import com.demo.util.ExcelReader;

public class SignupPageTest extends TestBase{
	
	public SignupPageTest() {
		super();
	}
	
	ExcelReader excReader;
	LandingPage landingpage;
	SignupPage signupage;
	
	@BeforeMethod
	public void Setup() {
		initialization();
		landingpage = new LandingPage();
		signupage = new SignupPage();
		landingpage.goToSignupPage();
	}
	
	@Test(priority=1)
	public void validateSignupTitle() {
		String title = signupage.validateSignupPageTitle();
		Assert.assertEquals(title, "Register Account");
	}
	
	@Test(priority=2)
	public void registerForNewAccount() {
		excReader = new ExcelReader();
		excReader.readExcelFile();
		
		String fn = excReader.GetCellValue(1, 0);
		String ln = excReader.GetCellValue(1, 1);
		String em = excReader.GetCellValue(1, 2);
		String pass = excReader.GetCellValue(1, 4);
		String pass2 = excReader.GetCellValue(1, 5);

		signupage.enterFirstName(fn);
		signupage.enterLastName(ln);
		signupage.enterEmail(em);
		signupage.enterphone("1233652324");
		signupage.enterPass(pass);
		signupage.confirmPwd(pass2);
		signupage.completeRegistration();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
}
