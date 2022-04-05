package Group_2;

import java.util.HashSet;
import java.util.Scanner;

public class PrintingDuplictesWordinString {
	public static void main(String[] args) {
		// Scanner sc=new Scanner(System.in);
		// System.out.println("enter the input");
	//	String s = sc.nextLine();
	
		String s="hi java hi mava hi bava";
		String[] str = s.split(" ");
		HashSet<String> set = new HashSet<String>();
		for (int i = 0; i < s.length(); i++) {
			set.add(str[i]);
			
		}
		for (String word : set) {
			int count=0;
			for (int i = 0; i < s.length(); i++) {
				if(word.equals(str[i]))
				{
					count++;
				}
				if(count>=2)
				{
					System.out.println(count+""+word);
				}
			}
			
			
		}
			
		
	}

}
