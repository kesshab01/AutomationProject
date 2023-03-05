package section1.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginToActitime {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		
		String msg =  driver.findElement(By.id("headerContainer")).getText();
		
		System.out.println(msg);
		
		if(msg.equals("Please identify yourself")) {
			System.out.println("Test case pass");
		}else {
			System.out.println("Test case fail");
		}
		
		driver.quit();
	}
}
