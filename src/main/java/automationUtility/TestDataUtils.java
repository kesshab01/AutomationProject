package automationUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class TestDataUtils {

	public String fetchDataFromProperty(String key) throws IOException {
		
		FileInputStream fis = new FileInputStream("./DataStorage/data.properties");
		Properties pobj = new Properties();
		pobj.load(fis);
		
		String value = pobj.getProperty(key);
		return value ;
	}
	
	public String fetchDataFromExcel(String sheetName, int rowNum, int cellNum) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./DataStorage/excelData.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Cell cel = book.getSheet(sheetName).getRow(rowNum).getCell(cellNum);
		DataFormatter df = new DataFormatter();
		String value = df.formatCellValue(cel);
		return value;
	}
}
