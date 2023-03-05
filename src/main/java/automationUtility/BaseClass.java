package automationUtility;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;
import objectRepositary.HomePage;
import objectRepositary.LoginPage;

public class BaseClass {

	public TestDataUtils tdu = new TestDataUtils();
	public SharedSeleniumLib ssl = new SharedSeleniumLib();
	public WebDriver driver ;
	
	public static WebDriver listenerDriver;
	@BeforeClass(alwaysRun = true)
	public void openBrowser() throws IOException {
		System.out.println("Browser Launch");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		listenerDriver = driver;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get(tdu.fetchDataFromProperty("url"));
	}
	
//	@Parameters({"browserName"})
//	@BeforeClass(alwaysRun = true)
//	public void openBrowser(String browserName) throws IOException {
//		System.out.println("Browser Launch");
//		if(browserName.equals("chrome")) {
//			WebDriverManager.chromedriver().setup();
//			driver = new ChromeDriver();
//		}
//		else if(browserName.equals("edge")) {
//			WebDriverManager.edgedriver().setup();
//			driver = new EdgeDriver();
//		}
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.manage().window().maximize();
//		driver.get(tdu.fetchDataFromProperty("url"));
//	}
	
	@BeforeMethod(alwaysRun = true)
	public void login() throws IOException {
		System.out.println("Login Done");
		LoginPage lp = new LoginPage(driver);
		lp.loginToApp(tdu.fetchDataFromProperty("username"), tdu.fetchDataFromProperty("password"));
		
//		driver.findElement(By.name("user_name")).sendKeys(tdu.fetchDataFromProperty("username"));
//		driver.findElement(By.name("user_password")).sendKeys(tdu.fetchDataFromProperty("password"));
//		driver.findElement(By.id("submitButton")).click();
	}
	
	@AfterMethod(alwaysRun = true)
	public void logout() {
		System.out.println("Logout done");
		HomePage hp = new HomePage(driver);
		hp.logoutFromApp(driver);
		
//		WebElement admin = driver.findElement(By.xpath("//span[@class='userName']/../following-sibling::td[1]/img"));
//		Actions act = new Actions(driver);
//		act.moveToElement(admin).perform();
//		driver.findElement(By.linkText("Sign Out")).click();
	}
	
	@AfterClass(alwaysRun = true)
	public void closeBrowser() {
		System.out.println("Browser Close");
		driver.quit();
	}
}
