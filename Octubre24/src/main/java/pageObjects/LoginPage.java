package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonMethods.WrapClass;

public class LoginPage {
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//LoginPage WebElements
	@FindBy(id = "user-name")
	private WebElement userNameTxt;
	@FindBy(id = "password")
	private WebElement pwdxt;
	@FindBy(name = "login-button")
	private WebElement loginBtn;
	@FindBy(xpath = "//*[@data-test ='error']")
	private WebElement errorTxt;
	
	public void login(String user, String pwd) {
		WrapClass.sendKeys(userNameTxt, user);
		WrapClass.sendKeys(pwdxt, pwd);
		WrapClass.click(loginBtn);

	}
	
	public boolean validateblockedError( ) {
		boolean errorDisplayed = errorTxt.getText().contains("Sorry, this user has been locked out.");
		return errorDisplayed;
	}
	

}
