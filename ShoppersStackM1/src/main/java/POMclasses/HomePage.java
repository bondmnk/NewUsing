package POMclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
 
	public WebDriver driver;
	
	//Initializing of all the web elements
	public HomePage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	//declaration of webelement 

	@FindBy(xpath="//div[text()='Hi Mustakim']")
	private WebElement UserNameText;

	@FindBy(xpath="//div[text()='Log Out']")
	private WebElement LogoutLink;

	@FindBy(xpath = "//div[text()='Hotels']")
	private WebElement HotelsMenuLink;
	
	
	//getters web elements
	
	
	public WebElement getUserNameText() {
		return UserNameText;
	}
	public WebElement getLogoutLink() {
		return LogoutLink;
	}
	public WebElement getHotelsMenuLink() {
		return HotelsMenuLink;
	}
}
