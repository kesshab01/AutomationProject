package objectRepositary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SalesOrderPage {

	@FindBy(xpath = "//img[@title='Create Sales Order...']")
	private WebElement createSalesOrderImg ;
	
	public SalesOrderPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnCreateSalesOrderImg() {
		createSalesOrderImg.click();
	}
}
