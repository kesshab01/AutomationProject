package section1.automation;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LanuchChrome {

	public static void main(String[] args) {
		
		// configure chrome browser server
	//	System.setProperty("webdriver.chrome.driver", "D:\\Browser_Servers\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		
		// launching chrome browser
		ChromeDriver driver = new ChromeDriver();
		
		// opening web application
		driver.get("https://www.amazon.com/");
	}
}
