package loginTests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonMethods.GlobalVariables;
import commonMethods.WrapClass;
import pageObjects.LoginPage;
import setupDriver.DriverSetup;

public class TC_01_Login {
	
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
		loginPage.login(GlobalVariables.STANDARD_USER, GlobalVariables.ALL_USER_PWD);
	}
	
	@AfterTest
	public void closerDriver() {
		WrapClass.takeScreenshot(driver, "TC_01_LOGIN");
		driver.quit();
	}

}
