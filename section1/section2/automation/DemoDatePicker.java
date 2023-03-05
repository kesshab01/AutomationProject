package section2.automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoDatePicker {

	public static void main(String[] args) {
		// select any future date from today.
		
		String date = "12";
		String month = "March";
		String year = "2029";
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/resources/demos/datepicker/default.html");
		
		driver.findElement(By.id("datepicker")).click();
		
		// select month & year
		while(true) {
			String cal_month = driver.findElement(By.cssSelector("span.ui-datepicker-month")).getText();
			String cal_year = driver.findElement(By.cssSelector("span.ui-datepicker-year")).getText();

			if(cal_month.equals(month) && cal_year.equals(year)) {
				break;
			}else {
				driver.findElement(By.cssSelector("a.ui-datepicker-next")).click();
			}
		}
		// select date
		driver.findElement(By.linkText(date)).click();
	}
}
















