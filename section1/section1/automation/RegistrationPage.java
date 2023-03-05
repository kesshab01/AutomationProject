package section1.automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class RegistrationPage {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.msn.com/en-in");
		driver.manage().window().maximize();
		
		WebElement entryPoint = driver.findElement(By.xpath("//entry-point[@instance-id='EntryPointHpWC']"));
		SearchContext entryPointShadowRoot = entryPoint.getShadowRoot();
		
		Thread.sleep(2000);
		WebElement feedNP = entryPointShadowRoot.findElement(By.cssSelector
				("div.default-feed-nav-container > feed-navigation-hp[instance-id='FeedNavigationHp']"));
		SearchContext feedNPShadowRoot = feedNP.getShadowRoot();
		
		Thread.sleep(1000);
		WebElement feedN = feedNPShadowRoot.findElement(By.cssSelector("feed-navigation[role='navigation']"));
		SearchContext feedNShadowRoot = feedN.getShadowRoot();
		
		Thread.sleep(1000);
		feedNShadowRoot.findElement(By.id("entertainment")).click();
	}
}











