package com.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseLayer.baseClass;

public class HomePage extends baseClass{

	@FindBy(xpath="//span[@class='user-display']")
	WebElement LoggedUserName;
	
	@FindBy(linkText="Contacts")
	WebElement contactsLink;
	
	@FindBy(linkText="Deals")
	WebElement DealsLink;
	
	public HomePage(){
		// how intialize Page factory OR .
		PageFactory.initElements(driver, this);
	}
	
	public String LoggedUser() {
		String user=LoggedUserName.getText();
		return user;
	}

	public void ContactPageLink() {
		contactsLink.click();
	}
	
	public void ValidateDealsLink() {
		DealsLink.click();
	}
	
}
