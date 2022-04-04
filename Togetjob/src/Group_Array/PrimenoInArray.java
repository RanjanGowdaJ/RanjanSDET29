package Group_Array;

public class PrimenoInArray {
	public static void main(String[] args) {
		int[]arr={5,7,17,6,22};
	
		for (int i = 0; i < arr.length; i++) {
			int no=arr[i];
			int j=2;
			while(j<no)
			{
				if(no%j==0)
				{
					break;
				}
				else
				{
					j++;
				}
			}
			if(j==no)
			{
				System.out.println("it is prime no"+no);
				
			}
			else
			{
				System.out.println("it is not a prime no"+no);
			}
		}
	}

}
