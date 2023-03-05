package section2.automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoFileUploadBySendKeys {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.monsterindia.com/");
		
		driver.findElement(By.xpath("//span[text()='Upload Resume']")).click();
		
		driver.findElement(By.id("file-upload")).sendKeys
										("E:\\SDET_AUTOMATION\\HTML_Pages\\Sample_Resume.docx");
	}
}
















