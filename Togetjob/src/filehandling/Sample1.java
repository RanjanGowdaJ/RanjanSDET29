package filehandling;

	import java.io.File;

	public class Sample1 
	{
		public static void main(String[] args) {
			
		
		File f=new File("c://javamava");
		{
		if(f.mkdirs())
		{
			System.out.println("yes its present");
		}
		else 
		{
			System.out.println("not present");
		}
	if(f.exists())
	{
		System.out.println("s created ");
	}
	else 
	{
		System.out.println("not creted");
	}
	
	}
	}
	}
	



