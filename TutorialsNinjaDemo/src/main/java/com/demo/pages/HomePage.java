package com.demo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demo.testbase.TestBase;

public class HomePage extends TestBase {
	
	@FindBy(xpath="//h2[contains(text(),'My Account')]")
	WebElement myAccount;

	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean navigatedToHomePage() {
		waitForElement(driver, myAccount);
		return myAccount.isDisplayed();
	}
	
}
