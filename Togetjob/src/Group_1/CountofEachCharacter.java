package Group_1;

import java.util.HashSet;

public class CountofEachCharacter {
	public static void main(String[] args) {
		//Step 1=store the given string into collection by creating a set
		String s="surasundra";
		HashSet<Character> set = new HashSet<Character>();
		for (int i = 0; i <s.length(); i++) {
			set.add(s.charAt(i));
			
		}
		//step 2=compare the given string with all the values present in the set
		for (Character ch : set) {
			int count = 0;
			for (int i = 0; i < s.length(); i++) {
				if(ch==s.charAt(i))    //if ch is matching with s,then increment the count 
				{
				count++;  
				}
				
			}// step 4=print the character and occuarence of each character  abdbsmgdyqytdw
			
			System.out.println(ch+"fwydfquydu  "+count);
			
		}
		
		
		}
	}