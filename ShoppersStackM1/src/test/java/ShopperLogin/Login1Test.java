package ShopperLogin;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import GenericUtility.BaseClass;
import GenericUtility.DataUtility;
import POMclasses.HomePage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login1Test extends BaseClass{
	HomePage homePage=	new HomePage(driver);
	@Test()
	public void TC_Login_001() throws Throwable {
		System.out.println("The first test case");
		
	} 
	@Test()
public void TC_Login_002() throws Throwable {
		System.out.println("The second test case");
		
	} 
}
