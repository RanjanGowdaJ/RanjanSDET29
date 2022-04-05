package Programes;

public class ContinouslyOccuringCharacter 
{
public static void main(String[] args)
{
	String s="aaabbccab";
	int count=1;
	for (int i = 0; i <s.length(); i++)
	{
		try{
	if(s.charAt(i)==s.charAt(i+1))
	{
		count++;
	}
	else{
		System.out.print(count+""+s.charAt(i));
		count=1;
	}
		}
		catch (Exception e) {
		}
	}
		
	if(count==1)
	{
		System.out.print(count+""+s.charAt(s.length()-1));
	}
	}
	
}