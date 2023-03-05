package section2.automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoFrame {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/droppable/");
		
		// switch into frame by using index
		// driver.switchTo().frame(0);
		
		// switch into frame by using webelement
		WebElement frameEle = driver.findElement(By.xpath("//iframe"));
		driver.switchTo().frame(frameEle);
		
		WebElement dragEle = driver.findElement(By.id("draggable"));
		WebElement dropEle = driver.findElement(By.id("droppable"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(dragEle, dropEle).perform();
		
		// come back to main page
		driver.switchTo().defaultContent();
		
		driver.findElement(By.name("s")).sendKeys("drag");
	}
}














