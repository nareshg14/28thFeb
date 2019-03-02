package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Depends {
	
	@Test(dependsOnMethods = "login")
	public void logout(){
		System.out.println("Logging out from the application");
	}
	
	@Test
	public void login(){
		System.out.println("Logging into application");
		Assert.fail();
	}

}
