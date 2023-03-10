package objectRepositary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeadsPage {

	@FindBy(css = "img[title='Create Lead...']")
	private WebElement createLeadImg;
	
	public LeadsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnCreateLeadImg() {
		createLeadImg.click();
	}
}
