package filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Sample3 {
	public static void main(String[] args) throws IOException 
	{
	
	File f=new File("c://javamava//mava.txt");
	FileWriter fw=new FileWriter(f);
	fw.write("i hate u");
	System.out.println("s data is present");
	fw.flush();
	}
	

}
