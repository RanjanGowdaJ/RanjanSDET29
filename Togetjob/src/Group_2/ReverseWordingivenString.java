package Group_2;

public class ReverseWordingivenString {
public static void main(String[] args) {
	String s = "keep smiling my buddy";
	String[] st = s.split(" ");  //
	for (int i=st.length-1;i>=0;i--)
	{
		System.out.print(st[i]+" ");//to print the o/p in single line call print method
	}
}
}
