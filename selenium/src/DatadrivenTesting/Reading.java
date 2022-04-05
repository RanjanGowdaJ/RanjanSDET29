package DatadrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Reading {
	public String getData(String sheet,int row,int cell) throws Exception, IOException {
	  String val="";
	  FileInputStream finp=new FileInputStream("./Excel/nothing.xlsx");
	 Workbook book = WorkbookFactory.create(finp);
	Cell c = book.getSheet(sheet).getRow(row).getCell(cell);
	val=c.getStringCellValue();
	return val;
	 
	}

}
