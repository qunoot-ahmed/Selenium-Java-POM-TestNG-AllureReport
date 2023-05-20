package com.demo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demo.testbase.TestBase;

public class LoginPage extends TestBase {
	
	//page factory:
	@FindBy(xpath="//h2[contains(text(),'Returning Customer')]")
	WebElement returingUser;
	
	@FindBy(name="email")
	WebElement loginUser;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement loginBtn;
	
	//initializing the page objects:
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	//actions:
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	
	public HomePage validateUserLogin(String em, String pwd) {
		loginUser.sendKeys(em);
		password.sendKeys(pwd);
		loginBtn.click();
		return new HomePage();
	}
	

}
