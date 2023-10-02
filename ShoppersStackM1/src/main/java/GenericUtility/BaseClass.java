package GenericUtility;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import POMclasses.HomePage;
import POMclasses.LoginPage;
import POMclasses.WelComePage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	String browser;
	public static  WebDriver driver;
	DataUtility data=new DataUtility();
	
	
	@Parameters("Browser")
	@BeforeClass
	public   void lanchTheBrowser(String Browser) throws Throwable {
		System.out.println("-----------------Lanching the Browser---------------");
//		String Browser=data.fetchingPropertiesFileData("browser");
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		
		if(Browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver(option); 
		}
		else if(Browser.equals("firefox")) {
		System.setProperty("webDriver.gecko.driver", "./Drivers/geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else if(Browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		else {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		
		String URL=data.fetchingPropertiesFileData("url");
	     driver.get(URL);
	} 
	
	@BeforeMethod
	public void loginToapplication() throws Throwable {
	 	System.out.println("-----------------Login to application-----------------");
	
		WelComePage welcomepage = new WelComePage(driver);
		welcomepage.getLoginButton().click();
		
		String MOBILENUMBER=data.fetchingPropertiesFileData("mobileNo");
		String PASSWORD=data.fetchingPropertiesFileData("password");
		
	LoginPage loginpage = new LoginPage(driver); 
	
	loginpage.getMobileNumber().sendKeys(MOBILENUMBER);
		loginpage.getPasswordTextField().sendKeys(PASSWORD);
		loginpage.getloginButton().click();
		
	}
	
	@AfterMethod
	public void logoutToApplication() throws Throwable {
		System.out.println("-----------------Logout the appliaction-----------------");

		 HomePage homepage= new HomePage(driver);
		homepage.getUserNameText().click();
		homepage.getLogoutLink().click();
	}
	 
	
	@AfterClass
	public void aftermethod() throws Throwable {
		System.out.println("-----------------Closing the server-----------------");
		Thread.sleep(3000);
		driver.quit();
	}
}
