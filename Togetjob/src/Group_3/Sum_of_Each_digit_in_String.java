package Group_3;

import java.util.Scanner;

public class Sum_of_Each_digit_in_String {
	public static void main(String[] args) {
	/*	String s="he1l3l4o5";
		int sum=0;
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)>=48 && s.charAt(i)<57)
			{
				sum=sum+s.charAt(i)-48;
			}
			
		}
		System.out.println(sum); */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a input");
		String str = sc.next();
		int sum = sc.nextInt();
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i)>=48 && str.charAt(i)<=57)
			{
				sum=sum+str.charAt(i)-48;
			}
			
		}
		System.out.println(sum);
		
		
	}

}
