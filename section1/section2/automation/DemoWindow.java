package section2.automation;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoWindow {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.naukri.com/");
		
		WebElement services = driver.findElement(By.xpath("//div[text()='Services']"));
		Actions act = new Actions(driver);
		act.moveToElement(services).perform();
		
		driver.findElement(By.cssSelector("a[title='Basic & premium plans']")).click();
		
		String mainId = driver.getWindowHandle();
		System.out.println("main window id :- " + mainId);
		
		Set<String> allId = driver.getWindowHandles();
		
		for(String  id : allId) {
			if(!mainId.equals(id)) {
				System.out.println("child id :- " + id);
				driver.switchTo().window(id);
			}
		}
		
		driver.findElement(By.id("addToCartBtn")).click();
	}
}






























