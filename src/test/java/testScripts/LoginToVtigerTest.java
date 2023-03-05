package testScripts;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import automationUtility.BaseClass;
import automationUtility.TestDataUtils;
import io.github.bonigarcia.wdm.WebDriverManager;

@Listeners(automationUtility.ExecutionMoniter.class)
public class LoginToVtigerTest extends BaseClass{

	@Test(groups = {"smoke"})
	public void homePageValidation() throws EncryptedDocumentException, IOException {
		
		WebElement homeEle = driver.findElement(By.xpath("//a[contains(text(),'Home')]"));
		
		String homeText = tdu.fetchDataFromExcel("TestCaseData", 1, 2);
		
		if(homeEle.getText().contains(homeText)) {
			System.out.println("Login To Vtiger is pass");
		}else {
			System.out.println("Login To Vtiger is fail");
		}
		
	}
}














