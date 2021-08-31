package TestLayer;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.BaseLayer.baseClass;
import com.PageLayer.ContactPage;
import com.PageLayer.DealsPage;
import com.PageLayer.HomePage;
import com.PageLayer.LoginPage;

public class DealsPageTest extends baseClass {

	LoginPage loginpage;
	HomePage homepage;
	ContactPage contactpage;
	DealsPage dealspage;
	
	@BeforeClass
	public void setUp() {
		baseClass.initlization();
		loginpage=new LoginPage();
		homepage=new HomePage();
		dealspage=new DealsPage();
	}
	
	@Test(priority=1)
	public void validateLoginFunctionality() {
		loginpage.usernameEnter("praf002@gmail.com");
		loginpage.passEnter("Pr@ful0812");
		loginpage.clickOnLoginButton();
	}
	
	@Test(priority=2)
	public void validateLoggedUserName() throws InterruptedException {
		
		String loggeduser=homepage.LoggedUser();
		String expectedName="Praful Pawar";
		Assert.assertEquals(loggeduser, expectedName);
		Thread.sleep(5000);
	}
	
	@Test(priority=3)
	public void validateDealsLink() {
		homepage.ValidateDealsLink();
	}
	
	@Test(priority=4)
	public void validateCreateNewDealsUsers() {
		
		dealspage.validateCreateDeals();
		
	}
	
	@Test(priority=5)
	public void validateTitleofDealsPage() {
		dealspage.validateTitleofDealsPage("Automation Testing");
	}
	
	@AfterClass
	public void tearDown() {
		driver.close();
	}
	
	
}
