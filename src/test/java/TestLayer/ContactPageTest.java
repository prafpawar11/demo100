package TestLayer;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.BaseLayer.baseClass;
import com.PageLayer.ContactPage;
import com.PageLayer.HomePage;
import com.PageLayer.LoginPage;

public class ContactPageTest extends baseClass{

	LoginPageTest loginpagetest;
	LoginPage loginpage;
	HomePage homepage;
	ContactPage contactpage;
	
	@BeforeClass
	public void setUp() {
		baseClass.initlization();
		loginpage=new LoginPage();
		homepage=new HomePage();
		contactpage=new ContactPage();
		loginpagetest =new LoginPageTest();
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
	public void validateContactLink() {
		homepage.ContactPageLink();
	}
	
	
	@Test(priority=4)
	public void ValidateCreateNewUserInContactPage() {
		
		contactpage.createUsers();
	}
	
	@Test(priority=5)
	public void ValidateFirstNameIncontactPage() {
		contactpage.enterFirstName("amit");
	}
	
	@Test(priority=6)
	public void ValidateMiddleNameIncontactPage() {
		contactpage.ValidateMiddleName("pandit");
	}
	
	@Test(priority=7)
	public void ValidateLastNameIncontactPage() {
		contactpage.enterLastName("abc");
	}
	
	@Test(priority=8)
	public void ValidateEmailIdIncontactPage() {
		contactpage.validateEmailTextBox("abc@gmail.com");
	}
	
	
	@AfterClass
	public void tearDown() {
		driver.close();
	}
	

}
