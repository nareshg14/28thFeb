package testNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestingGmail {
	
	@BeforeTest
	public void login(){
		System.out.println("Logging into application");
	}
	@Test(priority = 1)
	public void sendEmail(){
		System.out.println("Sending Email");
	}
	@Test(priority = 2)
	public void deleteEmail(){
		System.out.println("Deleting Email");
	}
	
	@AfterTest
	public void logOut(){
		System.out.println("Logging out from the application");
	}

}
