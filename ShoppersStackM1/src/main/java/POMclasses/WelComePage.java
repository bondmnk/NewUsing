package POMclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelComePage {
    
	public WebDriver driver;
	
	//Initializing of all the web elements
	public WelComePage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	//Declaration of Web elements 
	
	@FindBy(xpath="//div[text()='Login']")
	private WebElement LoginButton; 
	
	
	//getter method
	public WebElement getLoginButton() {
		return  LoginButton;
	}
	

	
}
