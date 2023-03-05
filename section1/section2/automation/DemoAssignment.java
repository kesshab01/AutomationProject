package section2.automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoAssignment {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
		driver.findElement(By.id("loginButton")).click();
	    
	    driver.findElement(By.id("container_users")).click();
	    
	    driver.findElement(By.className("components_button_label")).click();
	 //   Thread.sleep(2000);
	    
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    wait.until(ExpectedConditions.visibilityOfElementLocated
	    							(By.id("createUserPanel_firstNameField")));
	    
	    driver.findElement(By.id("createUserPanel_firstNameField")).sendKeys("Piyush");
	    driver.findElement(By.id("createUserPanel_lastNameField")).sendKeys("Rajguru");
	    driver.findElement(By.id("createUserPanel_emailField")).sendKeys("piyushrajguru222@gmail.com");
	    driver.findElement(By.xpath("//div[text() ='Save & Send Invitation']")).click();
	    driver.quit();
	    
	}
}
