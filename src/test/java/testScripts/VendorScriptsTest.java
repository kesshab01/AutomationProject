package testScripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import automationUtility.BaseClass;

@Listeners(automationUtility.ExecutionMoniter.class)
public class VendorScriptsTest extends BaseClass {

	@Test(groups = {"system"})
	public void VenderCreation()throws IOException {

		driver.findElement(By.xpath("// a[ contains (text() ,'More' )]")).click();
		driver.findElement(By.name("Vendors")).click();
		driver.findElement(By.cssSelector("img[title ='Create Vendor...']")).click();
		driver.findElement(By.xpath("//input[@name='vendorname']")).sendKeys(tdu.fetchDataFromExcel("TestCaseData",4,2));
		driver.findElement(By.cssSelector("input[type='submit']")).click();

		String VenderInfomsg = driver.findElement(By.cssSelector("span.lvtHeaderText")).getText();
		System.out.println(VenderInfomsg);
		System.out.println(tdu.fetchDataFromExcel("TestCaseData",4, 3));
		if( VenderInfomsg.contains(tdu.fetchDataFromExcel("TestCaseData",4, 3))){
			System.out.println("Vender Creation is pass");
		}else {
			System.out.println("Vender Creation is fail");
		}
	}

}

