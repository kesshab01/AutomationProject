package section2.automation;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DemoTestNG {

	@Test(dataProvider = "credentialsSupplier")
	public void loginToApp(String username, String password) {
		
		System.out.println("username : " + username);
		System.out.println("password : " + password);
	}
	
	@DataProvider
	public Object[][] credentialsSupplier() {
		
		Object [][] objarr = new Object [5][2];
		
		objarr[0][0] = "admin1";
		objarr[0][1] = "root1";
		
		objarr[1][0] = "admin2";
		objarr[1][1] = "root2";
		
		objarr[2][0] = "admin3";
		objarr[2][1] = "root3";
		
		objarr[3][0] = "admin4";
		objarr[3][1] = "root4";
		
		objarr[4][0] = "admin5";
		objarr[4][1] = "root5";
		
		return objarr;
	}
}

// @DataProvider annotated method return type is always Object [][] (2D Object Array)
