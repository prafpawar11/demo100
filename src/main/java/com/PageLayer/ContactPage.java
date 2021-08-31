package com.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseLayer.baseClass;

public class ContactPage extends baseClass {

	@FindBy(xpath="//a[@href='/contacts/new']")
	WebElement createUser;
	
	@FindBy(name="first_name")
	WebElement firstName;
	
	@FindBy(name="last_name")
	WebElement lastName;
		
	@FindBy(name="middle_name")
	WebElement middleName;
	
	@FindBy(name="value")
	WebElement emailId;
	

	public ContactPage(){
		PageFactory.initElements(driver, this);
	}
	
	public void createUsers() {
		createUser.click();
	}
	
	public void enterFirstName(String firstname) {
		firstName.sendKeys(firstname);
	}
	
	public void enterLastName(String lname) {
		lastName.sendKeys(lname);
	}

	public void ValidateMiddleName(String mName)
	{
		middleName.sendKeys(mName);
	}
	
	public void validateEmailTextBox(String abc) {
		emailId.sendKeys(abc);
	}
	
	
}
