package com.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseLayer.baseClass;

public class LoginPage extends baseClass {
	// pom with page factory

	@FindBy(name = "email")
	WebElement username;

	@FindBy(name = "password")
	WebElement password;

	
	@FindBy(xpath="//*[text()='Login']")
	WebElement LoginButton;

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	// associated methods for Object repositories using without Page factory
	public void usernameEnter(String uname) {
		username.sendKeys(uname);
	}

	public void passEnter(String pass) {
		password.sendKeys(pass);
	}

	public void clickOnLoginButton() {
		LoginButton.click();
	}

}
