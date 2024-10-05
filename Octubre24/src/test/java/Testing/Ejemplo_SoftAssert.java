package Testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Ejemplo_SoftAssert {
  @Test
  public void Prueba2() {
 
	  WebDriver driver = new ChromeDriver();
		SoftAssert softAssert = new SoftAssert();
		
		driver.get("https://www.saucedemo.com/");
		
		String actualTitle = driver.getTitle();
		String expectedTitle = "Swag Labs";
		String badTitle = "My store";
		
		softAssert.assertEquals(actualTitle, expectedTitle); //Si fuera un hard Assert la ejecución se detendría aquí
		softAssert.assertEquals(actualTitle, expectedTitle);
		
		softAssert.assertAll();
  }
  
}
