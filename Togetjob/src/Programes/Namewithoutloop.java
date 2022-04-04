package Programes;

public class Namewithoutloop {
	static int no=0;
	static void gowda(){
		
	no++;
	if(no<=100)
	{
		System.out.println("gowda"+no);
		gowda();
	}
		
	}
	public static void main(String[] args) {
	
		gowda();
		
	}

}
