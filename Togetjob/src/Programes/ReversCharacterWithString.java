package Programes;

public class ReversCharacterWithString
{
	public static void main(String[] args)
	{
		String s="hi hello bangalore";
		String[] s1 = s.split(" ");
		for(int i=s1.length-1;i>=0;i--)
		{
			String word=s1[i];
			String rev=" ";
			for (int j= word.length()-1; j>=0; j--)
			{
				
				rev=rev+word.charAt(j);
			}
			System.out.print(rev+" ");
		}
	}

}
