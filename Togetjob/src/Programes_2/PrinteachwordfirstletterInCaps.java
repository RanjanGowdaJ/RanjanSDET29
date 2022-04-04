package Programes_2;

public class PrinteachwordfirstletterInCaps {
	public static void main(String[] args) {
		String s="welcome to tyss";
		char ch = (char)(s.charAt(0)-32);
			System.out.println(ch);
			for (int i = 1; i < args.length; i++) {
		
			System.out.println(s.charAt(i));
			if(s.charAt(i)==' ')
			{
				System.out.println(" "+(char)(s.charAt(i+1)-32));
				i++;
			}
			else{
				System.out.println(s.charAt(i));
			}
		}
		
	}

}
