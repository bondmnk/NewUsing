package POMclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericUtility.DataUtility;

public class HotelsPage {

	
	
	//Initializing of all the web elements
	public HotelsPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="txtHotelCity")
	private WebElement CityInputTextField;
	
	@FindBy(xpath="//a[text()='Search Now']")
	private WebElement searchNowForHotelsButton;
	
	@FindBy(id="from")
	private WebElement fromDate;
	
	public WebElement getCityInputTextField() {
		return CityInputTextField;
	}
	public WebElement getsearchNowForHotelsButton() {
		return searchNowForHotelsButton;
	}
	public WebElement getFromDate() {
		return fromDate;
	}
	public void selectDatesForHotels(WebDriver driver, long fromdate, long todate) throws Throwable {
		driver.findElement(By.xpath("//a[text()='"+fromdate+"']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='"+todate+"']")).click();	
	}
	
}
