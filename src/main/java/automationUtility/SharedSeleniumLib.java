package automationUtility;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SharedSeleniumLib {

	private String mainID ;
	// alert
	public void acceptAlert(WebDriver driver) {
		driver.switchTo().alert().accept();
	}
	
	public void rejectAlert(WebDriver driver) {
		driver.switchTo().alert().dismiss();
	}
	
	public String getAlertMsg(WebDriver driver) {
		String alertText = driver.switchTo().alert().getText();
		return alertText;
	}
	
	// listbox
	public void selectItemFromListByText(WebElement element, String text) {
		
		Select s = new Select(element);
		s.selectByVisibleText(text);
	}
	
	public void selectItemFromListByValues(WebElement element, String value) {
		
		Select s = new Select(element);
		s.selectByValue(value);
	}
	
	// Mouse Over
	public void moveMouseOnElement(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
	}
	
	// window handling
	public void switchDriverFocusToChild(WebDriver driver) {
		mainID=driver.getWindowHandle();
		Set<String> allID=driver.getWindowHandles();
		for(String id: allID) {
			if(!mainID.equals(id)) {
				driver.switchTo().window(id);

			}
		}
	}
	
	public void switchDriverFocusToMain(WebDriver driver) {
		driver.switchTo().window(mainID);
	}
}












