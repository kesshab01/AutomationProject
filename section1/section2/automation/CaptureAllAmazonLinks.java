package section2.automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CaptureAllAmazonLinks {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		
		List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
		
		int totalLink = 0;
		for(WebElement wb : allLinks) {
			System.out.println(wb.getAttribute("href"));
			System.out.println(wb.getText());
			System.out.println("-------------------------------");
			totalLink++;
		}
		System.out.println("Total Links are :- " + totalLink);
	}
}
















