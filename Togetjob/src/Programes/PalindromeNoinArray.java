package Programes;

public class PalindromeNoinArray {
	
	public static void main(String[] args) {
		
		int[] arr={22,35,49,78,12,19,96};
		
		for (int i = 0; i < arr.length; i++) {
			int no=arr[i];
			int temp=no;
			int rev=0;
			while(temp>0)
			{
				int sum=temp%10;
				rev=rev*10+sum;
				temp=temp/10;
				
			}
			if(no==rev)
			{
				System.out.println("it is palindrome"+" "+rev);
			}
			else{
				System.out.println("it is not palindrome"+" "+rev);
			}
			
			
		}
		
	}

}
