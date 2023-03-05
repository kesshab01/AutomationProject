package section1.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginError {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();

		driver.findElement(By.id("loginButton")).click();

		Thread.sleep(2000);

		WebElement errorMsgele = driver.findElement
				(By.xpath("//span[contains(text(), 'Username or Password')]"));

		if(errorMsgele.isDisplayed()) {
			System.out.println("Error Message Visible in UI");
		}else {
			System.out.println("Error Message is not visible in UI");
		}


		WebElement loginCheckbox = driver.findElement(By.id("keepLoggedInCheckBox"));
	//	loginCheckbox.click();

		if(loginCheckbox.isEnabled()) {
			System.out.println("checkbox is enabled");
			loginCheckbox.click();
		}else {
			System.out.println("checkbox is not enabled");
		}

		if(loginCheckbox.isSelected()) {
			System.out.println("checkbox is selected");
		}else {
			System.out.println("checkbox is not selected");
		}


		driver.quit();
	}
}











