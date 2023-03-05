package objectRepositary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import automationUtility.SharedSeleniumLib;

public class CreateNewSalesOrderPage {

	@FindBy(name = "subject")
	private WebElement subjectTb;
	
	@FindBy(xpath = "//input[@id='single_accountid']/following-sibling::img")
	private WebElement organizationNamePlusImg;
	
	@FindBy(xpath = "//a[contains(text(),'Organization Name')]/../../following-sibling::tr[1]/td/a")
	private WebElement orgPopupFirstName;
	
	@FindBy(xpath = "//select[@name='invoicestatus']")
	private WebElement invoiceStatusListbox;
	
	@FindBy(name = "bill_street")
	private WebElement billingAddress;
	
	@FindBy(name = "ship_street")
	private WebElement shippingAddress;
	
	@FindBy(id = "searchIcon1")
	private WebElement selectFirstProduct;
	
	@FindBy(xpath = "//a[contains(text(),'Product Name')]/../../following-sibling::tr[1]/td[2]/a")
	private WebElement productPopupFirstName;
	
	@FindBy(id = "qty1")
	private WebElement firstProductQty;
	
	@FindBy(css = "[type='submit']")
	private WebElement saveBtn;
	
	public CreateNewSalesOrderPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void enterSubjectName(String name) {
		subjectTb.sendKeys(name);
	}
	
	public void clickOnOrganizationNamePlusImg() {
		organizationNamePlusImg.click();
	}
	
	public void clickOnOrgPopupFirstName() {
		orgPopupFirstName.click();
	}
	
	public void selectItemFromInvoiceStatusListbox(String value) {
		
		SharedSeleniumLib ssl = new SharedSeleniumLib();
		ssl.selectItemFromListByValues(invoiceStatusListbox, value);
	}
	
	public void enterBillingAddress(String address) {
		billingAddress.sendKeys(address);
	}
	
	public void enterShippingAddress(String address) {
		shippingAddress.sendKeys(address);
	}
	
	public void clickOnSelectFirstProduct() {
		selectFirstProduct.click();
	}
	
	public void clickOnPrductPopupFirstName() {
		productPopupFirstName.click();
	}
	
	public void enterFirstProductQty(String qty) {
		firstProductQty.sendKeys(qty);
	}
	
	public void clickOnSaveBtn() {
		saveBtn.click();
	}
}















