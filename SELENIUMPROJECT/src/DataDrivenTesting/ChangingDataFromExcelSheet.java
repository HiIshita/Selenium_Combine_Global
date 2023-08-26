////Changing Data From Excel Sheet by Using Data Driven Testing (but It will not change in the excel sheet)////

package DataDrivenTesting;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ChangingDataFromExcelSheet {
public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
	File file = new File("./testdata/TestData.xlsx");
	Workbook Workbook = WorkbookFactory.create(file);
	Sheet sheet = Workbook.getSheet("Sheet1");
	Row row = sheet.getRow(1);
	row.getCell(0).setCellValue("LiveProject");
	String str = row.getCell(0).toString();
	System.out.println("the excel sheet data is: "+str);
}
}
