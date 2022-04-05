package Group_2;

import java.util.LinkedHashSet;

public class Removing_Duplicate_words_in_string {
	public static void main(String[] args) {
		String s="hi maga hi machi hi frnds";
		String[] str = s.split(" ");
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		for (int i = 0; i < str.length; i++) {
			set.add(str[i]);
			
		}
		for (String word : set) {
			System.out.print(word+" ");
			
		}
	}

}
