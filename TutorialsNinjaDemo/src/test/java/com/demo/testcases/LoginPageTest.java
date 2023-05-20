package com.demo.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.demo.pages.HomePage;
import com.demo.pages.LandingPage;
import com.demo.pages.LoginPage;
import com.demo.testbase.TestBase;

public class LoginPageTest extends TestBase {
	
	public LoginPageTest() {
		super();
	}
	
	LandingPage landingpage;
	LoginPage loginpage; 
	HomePage homepage;
	
	@BeforeMethod
	public void Setup() {
		initialization();
		landingpage = new LandingPage();
		loginpage = new LoginPage();
		landingpage.goToLoginPage();
	}
	
	@Test(priority=1)
	public void validateLoginTitle() {
		String title = loginpage.validateLoginPageTitle();
		Assert.assertEquals(title, "Account Login");
	}
	
	@Test(priority=2)
	public void validateLogin() {
		homepage= loginpage.validateUserLogin(prop.getProperty("username"), prop.getProperty("password"));
		homepage.navigatedToHomePage();
		landingpage.logoutApplication();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
