package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonMethods.WrapClass;

public class inventoryPage {
	
	public inventoryPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//InventoryPage Web Elements
	@FindBy(id = "add-to-cart-sauce-labs-backpack")
	private WebElement addToCartBtn;
	@FindBy(id = "remove-sauce-labs-backpack")
	private WebElement removeToCartBtn;
	
	public boolean addToCartAndVerifyRemoveButton() {
		WrapClass.click(addToCartBtn);
		return WrapClass.verifyElementDisplayed(removeToCartBtn);
	}

}
