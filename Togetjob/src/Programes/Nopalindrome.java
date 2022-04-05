package Programes;

public class Nopalindrome {
	public static void main(String[] args) {
		int no=123;
		int temp=no;    //store the given no into temp varibale
		int rev=0;
		while (temp>0)  //when we dont no the range of values,we go for while loop
		{
		int sum = temp%10;  //here we will get the remainder  sum=123%10=3 
		rev=rev*10+sum;   //here we will get      rev=0*10+3
		temp=temp/10;    //here we will get quotient  temp=123/10=12
			
		}
	if(rev==no){
		System.out.println("it is palindrome");
	}else{
		System.out.println("it is not a palindrome");
	}
		
	}

}
