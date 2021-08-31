package com.PageLayer;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseLayer.baseClass;

public class DealsPage extends baseClass {
	
	
	@FindBy(xpath="//a[@href='/deals/new']")
	WebElement createDeals;
	
	@FindBy(name="title")
	WebElement title1;
	

	public DealsPage()
	{
		PageFactory.initElements(driver, this);
	}
	

	public void validateCreateDeals() {
		createDeals.click();
	}
	
	public void validateTitleofDealsPage(String title) {
		title1.sendKeys(title);
	}
	
}
