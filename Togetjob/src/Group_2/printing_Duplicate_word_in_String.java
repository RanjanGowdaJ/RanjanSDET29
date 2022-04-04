package Group_2;

import java.util.HashSet;

public class printing_Duplicate_word_in_String {
	public static void main(String[] args) {
		String  s="hii india hii hassan";
		String[] str = s.split(" ");
		HashSet<String> set = new HashSet<String>();
		for (int i = 0; i < str.length; i++) {
			set.add(str[i]);
		}
	for (String word : set) {
		int count =0;
		for (int i = 0; i < str.length; i++) {
			if(word.equals(str[i]))
			{
				count++;
			}
		}if(count>=2){
			System.out.println(count+"  "+word);
		}
		
	}
	}

}
