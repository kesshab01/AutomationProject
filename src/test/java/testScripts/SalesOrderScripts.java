package testScripts;

import java.awt.AWTException;
import java.io.IOException;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import automationUtility.BaseClass;
import objectRepositary.CreateNewSalesOrderPage;
import objectRepositary.HomePage;
import objectRepositary.SalesOrderInfoPage;
import objectRepositary.SalesOrderPage;

@Listeners(automationUtility.ExecutionMoniter.class)
public class SalesOrderScripts extends BaseClass{

	@Test(groups = {"sanity", "system"})
	public void CreateSaleOrder() throws AWTException, InterruptedException, EncryptedDocumentException, IOException {
		HomePage hp = new HomePage(driver);
		SalesOrderPage sop = new SalesOrderPage(driver);
		CreateNewSalesOrderPage cnop = new CreateNewSalesOrderPage(driver);
		SalesOrderInfoPage soip = new SalesOrderInfoPage(driver);
		
		hp.mouseOnMoreDD(driver);
		hp.clickOnSalesOrderLink();
		
		sop.clickOnCreateSalesOrderImg();
		
		cnop.enterSubjectName(tdu.fetchDataFromExcel("TestCaseData", 10, 2));
		cnop.clickOnOrganizationNamePlusImg();
		
		ssl.switchDriverFocusToChild(driver);
		
		cnop.clickOnOrgPopupFirstName();
		
		ssl.acceptAlert(driver);
		
		ssl.switchDriverFocusToMain(driver);

		cnop.selectItemFromInvoiceStatusListbox(tdu.fetchDataFromExcel("TestCaseData", 10, 3));

		cnop.enterBillingAddress("whitefield");
		cnop.enterShippingAddress("HopeFarm");
		
		cnop.clickOnSelectFirstProduct();

		ssl.switchDriverFocusToChild(driver);
		cnop.clickOnPrductPopupFirstName();

		ssl.switchDriverFocusToMain(driver);

		cnop.enterFirstProductQty(tdu.fetchDataFromExcel("TestCaseData", 10, 4));

		cnop.clickOnSaveBtn();

		String info=soip.getSalesOrderInfoMsg();
		Assert.assertTrue(info.contains(tdu.fetchDataFromExcel("TestCaseData", 10, 5)));
	}
}

