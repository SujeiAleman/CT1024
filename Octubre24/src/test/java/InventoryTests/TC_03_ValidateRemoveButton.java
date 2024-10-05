package InventoryTests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonMethods.GlobalVariables;
import pageObjects.LoginPage;
import pageObjects.inventoryPage;
import setupDriver.DriverSetup;

public class TC_03_ValidateRemoveButton {
	
	// Declarar e inicializar el WebDriver
	WebDriver driver = DriverSetup.setupDriver();
	
	//PageObjects
	LoginPage loginPage = new LoginPage(driver);
	inventoryPage invPage = new inventoryPage(driver);
	
	@BeforeTest
	public void startWebDriver() {
		driver.get(GlobalVariables.HOME_PAGE);
	}
	
	@Test
	public void TC_01() {
		//Step 1 Login
		loginPage.login(GlobalVariables.STANDARD_USER, GlobalVariables.ALL_USER_PWD);
		Assert.assertTrue(invPage.addToCartAndVerifyRemoveButton());
	}
	
	@AfterTest
	public void closerDriver() {
		driver.quit();
	}

}
