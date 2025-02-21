package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class LoginPage extends TestBase {

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//a[text()='Log in']")
	WebElement loginBtn;

	@FindBy(xpath = "//input[@placeholder='Enter registered email']")
	WebElement enterEmail;

	@FindBy(xpath = "//input[@placeholder='Enter password']")
	WebElement enterPassword;

	@FindBy(xpath = "//button[text()='LOGIN']")
	WebElement loginButtonWithUserNamePassword;

	public void verifyUserLogin() {
		
		String userName = prop.getProperty("username");
		String password = prop.getProperty("password"); 
//		loginBtn.click();
//		enterEmail.sendKeys(userName);          
//		enterPassword.sendKeys(password);
//		loginButtonWithUserNamePassword.click();
	}
}