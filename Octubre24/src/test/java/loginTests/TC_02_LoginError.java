package loginTests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonMethods.GlobalVariables;
import pageObjects.LoginPage;
import setupDriver.DriverSetup;

public class TC_02_LoginError {
	
	// Declarar e inicializar el WebDriver
	WebDriver driver = DriverSetup.setupDriver();
	
	//PageObjects
	LoginPage loginPage = new LoginPage(driver);
	
	@BeforeTest
	public void startWebDriver() {
		driver.get(GlobalVariables.HOME_PAGE);
	}
	
	@Test
	public void TC_01() {
		//Step 1 Login
		loginPage.login(GlobalVariables.LOCKED_USER, GlobalVariables.ALL_USER_PWD);
		Assert.assertTrue(loginPage.validateblockedError());
	}
	
	@AfterTest
	public void closerDriver() {
		driver.quit();
	}

}
