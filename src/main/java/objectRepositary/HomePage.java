package objectRepositary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import automationUtility.SharedSeleniumLib;

public class HomePage {

	@FindBy(xpath = "//span[@class='userName']/../following-sibling::td[1]/img")
	private WebElement administrator;
	
	@FindBy(linkText = "Sign Out")
	private WebElement signOut;
	
	@FindBy(linkText = "Leads")
	private WebElement leadLink;
	
	@FindBy(xpath = "//a[text()='More']")
	private WebElement moreDD;
	
	@FindBy(linkText = "Sales Order")
	private WebElement salesOrderLink;
	
	public HomePage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	public void logoutFromApp(WebDriver driver) {
		SharedSeleniumLib ssl = new SharedSeleniumLib();
		ssl.moveMouseOnElement(driver, administrator);
		
		signOut.click();
	}
	
	public void clickOnLeadsLink() {
		leadLink.click();
	}
	
	public void mouseOnMoreDD(WebDriver driver) {
		
		SharedSeleniumLib ssl = new SharedSeleniumLib();
		ssl.moveMouseOnElement(driver, moreDD);
	}
	
	public void clickOnSalesOrderLink() {
		salesOrderLink.click();
	}
}
