package com.UtilsLayer;

import com.BaseLayer.baseClass;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


public class ExtentReportSetUp extends baseClass {
	
	public static ExtentSparkReporter sparkReports;
	public static ExtentReports extent;
	public static ExtentTest extentTest;

	

	public static ExtentReports extentReportSetUp() {

		sparkReports=new ExtentSparkReporter(System.getProperty("user.dir")+"/Reports/extent.html");
		extent=new ExtentReports();
		extent.attachReporter(sparkReports);
		
		sparkReports.config().setTheme(Theme.DARK);
		sparkReports.config().setDocumentTitle("Automation Test Reports");
		
		return extent;
		
	}
	
}
