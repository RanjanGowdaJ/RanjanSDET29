package DatadrivenTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WrittingtoExcel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./Excel/nothing.xlsx");
		Workbook book=WorkbookFactory.create(fis);
		Sheet s = book.getSheet("Sheet1");
		Row r = s.createRow(5);
		Cell c = r.createCell(12);
		c.setCellValue("dingi");
		FileOutputStream fout=new FileOutputStream("./Excel/nothing.xlsx");
		book.write(fout);
	}

}
