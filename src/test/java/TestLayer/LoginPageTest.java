package TestLayer;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import com.BaseLayer.baseClass;
import com.PageLayer.LoginPage;
import com.UtilsLayer.UtilsClass;

public class LoginPageTest extends baseClass {
	LoginPage loginpage;
	
	
	 @BeforeClass
	public void setUp() {
		
		//UtilsClass.setDateforLog4j();
		baseClass.initlization();
		loginpage = new LoginPage();
	}

	@Test
	public void ValidateLoginFunctionality() {
	
		loginpage.usernameEnter(prop.getProperty("username"));
		loginpage.passEnter(prop.getProperty("password"));
		loginpage.clickOnLoginButton();
	}

	@AfterClass
	public void tearDown() {
		driver.close();
		//logger.info("browser terminated*****************************************************S");
	}
}
