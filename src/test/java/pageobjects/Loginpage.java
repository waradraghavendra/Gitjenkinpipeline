package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.Util;

public class Loginpage {

	WebDriver driver;
	
	@FindBy(id = "user[login]")
	WebElement username;

	@FindBy(xpath = "user[email]")
	 WebElement email;

	@FindBy(xpath = "user[password]")
	 WebElement password;

	public Loginpage(WebDriver driver) {
	
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}

	public void usedetails() throws InterruptedException {
		Thread.sleep(3000);
		username.sendKeys("raghavwra");
		System.out.println("Entered user name");
		/*
		 * email.sendKeys("raghavwar@gmail.com"); password.sendKeys("12345");
		 */
	
	}

}