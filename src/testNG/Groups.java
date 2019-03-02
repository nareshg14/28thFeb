package testNG;

import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Groups {
	
	@BeforeSuite
	public void beforeSuite(){
		System.out.println("Before Suite");
	}
	
	@BeforeGroups(groups = "smoke")
	public void checkVPNStatus(){
		System.out.println("Checking VPN Status");
	}
		
	@Test(groups = "smoke")
	public void bookFlight(){
		System.out.println("Booking Flights");
	}
	
	@Test(groups = "regression")
	public void cancelFlight(){
		System.out.println("Cancelling Flights");
	}
	
	@Test(groups = "regression")
	public void updateFlight(){
		System.out.println("Updating Flight");
	}

}
