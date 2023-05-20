package com.demo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demo.testbase.TestBase;

public class SignupPage extends TestBase {
	
	//page factory:
	@FindBy(xpath="//div[@id='content']")
	WebElement pageHeading;
	
	@FindBy(name="firstname")
	WebElement firstName;
	
	@FindBy(name="lastname")
	WebElement lastName;
	
	@FindBy(name="email")
	WebElement email;
	
	@FindBy(name="telephone")
	WebElement phone;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(name="confirm")
	WebElement confirmPass;
	
	@FindBy(xpath="//input[@name='agree']")
	WebElement agreeToPolicy;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement continueBtn;
	
	@FindBy(xpath="//h1[contains(text(),'Your Account Has Been Created!')]")
	WebElement successMsg;
	
	//initializing the page objects:
	public SignupPage() {
		PageFactory.initElements(driver, this);
	}
	
	//actions:
	public String validateSignupPageTitle() {
		return driver.getTitle();
	}
	
	public void enterFirstName(String fName) {
			waitForElement(driver, firstName);
			firstName.sendKeys(fName);
		}
	
	public void enterLastName(String lName) {
		waitForElement(driver, lastName);
		lastName.sendKeys(lName);
	}
	
	public void enterEmail(String emailAdd) {
		waitForElement(driver, email);
		email.sendKeys(emailAdd);
	}
	
	public void enterphone(String number) {
		waitForElement(driver, phone);
		 phone.sendKeys(number);
	}
	
	public void enterPass(String pass) {
		waitForElement(driver, password);
		password.sendKeys(pass);
	}
	
	public void confirmPwd(String pass2) {
		waitForElement(driver, confirmPass);
		confirmPass.sendKeys(pass2);
	}
	
	public boolean completeRegistration() {
		agreeToPolicy.click();
		continueBtn.click();
		waitForElement(driver, successMsg);
		return successMsg.isDisplayed();
	}
	
}
