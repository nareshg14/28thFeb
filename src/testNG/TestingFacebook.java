package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestingFacebook {
	
	@BeforeTest
	public void openBrowser(){
		System.out.println("Opening Browser");
	}
	
	@AfterTest
	public void closeBrowser(){
		System.out.println("Closing Browser");
	}
	
	@BeforeMethod
	public void loginFacebook(){
		System.out.println("Logging into Facebook");
	}
	
	@Test
	public void updateProfile(){
		System.out.println("Updating Profile");
	}
	
	@Test
	public void sharePicture(){
		System.out.println("Sharing Picture");
	}
	
	@AfterMethod
	public void logoutFacebook(){
		System.out.println("Logging out from Facebook");
	}
	
	@BeforeClass
	public void connectDB(){
		System.out.println("Connecting to DB");
	}
	
	@AfterClass
	public void disconnectDB(){
		System.out.println("Disconnecting from DB");
	}

}
