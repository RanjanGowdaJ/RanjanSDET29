package Programes;

public class PrimeNumber {   //a given no 
	public static void main(String[] args) {
		int no=7;
		int i=2;
		while(i<=no)
		{
			if(no%i==0)
			{
				break;
			}
			else{
				i++;
			}
		}
			if(no==i)
			{
				System.out.println("it is prime no");  //if no is not divided eqauly without any remainder then 
			}                                              //that no is called as prime no
			else{
				System.out.println("it is not a prime no");
			}
		}
	}

