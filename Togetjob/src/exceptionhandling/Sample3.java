package exceptionhandling;

public class Sample3 {
	public static void main(String[] args) {
		System.out.println("****");
		try{
			int i=1/0;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("handeld");
		}
		catch(ArithmeticException e)
	      {
			System.out.println("caught");
	      }
		System.out.println("***");
	}

}
