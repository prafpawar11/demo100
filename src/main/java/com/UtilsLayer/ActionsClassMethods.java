package com.UtilsLayer;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.BaseLayer.baseClass;

public class ActionsClassMethods extends baseClass {
	public static Actions act;
	
	// perform Right Click operation..
	public static void rightClickOnElement(WebElement wb) {
		 act = new Actions(driver);
		act.contextClick(wb).build().perform();
	}
	
	public static void clickOnElementByActions(WebElement wb) {
		 act = new Actions(driver);
		act.click(wb).build().perform();
	}
	
	public static void dranAndDropByActions(WebElement source, WebElement target) {	
		act = new Actions(driver);
		act.dragAndDrop(source, target).release().build().perform();
	}
	
	public static void moveEndOfPageByActions() {
		act = new Actions(driver);
		act.keyDown(Keys.CONTROL).sendKeys(Keys.END).keyUp(Keys.CONTROL).build().perform();
	}
	
	public static void moveHomeOfPageByActions() {
		act = new Actions(driver);
		act.keyDown(Keys.CONTROL).sendKeys(Keys.HOME).keyUp(Keys.CONTROL).build().perform();
	}
	
	

}
