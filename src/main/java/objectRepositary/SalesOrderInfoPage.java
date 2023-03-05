package objectRepositary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SalesOrderInfoPage {

	@FindBy(className = "lvtHeaderText")
	private WebElement salesOrderInfoMsg;
	
	public SalesOrderInfoPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public String getSalesOrderInfoMsg() {
		return salesOrderInfoMsg.getText();
	}
}
