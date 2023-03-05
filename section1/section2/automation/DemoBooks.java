package section2.automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoBooks {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://books-pwakit.appspot.com/");
		
		WebElement book_app = driver.findElement(By.xpath("//book-app"));
		
		SearchContext book_app_sr = book_app.getShadowRoot();
		
		book_app_sr.findElement(By.cssSelector
			("app-header>app-toolbar[class='toolbar-bottom']>book-input-decorator>input"))
			.sendKeys("chetan", Keys.ENTER);
	}
}

// inside shadow root findElement method only cssSelector will work.

// if we use xpath then we will get InvalidArgumentException












