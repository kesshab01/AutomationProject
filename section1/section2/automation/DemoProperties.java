package section2.automation;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class DemoProperties {

	public static void main(String[] args) throws IOException {
		
		// step 1 :- connect java with properties file
		FileInputStream fis = new FileInputStream("E:\\SDET_AUTOMATION\\DataStorage\\data.properties");
		
		// step 2 :- Load Properties file into Properties class object
		Properties pobj = new Properties();
		pobj.load(fis);
		
		// step 3 :- fetch data from loaded file
		String url = pobj.getProperty("url");
		String un = pobj.getProperty("username");
		String pwd = pobj.getProperty("password");
		
		System.out.println(url + "\n" + un + "\n" + pwd);
	}
}
