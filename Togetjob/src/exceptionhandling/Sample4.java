package exceptionhandling;

public class Sample4 {
	public static void main(String[] args) {
		System.out.println("******");
		try{
			int a=8;
			int b=2;
			int i=a/b;
			try{
				int[]arr={12,20,30};
				System.out.println(arr[i]);
			}
			catch(ArrayIndexOutOfBoundsException e)
			{System.out.println("caught");
			}
			}
		catch(ArithmeticException e)
		{
			System.out.println("handled");
		}
	}

}
