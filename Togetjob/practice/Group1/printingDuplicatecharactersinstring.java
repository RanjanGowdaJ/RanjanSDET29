package Group1;

import java.util.HashSet;
import java.util.Scanner;

public class printingDuplicatecharactersinstring {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value");
		String str = sc.next();
		HashSet<Character> set=new HashSet<Character>();
		for (int i = 0; i < str.length(); i++) {
			set.add(str.charAt(i));
			
		}
		for (Character ch : set) {
			int count = 0;
			for (int i = 0; i < str.length(); i++) {
				if(ch==str.charAt(i))
				{
					count++;
				}
			}
		// if(count>=2) //for printing duplicate characters in given string
			if(count==1)  //for printing unique characters in given string in sinlge line by calling print ()
				{
					System.out.println(ch);
			}  
			} 
			
		}
	}


