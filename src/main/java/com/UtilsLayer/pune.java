package com.UtilsLayer;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

import com.BaseLayer.baseClass;

public class pune extends baseClass implements WebDriverEventListener{

	@Override
	public void beforeAlertAccept(WebDriver driver) {
		
		
	}

	@Override
	public void afterAlertAccept(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterAlertDismiss(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeAlertDismiss(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeNavigateTo(String url, WebDriver driver) {
		System.out.println("Before navigating to URL is ::"+url);
		
	}

	@Override
	public void afterNavigateTo(String url, WebDriver driver) {
		
		System.out.println("After navigating to URL is ::"+url);
		
	}

	@Override
	public void beforeNavigateBack(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterNavigateBack(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeNavigateForward(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterNavigateForward(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeNavigateRefresh(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterNavigateRefresh(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeFindBy(By by, WebElement element, WebDriver driver) {
		System.out.println("Before trying to find "+by.toString());
		
	}

	@Override
	public void afterFindBy(By by, WebElement element, WebDriver driver) {
		
		System.out.println("After finding the Element:: "+by.toString());
	}

	@Override
	public void beforeClickOn(WebElement element, WebDriver driver) {
		
		System.out.println("Trying to click on Element is ::"+element.toString());
		
	}

	@Override
	public void afterClickOn(WebElement element, WebDriver driver) {
		System.out.println("Clicked on Element is ::"+element.toString());
	}

	@Override
	public void beforeChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
		System.out.println("Before Changing the value of element is ::"+element.toString());
		
	}

	@Override
	public void afterChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
		
		System.out.println("After Changing the value of element is ::"+element.toString());
		
	}

	@Override
	public void beforeScript(String script, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterScript(String script, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeSwitchToWindow(String windowName, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterSwitchToWindow(String windowName, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onException(Throwable throwable, WebDriver driver) {
		System.out.println("Exception is occure");
		
		UtilsClass.TakeScreenShotAttheEnd();
		
	}

	@Override
	public <X> void beforeGetScreenshotAs(OutputType<X> target) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <X> void afterGetScreenshotAs(OutputType<X> target, X screenshot) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeGetText(WebElement element, WebDriver driver) {
		
		System.out.println("Before getting the element Text "+element.toString());
		
	}

	@Override
	public void afterGetText(WebElement element, WebDriver driver, String text) {
		
		System.out.println("After getting the element Text "+element.toString());
		
	}

}
