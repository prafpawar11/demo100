package com.BaseLayer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.UtilsLayer.pune;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseClass {

	public static WebDriver driver;
	public static Properties prop;
	public static EventFiringWebDriver edriver;
	public static pune eventListner;
	

	public baseClass() {
		prop = new Properties();
		try {
			FileInputStream fis = new FileInputStream(
					"C:\\Users\\l470\\eclipse-workspace\\FreeCRMApplication\\src\\main\\java\\com\\Config\\config.properties");
			prop.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void initlization() {
		String BrowserName = prop.getProperty("browsername");
		if (BrowserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\l470\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (BrowserName.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver",
					"C:\\Users\\l470\\Downloads\\edgedriver_win64\\msedgedriver.exe");

			driver = new EdgeDriver();
		} else if (BrowserName.equalsIgnoreCase("ie")) {
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		} else {
			System.out.println("Please Enter correct Browser Name");
		}

		edriver=new EventFiringWebDriver(driver);

		eventListner =new pune();
		edriver.register(eventListner );

		driver=edriver;
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(prop.getProperty("url"));
	}
}
