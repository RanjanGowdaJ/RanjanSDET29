package Group_Array;

public class FindmaxlengthofElement {
	public static void main(String[] args) {
		String[] arr={"hell","hii","how","are","you"};
		String max=arr[0];
		for (int i = 1; i < arr.length; i++) {
		
				if(max.length()>arr.length)
				{
					max=arr[i];
			}
			
		}
		for (int i = 0; i < arr.length; i++) {
			if(max.length()==arr[i].length())
			{
				System.out.println(arr[i]);
			}
		}
	}

}
