package generics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import objectRepository.CalandarPage;
import objectRepository.CalculatorPage;
import objectRepository.ContactPage;
import objectRepository.ContactPageIT;
import objectRepository.HomePage;

import objectRepository.LeadPage;
import objectRepository.LeadPageIT;
import objectRepository.LoginPage;

import objectRepository.ProductPage;
import objectRepository.ProductPageIT;
import objectRepository.SearchBarFT;
import objectRepository.WorldClockPage;


public class Baseclass {
	public static WebDriver driver;
	public PropertyUtility property;
	public WebDriverUtility utility;
	public LoginPage login;
	public HomePage home;
	public ContactPage contact;
	public LeadPage lead;
	public ProductPage product;
	public CalandarPage calandar;
	public WorldClockPage clock;
	public CalculatorPage calculatorft;
	public SearchBarFT search;
	public ContactPageIT contactft;
	public LeadPageIT leadft;
	public ProductPageIT productft;

	@BeforeClass
	public void launchingBrowser()
	{
		property = new PropertyUtility();
		utility = new WebDriverUtility();

		if(property.readingDataFromPropertyFile("browser").equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
		}
		else if(property.readingDataFromPropertyFile("browser").equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();
		}
		else
		{
			WebDriverManager.edgedriver().setup();
			driver= new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@BeforeMethod
	public void navigatingtoApplication()
	{
		login = new LoginPage(driver);
		home = new HomePage(driver);
		contact= new ContactPage(driver);
		lead = new LeadPage(driver);
		product = new ProductPage(driver);
		calandar= new CalandarPage(driver);
		clock = new WorldClockPage(driver);
		calculatorft = new CalculatorPage(driver);
		search = new SearchBarFT(driver);
		contactft= new ContactPageIT(driver);
		leadft = new LeadPageIT(driver);
		productft = new ProductPageIT(driver);


		driver.get(property.readingDataFromPropertyFile("url"));
		login.loginToApplication(property.readingDataFromPropertyFile("username"), property.readingDataFromPropertyFile("password"));
	}
	@AfterMethod
	public void signOutFromApplication()
	{		
		utility.mouseHoveringOnElement(driver,home.getAdminIcon());
		home.getSignoutButton();
		System.out.println("signed out");
	}
	@AfterClass
	public void closingTheBrowser()
	{
		driver.quit();
	}
}
