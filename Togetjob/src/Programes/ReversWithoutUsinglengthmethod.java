package Programes;

public class ReversWithoutUsinglengthmethod {
	public static void main(String[] args) {
		String s="yppah";
		char[] str = s.toCharArray();//to convert the given string into char
		int count = 0;
		for (char c : str) //when we want to fetch the data from collection or array we will go for eachloop 
		{
			count++;//used to fetch the length of the given String without using length() or length
		}
		System.out.println(count);
		for (int i = count-1; i >=0; i--) {
			System.out.print(str[i]);
			
		}
		
	}

}
