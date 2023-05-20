package com.demo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demo.testbase.TestBase;

public class LandingPage extends TestBase {
	
	LandingPage landingpage;
	
	//page factory
	@FindBy(xpath="//a[@title='My Account']")
	WebElement myAccountMenu;
	
	@FindBy(xpath="//a[@href='https://tutorialsninja.com/demo/index.php?route=account/register']")
	WebElement register;
	
	@FindBy(xpath="//a[@href='https://tutorialsninja.com/demo/index.php?route=account/login']")
	WebElement loginLink;
	
	@FindBy(xpath="//a[@href='https://tutorialsninja.com/demo/index.php?route=account/logout']")
	WebElement logoutLink;
	
	//initializing the page objects:
	public LandingPage() {
		PageFactory.initElements(driver, this);
	}
	
	//actions:
	public SignupPage goToSignupPage() {
		myAccountMenu.click();
		waitForElement(driver, register);
		register.click();
		return new SignupPage();
	}
	
	public LoginPage goToLoginPage() {
		myAccountMenu.click();
		waitForElement(driver, loginLink);
		loginLink.click();
		return new LoginPage();
	}
	
	public LoginPage logoutApplication() {
		myAccountMenu.click();
		waitForElement(driver, logoutLink);
		logoutLink.click();
		return new LoginPage();
	}
	
}
