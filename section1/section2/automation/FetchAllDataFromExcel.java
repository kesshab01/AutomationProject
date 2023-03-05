package section2.automation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchAllDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis = new FileInputStream("E:\\SDET_AUTOMATION\\DataStorage\\excelData.xlsx");
		
		Workbook book = WorkbookFactory.create(fis);
		
		DataFormatter df = new DataFormatter();
		
		Sheet sh = book.getSheet("StudentData");
		int lastRowNum = sh.getLastRowNum(); // counts from 0
		System.out.println("last rown num: " + lastRowNum); // 2
		
		short lastCellNum = sh.getRow(0).getLastCellNum();	// counts from 1
		System.out.println("last cell num: " + lastCellNum); // 3
		
		for(int i = 0 ; i <= lastRowNum ; i++) {
			
			Row row = sh.getRow(i);
			
			for(int j = 0 ; j < lastCellNum ; j++) {
				
				Cell cel = row.getCell(j);
				String data = df.formatCellValue(cel);
				System.out.print(data + " ");
			}
			System.out.println();
		}
	}
}














