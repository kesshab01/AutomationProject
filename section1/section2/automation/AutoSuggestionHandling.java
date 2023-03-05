package section2.automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestionHandling {

	public static void main(String[] args) throws InterruptedException {
		
		String searchItem = "cricket" ;
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("q")).sendKeys(searchItem);
		Thread.sleep(4000);
		
		List<WebElement> sugg = driver.findElements(By.xpath
				("//span[starts-with(text(), '" + searchItem + "')]"));
		
		for(WebElement wb : sugg) {
			System.out.println(wb.getText());
		}
		System.out.println("Total suggestion are :- " + sugg.size());
		
		driver.quit();
	}
}














