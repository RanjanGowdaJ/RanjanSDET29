package Group_2;

import java.util.HashSet;

public class No_of_Occurance_of_word_in_String {
	public static void main(String[] args) {
		String s="hi maga bye maga";
		String[] str = s.split(" ");  //
		HashSet <String>  set= new HashSet<String>();
		for (int i = 0; i < str.length; i++) 
		{
			set.add(str[i]);
		}
		for (String word : set) {
			int count =0;
			for (int i = 0; i < str.length; i++) {
				if(word.equals(str[i]))
				{
					count++;
				}
			}
			System.out.println(word+" "+count);
			
		}
	}
}
