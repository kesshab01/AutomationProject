package section1.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoWebElementMethods {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		
		WebElement searchField = driver.findElement(By.id("gh-ac"));
		
		String placeholderValue = searchField.getAttribute("placeholder");
		System.out.println(placeholderValue);
		
		String classValue = searchField.getAttribute("class");
		System.out.println(classValue);
		
		driver.quit();
	}
}

/*
 * getAttribute(String attributeName) :- return a attribute value associated with attribute name
 *                                       in located element.
 */











