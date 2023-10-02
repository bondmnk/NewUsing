package ShopperLogin;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import GenericUtility.BaseClass;
import GenericUtility.DataUtility;
import POMclasses.HomePage;
import POMclasses.HotelsPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login1Test extends BaseClass{
	
	@Test()
	public void TC_Login_001() throws Throwable {
		Thread.sleep(4000);
		System.out.println("The first test case");
		 HomePage homepage1= new HomePage(driver);
		 homepage1.getHotelsMenuLink().click();
		
		String MainWindow=driver.getWindowHandle();
		
		Set<String> allWindowId = driver.getWindowHandles();
		allWindowId.remove(MainWindow);
		
		for(String wind:allWindowId) {
			driver.switchTo().window(wind);
		}
		
		HotelsPage hotelpage = new HotelsPage(driver);
		DataUtility data=new DataUtility();
		String CITY=data.fetchingExelFileDataString("Sheet1", 1, 0);
		hotelpage.getCityInputTextField().sendKeys(CITY);
		
		
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		hotelpage.getFromDate().click();
		
		 long FromDate = data.fetchingExelFileDataNumeric("Sheet1", 1, 1);
		 long ToDate=data.fetchingExelFileDataNumeric("Sheet1", 1, 2);
		
		hotelpage.selectDatesForHotels(driver, FromDate, ToDate);
		hotelpage.getsearchNowForHotelsButton().click();
		
	//	driver.switchTo().alert().accept();
		
		Thread.sleep(7000);
		driver.switchTo().window(MainWindow);
		
	} 
	@Test()
public void TC_Login_002() throws Throwable {
		System.out.println("The second test case");
		
	} 
}
