package section2.automation;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipkartAutosuggestion {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		driver.findElement(By.name("q")).sendKeys("Redme");
		
		List<WebElement> lst = driver.findElements(By.xpath("//ul/li"));
		
		for(WebElement wb : lst) {
		//	System.out.println(wb.getText());
			String text = wb.getText();
			if(text.contains("redme 10prime")) {
				wb.click();
				break;
			}
		}
		
		System.out.println("Total Suggestion are : " + lst.size());
		driver.quit();
	}
}












