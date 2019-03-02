package testNG;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkipTests {
	
	@Test
	public void login(){
		throw new SkipException("I don't want to execute Login method");
	}
	
	@Test
	public void openBrowser(){
		System.out.println("Opening Browser");
	}

}
