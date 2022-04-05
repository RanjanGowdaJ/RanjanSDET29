package Programes;

import java.util.Scanner;

public class FibonaciValue {
	public static void main(String[] args) {
		int fib1=0;
		int fib2=1;
		int fib3=0;
		System.out.println(fib1);
		System.out.println(fib2);
		Scanner sc=new Scanner(System.in);
		System.out.println("enter input");
		int sco = sc.nextInt();
		for (int i = 0; i <sco; i++) 
		{
		fib3=fib1+fib2;
		if(fib3<25)
		{
			System.out.println(fib3);
			fib1=fib2;
			fib2=fib3;
		}
		else
		{
			break;
		}
		}
	}
}
		
		
