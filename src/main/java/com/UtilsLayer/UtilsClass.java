package com.UtilsLayer;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.BaseLayer.baseClass;

public class UtilsClass extends baseClass {
	public static Select sel;

	// handle drop down
	public static void handleDropDown(WebElement wb, String text) {
		sel = new Select(wb);
		sel.selectByVisibleText(text);
	}

	public static int countDropDownList(WebElement wb) {
		sel = new Select(wb);
		List<WebElement> ls = sel.getOptions();
		int count = ls.size();
		return count;
	}

	public static void explicitWait(By by, int seconds) {
		WebDriverWait wait = new WebDriverWait(driver, seconds);
		wait.until(ExpectedConditions.visibilityOfElementLocated(by));
	}

	public static void TakeScreenShotAttheEnd() {
		File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File dist = new File(System.getProperty("user.dir") + "\screenShot" + System.currentTimeMillis() + ".png");
		try {
			FileUtils.copyFile(f, dist);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void switchToAlertPop() {
		driver.switchTo().alert();
	}

	public static String CaptureAlertPoptext() {
		String data = driver.switchTo().alert().getText();
		return data;
	}

	public static void SendDataTOAlertPop(String data) {
		driver.switchTo().alert().sendKeys(data);
	}

	public static void ClickOnOkButtonOnAlertPop() {
		driver.switchTo().alert().accept();
	}

	public static void ClickOnCancelButtonOnAlertPop() {
		driver.switchTo().alert().dismiss();
	}

	public static void switchToFrameByFrameName(String frameName) {
		driver.switchTo().frame(frameName);
	}

	public static void switchTopFrame() {
		driver.switchTo().defaultContent();
	}

	public static void handleTables(WebElement wb, By by, String tableValues) {
		List<WebElement> ls = wb.findElements(by);
		
		for(WebElement abc:ls)
		{
			String tableData=abc.getText();
			if(tableData.contains(tableValues))
			{
				System.out.println("data is present in table");
			}
		}
	}
	
	
	public static void setDateforLog4j() {
		SimpleDateFormat dateformat=new SimpleDateFormat("_ddMMyyyy_HHmmss");
		System.getProperty("current_date",dateformat.format(new Date()));
		PropertyConfigurator.configure("C:\\Users\\l470\\eclipse-workspace\\FreeCRMApplication\\src\\main\\resources\\log4j.properties");
	}
	
	

}
