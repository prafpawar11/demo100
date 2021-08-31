package TestLayer;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.BaseLayer.baseClass;
import com.PageLayer.HomePage;
import com.PageLayer.LoginPage;

public class HomePageTest extends baseClass {
	LoginPage loginpage;
	HomePage homepage;
	
	@BeforeClass
	public void setUp() {
		baseClass.initlization();
		loginpage=new LoginPage();
		homepage=new HomePage();
	}
	
	@Test(priority=1)
	public void validateLoginFunctionality() {
		loginpage.usernameEnter("praf002@gmail.com");
		loginpage.passEnter("Pr@ful0812");
		loginpage.clickOnLoginButton();
	}
	
	@Test(priority=2)
	public void validateLoggedUserName(){
		String loggeduser=homepage.LoggedUser();
		String expectedName="Praful Pawar";
		Assert.assertEquals(loggeduser, expectedName);
	}
	
	@Test(priority=3)
	public void validateContactLink() {
		homepage.ContactPageLink();
	}
	
	@Test(priority=4)
	public void validateDealsLink() {
		homepage.ValidateDealsLink();
	}
	
	@AfterClass
	public void tearDown() {
		driver.close();
	}
	
	
}
