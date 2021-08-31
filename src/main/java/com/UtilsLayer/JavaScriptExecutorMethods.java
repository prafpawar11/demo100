package com.UtilsLayer;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.BaseLayer.baseClass;

public class JavaScriptExecutorMethods extends baseClass {
	public static JavascriptExecutor js;

	public static void clickonElementByJS(WebElement wb) {
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", wb);	
	}
	
	public static void enterDataintextBoxByJS(WebElement wb,String a) {
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].value='"+a+"'", wb);
	}
	
	public static void scrollEndOfPageByJS() {
		js=(JavascriptExecutor)driver;
		js.executeScript("window.scrolBy(0,document.documentbody.scrollHeight);");
	}
	
	public static void scrollToElementByJS(WebElement wb) {
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoview(true);",wb );
	}
	
	public static void flashElementByJS(WebElement wb)
	{
		js=(JavascriptExecutor)driver;
		String bgcolor=wb.getCssValue("background-color");
		
		for(int i=0;i<100;i++)
		{
			JavaScriptExecutorMethods.changeColor(bgcolor, wb);
			JavaScriptExecutorMethods.changeColor("rgb(0,0,0)", wb);
		}
		
	}
	
	public static void changeColor(String color, WebElement wb) {
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].style.backgroundColor ='"+color+"'", wb);
	}
	
	
	
	
}
