package section2.automation;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoAlert {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.cssSelector("input.signinbtn")).click();
		
		driver.findElement(By.id("login1")).sendKeys("admin");
//		Alert alt = driver.switchTo().alert();
		
//		String altMsg = alt.getText();
//		System.out.println("Actual Alert Message :- " + altMsg);
//		
//		if(altMsg.equals("Please enter a valid user name")) {
//			System.out.println("alert message validation pass");
//		}else {
//			System.out.println("alert message validation fail");
//		}
//		
//		alt.accept();
	}
}
















