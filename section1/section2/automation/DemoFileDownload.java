package section2.automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoFileDownload {

	public static void main(String[] args) {
		
	//	WebDriverManager.firefoxdriver().setup();
		System.setProperty("webdriver.gecko.driver", "D:\\Browser_Servers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://maven.apache.org/download.cgi");
		
		driver.findElement(By.linkText("apache-maven-3.8.6-bin.zip")).click();
	}
}

/*
 * In chrome browser, we will never get file download popup. whereas any file will be 
 * automatically download in Downloads folder.
 * 
 * In Edge browser,  same case as chrome.
 * 
 * In firefox browser, same case as chrome.
 * 
 * Note :- If in case we get fileDownload popup then we have to use Robot class to
 * handle it.
 * 
 */












