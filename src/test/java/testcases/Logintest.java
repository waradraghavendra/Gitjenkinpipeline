package testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pageobjects.Loginpage;
import utility.Util;

public class Logintest  extends Util {
 

	@Test
	public void testlogin() throws InterruptedException {
		
		Loginpage login = new Loginpage(driver);
		login.usedetails();
	}
}
