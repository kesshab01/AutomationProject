package testScripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import automationUtility.BaseClass;
import objectRepositary.HomePage;
import objectRepositary.LeadsPage;

@Listeners(automationUtility.ExecutionMoniter.class)
public class LeadScripts extends BaseClass{

	@Test(groups = {"smoke" , "Sanity"})
	public void createNewLead() throws EncryptedDocumentException, IOException {

		HomePage hp = new HomePage(driver);
		LeadsPage lp = new LeadsPage(driver);
		
		hp.clickOnLeadsLink();
		lp.clickOnCreateLeadImg();
		driver.findElement(By.name("lastname")).sendKeys(tdu.fetchDataFromExcel("TestCaseData", 7, 2)); // 1
		driver.findElement(By.name("sompany")).sendKeys(tdu.fetchDataFromExcel("TestCaseData", 7, 3)); // 2
		
		WebElement leadSourceDD = driver.findElement(By.name("leadsource"));
		Select s = new Select(leadSourceDD);
		s.selectByValue(tdu.fetchDataFromExcel("TestCaseData", 7, 4)); // 3
		
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		
		String leadInfoMsg = driver.findElement(By.cssSelector("span.dvHeaderText")).getText();
		
		Assert.assertTrue(leadInfoMsg.contains(tdu.fetchDataFromExcel("TestCaseData", 7, 5)));
	}
}
