package commonMethods;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class WrapClass {
	
	public static void click(WebElement webElement) {
		webElement.click();
	}
	
	public static void sendKeys(WebElement webElement, String textToSend) {
		webElement.sendKeys(textToSend);
	}
	
	public static boolean verifyElementDisplayed(WebElement webElement) {
		return webElement.isDisplayed();
	}
	
	public static void takeScreenshot(WebDriver webdriver, String testCaseName) {
		
		//Tome el screenshot de la página sin formato
		File scrFile = ((TakesScreenshot)webdriver).getScreenshotAs(OutputType.FILE);
		//Ruta para guardar el archivo
		String screenshotPAth = "./test-output/ExecutionResults";
		
		try {
			FileHandler.createDir(new File(screenshotPAth));//Creamos el folder usando la ruta especificada de la variable "screenshotPath"
			FileHandler.copy(scrFile, new File(screenshotPAth + File.separator + testCaseName + ".png"));
		} catch (IOException e) {
			//TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
