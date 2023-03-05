package automationUtility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ExecutionMoniter implements ITestListener{

	public void onTestFailure(ITestResult res) {
		
		System.out.println("Test Case Failed...Capturing Screenshot");
		TakesScreenshot ts = (TakesScreenshot)BaseClass.listenerDriver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		try {
			FileUtils.copyFile(src, new File("./screenshots/" + res.getName() + ".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
