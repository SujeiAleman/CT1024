package JavaTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selenium_Test {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		//Identificando los webElements/objetos de la página web
		WebElement userTxt = driver.findElement(By.id("user-name"));
		WebElement pwdTxt = driver.findElement(By.id("password"));
		WebElement btnLogin = driver.findElement(By.id("login-button"));
		
		//Login
		userTxt.sendKeys("standard_user");
		Thread.sleep(2000);
		pwdTxt.sendKeys("secret_sauce");
		Thread.sleep(2000);
		btnLogin.click();
		
		//Método del explorador
		String title = driver.getTitle();
		System.out.println("El título es:" + title);
		
		String url = driver.getCurrentUrl();
		System.out.println("La url actual es:" + url);
		
		//Métodos de navegación
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		//Verificar que el elemento este desplegado
		boolean prodContainer = driver.findElement(By.className("inventory_item_name")).isDisplayed();	
		if(prodContainer) {
			System.out.println("El artículo es desplegado");
		}
		
		//Obtener Texto
		String prodName = driver.findElement(By.className("inventory_item_name")).getText();
		System.out.println("El texto del elemento es:" + prodName);
		
		if(prodName.contains("Sauce Labs Backpack")) { //el método .contains valida que 2 strings sean iguales
				System.out.println("El nombre del prodcuto es correcto");
		}	
		
		//Interactuar con dropdowns
		Select prodContainerDrp = new Select(driver.findElement(By.className("product_sort_container")));
		prodContainerDrp.selectByVisibleText("Price (low to high)");
		
		//Como cerrar el navegador
		//driver.close(); //Cierra la ventana o pestala actual que el webdriver
		driver.quit(); //Cierra todas las ventanas que el webdriver abrió durante la ejecución
		
	}
}
