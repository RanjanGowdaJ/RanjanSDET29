package DatadrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel1 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./Excel/nothing.xlsx");
		Workbook book=WorkbookFactory.create(fis);
		Sheet s = book.getSheet("Sheet1");
		Row r = s.getRow(6);
		Cell c = r.getCell(3);
		String value = c.getStringCellValue();
		System.out.println(value);
		}

}
