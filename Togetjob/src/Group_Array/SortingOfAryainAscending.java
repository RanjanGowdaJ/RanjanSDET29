package Group_Array;

public class SortingOfAryainAscending {
	public static void main(String[] args) {
		int []arr={20,30,10,40,35};
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
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
			
		}
	}

}
