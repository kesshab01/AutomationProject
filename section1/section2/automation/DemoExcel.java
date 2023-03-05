package section2.automation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DemoExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis = new FileInputStream("E:\\SDET_AUTOMATION\\DataStorage\\excelData.xlsx");
		
		Workbook book = WorkbookFactory.create(fis);

//		Row  row = book.getSheet("Sheet1").createRow(4);
//		
//		row.createCell(1).setCellValue("welcome");
		
		book.createSheet("mySheet").createRow(2).createCell(3).setCellValue("Hello All");
		
		FileOutputStream fos = new FileOutputStream("E:\\SDET_AUTOMATION\\DataStorage\\excelData.xlsx");
		book.write(fos);
		fos.flush();
		
		System.out.println("pass");
	}
}









