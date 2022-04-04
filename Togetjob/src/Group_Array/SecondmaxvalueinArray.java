package Group_Array;

public class SecondmaxvalueinArray {
	public static void main(String[] args) {
		int []arr={123,234,345,456,567};
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}			
		}
		int max = arr[arr.length-2];
		System.out.println(max);
	}

}
