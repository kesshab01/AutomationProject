package section1.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EbayWatchPrice {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		
		// step 1 :- Enter Watch in search field
		driver.findElement(By.id("gh-ac")).sendKeys("Watch");
		
		// step 2 :- click on search
		driver.findElement(By.id("gh-btn")).click();
		
		Thread.sleep(3000);
		
		// step 3 :- click on men department
		driver.findElement(By.xpath("//h2[text()='Department']/following-sibling::a/div")).click();
		
		Thread.sleep(2000);
		// step 4 :- capture price
		String price = driver.findElement(By.xpath
				("//span[text()=\"Fashion Sport Men's Stainless Steel Case Leather Band Quartz Analog Wrist Watch\"]"
						+ "/../../following-sibling::div[2]/div[1]")).getText();
		
		System.out.println("Price : " + price);
		
		driver.quit();
	}
}









