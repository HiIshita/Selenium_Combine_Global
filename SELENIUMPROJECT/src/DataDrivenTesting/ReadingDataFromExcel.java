/////Reading Data From Excel by using data driven testing/////


package DataDrivenTesting;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadingDataFromExcel {
public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
	File file = new File("./testdata/TestData.xlsx");
	Workbook Workbook = WorkbookFactory.create(file);
	Sheet sheet = Workbook.getSheet("Sheet1");
	Row row = sheet.getRow(1);
	String str = row.getCell(0).toString();
	System.out.println("the excel sheet data is: "+str);
}
}
