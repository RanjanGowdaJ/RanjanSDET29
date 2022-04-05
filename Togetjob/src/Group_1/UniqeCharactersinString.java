package Group_1;

import java.util.LinkedHashSet;

public class UniqeCharactersinString {
	public static void main(String[] args) {
		String s="hello";
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for (int i = 0; i <s.length(); i++) {
			set.add(s.charAt(i));
			
		}
		//step 2=compare the given string with all the values present in the set
		for (Character ch : set) {
			int count = 0;
			for (int i = 0; i < s.length(); i++) {
				if(ch==s.charAt(i))    //step 3=if ch is matching with s,then increment the count 
				{
				count++;  
				}
				
			}// step 4=print the only the Unique characters(we should not print the repeated characters)
			if(count==1){
			
			System.out.print(ch);
			
		}
		
	}
	}
}
