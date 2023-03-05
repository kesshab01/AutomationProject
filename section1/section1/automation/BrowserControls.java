package section1.automation;

import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserControls {

	public static void main(String[] args)  {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");

		// maximize of browser
		driver.manage().window().maximize();
		
		// minimize of browser
		driver.manage().window().minimize();
	}
}
/*
 * minimize() method feature is present in latest version of selenium (selenium 4)
 * 
 * but as per selenium 3 version minimize() feature is not exist.
 */










