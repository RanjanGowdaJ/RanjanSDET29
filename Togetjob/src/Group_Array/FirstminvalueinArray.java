package Group_Array;

public class FirstminvalueinArray {
	public static void main(String[] args) {
		int [] arr={343,6564,767,232,32,5645};
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]<arr[j])
				{
					int temp =arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
			}
			
		}
		int min = arr[arr.length-1];
		System.out.println(min);
	}

}
