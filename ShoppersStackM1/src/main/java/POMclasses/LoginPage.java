package POMclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
		public WebDriver driver;
		//Initializing of all the web elements
		public LoginPage(WebDriver driver){
			PageFactory.initElements(driver, this);
		}
	
		//declaration of web elements
		@FindBy(xpath="//input[@data-testid='user-mobileno-input-box']")
		private WebElement MobileNumber;
		
		@FindBy(xpath="//input[@data-testid='password-input-box-cta']")
		private WebElement passwordTextField;
		
		@FindBy(xpath ="//div[@data-testid='login-cta']")
		private WebElement loginButton;
		
		
		//getters methods
		public WebElement getMobileNumber() {
			return MobileNumber;
		}

		public WebElement getPasswordTextField() {
			return passwordTextField;
		}

		public WebElement getloginButton() {
			return loginButton;
		}

	
		
		
}
