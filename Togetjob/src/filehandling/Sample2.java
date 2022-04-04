package filehandling;

import java.io.File;
import java.io.IOException;


public class Sample2 {
	public static void main(String[] args) throws IOException 
	{
		File f=new File("c://javamava//mava.txt");
		if(f.createNewFile())
		{
			System.out.println("s it is created");
		}
		else
		{
			System.out.println("not created");
		}
	}
	

}
