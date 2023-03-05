package section1.automation;

import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchEdge {

	public static void main(String[] args) {
		
		// configure edge browser server
	//	System.setProperty("webdriver.edge.driver", "D:\\Browser_Servers\\edgedriver_win64\\msedgedriver.exe");
		WebDriverManager.edgedriver().setup();
		
		// launching edge browser
		EdgeDriver driver = new EdgeDriver();
		
		// opening web application
		driver.get("https://www.flipkart.com/");
	}
}
